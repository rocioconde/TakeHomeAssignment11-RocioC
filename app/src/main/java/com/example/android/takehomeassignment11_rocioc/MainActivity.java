package com.example.android.takehomeassignment11_rocioc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<GraduateSchoolOfEducation> gse;
    private SchoolOfEducationAdapter schoolsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        schoolsAdapter = new SchoolOfEducationAdapter(gse, this);
        recyclerView.setAdapter(schoolsAdapter);
    }

    public void addRandomSchool(View view) {
        gse.add(getRandomSchool());
        schoolsAdapter.notifyDataSetChanged();
    }

    private void initialData() {
        gse = new ArrayList<>();
        gse.add(new GraduateSchoolOfEducation("Teachers College, Columbia University", 4892, 1877, R.drawable.teacherscollege));
        gse.add(new GraduateSchoolOfEducation("Stanford Graduate School of Education", 866, 1920, R.drawable.stanford));
        gse.add(new GraduateSchoolOfEducation("Harvard Graduate School of Education", 339, 1891, R.drawable.harvard));
    }

    private GraduateSchoolOfEducation getRandomSchool() {
        int num = (int) (Math.random() * 3);
        if (num == 0)
            return new GraduateSchoolOfEducation("Stanford Graduate School of Education", 866, 1920, R.drawable.stanford);
        else if (num == 1)
            return new GraduateSchoolOfEducation("Harvard Graduate School of Education", 339, 1891, R.drawable.harvard);
        else
            return new GraduateSchoolOfEducation("Teachers College, Columbia University", 4892, 1877, R.drawable.teacherscollege);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_item_add:
                gse.add(getRandomSchool());
                schoolsAdapter.notifyDataSetChanged();
                Toast.makeText(this, "New school added", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_item_settings:
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
