package com.ks.client.activities;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.ks.client.home.HomeActivity;
import com.ks.client.home.HomePlace;

public class AppActivityMapper implements ActivityMapper {
	
	private ClientFactory clientFactory;
	
	public AppActivityMapper(ClientFactory clientFactory){
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof HomePlace){
			return new HomeActivity(clientFactory);
		}
		return null;
	}

}
