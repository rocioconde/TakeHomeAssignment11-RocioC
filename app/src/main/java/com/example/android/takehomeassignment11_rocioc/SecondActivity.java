package com.example.android.takehomeassignment11_rocioc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private ImageView schoolPhoto;
    private TextView schoolName;
    private TextView schoolEnrollment;
    private TextView schoolYearOfFoundation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        schoolPhoto = (ImageView) findViewById(R.id.school_photo);
        schoolName = (TextView) findViewById(R.id.school_name);
        schoolEnrollment = (TextView) findViewById(R.id.school_enrollment);
        schoolYearOfFoundation = (TextView) findViewById(R.id.school_year_of_foundation);

        Intent intent = getIntent();
        GraduateSchoolOfEducation gse = (GraduateSchoolOfEducation) intent.getSerializableExtra(Keys.GSE);
        schoolPhoto.setImageResource(gse.photoId);
        schoolName.setText(gse.name);
        schoolEnrollment.setText(String.valueOf(gse.totalEnrollment));
        schoolYearOfFoundation.setText(String.valueOf(gse.yearOfFoundation));


    }
}
