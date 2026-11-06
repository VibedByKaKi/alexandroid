package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.annotation.concurrent.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes20.dex */
public class LegacyIdentifierData {
    private final String mDeviceType;
    private final String mDsn;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mDeviceType;
        private String mDsn;

        public LegacyIdentifierData build() {
            return new LegacyIdentifierData(this);
        }

        public Builder setDeviceType(String str) {
            this.mDeviceType = str;
            return this;
        }

        public Builder setDsn(String str) {
            this.mDsn = str;
            return this;
        }
    }

    public LegacyIdentifierData(Builder builder) {
        this.mDsn = builder.mDsn;
        this.mDeviceType = builder.mDeviceType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LegacyIdentifierData legacyIdentifierData = (LegacyIdentifierData) obj;
            if (Objects.equal(this.mDsn, legacyIdentifierData.mDsn) && Objects.equal(this.mDeviceType, legacyIdentifierData.mDeviceType)) {
                return true;
            }
        }
        return false;
    }

    public String getDeviceType() {
        return this.mDeviceType;
    }

    public String getDsn() {
        return this.mDsn;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDsn, this.mDeviceType);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mDsn", this.mDsn).add("mDeviceType", this.mDeviceType).toString();
    }
}
