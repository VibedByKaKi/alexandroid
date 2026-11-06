package com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import javax.annotation.concurrent.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes20.dex */
public class AuthMaterialIdentifier implements Parcelable {
    public static final Parcelable.Creator<AuthMaterialIdentifier> CREATOR = new Parcelable.Creator<AuthMaterialIdentifier>() { // from class: com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.type.AuthMaterialIdentifier.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthMaterialIdentifier createFromParcel(Parcel parcel) {
            return new AuthMaterialIdentifier(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthMaterialIdentifier[] newArray(int i) {
            return new AuthMaterialIdentifier[i];
        }
    };
    private final String mAuthMaterialIndex;
    private final String mProductIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mAuthMaterialIndex;
        private String mProductIndex;

        public AuthMaterialIdentifier build() {
            Preconditions.checkArgument(this.mAuthMaterialIndex != null);
            Preconditions.checkArgument(this.mProductIndex != null);
            return new AuthMaterialIdentifier(this);
        }

        public Builder setAuthMaterialIndex(String str) {
            this.mAuthMaterialIndex = str;
            return this;
        }

        public Builder setProductIndex(String str) {
            this.mProductIndex = str;
            return this;
        }
    }

    public AuthMaterialIdentifier(Builder builder) {
        this.mAuthMaterialIndex = builder.mAuthMaterialIndex;
        this.mProductIndex = builder.mProductIndex;
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
            AuthMaterialIdentifier authMaterialIdentifier = (AuthMaterialIdentifier) obj;
            if (Objects.equal(this.mAuthMaterialIndex, authMaterialIdentifier.mAuthMaterialIndex) && Objects.equal(this.mProductIndex, authMaterialIdentifier.mProductIndex)) {
                return true;
            }
        }
        return false;
    }

    public String getAuthMaterialIndex() {
        return this.mAuthMaterialIndex;
    }

    public String getProductIndex() {
        return this.mProductIndex;
    }

    public int hashCode() {
        return Objects.hashCode(this.mAuthMaterialIndex, this.mProductIndex);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mAuthMaterialIndex", this.mAuthMaterialIndex).add("mProductIndex", this.mProductIndex).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAuthMaterialIndex);
        parcel.writeString(this.mProductIndex);
    }

    public /* synthetic */ AuthMaterialIdentifier(Parcel parcel, int i) {
        this(parcel);
    }

    private AuthMaterialIdentifier(Parcel parcel) {
        this.mAuthMaterialIndex = parcel.readString();
        this.mProductIndex = parcel.readString();
    }
}
