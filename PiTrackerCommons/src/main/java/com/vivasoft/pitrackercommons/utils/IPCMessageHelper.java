package com.vivasoft.pitrackercommons.utils;

import android.content.Context;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.vivasoft.pitrackercommons.constants.ResponseCodes;
import com.vivasoft.pitrackercommons.models.StateBase;

public final class IPCMessageHelper {
  public static void sendUnknownRequestReply(@NonNull Context context, @NonNull Messenger replyTo) {
    sendRequestReply(
      context,
      replyTo,
      null,
      ResponseCodes.UNKNOWN_REQUEST,
      false
    );
  }

  public static void sendMalformedRequestReply(@NonNull Context context, @NonNull Messenger replyTo) {
    sendRequestReply(
      context,
      replyTo,
      null,
      ResponseCodes.MALFORMED_REQUEST,
      false
    );
  }

  public static void sendRequestReply(
    @NonNull Context context,
    @NonNull Messenger replyTo,
    @Nullable String data,
    int responseCode,
    boolean success
  ) {
    try {
      Message message = Message.obtain(null, responseCode);
      message.setData(
        IPCDataHelper.getBundleFor(
          new StateBase(
            context.getPackageName(),
            responseCode,
            success,
            data
          )
        )
      );
      replyTo.send(message);
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}
