package org.hamcrest;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StringDescription extends BaseDescription {
    private final Appendable out;

    public StringDescription() {
        this(new StringBuilder());
    }

    public static String asString(SelfDescribing selfDescribing) {
        return toString(selfDescribing);
    }

    public static String toString(SelfDescribing selfDescribing) {
        return new StringDescription().appendDescriptionOf(selfDescribing).toString();
    }

    @Override // org.hamcrest.BaseDescription
    public void append(String str) {
        try {
            this.out.append(str);
        } catch (IOException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Could not write description", e);
        }
    }

    public StringDescription(Appendable appendable) {
        this.out = appendable;
    }

    @Override // org.hamcrest.BaseDescription
    public void append(char c) {
        try {
            this.out.append(c);
        } catch (IOException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Could not write description", e);
        }
    }

    public String toString() {
        return this.out.toString();
    }
}
