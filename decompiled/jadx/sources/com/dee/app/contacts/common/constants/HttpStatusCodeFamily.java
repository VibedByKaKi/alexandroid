package com.dee.app.contacts.common.constants;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum HttpStatusCodeFamily {
    UNKNOWN(0, 0, 0, 1),
    INFORMATIONAL(0, 0, 0, 1),
    SUCCESS(1, 0, 0, 0),
    REDIRECTION(0, 0, 0, 1),
    CLIENT_ERROR(0, 1, 0, 0),
    SERVER_ERROR(0, 0, 1, 0);

    private final int failureCount;
    private final int faultCount;
    private final int successCount;
    private final int unknownCount;

    HttpStatusCodeFamily(int i, int i2, int i3, int i4) {
        this.successCount = i;
        this.failureCount = i2;
        this.faultCount = i3;
        this.unknownCount = i4;
    }

    @NonNull
    public static HttpStatusCodeFamily familyFromStatusCode(@Nullable Integer num) {
        if (num == null) {
            return UNKNOWN;
        }
        int intValue = num.intValue() / 100;
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? UNKNOWN : SERVER_ERROR : CLIENT_ERROR : REDIRECTION : SUCCESS : INFORMATIONAL;
    }

    public int getFailureCount() {
        return this.failureCount;
    }

    public int getFaultCount() {
        return this.faultCount;
    }

    public int getSuccessCount() {
        return this.successCount;
    }

    public int getUnknownCount() {
        return this.unknownCount;
    }
}
