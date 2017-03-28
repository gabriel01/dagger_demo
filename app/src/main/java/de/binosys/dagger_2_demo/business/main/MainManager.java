package de.binosys.dagger_2_demo.business.main;

import javax.inject.Inject;


/**
 * Created by Gabriel on 28.03.17.
 */

public class MainManager {

	@Inject
	public MainManager(){

	}

	public String toastMessage(){
		return "This is a toast";
	}
}
