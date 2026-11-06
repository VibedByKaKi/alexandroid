package io.noties.markwon.utils;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import io.noties.markwon.core.spans.TextLayoutSpan;
import io.noties.markwon.core.spans.TextViewSpan;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class SpanUtils {
    public static int width(@NonNull Canvas canvas, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout layoutOf = TextLayoutSpan.layoutOf(spanned);
            if (layoutOf != null) {
                return layoutOf.getWidth();
            }
            TextView textViewOf = TextViewSpan.textViewOf(spanned);
            if (textViewOf != null) {
                return (textViewOf.getWidth() - textViewOf.getPaddingLeft()) - textViewOf.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }
}
