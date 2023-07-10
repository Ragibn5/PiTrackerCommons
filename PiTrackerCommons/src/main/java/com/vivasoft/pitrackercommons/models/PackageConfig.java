package com.vivasoft.pitrackercommons.models;

import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class PackageConfig implements Serializable {
  @Nullable
  private String dataPostUrl;
  @Nullable
  private String requestMethod;

  @Nullable
  private List<DailyOperationHours> dailyOperationHoursList;

  @Nullable
  private List<Param> queryParamList;
  @Nullable
  private List<Param> headerParamList;
  @Nullable
  private List<Param> requestBodyParamList;

  public PackageConfig() {
  }

  public PackageConfig(
    @Nullable String dataPostUrl,
    @Nullable String requestMethod,
    @Nullable List<DailyOperationHours> dailyOperationHoursList,
    @Nullable List<Param> queryParamList,
    @Nullable List<Param> headerParamList,
    @Nullable List<Param> requestBodyParamList
  ) {
    this.dataPostUrl = dataPostUrl;
    this.requestMethod = requestMethod;
    this.dailyOperationHoursList = dailyOperationHoursList;
    this.queryParamList = queryParamList;
    this.headerParamList = headerParamList;
    this.requestBodyParamList = requestBodyParamList;
  }

  @Nullable
  public String getDataPostUrl() {
    return dataPostUrl;
  }

  public void setDataPostUrl(@Nullable String dataPostUrl) {
    this.dataPostUrl = dataPostUrl;
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

  @Nullable
  public List<Param> getQueryParamList() {
    return queryParamList;
  }

  public void setQueryParamList(@Nullable List<Param> queryParamList) {
    this.queryParamList = queryParamList;
  }

  @Nullable
  public List<Param> getHeaderParamList() {
    return headerParamList;
  }

  public void setHeaderParamList(@Nullable List<Param> headerParamList) {
    this.headerParamList = headerParamList;
  }

  @Nullable
  public List<Param> getRequestBodyParamList() {
    return requestBodyParamList;
  }

  public void setRequestBodyParamList(@Nullable List<Param> requestBodyParamList) {
    this.requestBodyParamList = requestBodyParamList;
  }
}
