package io.noties.markwon.core.spans;

import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class TextViewSpan {
    private final WeakReference<TextView> reference;

    public TextViewSpan(@NonNull TextView textView) {
        this.reference = new WeakReference<>(textView);
    }

    public static void applyTo(@NonNull Spannable spannable, @NonNull TextView textView) {
        TextViewSpan[] textViewSpanArr = (TextViewSpan[]) spannable.getSpans(0, spannable.length(), TextViewSpan.class);
        if (textViewSpanArr != null) {
            for (TextViewSpan textViewSpan : textViewSpanArr) {
                spannable.removeSpan(textViewSpan);
            }
        }
        spannable.setSpan(new TextViewSpan(textView), 0, spannable.length(), 18);
    }

    @Nullable
    public static TextView textViewOf(@NonNull Spanned spanned) {
        TextViewSpan[] textViewSpanArr = (TextViewSpan[]) spanned.getSpans(0, spanned.length(), TextViewSpan.class);
        if (textViewSpanArr == null || textViewSpanArr.length <= 0) {
            return null;
        }
        return textViewSpanArr[0].textView();
    }

    @Nullable
    public TextView textView() {
        return this.reference.get();
    }

    @Nullable
    public static TextView textViewOf(@NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return textViewOf((Spanned) charSequence);
        }
        return null;
    }
}
