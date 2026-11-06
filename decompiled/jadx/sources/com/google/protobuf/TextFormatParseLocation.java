package com.google.protobuf;

import java.util.Arrays;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TextFormatParseLocation {
    public static final TextFormatParseLocation EMPTY = new TextFormatParseLocation(-1, -1);
    private final int column;
    private final int line;

    private TextFormatParseLocation(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public static TextFormatParseLocation create(int i, int i2) {
        if (i == -1 && i2 == -1) {
            return EMPTY;
        }
        if (i >= 0 && i2 >= 0) {
            return new TextFormatParseLocation(i, i2);
        }
        Buffer$$ExternalSyntheticBUOutline0.m("line and column values must be >= 0: line %d, column: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextFormatParseLocation)) {
            return false;
        }
        TextFormatParseLocation textFormatParseLocation = (TextFormatParseLocation) obj;
        return this.line == textFormatParseLocation.getLine() && this.column == textFormatParseLocation.getColumn();
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public int hashCode() {
        return Arrays.hashCode(new int[]{this.line, this.column});
    }

    public String toString() {
        return String.format("ParseLocation{line=%d, column=%d}", Integer.valueOf(this.line), Integer.valueOf(this.column));
    }
}
