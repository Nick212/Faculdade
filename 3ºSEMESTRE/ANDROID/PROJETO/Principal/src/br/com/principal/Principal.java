package br.com.principal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Principal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);
	}

	public void btnAdm_Click(View view){
		
		Intent it = new Intent(this, Login.class);
		startActivity(it);
		
	}
	
	public void btnSair_Click(View view){
    	Intent intent = new Intent(Intent.ACTION_MAIN); 
    	finish();
	}
}
