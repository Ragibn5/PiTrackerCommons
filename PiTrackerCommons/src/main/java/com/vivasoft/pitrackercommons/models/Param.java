package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;
import androidx.core.util.Pair;

import com.vivasoft.pitrackercommons.parsers.ParamParser;

import java.io.Serializable;

public class Param implements Serializable {
  @NonNull
  private final String key;
  @NonNull
  private final Object value;

  private final ParamParser parser = new ParamParser();

  public Param(String data) throws IllegalArgumentException {
    Pair<String, Object> parsedData = parser.parse(data);
    this.key = parsedData.first;
    this.value = parsedData.second;
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
