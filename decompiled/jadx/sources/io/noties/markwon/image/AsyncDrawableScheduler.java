package io.noties.markwon.image;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AsyncDrawableScheduler {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DrawableCallbackImpl implements Drawable.Callback {
        private final Invalidator invalidator;
        private Rect previousBounds;
        private final TextView view;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public interface Invalidator {
            void invalidate();
        }

        public DrawableCallbackImpl(@NonNull TextView textView, @NonNull Invalidator invalidator, Rect rect) {
            this.view = textView;
            this.invalidator = invalidator;
            this.previousBounds = new Rect(rect);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull final Drawable drawable) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.view.post(new Runnable() { // from class: io.noties.markwon.image.AsyncDrawableScheduler.DrawableCallbackImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DrawableCallbackImpl.this.invalidateDrawable(drawable);
                    }
                });
                return;
            }
            Rect bounds = drawable.getBounds();
            if (this.previousBounds.equals(bounds)) {
                this.view.postInvalidate();
            } else {
                this.invalidator.invalidate();
                this.previousBounds = new Rect(bounds);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
            this.view.postDelayed(runnable, j - SystemClock.uptimeMillis());
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.view.removeCallbacks(runnable);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TextViewInvalidator implements DrawableCallbackImpl.Invalidator, Runnable {
        private final TextView textView;

        public TextViewInvalidator(@NonNull TextView textView) {
            this.textView = textView;
        }

        @Override // io.noties.markwon.image.AsyncDrawableScheduler.DrawableCallbackImpl.Invalidator
        public void invalidate() {
            this.textView.removeCallbacks(this);
            this.textView.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.textView;
            textView.setText(textView.getText());
        }
    }

    private AsyncDrawableScheduler() {
    }

    @Nullable
    private static AsyncDrawableSpan[] extractSpans(@NonNull TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (AsyncDrawableSpan[]) ((Spanned) text).getSpans(0, length, AsyncDrawableSpan.class);
    }

    public static void schedule(@NonNull final TextView textView) {
        Integer num = (Integer) textView.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode);
        int hashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != hashCode) {
            textView.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, Integer.valueOf(hashCode));
            AsyncDrawableSpan[] extractSpans = extractSpans(textView);
            if (extractSpans == null || extractSpans.length <= 0) {
                return;
            }
            if (textView.getTag(R.id.markwon_drawables_scheduler) == null) {
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: io.noties.markwon.image.AsyncDrawableScheduler.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        AsyncDrawableScheduler.unschedule(textView);
                        view.removeOnAttachStateChangeListener(this);
                        view.setTag(R.id.markwon_drawables_scheduler, null);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                    }
                };
                textView.addOnAttachStateChangeListener(onAttachStateChangeListener);
                textView.setTag(R.id.markwon_drawables_scheduler, onAttachStateChangeListener);
            }
            TextViewInvalidator textViewInvalidator = new TextViewInvalidator(textView);
            for (AsyncDrawableSpan asyncDrawableSpan : extractSpans) {
                AsyncDrawable drawable = asyncDrawableSpan.getDrawable();
                drawable.setCallback2(new DrawableCallbackImpl(textView, textViewInvalidator, drawable.getBounds()));
            }
        }
    }

    public static void unschedule(@NonNull TextView textView) {
        if (textView.getTag(R.id.markwon_drawables_scheduler_last_text_hashcode) == null) {
            return;
        }
        textView.setTag(R.id.markwon_drawables_scheduler_last_text_hashcode, null);
        AsyncDrawableSpan[] extractSpans = extractSpans(textView);
        if (extractSpans == null || extractSpans.length <= 0) {
            return;
        }
        for (AsyncDrawableSpan asyncDrawableSpan : extractSpans) {
            asyncDrawableSpan.getDrawable().setCallback2(null);
        }
    }
}
