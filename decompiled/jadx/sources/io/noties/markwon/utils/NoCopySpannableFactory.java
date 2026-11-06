package io.noties.markwon.utils;

import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class NoCopySpannableFactory extends Spannable.Factory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Holder {
        private static final NoCopySpannableFactory INSTANCE = new NoCopySpannableFactory();
    }

    @NonNull
    public static NoCopySpannableFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override // android.text.Spannable.Factory
    public Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
    }
}
