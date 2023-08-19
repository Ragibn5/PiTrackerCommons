package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Param implements Serializable {
  @NonNull
  private final String key;
  @NonNull
  private final Object value;

  public Param(@NonNull String key, @NonNull Object value) {
    this.key = key;
    this.value = value;
  }

  @NonNull
  public String getKey() {
    return key;
  }

  @NonNull
  public Object getValue() {
    return value;
  }
}
