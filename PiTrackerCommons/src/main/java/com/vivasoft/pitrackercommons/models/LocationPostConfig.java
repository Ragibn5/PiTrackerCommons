package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class LocationPostConfig extends ApiConfig implements Serializable {
  @NonNull
  private String packageName;
  @NonNull
  private String latitudeKeyName;
  @NonNull
  private String longitudeKeyName;
  @NonNull
  private String timeStampKeyName;
  @NonNull
  private String locationEntriesKeyName;
  @Nullable
  private List<Param> locationEntryParams;
  @NonNull
  private List<DailyOperationHours> dailyOperationHoursList;

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

  public void setPackageName(@NonNull String packageName) {
    this.packageName = packageName;
  }

  @NonNull
  public String getLatitudeKeyName() {
    return latitudeKeyName;
  }

  public void setLatitudeKeyName(@NonNull String latitudeKeyName) {
    this.latitudeKeyName = latitudeKeyName;
  }

  @NonNull
  public String getLongitudeKeyName() {
    return longitudeKeyName;
  }

  public void setLongitudeKeyName(@NonNull String longitudeKeyName) {
    this.longitudeKeyName = longitudeKeyName;
  }

  @NonNull
  public String getTimeStampKeyName() {
    return timeStampKeyName;
  }

  public void setTimeStampKeyName(@NonNull String timeStampKeyName) {
    this.timeStampKeyName = timeStampKeyName;
  }

  @NonNull
  public String getLocationEntriesKeyName() {
    return locationEntriesKeyName;
  }

  public void setLocationEntriesKeyName(@NonNull String locationEntriesKeyName) {
    this.locationEntriesKeyName = locationEntriesKeyName;
  }

  @Nullable
  public List<Param> getLocationEntryParams() {
    return locationEntryParams;
  }

  public void setLocationEntryParams(@Nullable List<Param> locationEntryParams) {
    this.locationEntryParams = locationEntryParams;
  }

  @NonNull
  public List<DailyOperationHours> getDailyOperationHoursList() {
    return dailyOperationHoursList;
  }

  public void setDailyOperationHoursList(@NonNull List<DailyOperationHours> dailyOperationHoursList) {
    this.dailyOperationHoursList = dailyOperationHoursList;
  }
}
