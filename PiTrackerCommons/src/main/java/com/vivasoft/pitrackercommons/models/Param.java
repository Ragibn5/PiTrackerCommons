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
    switch (paramType.typeId) {
      case ParamType.BOOL:
        return new Param(key, ((boolean) value), paramType);
      case ParamType.INT_32:
        return new Param(key, ((int) value), paramType);
      case ParamType.INT_64:
        return new Param(key, ((long) value), paramType);
      case ParamType.DOUBLE:
        return new Param(key, ((double) value), paramType);
      default:
        return new Param(key, value.toString(), paramType);
    }
  }

  public static class ParamType implements Serializable {
    public static final int BOOL = 1;
    public static final int INT_32 = 2;
    public static final int INT_64 = 3;
    public static final int DOUBLE = 4;
    public static final int STRING = 5;

    private final int typeId;

    ParamType(int typeId) {
      this.typeId = typeId;
    }
  }
}
