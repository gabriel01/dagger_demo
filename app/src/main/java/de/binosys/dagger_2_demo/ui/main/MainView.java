package de.binosys.dagger_2_demo.ui.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import javax.inject.Inject;

import de.binosys.dagger_2_demo.R;
import de.binosys.dagger_2_demo.ui.main.MvpMain.Presenter;


/**
 * Created by Gabriel on 28.03.17.
 */

public class MainView extends FrameLayout implements MvpMain.View {


	Presenter presenter;

	@Inject
	public MainView(@NonNull Context context, Presenter presenter) {

		super(context);
		this.presenter = presenter;

		initView(context);
	}

	private void initView(Context context) {

		android.view.View root = inflate(context, R.layout.main_view, this);

		Button button = (Button) root.findViewById(R.id.button_toast);
		button.setOnClickListener(view -> presenter.onButtonClick());
	}

	@Override
	protected void onAttachedToWindow() {

		super.onAttachedToWindow();
		presenter.bindView(this);
	}

	@Override
	public void showToast(String message) {

		Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
	}
}
