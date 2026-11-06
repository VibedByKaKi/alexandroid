package com.amazon.alexa.accessory.notificationpublisher.consumption;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public abstract class BaseComponent {
    public static final int COMPONENT_ID_AUDIO_FOCUS = 7;
    public static final int COMPONENT_ID_CONVERSATION = 10;
    public static final int COMPONENT_ID_GESTURE = 2;
    public static final int COMPONENT_ID_NOTIFICATION = 1;
    public static final int COMPONENT_ID_QUEUE = 5;
    public static final int COMPONENT_ID_RENDERER = 3;
    public static final int COMPONENT_ID_REPLY_READ_BACK = 9;
    public static final int COMPONENT_ID_SPEECH_RECOGNIZER = 8;
    public static final int COMPONENT_ID_STATUS = 6;
    public static final int COMPONENT_ID_TIMER = 4;
    private final int componentId;

    public BaseComponent(int i) {
        this.componentId = i;
    }

    public int getComponentId() {
        return this.componentId;
    }

    public boolean postEventMessage(int i, @Nullable Object obj) {
        return ConsumptionEngine.getInstance().postEventMessage(1, this.componentId, i, obj);
    }

    public boolean postEventMessageDelayed(int i, @Nullable Object obj, long j) {
        return ConsumptionEngine.getInstance().postEventMessageDelayed(1, this.componentId, i, obj, j);
    }

    public boolean postEventMessage(int i) {
        return postEventMessage(i, null);
    }

    public boolean postEventMessageDelayed(int i, long j) {
        return postEventMessageDelayed(i, null, j);
    }

    public void handleEventMessage(int i, @Nullable Object obj) {
    }
}
