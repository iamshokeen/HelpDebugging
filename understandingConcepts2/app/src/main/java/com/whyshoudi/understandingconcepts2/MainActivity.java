package com.whyshoudi.understandingconcepts2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      creating the new array list
        ArrayList<ReportCard> reportCard = new ArrayList<ReportCard>();
//giving values to the objects in my ReportCard class
        reportCard.add(new ReportCard("English",96));
        reportCard.add(new ReportCard("Math",99));
        reportCard.add(new ReportCard("Physics",95));
        reportCard.add(new ReportCard("Chemistry",95));
        reportCard.add(new ReportCard("Physical Edu",97));
        reportCard.add(new ReportCard("History",98));

//      set Adapter
        theAdapter Adapter = new theAdapter(this,reportCard);
//       set list
        ListView myList = (ListView) findViewById(R.id.listmView);
//        sending my adapter to the list view
        myList.setAdapter(Adapter);

    }
}
