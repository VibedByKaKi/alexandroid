package com.amazon.identity.auth.device.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class FederatedAuthConfig implements Parcelable {
    public static final Parcelable.Creator<FederatedAuthConfig> CREATOR = new Parcelable.Creator<FederatedAuthConfig>() { // from class: com.amazon.identity.auth.device.api.FederatedAuthConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FederatedAuthConfig createFromParcel(Parcel parcel) {
            return new FederatedAuthConfig(parcel.readString(), parcel.readString(), IdentityProvider.values()[parcel.readInt()]);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FederatedAuthConfig[] newArray(int i) {
            return new FederatedAuthConfig[i];
        }
    };
    private final String mAccessToken;
    private final IdentityProvider mIdentityProvider;
    private final String mRelyingParty;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum IdentityProvider {
        GOOGLE("GOOGLE"),
        FACEBOOK("FACEBOOK"),
        LOGIN_WITH_AMAZON("LoginWithAmazon");

        private final String mValue;

        IdentityProvider(String str) {
            this.mValue = str;
        }

        @FireOsSdk
        public String getValue() {
            return this.mValue;
        }
    }

    @FireOsSdk
    public FederatedAuthConfig(String str, String str2, IdentityProvider identityProvider) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("mAccessToken is required");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("relyingParty is required");
            throw null;
        }
        if (identityProvider == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("identityProvider is required");
            throw null;
        }
        this.mAccessToken = str;
        this.mRelyingParty = str2;
        this.mIdentityProvider = identityProvider;
    }

    @Override // android.os.Parcelable
    @FireOsSdk
    public int describeContents() {
        return 0;
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public IdentityProvider getIdentityProvider() {
        return this.mIdentityProvider;
    }

    public String getRelyingParty() {
        return this.mRelyingParty;
    }

    @Override // android.os.Parcelable
    @FireOsSdk
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAccessToken);
        parcel.writeString(this.mRelyingParty);
        parcel.writeInt(this.mIdentityProvider.ordinal());
    }
}
