package com.soboot.mike.worker.login;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.soboot.mike.worker.R;
import com.soboot.mike.worker.base.MyBaseFragmentActivity;
import com.soboot.mike.worker.fragment.Myfrg;

public class PhoneLoginActivity extends MyBaseFragmentActivity implements View.OnClickListener {
    Button btn_phone_login;
    private Fragment f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_login);
        btn_phone_login = (Button) findViewById(R.id.btn_phone_login);
        f = new Myfrg();
        btn_phone_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        replaceFragmentView(R.id.frg_test, f);
    }
}
