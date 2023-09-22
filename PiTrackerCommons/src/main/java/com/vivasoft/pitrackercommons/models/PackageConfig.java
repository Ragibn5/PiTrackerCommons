package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class PackageConfig implements Serializable {
  @NonNull
  final String packageName;
  @NonNull
  private final LogPostConfig logPostConfig;
  @NonNull
  private final LocationPostConfig locationPostConfig;

  public PackageConfig(@NonNull String packageName, @NonNull LogPostConfig logPostConfig, @NonNull LocationPostConfig locationPostConfig) {
    this.packageName = packageName;
    this.logPostConfig = logPostConfig;
    this.locationPostConfig = locationPostConfig;
  }

  @NonNull
  public String getPackageName() {
    return packageName;
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
