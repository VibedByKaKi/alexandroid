package com.amazon.alexa.accessory.avsclient.bootup;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AccessoryBootUpMetadata {
    private final String deviceType;
    private Date poweredOnTime;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String deviceType;
        private Date poweredOnTime;

        public AccessoryBootUpMetadata build() {
            Preconditions.notNull(this.deviceType, "deviceType");
            Preconditions.notNull(this.poweredOnTime, "poweredOnTime");
            return new AccessoryBootUpMetadata(this);
        }

        public Builder setDeviceType(String str) {
            this.deviceType = str;
            return this;
        }

        public Builder setPoweredOnTime(Date date) {
            this.poweredOnTime = date;
            return this;
        }
    }

    public AccessoryBootUpMetadata(Builder builder) {
        this.deviceType = builder.deviceType;
        this.poweredOnTime = builder.poweredOnTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public Date getPoweredOnTime() {
        return this.poweredOnTime;
    }

    public void setPoweredOnTime(Date date) {
        this.poweredOnTime = date;
    }
}
