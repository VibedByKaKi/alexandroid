package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class AsyncDrawable extends Drawable {
    private Drawable.Callback callback;
    private int canvasWidth;
    private final String destination;
    private final ImageSize imageSize;
    private final ImageSizeResolver imageSizeResolver;
    private final AsyncDrawableLoader loader;
    private final Drawable placeholder;
    private Drawable result;
    private float textSize;
    private boolean waitingForDimensions;
    private boolean wasPlayingBefore = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class WrappedCallback implements Drawable.Callback {
        private final Drawable.Callback callback;

        public WrappedCallback(@NonNull Drawable.Callback callback) {
            this.callback = callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            this.callback.invalidateDrawable(AsyncDrawable.this);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
            this.callback.scheduleDrawable(AsyncDrawable.this, runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.callback.unscheduleDrawable(AsyncDrawable.this, runnable);
        }
    }

    public AsyncDrawable(@NonNull String str, @NonNull AsyncDrawableLoader asyncDrawableLoader, @NonNull ImageSizeResolver imageSizeResolver, @Nullable ImageSize imageSize) {
        this.destination = str;
        this.loader = asyncDrawableLoader;
        this.imageSizeResolver = imageSizeResolver;
        this.imageSize = imageSize;
        Drawable placeholder = asyncDrawableLoader.placeholder(this);
        this.placeholder = placeholder;
        if (placeholder != null) {
            setPlaceholderResult(placeholder);
        }
    }

    private void initBounds() {
        if (this.canvasWidth == 0) {
            this.waitingForDimensions = true;
            setBounds(noDimensionsBounds(this.result));
            return;
        }
        this.waitingForDimensions = false;
        Rect resolveBounds = resolveBounds();
        this.result.setBounds(resolveBounds);
        this.result.setCallback(this.callback);
        setBounds(resolveBounds);
        invalidateSelf();
    }

    @NonNull
    private static Rect noDimensionsBounds(@Nullable Drawable drawable) {
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            if (!bounds.isEmpty()) {
                return bounds;
            }
            Rect intrinsicBounds = DrawableUtils.intrinsicBounds(drawable);
            if (!intrinsicBounds.isEmpty()) {
                return intrinsicBounds;
            }
        }
        return new Rect(0, 0, 1, 1);
    }

    @NonNull
    private Rect resolveBounds() {
        return this.imageSizeResolver.resolveImageSize(this);
    }

    public void clearResult() {
        Drawable drawable = this.result;
        if (drawable != null) {
            drawable.setCallback(null);
            this.result = null;
            setBounds(0, 0, 0, 0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (hasResult()) {
            this.result.draw(canvas);
        }
    }

    @NonNull
    public String getDestination() {
        return this.destination;
    }

    @Nullable
    public ImageSize getImageSize() {
        return this.imageSize;
    }

    @NonNull
    public ImageSizeResolver getImageSizeResolver() {
        return this.imageSizeResolver;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (hasResult()) {
            return this.result.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (hasResult()) {
            return this.result.getIntrinsicWidth();
        }
        return 1;
    }

    public float getLastKnowTextSize() {
        return this.textSize;
    }

    public int getLastKnownCanvasWidth() {
        return this.canvasWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (hasResult()) {
            return this.result.getOpacity();
        }
        return -2;
    }

    public Drawable getResult() {
        return this.result;
    }

    public boolean hasKnownDimensions() {
        return this.canvasWidth > 0;
    }

    public boolean hasResult() {
        return this.result != null;
    }

    public void initWithKnownDimensions(int i, float f) {
        this.canvasWidth = i;
        this.textSize = f;
        if (this.waitingForDimensions) {
            initBounds();
        }
    }

    public boolean isAttached() {
        return getCallback() != null;
    }

    public void setCallback2(@Nullable Drawable.Callback callback) {
        this.callback = callback == null ? null : new WrappedCallback(callback);
        super.setCallback(callback);
        Drawable.Callback callback2 = this.callback;
        Drawable drawable = this.result;
        if (callback2 == null) {
            if (drawable != null) {
                drawable.setCallback(null);
                Object obj = this.result;
                if (obj instanceof Animatable) {
                    Animatable animatable = (Animatable) obj;
                    boolean isRunning = animatable.isRunning();
                    this.wasPlayingBefore = isRunning;
                    if (isRunning) {
                        animatable.stop();
                    }
                }
            }
            this.loader.cancel(this);
            return;
        }
        if (drawable != null && drawable.getCallback() == null) {
            this.result.setCallback(this.callback);
        }
        Drawable drawable2 = this.result;
        boolean z = drawable2 == null || drawable2 == this.placeholder;
        if (drawable2 != null) {
            drawable2.setCallback(this.callback);
            Object obj2 = this.result;
            if ((obj2 instanceof Animatable) && this.wasPlayingBefore) {
                ((Animatable) obj2).start();
            }
        }
        if (z) {
            this.loader.load(this);
        }
    }

    public void setPlaceholderResult(@NonNull Drawable drawable) {
        Drawable drawable2 = this.result;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        Rect bounds = drawable.getBounds();
        if (!bounds.isEmpty()) {
            this.result = drawable;
            drawable.setCallback(this.callback);
            setBounds(bounds);
            this.waitingForDimensions = false;
            return;
        }
        Rect intrinsicBounds = DrawableUtils.intrinsicBounds(drawable);
        if (intrinsicBounds.isEmpty()) {
            drawable.setBounds(0, 0, 1, 1);
        } else {
            drawable.setBounds(intrinsicBounds);
        }
        setBounds(drawable.getBounds());
        setResult(drawable);
    }

    public void setResult(@NonNull Drawable drawable) {
        this.wasPlayingBefore = false;
        Drawable drawable2 = this.result;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.result = drawable;
        initBounds();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AsyncDrawable{destination='");
        sb.append(this.destination);
        sb.append("', imageSize=");
        sb.append(this.imageSize);
        sb.append(", result=");
        sb.append(this.result);
        sb.append(", canvasWidth=");
        sb.append(this.canvasWidth);
        sb.append(", textSize=");
        sb.append(this.textSize);
        sb.append(", waitingForDimensions=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.waitingForDimensions, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
