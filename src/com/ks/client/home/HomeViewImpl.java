package com.ks.client.home;

import com.github.gwtbootstrap.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;

public class HomeViewImpl extends VerticalPanel implements HomeView {
	
	public HomeViewImpl() {
		super();
		Button button = new Button("Home");
		this.add(button);
	}

}
