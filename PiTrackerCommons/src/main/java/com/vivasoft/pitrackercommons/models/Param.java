package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Param implements Serializable {
  @NonNull
  private final String key;
  @NonNull
  private final Object value;
  @NonNull
  private final ParamType paramType;

  private Param(@NonNull String key, @NonNull Object value, @NonNull ParamType paramType) {
    this.key = key;
    this.value = value;
    this.paramType = paramType;
  }

  @NonNull
  public String getKey() {
    return key;
  }

  @NonNull
  public Object getValue() {
    return value;
  }

  @NonNull
  public ParamType getParamType() {
    return paramType;
  }

  public Param getTypeFixedInstance() {
    switch (paramType) {
      case TYPE_BOOL:
        return new Param(key, ((boolean) value), paramType);
      case TYPE_INT_32:
        return new Param(key, ((int) value), paramType);
      case TYPE_INT_64:
        return new Param(key, ((long) value), paramType);
      case TYPE_DOUBLE:
        return new Param(key, ((double) value), paramType);
      default:
        return new Param(key, value.toString(), paramType);
    }
  }

  public enum ParamType {
    TYPE_BOOL(1),
    TYPE_INT_32(2),
    TYPE_INT_64(3),
    TYPE_DOUBLE(4),
    TYPE_STRING(5);
    private final int value;

    ParamType(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }
}
