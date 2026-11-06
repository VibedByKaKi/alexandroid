package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.annotation.concurrent.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes20.dex */
public class LegacyIdentifier implements Parcelable {
    public static final Parcelable.Creator<LegacyIdentifier> CREATOR = new Parcelable.Creator<LegacyIdentifier>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.LegacyIdentifier.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LegacyIdentifier createFromParcel(Parcel parcel) {
            return new LegacyIdentifier(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LegacyIdentifier[] newArray(int i) {
            return new LegacyIdentifier[i];
        }
    };
    private final String mDeviceType;
    private final String mDsn;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mDeviceType;
        private String mDsn;

        public LegacyIdentifier build() {
            return new LegacyIdentifier(this);
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

    public LegacyIdentifier(Builder builder) {
        this.mDsn = builder.mDsn;
        this.mDeviceType = builder.mDeviceType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LegacyIdentifier legacyIdentifier = (LegacyIdentifier) obj;
            if (Objects.equal(this.mDsn, legacyIdentifier.mDsn) && Objects.equal(this.mDeviceType, legacyIdentifier.mDeviceType)) {
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mDsn);
        parcel.writeString(this.mDeviceType);
    }

    public /* synthetic */ LegacyIdentifier(Parcel parcel, int i) {
        this(parcel);
    }

    private LegacyIdentifier(Parcel parcel) {
        this.mDsn = parcel.readString();
        this.mDeviceType = parcel.readString();
    }
}
