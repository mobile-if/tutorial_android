package id.ac.its.mobile.tutorialandroidmis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
    public static final String EXTRA_CONTENT = "extra_content";


    private TextView tvContent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Dashboard");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        String content = getIntent().getStringExtra(EXTRA_CONTENT);

        tvContent = findViewById(R.id.tv_content);

        tvContent.setText(content);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
