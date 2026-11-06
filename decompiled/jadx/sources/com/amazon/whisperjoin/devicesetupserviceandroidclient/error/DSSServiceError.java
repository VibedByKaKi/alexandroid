package com.amazon.whisperjoin.devicesetupserviceandroidclient.error;

import androidx.annotation.Nullable;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DSSServiceError extends Exception {
    public static final int ERROR_403_FORBIDDEN = 403;
    private final int mErrorCode;
    private final String mErrorMessage;
    private final Long mRetryCallAfterTimestampMs;

    public DSSServiceError(int i, @Nullable String str, @Nullable Long l) {
        super(DoubleList$$ExternalSyntheticOutline0.m(i, "An Error Occurred Making a called to DSS. HTTP Status = ", ", Message = ", str));
        this.mErrorCode = i;
        this.mErrorMessage = str;
        this.mRetryCallAfterTimestampMs = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DSSServiceError dSSServiceError = (DSSServiceError) obj;
            if (this.mErrorCode == dSSServiceError.mErrorCode && Objects.equal(this.mErrorMessage, dSSServiceError.mErrorMessage)) {
                return true;
            }
        }
        return false;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public Long getRetryCallAfterTimestampMs() {
        return this.mRetryCallAfterTimestampMs;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.mErrorCode), this.mErrorMessage);
    }

    public boolean is403Forbidden() {
        return this.mErrorCode == 403;
    }

    public DSSServiceError(int i, @Nullable String str) {
        this(i, str, null);
    }
}
