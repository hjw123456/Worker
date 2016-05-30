package com.soboot.mike.worker.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.soboot.mike.worker.base.MyBaseFragment;
import com.soboot.mike.worker.R;

/**
 * Created by Wing on 2016/5/27.
 */
public class ThirdStepFrg extends MyBaseFragment {

    @Override
    public void init() {

    }

    @Override
    public View setFragmentView(LayoutInflater inflater, ViewGroup container, Bundle saveInstaceState) {
        return inflater.inflate(R.layout.third_step_frg, null);
    }
}
