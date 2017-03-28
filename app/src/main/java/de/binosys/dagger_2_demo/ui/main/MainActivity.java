package de.binosys.dagger_2_demo.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import javax.inject.Inject;

import de.binosys.dagger_2_demo.DaggerApplication;
import de.binosys.dagger_2_demo.R;


public class MainActivity extends AppCompatActivity {

	@Inject
	MainView mainView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((DaggerApplication)getApplication()).graph().inject(this);

		FrameLayout root = (FrameLayout) findViewById(R.id.container_main);
		root.addView(mainView);

	}

}
