package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class ApiConfig implements Serializable {
  @NonNull
  private final String postUrl;

  @Nullable
  private final List<Param> queryParamList;
  @Nullable
  private final List<Param> headerParamList;
  @Nullable
  private final List<Param> requestBodyParamList;

  public ApiConfig(@NonNull String postUrl,
                   @Nullable List<Param> queryParamList,
                   @Nullable List<Param> headerParamList,
                   @Nullable List<Param> requestBodyParamList) {
    this.postUrl = postUrl;
    this.queryParamList = queryParamList;
    this.headerParamList = headerParamList;
    this.requestBodyParamList = requestBodyParamList;
  }

  @NonNull
  public String getPostUrl() {
    return postUrl;
  }

  @Nullable
  public List<Param> getQueryParamList() {
    return queryParamList;
  }

  @Nullable
  public List<Param> getHeaderParamList() {
    return headerParamList;
  }

  @Nullable
  public List<Param> getRequestBodyParamList() {
    return requestBodyParamList;
  }
}
