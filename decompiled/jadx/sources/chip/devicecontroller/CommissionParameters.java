package chip.devicecontroller;

import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class CommissionParameters {

    @Nullable
    private final byte[] csrNonce;

    @Nullable
    private final ICDRegistrationInfo icdRegistrationInfo;

    @Nullable
    private final NetworkCredentials networkCredentials;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {

        @Nullable
        private byte[] csrNonce = null;

        @Nullable
        private NetworkCredentials networkCredentials = null;

        @Nullable
        private ICDRegistrationInfo icdRegistrationInfo = null;

        public CommissionParameters build() {
            return new CommissionParameters(this);
        }

        public Builder setCsrNonce(byte[] bArr) {
            this.csrNonce = bArr;
            return this;
        }

        public Builder setICDRegistrationInfo(ICDRegistrationInfo iCDRegistrationInfo) {
            this.icdRegistrationInfo = iCDRegistrationInfo;
            return this;
        }

        public Builder setNetworkCredentials(NetworkCredentials networkCredentials) {
            this.networkCredentials = networkCredentials;
            return this;
        }
    }

    private CommissionParameters(Builder builder) {
        this.csrNonce = builder.csrNonce;
        this.networkCredentials = builder.networkCredentials;
        this.icdRegistrationInfo = builder.icdRegistrationInfo;
    }

    public final byte[] getCsrNonce() {
        return this.csrNonce;
    }

    public final ICDRegistrationInfo getICDRegistrationInfo() {
        return this.icdRegistrationInfo;
    }

    public final NetworkCredentials getNetworkCredentials() {
        return this.networkCredentials;
    }
}
