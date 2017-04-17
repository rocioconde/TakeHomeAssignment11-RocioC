package com.example.android.takehomeassignment11_rocioc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SchoolOfEducationAdapter extends RecyclerView.Adapter<SchoolOfEducationViewHolder> {

    private List<GraduateSchoolOfEducation> gse;
    private Context context;

    public SchoolOfEducationAdapter(List<GraduateSchoolOfEducation> gse, Context context) {
        this.gse = gse;
        this.context = context;
    }

    @Override
    public SchoolOfEducationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_school_of_education, parent, false);
        return new SchoolOfEducationViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(SchoolOfEducationViewHolder holder, int position) {
        GraduateSchoolOfEducation school = gse.get(position);
        holder.bind(school);
    }

    @Override
    public int getItemCount() {
        return gse.size();
    }
}
