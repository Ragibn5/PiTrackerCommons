package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class LocationPostConfig extends ApiConfig implements Serializable {
  @NonNull
  private final String packageName;
  @NonNull
  private final String latitudeKeyName;
  @NonNull
  private final String longitudeKeyName;
  @NonNull
  private final String timeStampKeyName;
  @NonNull
  private final String locationEntriesKeyName;
  @Nullable
  private final List<Param> locationEntryParams;
  @NonNull
  private final List<DailyOperationHours> dailyOperationHoursList;

  public LocationPostConfig(@NonNull String postUrl,
                            @Nullable List<Param> queryParamList,
                            @Nullable List<Param> headerParamList,
                            @Nullable List<Param> requestBodyParamList,
                            @NonNull String packageName,
                            @NonNull String latitudeKeyName,
                            @NonNull String longitudeKeyName,
                            @NonNull String timeStampKeyName,
                            @NonNull String locationEntriesKeyName,
                            @Nullable List<Param> locationEntryParams,
                            @NonNull List<DailyOperationHours> dailyOperationHoursList) {
    super(postUrl, queryParamList, headerParamList, requestBodyParamList);
    this.packageName = packageName;
    this.latitudeKeyName = latitudeKeyName;
    this.longitudeKeyName = longitudeKeyName;
    this.timeStampKeyName = timeStampKeyName;
    this.locationEntriesKeyName = locationEntriesKeyName;
    this.locationEntryParams = locationEntryParams;
    this.dailyOperationHoursList = dailyOperationHoursList;
  }

  @NonNull
  public String getPackageName() {
    return packageName;
  }

  @NonNull
  public String getLatitudeKeyName() {
    return latitudeKeyName;
  }

  @NonNull
  public String getLongitudeKeyName() {
    return longitudeKeyName;
  }

  @NonNull
  public String getTimeStampKeyName() {
    return timeStampKeyName;
  }

  @NonNull
  public String getLocationEntriesKeyName() {
    return locationEntriesKeyName;
  }

  @Nullable
  public List<Param> getLocationEntryParams() {
    return locationEntryParams;
  }

  @NonNull
  public List<DailyOperationHours> getDailyOperationHoursList() {
    return dailyOperationHoursList;
  }
}
