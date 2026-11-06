package com.amazon.apl.android.text;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LineSpan {
    private final int color;
    private final int end;
    private final int start;

    public LineSpan(int i, int i2, int i3) {
        this.start = i;
        this.end = i2;
        this.color = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            LineSpan lineSpan = (LineSpan) obj;
            if (lineSpan.start == this.start && lineSpan.end == this.end && lineSpan.color == this.color) {
                return true;
            }
        }
        return false;
    }

    public int getColor() {
        return this.color;
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.start), Integer.valueOf(this.end), Integer.valueOf(this.color));
    }
}
