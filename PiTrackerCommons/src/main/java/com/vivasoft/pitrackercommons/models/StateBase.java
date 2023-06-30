package com.vivasoft.pitrackercommons.models;

import java.io.Serializable;

public class StateBase implements Serializable {
  private final boolean success;
  private final int requestCode;

  public StateBase(boolean success, int requestCode) {
    this.success = success;
    this.requestCode = requestCode;
  }

  public boolean isSuccess() {
    return success;
  }

  public int getRequestCode() {
    return requestCode;
  }
}
