package com.facebook.drawee.debug;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.facebook.drawee.debug.listener.ImageLoadingTimeListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.infer.annotation.Nullsafe;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class DebugControllerOverlayDrawable extends Drawable implements ImageLoadingTimeListener {
    private static final float IMAGE_SIZE_THRESHOLD_NOT_OK = 0.5f;
    private static final float IMAGE_SIZE_THRESHOLD_OK = 0.1f;
    private static final int MAX_LINE_WIDTH_EM = 8;
    private static final int MAX_NUMBER_OF_LINES = 9;
    private static final int MAX_TEXT_SIZE_PX = 40;
    private static final int MIN_TEXT_SIZE_PX = 10;
    private static final String NO_CONTROLLER_ID = "none";
    private static final int OUTLINE_COLOR = -26624;
    private static final int OUTLINE_STROKE_WIDTH_PX = 2;
    private static final int TEXT_BACKGROUND_COLOR = 1711276032;
    private static final int TEXT_COLOR = -1;

    @VisibleForTesting
    static final int TEXT_COLOR_IMAGE_ALMOST_OK = -256;

    @VisibleForTesting
    static final int TEXT_COLOR_IMAGE_NOT_OK = -65536;

    @VisibleForTesting
    static final int TEXT_COLOR_IMAGE_OK = -16711936;
    private static final int TEXT_LINE_SPACING_PX = 8;
    private static final int TEXT_PADDING_PX = 10;
    private String mControllerId;
    private int mCurrentTextXPx;
    private int mCurrentTextYPx;
    private long mFinalImageTimeMs;
    private int mFrameCount;
    private int mHeightPx;

    @Nullable
    private String mImageFormat;

    @Nullable
    private String mImageId;
    private int mImageSizeBytes;
    private int mLineIncrementPx;
    private int mLoopCount;

    @Nullable
    private String mOriginText;

    @Nullable
    private ScalingUtils.ScaleType mScaleType;
    private int mStartTextXPx;
    private int mStartTextYPx;
    private int mWidthPx;
    private HashMap<String, String> mAdditionalData = new HashMap<>();
    private int mTextGravity = 80;
    private final Paint mPaint = new Paint(1);
    private final Matrix mMatrix = new Matrix();
    private final Rect mRect = new Rect();
    private final RectF mRectF = new RectF();
    private int mOriginColor = -1;
    private int mOverlayColor = 0;

    public DebugControllerOverlayDrawable() {
        reset();
    }

    private void addDebugText(Canvas canvas, String str, String str2, int i) {
        String m = BitVector$$ExternalSyntheticOutline0.m(str, ": ");
        float measureText = this.mPaint.measureText(m);
        float measureText2 = this.mPaint.measureText(str2);
        this.mPaint.setColor(TEXT_BACKGROUND_COLOR);
        int i2 = this.mCurrentTextXPx;
        int i3 = this.mCurrentTextYPx;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + measureText + measureText2 + 4.0f, i3 + this.mLineIncrementPx + 8, this.mPaint);
        this.mPaint.setColor(-1);
        canvas.drawText(m, this.mCurrentTextXPx, this.mCurrentTextYPx, this.mPaint);
        this.mPaint.setColor(i);
        canvas.drawText(str2, this.mCurrentTextXPx + measureText, this.mCurrentTextYPx, this.mPaint);
        this.mCurrentTextYPx += this.mLineIncrementPx;
    }

    private static String format(String str, @Nullable Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void prepareDebugTextParameters(Rect rect, int i, int i2) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.mPaint.setTextSize(min);
        int i3 = min + 8;
        this.mLineIncrementPx = i3;
        int i4 = this.mTextGravity;
        if (i4 == 80) {
            this.mLineIncrementPx = i3 * (-1);
        }
        this.mStartTextXPx = rect.left + 10;
        this.mStartTextYPx = i4 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    public void addAdditionalData(String str, String str2) {
        this.mAdditionalData.put(str, str2);
    }

    @VisibleForTesting
    public int determineSizeHintColor(int i, int i2, @Nullable ScalingUtils.ScaleType scaleType) {
        int i3;
        int i4;
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (scaleType != null) {
                Rect rect = this.mRect;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.mMatrix.reset();
                i3 = i;
                i4 = i2;
                scaleType.getTransform(this.mMatrix, this.mRect, i3, i4, 0.0f, 0.0f);
                RectF rectF = this.mRectF;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i3;
                rectF.bottom = i4;
                this.mMatrix.mapRect(rectF);
                int width2 = (int) this.mRectF.width();
                int height2 = (int) this.mRectF.height();
                width = Math.min(width, width2);
                height = Math.min(height, height2);
            } else {
                i3 = i;
                i4 = i2;
            }
            float f = width;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = height;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i3 - width);
            int abs2 = Math.abs(i4 - height);
            float f7 = abs;
            if (f7 < f2 && abs2 < f5) {
                return TEXT_COLOR_IMAGE_OK;
            }
            if (f7 < f3 && abs2 < f6) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(2.0f);
        this.mPaint.setColor(OUTLINE_COLOR);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.mPaint);
        Paint paint = this.mPaint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.mPaint.setColor(this.mOverlayColor);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.mPaint);
        this.mPaint.setStyle(style);
        this.mPaint.setStrokeWidth(0.0f);
        this.mPaint.setColor(-1);
        this.mCurrentTextXPx = this.mStartTextXPx;
        this.mCurrentTextYPx = this.mStartTextYPx;
        String str = this.mImageId;
        String str2 = this.mControllerId;
        if (str != null) {
            addDebugText(canvas, "IDs", format("%s, %s", str2, str));
        } else {
            addDebugText(canvas, "ID", str2);
        }
        addDebugText(canvas, "D", format("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        if (bounds.height() > 0) {
            addDebugText(canvas, "DAR", Float.valueOf(bounds.width() / bounds.height()));
        }
        addDebugText(canvas, "I", format("%dx%d", Integer.valueOf(this.mWidthPx), Integer.valueOf(this.mHeightPx)), determineSizeHintColor(this.mWidthPx, this.mHeightPx, this.mScaleType));
        int i = this.mHeightPx;
        if (i > 0) {
            addDebugText(canvas, "IAR", Float.valueOf(this.mWidthPx / i));
        }
        addDebugText(canvas, "I", format("%d KiB", Integer.valueOf(this.mImageSizeBytes / 1024)));
        String str3 = this.mImageFormat;
        if (str3 != null) {
            addDebugText(canvas, "i format", str3);
        }
        int i2 = this.mFrameCount;
        if (i2 > 0) {
            addDebugText(canvas, "anim", format("f %d, l %d", Integer.valueOf(i2), Integer.valueOf(this.mLoopCount)));
        }
        ScalingUtils.ScaleType scaleType = this.mScaleType;
        if (scaleType != null) {
            addDebugText(canvas, ModelTransformer.KEY_BATTERY_SCALE, scaleType);
        }
        long j = this.mFinalImageTimeMs;
        if (j >= 0) {
            addDebugText(canvas, "t", format("%d ms", Long.valueOf(j)));
        }
        String str4 = this.mOriginText;
        if (str4 != null) {
            addDebugText(canvas, "origin", str4, this.mOriginColor);
        }
        for (Map.Entry<String, String> entry : this.mAdditionalData.entrySet()) {
            addDebugText(canvas, entry.getKey(), entry.getValue());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        prepareDebugTextParameters(rect, 9, 8);
    }

    @Override // com.facebook.drawee.debug.listener.ImageLoadingTimeListener
    public void onFinalImageSet(long j) {
        this.mFinalImageTimeMs = j;
        invalidateSelf();
    }

    public void reset() {
        this.mWidthPx = -1;
        this.mHeightPx = -1;
        this.mImageSizeBytes = -1;
        this.mAdditionalData = new HashMap<>();
        this.mFrameCount = -1;
        this.mLoopCount = -1;
        this.mImageFormat = null;
        setControllerId(null);
        this.mFinalImageTimeMs = -1L;
        this.mOriginText = null;
        this.mOriginColor = -1;
        invalidateSelf();
    }

    public void setAnimationInfo(int i, int i2) {
        this.mFrameCount = i;
        this.mLoopCount = i2;
        invalidateSelf();
    }

    public void setControllerId(@Nullable String str) {
        if (str == null) {
            str = "none";
        }
        this.mControllerId = str;
        invalidateSelf();
    }

    public void setDimensions(int i, int i2) {
        this.mWidthPx = i;
        this.mHeightPx = i2;
        invalidateSelf();
    }

    public void setFinalImageTimeMs(long j) {
        this.mFinalImageTimeMs = j;
    }

    public void setImageFormat(@Nullable String str) {
        this.mImageFormat = str;
    }

    public void setImageId(@Nullable String str) {
        this.mImageId = str;
        invalidateSelf();
    }

    public void setImageSize(int i) {
        this.mImageSizeBytes = i;
    }

    public void setOrigin(String str, int i) {
        this.mOriginText = str;
        this.mOriginColor = i;
        invalidateSelf();
    }

    public void setOverlayColor(int i) {
        this.mOverlayColor = i;
    }

    public void setScaleType(@Nullable ScalingUtils.ScaleType scaleType) {
        this.mScaleType = scaleType;
    }

    public void setTextGravity(int i) {
        this.mTextGravity = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private void addDebugText(Canvas canvas, String str, String str2) {
        addDebugText(canvas, str, str2, -1);
    }

    private void addDebugText(Canvas canvas, String str, Object obj) {
        addDebugText(canvas, str, String.valueOf(obj), -1);
    }
}
