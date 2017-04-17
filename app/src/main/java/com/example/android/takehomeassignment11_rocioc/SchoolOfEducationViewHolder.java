package com.example.android.takehomeassignment11_rocioc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SchoolOfEducationViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView schoolNameView;
    private TextView schoolEnrollmentView;
    private TextView schoolYearOfFoundationView;
    private ImageView schoolPhotoView;
    private Context context;

    public SchoolOfEducationViewHolder(View itemView, Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        schoolNameView = (TextView) itemView.findViewById(R.id.school_name);
        schoolEnrollmentView = (TextView) itemView.findViewById(R.id.school_enrollment);
        schoolYearOfFoundationView = (TextView) itemView.findViewById(R.id.school_year_of_foundation);
        schoolPhotoView = (ImageView) itemView.findViewById(R.id.school_photo);
        this.context = context;
    }

    public void bind(final GraduateSchoolOfEducation school) {
        schoolNameView.setText(school.name);
        schoolEnrollmentView.setText(String.valueOf(school.totalEnrollment));
        schoolYearOfFoundationView.setText(String.valueOf(school.yearOfFoundation));
        schoolPhotoView.setImageResource(school.photoId);


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra(Keys.GSE, school);
                context.startActivity(intent);

            }
        });

    }
}
