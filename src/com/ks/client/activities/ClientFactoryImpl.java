package com.ks.client.activities;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.ks.client.home.HomeView;
import com.ks.client.home.HomeViewImpl;

public class ClientFactoryImpl implements ClientFactory {
	private SimpleEventBus eventBus;
	private PlaceController placeController;
	private HomeView homeView;
	
	public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();
		placeController = new PlaceController(eventBus);
	}
	
	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public HomeView getHomeView() {
		if(homeView==null){
			homeView= new HomeViewImpl();
		}
		return homeView;
	}
}
