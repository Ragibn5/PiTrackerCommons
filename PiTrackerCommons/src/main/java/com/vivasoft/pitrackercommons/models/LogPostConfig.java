package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class LogPostConfig extends ApiConfig implements Serializable {
  @NonNull
  private String packageName;

  public LogPostConfig(@NonNull String postUrl,
                       @Nullable String authToken,
                       @Nullable List<Param> queryParamList,
                       @Nullable List<Param> headerParamList,
                       @Nullable List<Param> requestBodyParamList,
                       @NonNull String packageName) {
    super(postUrl, authToken, queryParamList, headerParamList, requestBodyParamList);
    this.packageName = packageName;
  }

  @NonNull
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(@NonNull String packageName) {
    this.packageName = packageName;
  }
}
