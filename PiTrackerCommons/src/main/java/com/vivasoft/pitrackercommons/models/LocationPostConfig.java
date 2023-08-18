package com.vivasoft.pitrackercommons.models;

import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class LocationPostConfig extends ApiConfig implements Serializable {
  @Nullable
  private String packageName;
  @Nullable
  private List<DailyOperationHours> dailyOperationHoursList;

  public LocationPostConfig(@Nullable String postUrl,
                            @Nullable String authToken,
                            @Nullable List<Param> queryParamList,
                            @Nullable List<Param> headerParamList,
                            @Nullable List<Param> requestBodyParamList,
                            @Nullable String packageName,
                            @Nullable List<DailyOperationHours> dailyOperationHoursList) {
    super(postUrl, authToken, queryParamList, headerParamList, requestBodyParamList);
    this.packageName = packageName;
    this.dailyOperationHoursList = dailyOperationHoursList;
  }

  @Nullable
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(@Nullable String packageName) {
    this.packageName = packageName;
  }

  @Nullable
  public List<DailyOperationHours> getDailyOperationHoursList() {
    return dailyOperationHoursList;
  }

  public void setDailyOperationHoursList(@Nullable List<DailyOperationHours> dailyOperationHoursList) {
    this.dailyOperationHoursList = dailyOperationHoursList;
  }
}
