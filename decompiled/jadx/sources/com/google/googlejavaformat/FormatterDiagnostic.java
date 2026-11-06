package com.google.googlejavaformat;

import com.google.common.base.Preconditions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class FormatterDiagnostic {
    private final int column;
    private final int lineNumber;
    private final String message;

    private FormatterDiagnostic(int i, int i2, String str) {
        this.lineNumber = i;
        this.column = i2;
        this.message = str;
    }

    public static FormatterDiagnostic create(int i, int i2, String str) {
        Preconditions.checkArgument(i >= 0);
        Preconditions.checkArgument(i2 >= 0);
        Preconditions.checkNotNull(str);
        return new FormatterDiagnostic(i, i2, str);
    }

    public int column() {
        return this.column;
    }

    public int line() {
        return this.lineNumber;
    }

    public String message() {
        return this.message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.lineNumber;
        if (i >= 0) {
            sb.append(i);
            sb.append(AbstractJsonLexerKt.COLON);
        }
        int i2 = this.column;
        if (i2 >= 0) {
            sb.append(i2 + 1);
            sb.append(AbstractJsonLexerKt.COLON);
        }
        if (this.lineNumber >= 0 || this.column >= 0) {
            sb.append(' ');
        }
        sb.append("error: ");
        sb.append(this.message);
        return sb.toString();
    }

    public static FormatterDiagnostic create(String str) {
        return new FormatterDiagnostic(-1, -1, str);
    }
}
