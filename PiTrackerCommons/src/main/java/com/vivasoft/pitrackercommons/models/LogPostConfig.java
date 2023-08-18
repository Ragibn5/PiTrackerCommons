package com.vivasoft.pitrackercommons.models;

import androidx.annotation.Nullable;

import java.io.Serializable;

public class LogPostConfig extends ApiConfig implements Serializable {
  @Nullable
  private String packageName;

  public LogPostConfig() {
    super();
  }

  public LogPostConfig(@Nullable String packageName) {
    super();
    this.packageName = packageName;
  }

  @Nullable
  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(@Nullable String packageName) {
    this.packageName = packageName;
  }
}
