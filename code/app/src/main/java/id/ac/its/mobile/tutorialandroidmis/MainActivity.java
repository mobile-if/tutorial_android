package id.ac.its.mobile.tutorialandroidmis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin, btnRegister;

    private ImageView ivIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
        btnRegister = findViewById(R.id.btn_register);
        ivIcon = findViewById(R.id.iv_icon);

        etUsername.setText("mobile");
        etPassword.setText("coba");

        etUsername.getText();
        Toast.makeText(this, etUsername.getText().toString(), Toast.LENGTH_SHORT).show();

        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        ivIcon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_icon:
                Toast.makeText(this, "OKE", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_login:
                String content = etUsername.getText().toString() + " " + etPassword.getText().toString();

                Toast.makeText(MainActivity.this, content, Toast.LENGTH_SHORT).show();

                Intent nextIntent = new Intent(MainActivity.this, DashboardActivity.class);
                nextIntent.putExtra(DashboardActivity.EXTRA_CONTENT, content);
                startActivity(nextIntent);

                //finish();


                break;
            case R.id.btn_register:
                Toast.makeText(this, "Registrasi!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
