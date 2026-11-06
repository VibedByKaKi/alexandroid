package com.amazon.apl.android.sgcontent;

import com.amazon.apl.android.scenegraph.edittext.EditText;
import com.amazon.apl.android.scenegraph.edittext.EditTextConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EditTextNode extends Node {
    public EditTextNode(long j) {
        super(j);
    }

    private static native EditText nGetEditText(long j);

    private static native float[] nGetSize(long j);

    private static native String nGetText(long j);

    private static native long nGetTextConfig(long j);

    public EditText getEditText() {
        return nGetEditText(this.mAddress);
    }

    public EditTextConfig getEditTextConfig() {
        return new EditTextConfig(nGetTextConfig(this.mAddress));
    }

    public String getText() {
        return nGetText(this.mAddress);
    }
}
