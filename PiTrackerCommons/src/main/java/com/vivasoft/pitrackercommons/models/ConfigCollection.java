package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class ConfigCollection implements Serializable {
  @NonNull
  LogPostConfig logPostConfig;
  @NonNull
  LocationPostConfig locationPostConfig;

  public ConfigCollection(@NonNull LogPostConfig logPostConfig, @NonNull LocationPostConfig locationPostConfig) {
    this.logPostConfig = logPostConfig;
    this.locationPostConfig = locationPostConfig;
  }

  @NonNull
  public LogPostConfig getLogPostConfig() {
    return logPostConfig;
  }

  public void setLogPostConfig(@NonNull LogPostConfig logPostConfig) {
    this.logPostConfig = logPostConfig;
  }

  @NonNull
  public LocationPostConfig getLocationPostConfig() {
    return locationPostConfig;
  }

  public void setLocationPostConfig(@NonNull LocationPostConfig locationPostConfig) {
    this.locationPostConfig = locationPostConfig;
  }
}
