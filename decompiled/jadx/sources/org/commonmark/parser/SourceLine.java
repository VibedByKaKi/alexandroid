package org.commonmark.parser;

import org.commonmark.node.SourceSpan;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SourceLine {
    private final CharSequence content;
    private final SourceSpan sourceSpan;

    private SourceLine(CharSequence charSequence, SourceSpan sourceSpan) {
        if (charSequence == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("content must not be null");
            throw null;
        }
        this.content = charSequence;
        this.sourceSpan = sourceSpan;
    }

    public static SourceLine of(CharSequence charSequence, SourceSpan sourceSpan) {
        return new SourceLine(charSequence, sourceSpan);
    }

    public CharSequence getContent() {
        return this.content;
    }

    public SourceSpan getSourceSpan() {
        return this.sourceSpan;
    }

    public SourceLine substring(int i, int i2) {
        SourceSpan sourceSpan;
        CharSequence subSequence = this.content.subSequence(i, i2);
        SourceSpan sourceSpan2 = this.sourceSpan;
        if (sourceSpan2 != null) {
            int columnIndex = sourceSpan2.getColumnIndex() + i;
            int i3 = i2 - i;
            if (i3 != 0) {
                sourceSpan = SourceSpan.of(this.sourceSpan.getLineIndex(), columnIndex, i3);
                return of(subSequence, sourceSpan);
            }
        }
        sourceSpan = null;
        return of(subSequence, sourceSpan);
    }
}
