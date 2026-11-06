package com.amazon.alexa.accessory.notificationpublisher.consumption;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class AutoValue_GestureEventPayload extends GestureEventPayload {
    private final String deviceAddress;
    private final String deviceType;
    private final int inputAction;
    private final int inputBehavior;
    private final int inputSource;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends GestureEventPayload.Builder {
        private String deviceAddress;
        private String deviceType;
        private int inputAction;
        private int inputBehavior;
        private int inputSource;
        private byte set$0;

        @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload.Builder
        public GestureEventPayload build() {
            String str;
            String str2;
            if (this.set$0 == 7 && (str = this.deviceType) != null && (str2 = this.deviceAddress) != null) {
                return new AutoValue_GestureEventPayload(str, this.inputSource, this.inputAction, str2, this.inputBehavior, 0);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" inputSource");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" inputAction");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" inputBehavior");
            }
            if (this.deviceType == null) {
                sb.append(" deviceType");
            }
            if (this.deviceAddress == null) {
                sb.append(" deviceAddress");
            }
            Single$$ExternalSyntheticBUOutline0.m$2(Automotive$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload.Builder
        public GestureEventPayload.Builder setDeviceAddress(String str) {
            if (str != null) {
                this.deviceAddress = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceAddress");
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload.Builder
        public GestureEventPayload.Builder setDeviceType(String str) {
            if (str != null) {
                this.deviceType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null deviceType");
            return null;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload.Builder
        public GestureEventPayload.Builder setInputAction(int i) {
            this.inputAction = i;
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload.Builder
        public GestureEventPayload.Builder setInputBehavior(int i) {
            this.inputBehavior = i;
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload.Builder
        public GestureEventPayload.Builder setInputSource(int i) {
            this.inputSource = i;
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }
    }

    private AutoValue_GestureEventPayload(int i, int i2, int i3, String str, String str2) {
        this.inputSource = i;
        this.inputAction = i2;
        this.inputBehavior = i3;
        this.deviceType = str;
        this.deviceAddress = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GestureEventPayload) {
            GestureEventPayload gestureEventPayload = (GestureEventPayload) obj;
            if (this.inputSource == gestureEventPayload.getInputSource() && this.inputAction == gestureEventPayload.getInputAction() && this.inputBehavior == gestureEventPayload.getInputBehavior() && this.deviceType.equals(gestureEventPayload.getDeviceType()) && this.deviceAddress.equals(gestureEventPayload.getDeviceAddress())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload, com.amazon.alexa.accessory.notificationpublisher.consumption.Payload
    public String getDeviceType() {
        return this.deviceType;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload
    public int getInputAction() {
        return this.inputAction;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload
    public int getInputBehavior() {
        return this.inputBehavior;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.consumption.GestureEventPayload
    public int getInputSource() {
        return this.inputSource;
    }

    public int hashCode() {
        return this.deviceAddress.hashCode() ^ ((((((((this.inputSource ^ 1000003) * 1000003) ^ this.inputAction) * 1000003) ^ this.inputBehavior) * 1000003) ^ this.deviceType.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GestureEventPayload{inputSource=");
        sb.append(this.inputSource);
        sb.append(", inputAction=");
        sb.append(this.inputAction);
        sb.append(", inputBehavior=");
        sb.append(this.inputBehavior);
        sb.append(", deviceType=");
        sb.append(this.deviceType);
        sb.append(", deviceAddress=");
        return a$$ExternalSyntheticOutline0.m(sb, this.deviceAddress, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_GestureEventPayload(String str, int i, int i2, String str2, int i3, int i4) {
        this(i, i2, i3, str, str2);
    }
}
