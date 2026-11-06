package org.apache.commons.text.translate;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.Writer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
abstract class SinglePassTranslator extends CharSequenceTranslator {
    private String getClassName() {
        Class<?> cls = getClass();
        return cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName();
    }

    @Override // org.apache.commons.text.translate.CharSequenceTranslator
    public int translate(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (i == 0) {
            translateWhole(charSequence, writer);
            return Character.codePointCount(charSequence, i, charSequence.length());
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(new StringBuilder(), getClassName(), ".translate(final CharSequence input, final int index, final Writer out) cannot handle a non-zero index."));
        return 0;
    }

    public abstract void translateWhole(CharSequence charSequence, Writer writer) throws IOException;
}
