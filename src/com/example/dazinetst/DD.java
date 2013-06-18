package com.example.dazinetst;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class DD extends Activity implements View.OnClickListener {

	Button button1;
	Button buttonProgramma;
	Button buttonNews;
	Button buttonTeams;
	
	// contact button
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dd);
        button1 = (Button)findViewById(R.id.buttonContact);
        button1.setOnClickListener(this);
        
        buttonProgramma = (Button) findViewById(R.id.buttonProgramma); 
        buttonProgramma.setOnClickListener(this);
        
        buttonNews = (Button) findViewById(R.id.buttonNews); 
        buttonNews.setOnClickListener(this);
        
        buttonTeams = (Button) findViewById(R.id.buttonTeams); 
        buttonTeams.setOnClickListener(this);
        
    }

    
	@Override
	public void onClick(View v) {
		switch (v.getId())
		{
		case R.id.buttonContact:
			startActivity(new Intent("com.example.dazinetst.Contact"));
			break;
		case R.id.buttonProgramma:
			startActivity(new Intent("com.example.dazinetst.Programma"));
	        break;
		case R.id.buttonNews:
			startActivity(new Intent("com.example.dazinetst.RssReader"));
	        break;
		case R.id.buttonTeams:
			startActivity(new Intent("com.example.dazinetst.Teams"));
	        break;
		}
    
	}
	    
}
