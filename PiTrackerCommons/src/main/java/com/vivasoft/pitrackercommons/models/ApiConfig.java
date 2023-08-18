package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class ApiConfig implements Serializable {
  @NonNull
  private String postUrl;

  @Nullable
  private String authToken;

  @Nullable
  private List<Param> queryParamList;
  @Nullable
  private List<Param> headerParamList;
  @Nullable
  private List<Param> requestBodyParamList;

  public ApiConfig(@NonNull String postUrl,
                   @Nullable String authToken,
                   @Nullable List<Param> queryParamList,
                   @Nullable List<Param> headerParamList,
                   @Nullable List<Param> requestBodyParamList) {
    this.postUrl = postUrl;
    this.authToken = authToken;
    this.queryParamList = queryParamList;
    this.headerParamList = headerParamList;
    this.requestBodyParamList = requestBodyParamList;
  }

  @NonNull
  public String getPostUrl() {
    return postUrl;
  }

  public void setPostUrl(@NonNull String postUrl) {
    this.postUrl = postUrl;
  }

  @Nullable
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(@Nullable String authToken) {
    this.authToken = authToken;
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
