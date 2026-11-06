package org.commonmark.node;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SourceSpan {
    private final int columnIndex;
    private final int length;
    private final int lineIndex;

    private SourceSpan(int i, int i2, int i3) {
        this.lineIndex = i;
        this.columnIndex = i2;
        this.length = i3;
    }

    public static SourceSpan of(int i, int i2, int i3) {
        return new SourceSpan(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SourceSpan sourceSpan = (SourceSpan) obj;
            if (this.lineIndex == sourceSpan.lineIndex && this.columnIndex == sourceSpan.columnIndex && this.length == sourceSpan.length) {
                return true;
            }
        }
        return false;
    }

    public int getColumnIndex() {
        return this.columnIndex;
    }

    public int getLength() {
        return this.length;
    }

    public int getLineIndex() {
        return this.lineIndex;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.lineIndex), Integer.valueOf(this.columnIndex), Integer.valueOf(this.length));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SourceSpan{line=");
        sb.append(this.lineIndex);
        sb.append(", column=");
        sb.append(this.columnIndex);
        sb.append(", length=");
        return a$$ExternalSyntheticOutline0.m(sb, this.length, StringSubstitutor.DEFAULT_VAR_END);
    }
}
