package com.amazon.apl.android.primitive;

import com.amazon.apl.android.primitive.UrlRequests;
import com.amazon.apl.android.utils.HttpUtils;
import com.amazon.apl.enums.APLEnum;
import com.amazon.common.BoundObject;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class UrlRequestGetter extends ArrayGetter<UrlRequests, UrlRequests.UrlRequest> {
    public UrlRequestGetter(BoundObject boundObject, APLEnum aPLEnum) {
        super(boundObject, aPLEnum);
    }

    private static native String[] nGetUrlRequestHeadersAt(long j, int i, int i2);

    private static native String nGetUrlRequestSourceAt(long j, int i, int i2);

    private native int nSize(long j, int i);

    @Override // com.amazon.apl.android.primitive.ArrayGetter
    public UrlRequests builder() {
        return new AutoValue_UrlRequests(new ArrayList());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.apl.android.primitive.ArrayGetter
    public UrlRequests.UrlRequest get(int i) {
        return UrlRequests.UrlRequest.builder().url(nGetUrlRequestSourceAt(getNativeHandle(), getIndex(), i)).headers(HttpUtils.listToHeadersMap(nGetUrlRequestHeadersAt(getNativeHandle(), getIndex(), i))).build();
    }

    @Override // com.amazon.apl.android.primitive.ArrayGetter
    public int size() {
        return nSize(getNativeHandle(), getIndex());
    }
}
