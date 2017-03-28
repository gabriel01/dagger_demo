package de.binosys.dagger_2_demo;

import android.app.Application;

import de.binosys.dagger_2_demo.crossconcern.dagger.AppModule;
import de.binosys.dagger_2_demo.crossconcern.dagger.DIComponent;
import de.binosys.dagger_2_demo.crossconcern.dagger.DaggerDIComponent;


/**
 * Created by Gabriel on 28.03.17.
 */

public class DaggerApplication extends Application {

	DIComponent graph;

	@Override
	public void onCreate() {

		super.onCreate();
		graph = DaggerDIComponent.builder()
				.appModule(new AppModule(this))
				.build();
	}

	public DIComponent graph() {

		return graph;
	}
}
