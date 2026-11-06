package com.amazon.identity.kcpsdk.common;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum FIRSErrorType {
    FIRSErrorTypeCustomerNotFound("customer_not_found"),
    FIRSErrorTypeDeviceAlreadyRegistered("device_already_registered"),
    FIRSErrorTypeDuplicateAccountName("duplicate_account_name"),
    FIRSErrorTypeInternalError("message"),
    FIRSErrorTypeUnrecognized("unrecognized"),
    FIRSErrorTypeInvalidAccountFound("invalid_account_found");

    private final String mErrorCode;

    FIRSErrorType(String str) {
        this.mErrorCode = str;
    }

    public String getErrorCode() {
        return this.mErrorCode;
    }
}
