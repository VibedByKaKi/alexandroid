package com.amazon.identity.auth.device.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum SSOMetrics$AccountManagerFailure {
    BAD_ARGUMENTS(7, "BadArguments"),
    BAD_REQUEST(8, "BadRequest"),
    CANCELED(4, "Cancelled"),
    INVALID_RESPONSE(5, "InvalidResponse"),
    NETWORK_ERROR(3, "NetworkError"),
    REMOTE_EXCEPTION(1, "RemoteException"),
    UNSUPPORTED_OPERATION(6, "UnsupportedOperation"),
    UNRECOGNIZED(9, "UnrecognizedExternalError");

    private final int mErrorCode;
    private final String mName;

    SSOMetrics$AccountManagerFailure(int i, String str) {
        this.mErrorCode = i;
        this.mName = str;
    }

    public static SSOMetrics$AccountManagerFailure getFromAccountManagerErrorCode(int i) {
        for (SSOMetrics$AccountManagerFailure sSOMetrics$AccountManagerFailure : values()) {
            if (sSOMetrics$AccountManagerFailure.getAccountManagerErrorCode() == i) {
                return sSOMetrics$AccountManagerFailure;
            }
        }
        return UNRECOGNIZED;
    }

    public int getAccountManagerErrorCode() {
        return this.mErrorCode;
    }

    public String getName() {
        return this.mName;
    }
}
