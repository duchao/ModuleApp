package com.example.test.moduleapp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.test.moduleapp.R;
import com.github.mzule.activityrouter.annotation.Router;
import com.github.mzule.activityrouter.router.Routers;

@Router("app_main")
public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.app_main_jump_button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.app_main_jump_button:
                jumpToLogin();
                break;
            default:
                break;
        }
    }

    private void jumpToLogin() {
        Routers.open(MainActivity.this, "module://login_login");
    }
}
