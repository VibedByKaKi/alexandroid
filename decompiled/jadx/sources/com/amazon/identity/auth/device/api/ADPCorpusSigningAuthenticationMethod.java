package com.amazon.identity.auth.device.api;

import android.os.Bundle;
import com.amazon.fireos.sdk.annotations.FireOsSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public interface ADPCorpusSigningAuthenticationMethod {

    @FireOsSdk
    @Deprecated
    public static final String KEY_ADP_AUTH_SIGNATURE = "adp_signature";

    @FireOsSdk
    @Deprecated
    public static final String KEY_ADP_AUTH_TOKEN = "adp_token";

    @FireOsSdk
    @Deprecated
    public static final String KEY_ERROR_CODE = "error_code_key";

    @FireOsSdk
    @Deprecated
    public static final String KEY_ERROR_MESSAGE = "error_message_key";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static final class SignCorpusError {

        @FireOsSdk
        @Deprecated
        public static final int INVALID_ARGUMENT = 3;

        @FireOsSdk
        @Deprecated
        public static final int IPC_ERROR = 1;

        @FireOsSdk
        @Deprecated
        public static final int NO_CREDENTIALS = 2;

        @FireOsSdk
        @Deprecated
        public static final int UNRECOGNIZED = 5;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static final class SignCorpusOption {

        @FireOsSdk
        @Deprecated
        public static final String USE_FALL_BACK_CREDENTIALS = "UseFallBackCredentials";
    }

    @FireOsSdk
    @Deprecated
    MAPFuture<Bundle> signCorpus(byte[] bArr, Bundle bundle, Callback callback);
}
