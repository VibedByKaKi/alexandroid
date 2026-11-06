package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import javax.annotation.concurrent.Immutable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
/* loaded from: classes20.dex */
public class AuthMaterialIdentifier {
    private final String mAuthMaterialIndex;
    private final String mProductIndex;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mAuthMaterialIndex;
        private String mProductIndex;

        public AuthMaterialIdentifier build() {
            validate();
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

        public void validate() {
            RequestInputValidator.validateAuthMaterialIndex(this.mAuthMaterialIndex);
            RequestInputValidator.validateProductIndex(this.mProductIndex);
        }
    }

    public AuthMaterialIdentifier(Builder builder) {
        this.mAuthMaterialIndex = builder.mAuthMaterialIndex;
        this.mProductIndex = builder.mProductIndex;
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
}
