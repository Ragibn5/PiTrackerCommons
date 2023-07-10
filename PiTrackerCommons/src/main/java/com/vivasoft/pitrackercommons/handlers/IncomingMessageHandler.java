package com.vivasoft.pitrackercommons.handlers;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

import androidx.annotation.NonNull;

public class IncomingMessageHandler extends Handler {
  @NonNull
  private final MessageCallback messageCallback;

  public IncomingMessageHandler(
    @NonNull Looper looper,
    @NonNull MessageCallback messageCallback) {
    super(looper);
    this.messageCallback = messageCallback;
  }

  @Override
  public void handleMessage(@NonNull Message msg) {
    super.handleMessage(msg);
    messageCallback.onMessage(msg);
  }

  public interface MessageCallback {
    void onMessage(Message message);
  }
}
