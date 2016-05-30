package com.soboot.mike.worker.login;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.soboot.mike.worker.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv_phone_login;
    TextView tv_register;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv_phone_login = (TextView) findViewById(R.id.tv_phone_login);
        tv_register = (TextView) findViewById(R.id.tv_register);
        tv_phone_login.setOnClickListener(this);
        tv_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_phone_login:
                intent = new Intent(this, PhoneLoginActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_register:
                intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
                break;

        }

    }

}
