package com.ks.client.home;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.ks.client.activities.ClientFactory;

public class HomeActivity  extends AbstractActivity{
	
	private HomeView view;
	private ClientFactory clientFactory;
	private EventBus eventBus;
	
	public HomeActivity(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		view = clientFactory.getHomeView();
		panel.setWidget(view.asWidget());
		this.eventBus = eventBus;
		bind();
	}

	private void bind() {
		
	}
}
