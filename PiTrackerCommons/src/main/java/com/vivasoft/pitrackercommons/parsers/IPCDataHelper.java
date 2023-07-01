package com.vivasoft.pitrackercommons.parsers;

import android.os.Bundle;
import android.os.Message;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.vivasoft.pitrackercommons.models.StateBase;

public final class IPCDataHelper {
  @NonNull
  public static Bundle getBundleFor(@NonNull StateBase stateBase) {
    Bundle data = new Bundle();
    data.putParcelable("data", stateBase);
    data.setClassLoader(StateBase.class.getClassLoader());
    return data;
  }

  @Nullable
  public static StateBase getDataFor(@NonNull Message message) {
    Bundle data = message.getData();
    data.setClassLoader(StateBase.class.getClassLoader());

    return data.containsKey("data")
      ? data.get("data") instanceof StateBase ? ((StateBase) data.get("data")) : null
      : null;
  }
}
