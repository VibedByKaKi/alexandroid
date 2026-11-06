package org.chromium.net.apihelpers;

import org.chromium.net.UrlResponseInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class ByteArrayCronetCallback extends InMemoryTransformCronetCallback<byte[]> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public ByteArrayCronetCallback addCompletionListener(CronetRequestCompletionListener<? super byte[]> cronetRequestCompletionListener) {
        super.addCompletionListener((CronetRequestCompletionListener) cronetRequestCompletionListener);
        return this;
    }

    @Override // org.chromium.net.apihelpers.InMemoryTransformCronetCallback
    public final byte[] transformBodyBytes(UrlResponseInfo urlResponseInfo, byte[] bArr) {
        return bArr;
    }
}
