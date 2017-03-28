package de.binosys.dagger_2_demo.crossconcern.mvp;

/**
 * Created by Gabriel on 28.03.17.
 */

public interface MvpPresenter<T> {

	void bindView(T view);

}
