package com.whyshoudi.understandingconcepts2;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Saksham Raj Shokeen on 12/22/2017.
 */

//
//my adapter taking 2 params , one Context and another ArrayList
//this adapter is an extension of AN ARRAY ADAPTER
//**NO IDEA WHY WE SET RESOURSE == 0 AND WHAT IS THE MEANING OF INFLATING

public class theAdapter extends ArrayAdapter<ReportCard> {

    public theAdapter(Activity context, ArrayList<ReportCard> reportCard){

        super(context,0,reportCard);
    }


//    OVERRIDING THE getView method


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View myView = convertView;

        if(myView == null) {
            myView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

//        gettingPosition
        ReportCard currentSubject = getItem(position);
//        setting up the text views
        TextView subjectText = (TextView) myView.findViewById(R.id.subject);
        subjectText.setText(currentSubject.getSubject());

//      setting up second text view
        TextView marksText = (TextView) myView.findViewById(R.id.marks);
        marksText.setText(currentSubject.getMarks());

    return myView;
    }
}
