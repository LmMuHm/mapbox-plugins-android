package com.mapbox.mapboxsdk.plugins.places.autocomplete.ui;

import com.mapbox.api.geocoding.v5.models.CarmenFeature;

public interface ResultClickCallback {
  void onClick(CarmenFeature carmenFeature);
}