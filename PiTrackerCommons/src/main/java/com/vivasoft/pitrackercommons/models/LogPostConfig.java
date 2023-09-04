package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;
import java.util.List;

public class LogPostConfig extends ApiConfig implements Serializable {
  @NonNull
  private String packageName;
  @NonNull
  private final String typeKeyName;
  @NonNull
  private final String descriptionKeyName;
  @NonNull
  private final String timeStampKeyName;
  @NonNull
  private final String logEntriesKeyName;
  @Nullable
  private final List<Param> logEntryParams;

  public LogPostConfig(@NonNull String postUrl,
                       @Nullable List<Param> queryParamList,
                       @Nullable List<Param> headerParamList,
                       @Nullable List<Param> requestBodyParamList,
                       @NonNull String packageName,
                       @NonNull String typeKeyName,
                       @NonNull String descriptionKeyName,
                       @NonNull String timeStampKeyName,
                       @NonNull String logEntriesKeyName,
                       @Nullable List<Param> logEntryParams) {
    super(postUrl, queryParamList, headerParamList, requestBodyParamList);
    this.packageName = packageName;
    this.typeKeyName = typeKeyName;
    this.descriptionKeyName = descriptionKeyName;
    this.timeStampKeyName = timeStampKeyName;
    this.logEntriesKeyName = logEntriesKeyName;
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
  public String getTypeKeyName() {
    return typeKeyName;
  }

  @NonNull
  public String getDescriptionKeyName() {
    return descriptionKeyName;
  }

  @NonNull
  public String getTimeStampKeyName() {
    return timeStampKeyName;
  }

  @NonNull
  public String getLogEntriesKeyName() {
    return logEntriesKeyName;
  }

  @Nullable
  public List<Param> getLogEntryParams() {
    return logEntryParams;
  }
}
