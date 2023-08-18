package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class LogPostConfig extends ApiConfig implements Serializable {
  @NonNull
  private String packageName;

  public LogPostConfig(@NonNull String postUrl, @NonNull String packageName) {
    super(postUrl);
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
