package com.amazon.identity.auth.device.fragment;

import com.amazon.identity.auth.device.api.MAPError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
enum P2AExitCategory {
    COMPLETED(true, null, null),
    USER_CANCELLED(false, MAPError.CommonError.OPERATION_CANCELLED, "USER_CANCELLED"),
    NETWORK_ERROR(false, MAPError.CommonError.NETWORK_ERROR, "UI_TERMINATED"),
    INTERNAL_ERROR(false, MAPError.CommonError.INTERNAL_ERROR, "UI_TERMINATED");

    private final boolean mIsSuccess;
    private final MAPError mMapError;
    private final String mMetricReason;

    P2AExitCategory(boolean z, MAPError mAPError, String str) {
        this.mIsSuccess = z;
        this.mMapError = mAPError;
        this.mMetricReason = str;
    }

    public MAPError getMapError() {
        return this.mMapError;
    }

    public String getMetricReason() {
        return this.mMetricReason;
    }

    public boolean isSuccess() {
        return this.mIsSuccess;
    }
}
