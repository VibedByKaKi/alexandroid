package io.noties.markwon.core.spans;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class TextLayoutSpan {
    private final WeakReference<Layout> reference;

    public TextLayoutSpan(@NonNull Layout layout) {
        this.reference = new WeakReference<>(layout);
    }

    public static void applyTo(@NonNull Spannable spannable, @NonNull Layout layout) {
        TextLayoutSpan[] textLayoutSpanArr = (TextLayoutSpan[]) spannable.getSpans(0, spannable.length(), TextLayoutSpan.class);
        if (textLayoutSpanArr != null) {
            for (TextLayoutSpan textLayoutSpan : textLayoutSpanArr) {
                spannable.removeSpan(textLayoutSpan);
            }
        }
        spannable.setSpan(new TextLayoutSpan(layout), 0, spannable.length(), 18);
    }

    @Nullable
    public static Layout layoutOf(@NonNull Spanned spanned) {
        TextLayoutSpan[] textLayoutSpanArr = (TextLayoutSpan[]) spanned.getSpans(0, spanned.length(), TextLayoutSpan.class);
        if (textLayoutSpanArr == null || textLayoutSpanArr.length <= 0) {
            return null;
        }
        return textLayoutSpanArr[0].layout();
    }

    @Nullable
    public Layout layout() {
        return this.reference.get();
    }

    @Nullable
    public static Layout layoutOf(@NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return layoutOf((Spanned) charSequence);
        }
        return null;
    }
}
