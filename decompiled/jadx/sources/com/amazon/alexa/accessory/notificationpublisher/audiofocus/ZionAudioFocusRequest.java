package com.amazon.alexa.accessory.notificationpublisher.audiofocus;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ZionAudioFocusRequest {
    private Integer componentId;
    private Integer eventId;

    public ZionAudioFocusRequest(@Nullable Integer num, @Nullable Integer num2) {
        this.componentId = num;
        this.eventId = num2;
    }

    public Integer getComponentId() {
        return this.componentId;
    }

    public Integer getEventId() {
        return this.eventId;
    }
}
