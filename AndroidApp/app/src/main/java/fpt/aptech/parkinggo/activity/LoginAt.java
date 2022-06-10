package fpt.aptech.parkinggo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fpt.aptech.parkinggo.R;
import fpt.aptech.parkinggo.asynctask.LoginTask;

public class LoginAt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_at);
        Button btnButton = findViewById(R.id.a_login_btn_signin);
        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new LoginTask(LoginAt.this).execute();
            }
        });
    }
}