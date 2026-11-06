package com.google.android.gms.auth.api.phone;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.CommonStatusCodes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class SmsRetrieverStatusCodes extends CommonStatusCodes {
    public static final int API_NOT_AVAILABLE = 36501;
    public static final int PLATFORM_NOT_SUPPORTED = 36500;
    public static final int USER_PERMISSION_REQUIRED = 36502;

    private SmsRetrieverStatusCodes() {
    }

    @NonNull
    public static String getStatusCodeString(int i) {
        switch (i) {
            case PLATFORM_NOT_SUPPORTED /* 36500 */:
                return "PLATFORM_NOT_SUPPORTED";
            case API_NOT_AVAILABLE /* 36501 */:
                return "API_NOT_AVAILABLE";
            case USER_PERMISSION_REQUIRED /* 36502 */:
                return "USER_PERMISSION_REQUIRED";
            default:
                return CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
