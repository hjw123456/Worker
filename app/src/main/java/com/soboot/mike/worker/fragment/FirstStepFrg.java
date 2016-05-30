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
public class FirstStepFrg extends MyBaseFragment implements View.OnClickListener {
    public static final int FIRST=12345;
    EditText editText_input_number;
    Button btn_send_code;

    @Override
    public void init() {
        editText_input_number = (EditText) fragmentView.findViewById(R.id.editText_reg_input_number);
        btn_send_code = (Button) fragmentView.findViewById(R.id.btn_reg_send_code);
        btn_send_code.setOnClickListener(this);

    }

    @Override
    public View setFragmentView(LayoutInflater inflater, ViewGroup container, Bundle saveInstaceState) {
        return inflater.inflate(R.layout.first_step_frg, null);
    }

    @Override
    public void onClick(View v) {
        if (fragmentListener != null) {
            fragmentListener.setClick(FIRST, null);
        }
    }
}
