package com.ks.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;
import com.ks.client.activities.AppActivityMapper;
import com.ks.client.activities.AppPlaceHistoryMapper;
import com.ks.client.activities.ClientFactory;
import com.ks.client.activities.ClientFactoryImpl;
import com.ks.client.home.HomePlace;

public class UpImageToAmazone implements EntryPoint {
	
	SimplePanel appWidget = new SimplePanel();
	public static ClientFactory clientFactory = new ClientFactoryImpl();
	
	public void onModuleLoad() {
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();

		// Start ActivityManager for the main widget with our ActivityMapper
		ActivityMapper activityMapper = new AppActivityMapper(clientFactory);
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(appWidget);

		// Start PlaceHistoryHandler with our PlaceHistoryMapper
		AppPlaceHistoryMapper historyMapper= GWT.create(AppPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, new HomePlace());

		RootPanel.get().add(appWidget);
		historyHandler.handleCurrentHistory();
	}
}
