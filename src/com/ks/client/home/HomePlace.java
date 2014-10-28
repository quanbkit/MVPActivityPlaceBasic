package com.ks.client.home;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class HomePlace  extends Place{
	
	public HomePlace() {
		super();
	}
	
	public String getToken() {
		return "home";
	}
	
	public static class Tokenizer implements PlaceTokenizer<HomePlace> {
        @Override
        public String getToken(HomePlace place) {
            return place.getToken();
        }

        @Override
        public HomePlace getPlace(String token) {
            return new HomePlace();
        }
    }

}
