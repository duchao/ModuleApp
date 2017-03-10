package com.example.test.login.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.test.login.R;
import com.github.mzule.activityrouter.annotation.Router;
import com.github.mzule.activityrouter.router.Routers;

/**
 * Created by duchao on 2017/3/10.
 */
@Router("login_login")
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mButton = (Button) findViewById(R.id.login_back_to_main);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Routers.open(LoginActivity.this,"module://app_main");
                //finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.login_back_to_main) {
            backToMain();
        }

    }

    private void backToMain() {
    }
}
