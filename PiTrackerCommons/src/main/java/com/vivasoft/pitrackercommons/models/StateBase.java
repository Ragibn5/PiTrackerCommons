package com.vivasoft.pitrackercommons.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class StateBase implements Parcelable {
  @NonNull
  private final String packageName;
  private final int code;
  private final boolean success;
  @Nullable
  private final String data;

  public StateBase(
    @NonNull String packageName,
    int code,
    boolean success,
    @Nullable String data) {
    this.packageName = packageName;
    this.code = code;
    this.success = success;
    this.data = data;
  }

  protected StateBase(Parcel in) {
    packageName = in.readString();
    code = in.readInt();
    success = in.readByte() != 0;
    data = in.readString();
  }

  public static final Creator<StateBase> CREATOR = new Creator<StateBase>() {
    @Override
    public StateBase createFromParcel(Parcel in) {
      return new StateBase(in);
    }

    @Override
    public StateBase[] newArray(int size) {
      return new StateBase[size];
    }
  };

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(@NonNull Parcel dest, int flags) {
    dest.writeString(packageName);
    dest.writeInt(code);
    dest.writeByte((byte) (success ? 1 : 0));
    dest.writeString(data);
  }

  @NonNull
  public String getPackageName() {
    return packageName;
  }

  public int getCode() {
    return code;
  }

  public boolean isSuccess() {
    return success;
  }

  @Nullable
  public String getData() {
    return data;
  }
}
