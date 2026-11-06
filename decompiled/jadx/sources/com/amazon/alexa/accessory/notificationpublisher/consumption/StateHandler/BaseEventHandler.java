package com.amazon.alexa.accessory.notificationpublisher.consumption.StateHandler;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.notificationpublisher.consumption.Payload;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class BaseEventHandler {
    public abstract void handleAudioFocusEvent(int i);

    public abstract void handleGestureEvent(int i, @Nullable Payload payload);

    public abstract void handleNotificationEvent(int i, @NonNull JSONObject jSONObject);

    public abstract void handleRendererEvent(int i, @NonNull JSONObject jSONObject);

    public abstract void handleReplyReadBackEvent(int i, @Nullable Object obj);

    public abstract void handleSpeechRecognizerEvent(int i, @Nullable Object obj);

    public abstract void handleStatusEvent(int i);

    public abstract void handleTimerEvent(int i, @NonNull JSONObject jSONObject);
}
