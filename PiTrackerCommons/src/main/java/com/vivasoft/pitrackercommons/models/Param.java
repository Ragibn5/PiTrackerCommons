package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import com.vivasoft.pitrackercommons.exceptions.NotInitializedException;
import com.vivasoft.pitrackercommons.exceptions.TypeMismatchException;

import java.io.Serializable;

public class Param implements Serializable {
  private String key;
  private Object value;
  private ParamType paramType;

  public Param() throws NotInitializedException, TypeMismatchException {
    tryFixingValueTypeMismatch();
  }

  private Param(@NonNull String key, @NonNull Object value, @NonNull ParamType paramType) throws NotInitializedException, TypeMismatchException {
    this.key = key;
    this.value = value;
    this.paramType = paramType;

    tryFixingValueTypeMismatch();
  }

  private void tryFixingValueTypeMismatch() throws NotInitializedException, TypeMismatchException {
    if (key == null || value == null || paramType == null) {
      throw new NotInitializedException("Some non-null values are not yet initialized");
    }

    if ((((paramType.typeId == ParamType.BOOL) && (value instanceof Boolean)) ||
      ((paramType.typeId == ParamType.INT_32) && (value instanceof Integer)) ||
      ((paramType.typeId == ParamType.INT_64) && (value instanceof Long)) ||
      ((paramType.typeId == ParamType.DOUBLE) && (value instanceof Double)) ||
      ((paramType.typeId == ParamType.STRING) && (value instanceof String)))) {
      // nothing to do - everything is okay
    } else if (paramType.typeId == ParamType.DOUBLE && ((value instanceof Integer) || (value instanceof Long))) {
      value = getTypeFixedValue(value, paramType);
    } else {
      throw new TypeMismatchException("The value does not match the specified param type");
    }
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

  public Object getTypeFixedValue(@NonNull Object value, @NonNull ParamType paramType) {
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
