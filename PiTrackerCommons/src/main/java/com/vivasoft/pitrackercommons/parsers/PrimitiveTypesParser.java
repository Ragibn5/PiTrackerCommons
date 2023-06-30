package com.vivasoft.pitrackercommons.parsers;

public abstract class PrimitiveTypesParser {
  public Boolean parseBool(String boolStr) throws IllegalArgumentException {
    switch (boolStr.trim()) {
      case "true":
        return true;
      case "false":
        return false;
      default:
        throw new IllegalArgumentException(
          "Not a valid boolean string, can either be 'true' or 'false'"
        );
    }
  }

  public Long parseLongInt(String intStr) throws IllegalArgumentException {
    try {
      return Long.parseLong(intStr);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Not a valid integer");
    }
  }

  public Double parseDouble(String doubleStr) throws IllegalArgumentException {
    try {
      return Double.parseDouble(doubleStr);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Not a valid double");
    }
  }
}
