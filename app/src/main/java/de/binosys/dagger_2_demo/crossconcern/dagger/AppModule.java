package de.binosys.dagger_2_demo.crossconcern.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;


/**
 * Created by Gabriel on 28.03.17.
 */
@Module
public class AppModule {

	Context context;

	public AppModule(Context context) {

		this.context = context;
	}

	@Provides
	public Context provideContext() {

		return context;
	}
}
