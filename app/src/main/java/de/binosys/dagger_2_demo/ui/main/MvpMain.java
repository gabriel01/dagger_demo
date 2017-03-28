package de.binosys.dagger_2_demo.ui.main;

import de.binosys.dagger_2_demo.crossconcern.mvp.MvpPresenter;


/**
 * Created by Gabriel on 28.03.17.
 */

public interface MvpMain {

	interface Presenter extends MvpPresenter<View> {
		void onButtonClick();
	}

	interface View {
		void showToast(String message);
	}
}



