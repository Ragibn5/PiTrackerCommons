package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Param implements Serializable {
  private final String key;
  private final Object value;
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
    return getTypeFixedValue();
  }

  @NonNull
  public ParamType getParamType() {
    return paramType;
  }

  private Object getTypeFixedValue() {
    switch (paramType.typeId) {
      case ParamType.INT_32: {
        if (value instanceof Double) {
          return ((Double) value).intValue();
        } else if (value instanceof Float) {
          // uncommon case
          return ((Float) value).intValue();
        } else {
          // uncommon case
          return this.value;
        }
      }
      case ParamType.INT_64: {
        if (value instanceof Double) {
          return ((Double) value).longValue();
        } else if (value instanceof Float) {
          // uncommon case
          return ((Float) value).longValue();
        } else {
          // uncommon case
          return this.value;
        }
      }
      case ParamType.BOOL:
      case ParamType.DOUBLE:
      case ParamType.STRING:
      default:
        return this.value;
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
