package de.binosys.dagger_2_demo.crossconcern.dagger;

/**
 * Created by Gabriel on 28.03.17.
 */

import javax.inject.Singleton;

import dagger.Component;
import de.binosys.dagger_2_demo.ui.main.MainActivity;


@Singleton
@Component(modules = {AppModule.class, MainModule.class})
public interface DIComponent {

	void inject(MainActivity mainActivity);
}
