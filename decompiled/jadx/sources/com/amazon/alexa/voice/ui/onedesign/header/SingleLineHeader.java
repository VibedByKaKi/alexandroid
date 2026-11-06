package com.amazon.alexa.voice.ui.onedesign.header;

import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class SingleLineHeader implements SingleLineHeaderModel {
    private final CharSequence title;

    public SingleLineHeader(@NonNull CharSequence charSequence) {
        this.title = charSequence;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && SingleLineHeader.class == obj.getClass() && this.title.equals(((SingleLineHeader) obj).title);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.header.SingleLineHeaderModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + JfifUtil.MARKER_EOI;
    }

    public String toString() {
        return "SingleLineHeader{title=" + ((Object) this.title) + AbstractJsonLexerKt.END_OBJ;
    }
}
