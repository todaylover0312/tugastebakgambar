package com.tugas.tebakgambar;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class TopengActivity extends Activity {
 //deklarasi variabel
	EditText jawabantxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topeng);
        jawabantxt = (EditText)findViewById(R.id.editText1);
        jawabantxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
        
        
    }

    public void cek(View v){
    	String jawabanBenar = "TOPENG MONYET";
    	String jawabanUser = jawabantxt.getText().toString();
    	if(jawabanUser.equals(jawabanBenar)){
    		//pesan Toast
    		Toast.makeText(getApplicationContext()," JAWABAN TEPAT !", Toast.LENGTH_LONG).show();
    		Intent i = new Intent(getApplicationContext(),BerhasilActivity.class);
    		startActivity(i);
    		
    	}
    	else {
    		Toast.makeText(getApplicationContext(),  " JAWABAN MASIH SALAH ", Toast.LENGTH_LONG).show();
    		
    	}
    	
    	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
