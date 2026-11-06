package com.amazon.apl.android.scenegraph.generic;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Point<T> {
    private final T x;
    private final T y;

    public Point(T t, T t2) {
        this.x = t;
        this.y = t2;
    }

    public T getX() {
        return this.x;
    }

    public T getY() {
        return this.y;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Point(");
        sb.append(this.x);
        sb.append(", ");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, MarkdownConstants.RIGHT_PARENTHESIS, this.y);
    }
}
