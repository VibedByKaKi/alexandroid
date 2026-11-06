package com.amazon.whisperjoin.common.sharedtypes.provisioning.events.data;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExceptionData {
    private final byte[] mData;
    private final Exception mException;

    public ExceptionData(byte[] bArr, Exception exc) {
        if (exc == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("throwable can not be null");
            throw null;
        }
        this.mData = bArr == null ? null : (byte[]) bArr.clone();
        this.mException = exc;
    }

    public byte[] getData() {
        byte[] bArr = this.mData;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public Exception getException() {
        return this.mException;
    }
}
