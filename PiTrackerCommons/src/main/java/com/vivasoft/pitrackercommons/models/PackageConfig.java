package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class PackageConfig implements Serializable {
  @NonNull
  private final LogPostConfig logPostConfig;
  @NonNull
  private final LocationPostConfig locationPostConfig;

  public PackageConfig(@NonNull LogPostConfig logPostConfig, @NonNull LocationPostConfig locationPostConfig) {
    this.logPostConfig = logPostConfig;
    this.locationPostConfig = locationPostConfig;
  }

  @NonNull
  public LogPostConfig getLogPostConfig() {
    return logPostConfig;
  }

  @NonNull
  public LocationPostConfig getLocationPostConfig() {
    return locationPostConfig;
  }
}
