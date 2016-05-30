package com.soboot.mike.worker.login;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.soboot.mike.worker.base.MyBaseFragment;
import com.soboot.mike.worker.base.MyBaseFragmentActivity;
import com.soboot.mike.worker.R;
import com.soboot.mike.worker.fragment.FirstStepFrg;
import com.soboot.mike.worker.fragment.SecStepFrg;
import com.soboot.mike.worker.fragment.ThirdStepFrg;

public class RegisterActivity extends MyBaseFragmentActivity implements MyBaseFragment.IFragmentListener, View.OnClickListener {
    Fragment fsf;
    Fragment ssf;
    Fragment tsf;
    TextView tv_step1;
    TextView tv_step2;
    TextView tv_step3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tv_step1 = (TextView) findViewById(R.id.tv_step1);
        tv_step2 = (TextView) findViewById(R.id.tv_step2);
        tv_step3 = (TextView) findViewById(R.id.tv_step3);
        tv_step1.setOnClickListener(this);
        tv_step2.setOnClickListener(this);
        tv_step3.setOnClickListener(this);
        tv_step1.setTextColor(Color.BLUE);
        tv_step2.setTextColor(Color.BLUE);
        tv_step3.setTextColor(Color.BLUE);
        fsf = new FirstStepFrg();
        ssf = new SecStepFrg();
        tsf = new ThirdStepFrg();
        addFragmentView(R.id.reg_step, fsf);
    }


    @Override
    public void setClick(int viewId, Bundle bundle) {
        switch (viewId) {
            case FirstStepFrg.FIRST:
                tv_step2.setTextColor(Color.RED);
                replaceFragmentView(R.id.reg_step, ssf);
                break;
            case SecStepFrg.SEC:
                tv_step2.setTextColor(Color.BLUE);
                tv_step3.setTextColor(Color.RED);
                replaceFragmentView(R.id.reg_step, tsf);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_step1:
                replaceFragmentView(R.id.reg_step, fsf);
                break;
            case R.id.tv_step2:
                replaceFragmentView(R.id.reg_step, ssf);

                break;
            case R.id.tv_step3:
                replaceFragmentView(R.id.reg_step, tsf);

                break;
        }
    }
}
