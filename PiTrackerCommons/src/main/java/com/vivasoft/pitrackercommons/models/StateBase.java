package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;

public class StateBase implements Serializable {
  @NonNull
  private final String packageName;
  private final int requestCode;
  private final boolean success;
  @Nullable
  private final String data;

  public StateBase(
    @NonNull String packageName,
    int requestCode,
    boolean success,
    @Nullable String data) {
    this.packageName = packageName;
    this.requestCode = requestCode;
    this.success = success;
    this.data = data;
  }

  @NonNull
  public String getPackageName() {
    return packageName;
  }

  public int getRequestCode() {
    return requestCode;
  }

  public boolean isSuccess() {
    return success;
  }

  @Nullable
  public String getData() {
    return data;
  }
}
