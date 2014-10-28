package com.ks.client.activities;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.ks.client.home.HomePlace;

@WithTokenizers({HomePlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
