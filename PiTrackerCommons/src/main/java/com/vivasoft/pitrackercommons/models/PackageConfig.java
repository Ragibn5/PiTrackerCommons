package com.vivasoft.pitrackercommons.models;

import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class PackageConfig implements Serializable {
  @Nullable
  private String dataPostUrl;
  @Nullable
  private String authToken;
  @Nullable
  private String requestMethod;
  @Nullable
  private List<DailyOperationHours> dailyOperationHoursList;

  public PackageConfig() {
  }

  public PackageConfig(
    @Nullable String dataPostUrl,
    @Nullable String authToken,
    @Nullable String requestMethod,
    @Nullable List<DailyOperationHours> dailyOperationHoursList) {
    this.dataPostUrl = dataPostUrl;
    this.authToken = authToken;
    this.requestMethod = requestMethod;
    this.dailyOperationHoursList = dailyOperationHoursList;
  }

  @Nullable
  public String getDataPostUrl() {
    return dataPostUrl;
  }

  public void setDataPostUrl(@Nullable String dataPostUrl) {
    this.dataPostUrl = dataPostUrl;
  }

  @Nullable
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(@Nullable String authToken) {
    this.authToken = authToken;
  }

  @Nullable
  public String getRequestMethod() {
    return requestMethod;
  }

  public void setRequestMethod(@Nullable String requestMethod) {
    this.requestMethod = requestMethod;
  }

  @Nullable
  public List<DailyOperationHours> getDailyOperationHoursList() {
    return dailyOperationHoursList;
  }

  public void setDailyOperationHoursList(@Nullable List<DailyOperationHours> dailyOperationHoursList) {
    this.dailyOperationHoursList = dailyOperationHoursList;
  }
}
