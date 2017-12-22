package com.whyshoudi.understandingconcepts2;

/**
 * Created by Saksham Raj Shokeen on 12/22/2017.
 */
//
//My class takes in 2 inputs, one string and one integer
//class name is Report Card

public class ReportCard {

    private String mSubject;
    private int mMarks;

    //    Constructor takes 2 params
    public ReportCard(String Subject, int Marks) {
        mSubject = Subject;
        mMarks = Marks;

    }

    //  setting up getters;
    public int getMarks() {
        return mMarks;
    }
    public String getSubject() {
        return mSubject;
    }

}
