package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class LogPostConfig extends ApiConfig implements Serializable {
  @NonNull
  private String packageName;
  @NonNull
  private String descriptionKeyName;
  @Nullable
  private List<Param> logEntryParams;

  public LogPostConfig(@NonNull String postUrl,
                       @Nullable List<Param> queryParamList,
                       @Nullable List<Param> headerParamList,
                       @Nullable List<Param> requestBodyParamList,
                       @NonNull String packageName,
                       @NonNull String descriptionKeyName,
                       @Nullable List<Param> logEntryParams) {
    super(postUrl, queryParamList, headerParamList, requestBodyParamList);
    this.packageName = packageName;
    this.descriptionKeyName = descriptionKeyName;
    this.logEntryParams = logEntryParams;
  }

  @NonNull
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(@NonNull String packageName) {
    this.packageName = packageName;
  }

  @NonNull
  public String getDescriptionKeyName() {
    return descriptionKeyName;
  }

  public void setDescriptionKeyName(@NonNull String descriptionKeyName) {
    this.descriptionKeyName = descriptionKeyName;
  }

  @Nullable
  public List<Param> getLogEntryParams() {
    return logEntryParams;
  }

  public void setLogEntryParams(@Nullable List<Param> logEntryParams) {
    this.logEntryParams = logEntryParams;
  }
}
