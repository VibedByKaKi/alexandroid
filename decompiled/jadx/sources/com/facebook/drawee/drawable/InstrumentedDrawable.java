package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/drawee/drawable/InstrumentedDrawable;", "Lcom/facebook/drawee/drawable/ForwardingDrawable;", "drawable", "Landroid/graphics/drawable/Drawable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/drawee/drawable/InstrumentedDrawable$Listener;", "<init>", "(Landroid/graphics/drawable/Drawable;Lcom/facebook/drawee/drawable/InstrumentedDrawable$Listener;)V", "_scaleType", "", "isChecked", "", "getScaleType", "draw", "", "canvas", "Landroid/graphics/Canvas;", "Listener", "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InstrumentedDrawable extends ForwardingDrawable {

    @NotNull
    private final String _scaleType;
    private boolean isChecked;

    @Nullable
    private final Listener listener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\r"}, d2 = {"Lcom/facebook/drawee/drawable/InstrumentedDrawable$Listener;", "", "track", "", "viewWidth", "", "viewHeight", "imageWidth", "imageHeight", "scaledWidth", "scaledHeight", "scaleType", "", "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Listener {
        void track(int viewWidth, int viewHeight, int imageWidth, int imageHeight, int scaledWidth, int scaledHeight, @Nullable String scaleType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentedDrawable(@NotNull Drawable drawable, @Nullable Listener listener) {
        super(drawable);
        drawable.getClass();
        this.listener = listener;
        this._scaleType = getScaleType(drawable);
    }

    private final String getScaleType(Drawable drawable) {
        return drawable instanceof ScaleTypeDrawable ? ((ScaleTypeDrawable) drawable).getScaleType().toString() : "none";
    }

    @Override // com.facebook.drawee.drawable.ForwardingDrawable, android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.getClass();
        if (!this.isChecked) {
            this.isChecked = true;
            RectF rectF = new RectF();
            getRootBounds(rectF);
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            getTransformedBounds(rectF);
            int width2 = (int) rectF.width();
            int height2 = (int) rectF.height();
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Listener listener = this.listener;
            if (listener != null) {
                listener.track(width, height, intrinsicWidth, intrinsicHeight, width2, height2, this._scaleType);
            }
        }
        super.draw(canvas);
    }
}
