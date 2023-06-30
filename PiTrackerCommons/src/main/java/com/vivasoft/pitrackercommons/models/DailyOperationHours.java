package com.vivasoft.pitrackercommons.models;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.List;

public class DailyOperationHours implements Serializable {
  private final int dayOfWeek;

  @NonNull
  private final List<Integer> hours;

  public DailyOperationHours(int dayOfWeek, @NonNull List<Integer> hours) {
    this.dayOfWeek = dayOfWeek;
    this.hours = hours;
  }

  public int getDayOfWeek() {
    return dayOfWeek;
  }

  @NonNull
  public List<Integer> getHours() {
    return hours;
  }
}
