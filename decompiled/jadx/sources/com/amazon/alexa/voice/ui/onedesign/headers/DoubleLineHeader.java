package com.amazon.alexa.voice.ui.onedesign.headers;

import androidx.annotation.NonNull;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DoubleLineHeader implements DoubleLineHeaderModel {
    private final CharSequence subTitle;
    private final CharSequence title;

    public DoubleLineHeader(@NonNull CharSequence charSequence, @NonNull CharSequence charSequence2) {
        this.title = charSequence;
        this.subTitle = charSequence2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DoubleLineHeader.class != obj.getClass()) {
            return false;
        }
        DoubleLineHeader doubleLineHeader = (DoubleLineHeader) obj;
        return this.title.equals(doubleLineHeader.title) && this.subTitle.equals(doubleLineHeader.subTitle);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.headers.DoubleLineHeaderModel
    public CharSequence getSubTitle() {
        return this.subTitle;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.headers.DoubleLineHeaderModel
    public CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subTitle.hashCode() + ChatData$$ExternalSyntheticOutline0.m(this.title, JfifUtil.MARKER_EOI, 31);
    }

    public String toString() {
        return "DoubleLineHeader{title=" + ((Object) this.title) + ", subTitle=" + ((Object) this.subTitle) + AbstractJsonLexerKt.END_OBJ;
    }
}
