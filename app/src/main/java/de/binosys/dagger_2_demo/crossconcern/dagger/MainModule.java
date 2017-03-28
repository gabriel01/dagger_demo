package de.binosys.dagger_2_demo.crossconcern.dagger;

import dagger.Module;
import dagger.Provides;
import de.binosys.dagger_2_demo.ui.main.MainPresenter;
import de.binosys.dagger_2_demo.ui.main.MvpMain;


/**
 * Created by Gabriel on 28.03.17.
 */

@Module
public class MainModule {

	@Provides
	public MvpMain.Presenter providesPresenter(MainPresenter presenter){
		return presenter;
	}
}
