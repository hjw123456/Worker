package com.soboot.mike.worker.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.soboot.mike.worker.base.MyBaseFragment;
import com.soboot.mike.worker.R;

/**
 * Created by Wing on 2016/5/27.
 */
public class SecStepFrg extends MyBaseFragment implements View.OnClickListener {
    public static final int SEC=12346;
    EditText editText_input_code;
    Button btn_reget;
    Button btn_commit_code;
    @Override
    public void init() {
        btn_commit_code = (Button) fragmentView.findViewById(R.id.btn_commit_code);
        btn_commit_code.setOnClickListener(this);
    }

    @Override
    public View setFragmentView(LayoutInflater inflater, ViewGroup container, Bundle saveInstaceState) {
        return inflater.inflate(R.layout.sec_step_frg,null);
    }

    @Override
    public void onClick(View v) {
        if (fragmentListener != null) {
            fragmentListener.setClick(SEC, null);
        }
    }
}
