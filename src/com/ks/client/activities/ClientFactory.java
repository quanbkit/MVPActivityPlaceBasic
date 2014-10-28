package com.ks.client.activities;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.ks.client.home.HomeView;

public interface ClientFactory {
	
	PlaceController getPlaceController();

	EventBus getEventBus();

	HomeView getHomeView();
}
