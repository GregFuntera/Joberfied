package com.chrs.iit.android.greg.joberfied;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView iv_jobseeker,iv_employer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_jobseeker=(ImageView)findViewById(R.id.iv_jobSeeker);
        iv_jobseeker.setOnClickListener(this);
        iv_employer=(ImageView)findViewById(R.id.iv_employer);
        iv_employer.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.iv_jobSeeker:
                Intent showJobseeker =new Intent(this,JobSeeker.class);
                startActivity(showJobseeker);
                break;
            case R.id.iv_employer:
                Intent showEmployer=new Intent(this,Employer.class);
                startActivity(showEmployer);
                break;
        }
    }

}
