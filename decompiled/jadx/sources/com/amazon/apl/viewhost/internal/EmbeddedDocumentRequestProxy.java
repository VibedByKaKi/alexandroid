package com.amazon.apl.viewhost.internal;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Keep
/* loaded from: classes20.dex */
public class EmbeddedDocumentRequestProxy extends BoundObject {
    public EmbeddedDocumentRequestProxy(long j) {
        bind(j);
    }

    private native void nFailure(long j, String str);

    private native String nGetRequestUrl(long j);

    private native long nSuccess(long j, long j2, boolean z, long j3);

    public void failure(String str) {
        nFailure(getNativeHandle(), str);
    }

    public String getRequestUrl() {
        return nGetRequestUrl(getNativeHandle());
    }

    @Nullable
    public DocumentContext success(long j, boolean z, long j2) {
        long nSuccess = nSuccess(getNativeHandle(), j, z, j2);
        if (nSuccess == 0) {
            return null;
        }
        return new DocumentContext(nSuccess);
    }
}
