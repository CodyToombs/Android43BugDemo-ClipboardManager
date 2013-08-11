package com.androidpolice.android43bugdemo.clipboardmanager;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btnEnable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initControls();
	}

	private void initControls() {
		btnEnable = (Button) findViewById(R.id.button_enable);
		btnEnable.setOnClickListener(onClick_Enabled);
	}

	private View.OnClickListener onClick_Enabled = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			ClipboardManager manager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
			manager.addPrimaryClipChangedListener(new ClipboardManager.OnPrimaryClipChangedListener() {
				@Override
				public void onPrimaryClipChanged() {

				}
			});
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
