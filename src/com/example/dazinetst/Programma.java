package com.example.dazinetst;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class Programma extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_programma);
		
		TabHost tabHost = getTabHost();
        
        TabSpec tab1spec = tabHost.newTabSpec("Tab1");
        // setting Title and Icon for the Tab
        tab1spec.setIndicator("Tab1", getResources().getDrawable(R.drawable.ic_action_tab1));
        Intent photosIntent = new Intent(this, Tab1.class);
        tab1spec.setContent(photosIntent);
         
        TabSpec tab2spec = tabHost.newTabSpec("Tab2");        
        tab2spec.setIndicator("Tab2", getResources().getDrawable(R.drawable.ic_action_tab2));
        Intent songsIntent = new Intent(this, Tab2.class);
        tab2spec.setContent(songsIntent);
         
         
        // Adding all TabSpec to TabHost
        tabHost.addTab(tab1spec); 
        tabHost.addTab(tab2spec); 
	}

}