package com.amazon.apl.android.scenegraph.edittext;

import com.amazon.common.BoundObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EditText extends BoundObject {
    public EditText(long j) {
        bind(j);
    }

    private static native void nFocusChanged(long j, boolean z);

    private static native void nSubmit(long j);

    private static native void nTextChanged(long j, String str);

    public void focusChanged(boolean z) {
        nFocusChanged(getNativeHandle(), z);
    }

    public void submit() {
        nSubmit(getNativeHandle());
    }

    public void textChanged(String str) {
        nTextChanged(getNativeHandle(), str);
    }
}
