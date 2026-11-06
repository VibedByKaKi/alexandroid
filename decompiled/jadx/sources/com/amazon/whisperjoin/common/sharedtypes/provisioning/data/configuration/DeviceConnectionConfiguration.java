package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.configuration;

import com.amazon.whisperjoin.common.sharedtypes.cryptography.TrustProvider;
import java.util.Objects;
import org.apache.commons.lang.builder.HashCodeBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceConnectionConfiguration {
    private String pin;
    private String publicKey;
    private final TrustProvider.TrustState trustState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String pin;
        private String publicKey;
        private TrustProvider.TrustState trustState;

        public DeviceConnectionConfiguration build() {
            TrustProvider.TrustState trustState = this.trustState;
            if (trustState != null) {
                return new DeviceConnectionConfiguration(trustState, this.pin, this.publicKey);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("trustState can not be null");
            return null;
        }

        public Builder withPin(String str) {
            this.pin = str;
            return this;
        }

        public Builder withPublicKey(String str) {
            this.publicKey = str;
            return this;
        }

        public Builder withTrustState(TrustProvider.TrustState trustState) {
            this.trustState = trustState;
            return this;
        }
    }

    private DeviceConnectionConfiguration(TrustProvider.TrustState trustState, String str, String str2) {
        this.trustState = trustState;
        this.pin = str;
        this.publicKey = str2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DeviceConnectionConfiguration deviceConnectionConfiguration = (DeviceConnectionConfiguration) obj;
            if (this.trustState.equals(deviceConnectionConfiguration.getTrustState()) && Objects.equals(this.pin, deviceConnectionConfiguration.getPin()) && Objects.equals(this.publicKey, deviceConnectionConfiguration.getPublicKey())) {
                return true;
            }
        }
        return false;
    }

    public String getPin() {
        return this.pin;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public TrustProvider.TrustState getTrustState() {
        return this.trustState;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(getTrustState()).append(getPin()).append(getPublicKey()).toHashCode();
    }
}
