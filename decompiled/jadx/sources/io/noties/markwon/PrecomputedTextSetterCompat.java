package io.noties.markwon;

import android.text.Spanned;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.text.PrecomputedTextCompat;
import io.noties.markwon.Markwon;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PrecomputedTextSetterCompat implements Markwon.TextSetter {
    private final Executor executor;

    public PrecomputedTextSetterCompat(@NonNull Executor executor) {
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyText(@Nullable final TextView textView, @NonNull final Spanned spanned, @NonNull final TextView.BufferType bufferType, @NonNull final Runnable runnable) {
        if (textView != null) {
            textView.post(new Runnable() { // from class: io.noties.markwon.PrecomputedTextSetterCompat.2
                @Override // java.lang.Runnable
                public void run() {
                    textView.setText(spanned, bufferType);
                    runnable.run();
                }
            });
        }
    }

    @NonNull
    public static PrecomputedTextSetterCompat create(@NonNull Executor executor) {
        return new PrecomputedTextSetterCompat(executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static PrecomputedTextCompat precomputedText(@Nullable TextView textView, @NonNull Spanned spanned) {
        if (textView == null) {
            return null;
        }
        return PrecomputedTextCompat.create(spanned, new PrecomputedTextCompat.Params(textView.getTextMetricsParams()));
    }

    @Override // io.noties.markwon.Markwon.TextSetter
    public void setText(@NonNull TextView textView, @NonNull final Spanned spanned, @NonNull final TextView.BufferType bufferType, @NonNull final Runnable runnable) {
        final WeakReference weakReference = new WeakReference(textView);
        this.executor.execute(new Runnable() { // from class: io.noties.markwon.PrecomputedTextSetterCompat.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    PrecomputedTextCompat precomputedText = PrecomputedTextSetterCompat.precomputedText((TextView) weakReference.get(), spanned);
                    if (precomputedText != null) {
                        PrecomputedTextSetterCompat.applyText((TextView) weakReference.get(), precomputedText, bufferType, runnable);
                    }
                } catch (Throwable th) {
                    Log.e("PrecomputdTxtSetterCmpt", "Exception during pre-computing text", th);
                    PrecomputedTextSetterCompat.applyText((TextView) weakReference.get(), spanned, bufferType, runnable);
                }
            }
        });
    }
}
