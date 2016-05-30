package com.soboot.mike.worker.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Wing on 2016/5/27.
 */
public abstract class MyBaseFragment extends Fragment {
    public View fragmentView;
    public IFragmentListener fragmentListener;
    protected Activity myActivity;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        myActivity = activity;
        if (activity instanceof IFragmentListener) {
            fragmentListener = (IFragmentListener) activity;
        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (fragmentView != null) {
            ViewGroup vg = (ViewGroup) fragmentView.getParent();
            vg.removeView(fragmentView);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (fragmentView == null) {

            fragmentView = setFragmentView(inflater, container,
                    savedInstanceState);
            init();
        }
        return fragmentView;
    }

    public abstract void init();

    public abstract View setFragmentView(LayoutInflater inflater, ViewGroup container, Bundle saveInstaceState);

    public abstract interface IFragmentListener {
        void setClick(int viewId, Bundle bundle);
    }
}
