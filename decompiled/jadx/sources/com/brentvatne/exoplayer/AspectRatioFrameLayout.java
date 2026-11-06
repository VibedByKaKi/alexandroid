package com.brentvatne.exoplayer;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.common.Format;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aR$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/brentvatne/exoplayer/AspectRatioFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "value", "", "videoAspectRatio", "getVideoAspectRatio", "()F", "setVideoAspectRatio", "(F)V", "", ViewProps.RESIZE_MODE, "getResizeMode", "()I", "setResizeMode", "(I)V", "invalidateAspectRatio", "", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "updateAspectRatio", "format", "Landroidx/media3/common/Format;", "Companion", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    private int resizeMode;
    private float videoAspectRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioFrameLayout(@NotNull Context context) {
        super(context);
        context.getClass();
    }

    public final int getResizeMode() {
        return this.resizeMode;
    }

    public final float getVideoAspectRatio() {
        return this.videoAspectRatio;
    }

    public final void invalidateAspectRatio() {
        setVideoAspectRatio(0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f;
        float f2;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.videoAspectRatio == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = (this.videoAspectRatio / (f3 / f4)) - 1;
        if (Math.abs(f5) <= 0.01f) {
            return;
        }
        int i = this.resizeMode;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        float f6 = this.videoAspectRatio;
                        if (f5 > 0.0f) {
                            f = f3 / f6;
                        } else {
                            f2 = f4 * f6;
                        }
                    } else {
                        int i2 = (int) (this.videoAspectRatio * f4);
                        if (i2 < measuredWidth) {
                            float f7 = i2;
                            float f8 = f3 / f7;
                            measuredWidth = (int) (f7 * f8);
                            f = f8 * f4;
                        } else {
                            measuredWidth = i2;
                        }
                    }
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            f2 = f4 * this.videoAspectRatio;
            measuredWidth = (int) f2;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        f = f3 / this.videoAspectRatio;
        measuredHeight = (int) f;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public final void setResizeMode(int i) {
        if (i != this.resizeMode) {
            this.resizeMode = i;
            requestLayout();
        }
    }

    public final void setVideoAspectRatio(float f) {
        if (f == this.videoAspectRatio) {
            return;
        }
        this.videoAspectRatio = f;
        requestLayout();
    }

    public final void updateAspectRatio(@NotNull Format format) {
        format.getClass();
        int i = format.rotationDegrees;
        if (i == 90 || i == 270) {
            int i2 = format.width;
            setVideoAspectRatio(i2 != 0 ? (format.height * format.pixelWidthHeightRatio) / i2 : 1.0f);
        } else {
            int i3 = format.height;
            setVideoAspectRatio(i3 != 0 ? (format.width * format.pixelWidthHeightRatio) / i3 : 1.0f);
        }
    }
}
