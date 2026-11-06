package com.amazon.dee.app.ui.main;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import com.amazon.dee.app.core.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class GlowFrameLayout extends FrameLayout {
    private static final String TAG = "GlowFrameLayout";
    private int backgroundColor;
    private Bitmap cachedBitmap;
    private Canvas cachedCanvas;
    private float cornerRadius;
    private int glowColor;
    private float glowSpread;
    private boolean isDirty;

    @VisibleForTesting
    protected Paint paint;
    private Path path;
    private RectF rect;

    public GlowFrameLayout(Context context) {
        super(context);
        this.isDirty = true;
        init(null);
    }

    private float dpToPx(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    private void drawGlowEffect() {
        this.cachedCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        float f = this.glowSpread;
        this.rect.set(f, f, getWidth() - f, getHeight() - f);
        this.path.reset();
        Path path = this.path;
        RectF rectF = this.rect;
        float f2 = this.cornerRadius;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        this.paint.setShadowLayer(this.glowSpread, 0.0f, 0.0f, this.glowColor);
        this.cachedCanvas.drawPath(this.path, this.paint);
        this.paint.setShader(null);
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.backgroundColor);
        this.cachedCanvas.drawPath(this.path, this.paint);
    }

    public void init(AttributeSet attributeSet) {
        setWillNotDraw(false);
        this.paint = new Paint(1);
        this.path = new Path();
        this.rect = new RectF();
        this.glowColor = getResources().getColor(R.color.alexa_glow, getContext().getTheme());
        this.backgroundColor = getResources().getColor(R.color.mosaic_bottom_bar_background, getContext().getTheme());
        this.cornerRadius = getResources().getDimension(R.dimen.af_floating_input_bar_radius);
        this.glowSpread = getResources().getDimension(R.dimen.af_floating_input_bar_glow_spread);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.GlowFrameLayout);
            try {
                this.glowColor = obtainStyledAttributes.getColor(R.styleable.GlowFrameLayout_glowColor, this.glowColor);
                this.glowSpread = dpToPx(obtainStyledAttributes.getDimension(R.styleable.GlowFrameLayout_glowSpread, this.glowSpread));
                this.cornerRadius = dpToPx(obtainStyledAttributes.getDimension(R.styleable.GlowFrameLayout_cornerRadius, this.cornerRadius));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        setBackgroundColor(0);
        setLayerType(2, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.isDirty) {
            drawGlowEffect();
            this.isDirty = false;
        }
        canvas.drawBitmap(this.cachedBitmap, 0.0f, 0.0f, (Paint) null);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.isDirty = true;
        Bitmap bitmap = this.cachedBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.cachedBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.cachedCanvas = new Canvas(this.cachedBitmap);
    }

    public void setCornerRadius(float f) {
        this.cornerRadius = f;
        invalidate();
    }

    public void setFillColor(int i) {
        if (this.backgroundColor == i) {
            return;
        }
        this.backgroundColor = i;
        this.isDirty = true;
        invalidate();
    }

    public void setGlowColor(int i) {
        this.glowColor = i;
        invalidate();
    }

    public void setGlowSpread(float f) {
        this.glowSpread = f;
        invalidate();
    }

    public GlowFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isDirty = true;
        init(attributeSet);
    }

    public GlowFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isDirty = true;
        init(attributeSet);
    }
}
