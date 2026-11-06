package com.google.android.gms.auth.api.accounttransfer;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class AccountTransferStatusCodes extends CommonStatusCodes {
    public static final int CHALLENGE_NOT_ALLOWED = 20503;
    public static final int INVALID_REQUEST = 20502;
    public static final int NOT_ALLOWED_SECURITY = 20500;
    public static final int NO_DATA_AVAILABLE = 20501;
    public static final int SESSION_INACTIVE = 20504;

    private AccountTransferStatusCodes() {
    }

    @NonNull
    public static String getStatusCodeString(int i) {
        switch (i) {
            case NOT_ALLOWED_SECURITY /* 20500 */:
                return "NOT_ALLOWED_SECURITY";
            case NO_DATA_AVAILABLE /* 20501 */:
                return "NO_DATA_AVAILABLE";
            case INVALID_REQUEST /* 20502 */:
                return "INVALID_REQUEST";
            case CHALLENGE_NOT_ALLOWED /* 20503 */:
                return "CHALLENGE_NOT_ALLOWED";
            case SESSION_INACTIVE /* 20504 */:
                return "SESSION_INACTIVE";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
