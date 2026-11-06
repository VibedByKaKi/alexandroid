package com.amazonaws.mobileconnectors.cognitoidentityprovider.util;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.exceptions.CognitoParameterInvalidException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class CognitoIdentityProviderClientConfig {
    private static final long REFRESH_THRESHOLD_DEFAULT = 120000;
    private static final long REFRESH_THRESHOLD_MAX = 1800000;
    private static final long REFRESH_THRESHOLD_MIN = 0;
    private static long refreshThreshold = 120000;

    public static long getRefreshThreshold() {
        return refreshThreshold;
    }

    public static void setRefreshThreshold(long j) {
        if (j > 1800000 || j < 0) {
            throw new CognitoParameterInvalidException(String.format("The value of refreshThreshold must between %d and %d milliseconds", 0L, 1800000L));
        }
        refreshThreshold = j;
    }
}
