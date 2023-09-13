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
      case ParamType.INT_32: {
        if (value instanceof Double) {
          return new Param(key, ((Double) value).intValue(), paramType);
        } else if (value instanceof Float) {
          // uncommon case
          return new Param(key, ((Float) value).intValue(), paramType);
        } else {
          return this;
        }
      }
      case ParamType.INT_64: {
        if (value instanceof Double) {
          return new Param(key, ((Double) value).longValue(), paramType);
        } else if (value instanceof Float) {
          // uncommon case
          return new Param(key, ((Float) value).longValue(), paramType);
        } else {
          return this;
        }
      }
      case ParamType.BOOL:
      case ParamType.DOUBLE:
      case ParamType.STRING:
      default:
        return this;
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
