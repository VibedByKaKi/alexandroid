package com.amazon.alexa.accessory.notificationpublisher.consumption;

import com.amazon.alexa.accessory.notificationpublisher.consumption.AutoValue_GestureEventPayload;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes15.dex */
public abstract class GestureEventPayload implements Payload {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract GestureEventPayload build();

        public abstract Builder setDeviceAddress(String str);

        public abstract Builder setDeviceType(String str);

        public abstract Builder setInputAction(int i);

        public abstract Builder setInputBehavior(int i);

        public abstract Builder setInputSource(int i);
    }

    public static Builder builder() {
        return new AutoValue_GestureEventPayload.Builder();
    }

    public abstract String getDeviceAddress();

    @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.Payload
    public abstract String getDeviceType();

    public abstract int getInputAction();

    public abstract int getInputBehavior();

    public abstract int getInputSource();
}
