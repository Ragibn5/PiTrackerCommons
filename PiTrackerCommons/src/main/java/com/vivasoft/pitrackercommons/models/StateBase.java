package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class StateBase implements Serializable {
  @NonNull
  private final String packageName;
  private final int requestCode;
  private final boolean success;

  public StateBase(@NonNull String packageName, int requestCode, boolean success) {
    this.packageName = packageName;
    this.requestCode = requestCode;
    this.success = success;
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
}
