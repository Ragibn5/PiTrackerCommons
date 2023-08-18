package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class LocationPostConfig extends ApiConfig implements Serializable {
  @NonNull
  private String packageName;
  @NonNull
  private List<DailyOperationHours> dailyOperationHoursList;

  public LocationPostConfig(@NonNull String postUrl,
                            @Nullable String authToken,
                            @Nullable List<Param> queryParamList,
                            @Nullable List<Param> headerParamList,
                            @Nullable List<Param> requestBodyParamList,
                            @NonNull String packageName,
                            @NonNull List<DailyOperationHours> dailyOperationHoursList) {
    super(postUrl, authToken, queryParamList, headerParamList, requestBodyParamList);
    this.packageName = packageName;
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
  public List<DailyOperationHours> getDailyOperationHoursList() {
    return dailyOperationHoursList;
  }

  public void setDailyOperationHoursList(@NonNull List<DailyOperationHours> dailyOperationHoursList) {
    this.dailyOperationHoursList = dailyOperationHoursList;
  }
}
