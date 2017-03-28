package de.binosys.dagger_2_demo.ui.main;

import javax.inject.Inject;

import de.binosys.dagger_2_demo.business.main.MainManager;
import de.binosys.dagger_2_demo.ui.main.MvpMain.Presenter;
import de.binosys.dagger_2_demo.ui.main.MvpMain.View;


/**
 * Created by Gabriel on 28.03.17.
 */

public class MainPresenter implements Presenter {

	View view;

	@Inject
	MainManager manager;

	// FIXME: this constructor should be obsolete. What has to be done to be able to remove it???
	@Inject
	public MainPresenter(MainManager manager) {

		this.manager = manager;
	}

	@Override
	public void onButtonClick() {

		String message = manager.toastMessage();
		view.showToast(message);
	}

	@Override
	public void bindView(View view) {

		this.view = view;
	}
}
