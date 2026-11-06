package com.amazon.alexa.client.metrics.mobilytics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.identity.MobilyticsDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MobilyticsDeviceImpl implements MobilyticsDevice {
    private final String deviceSerialNumber;
    private final String deviceType;

    private MobilyticsDeviceImpl(Builder builder) {
        this.deviceType = builder.deviceType;
        this.deviceSerialNumber = builder.deviceSerialNumber;
    }

    public static Builder builder() {
        return new Builder(0);
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDevice
    @NonNull
    public String deviceSerialNumber() {
        String str = this.deviceSerialNumber;
        return (str == null || TextUtils.isEmpty(str)) ? "Unknown" : this.deviceSerialNumber;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsDevice
    @NonNull
    public String deviceType() {
        String str = this.deviceType;
        return (str == null || TextUtils.isEmpty(str)) ? "Unknown" : this.deviceType;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String deviceSerialNumber;
        private String deviceType;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public MobilyticsDeviceImpl build() {
            return new MobilyticsDeviceImpl(this, 0);
        }

        public Builder withDeviceSerialNumber(String str) {
            this.deviceSerialNumber = str;
            return this;
        }

        public Builder withDeviceType(String str) {
            this.deviceType = str;
            return this;
        }

        private Builder() {
        }
    }

    public /* synthetic */ MobilyticsDeviceImpl(Builder builder, int i) {
        this(builder);
    }
}
