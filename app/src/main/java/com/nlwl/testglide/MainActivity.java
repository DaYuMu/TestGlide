package com.nlwl.testglide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.nlwl.testglide.ListViewAndGridView.ListViewActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setListener();

	}

	private void setListener() {



	}

	public void BitMap(View view) {
		Intent intent = new Intent(this, BitMapActivity.class);
		startActivity(intent);

	}

	public void ListView(View view) {
		Intent intent = new Intent(this, ListViewActivity.class);
		startActivity(intent);
	}
}