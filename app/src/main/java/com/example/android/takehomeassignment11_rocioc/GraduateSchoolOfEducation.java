package com.example.android.takehomeassignment11_rocioc;

import java.io.Serializable;

/**
 * Created by ccteuser on 4/17/17.
 */

public class GraduateSchoolOfEducation implements Serializable {

    public String name;
    public int totalEnrollment;
    public int yearOfFoundation;
    public int photoId;

    public GraduateSchoolOfEducation(String name, int totalEnrollment, int yearOfFoundation, int photoId) {
        this.name = name;
        this.totalEnrollment = totalEnrollment;
        this.yearOfFoundation = yearOfFoundation;
        this.photoId = photoId;
    }


}
