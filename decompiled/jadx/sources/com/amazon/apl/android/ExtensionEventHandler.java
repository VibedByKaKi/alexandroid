package com.amazon.apl.android;

import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ExtensionEventHandler extends BoundObject {
    public ExtensionEventHandler(String str, String str2) {
        long nCreate = nCreate(str, str2);
        if (nCreate != 0) {
            bind(nCreate);
        }
    }

    private static native long nCreate(String str, String str2);

    private static native String nGetName(long j);

    private static native String nGetURI(long j);

    public String getName() {
        return nGetName(getNativeHandle());
    }

    public String getURI() {
        return nGetURI(getNativeHandle());
    }
}
