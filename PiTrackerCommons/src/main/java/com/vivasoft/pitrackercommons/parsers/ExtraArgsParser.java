package com.vivasoft.pitrackercommons.parsers;

import androidx.core.util.Pair;

public final class ExtraArgsParser extends PrimitiveTypesParser {
  public Pair<String, Object> parse(String data) throws IllegalArgumentException {
    if (data.matches("^([a-zA-Z]+):([a-zA-Z]+):(.+)$")) {
      throw new IllegalArgumentException(
        "Input does not match the expected regex format: ^([a-zA-Z]+):([a-zA-Z]+):(.+)$"
      );
    } else {
      String[] parts = data.split(":");
      String key = parts[0];
      Object value = getParsedValue(parts[1], parts[2]);
      return new Pair<>(key, value);
    }
  }

  private Object getParsedValue(String typeName, String valueStr) throws IllegalArgumentException {
    switch (typeName) {
      case "bool":
        return parseBool(valueStr);
      case "int":
        return parseLongInt(valueStr);
      case "double":
        return parseDouble(valueStr);
      case "string":
        return valueStr;
      default:
        throw new IllegalArgumentException(
          "Invalid type: only int(8 byte), bool, double & string are supported"
        );
    }
  }
}
