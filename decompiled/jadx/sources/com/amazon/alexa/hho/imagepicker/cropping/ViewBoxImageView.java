package com.amazon.alexa.hho.imagepicker.cropping;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.amazon.alexa.hho.imagepicker.cropping.ImageViewGestureHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class ViewBoxImageView extends AppCompatImageView implements IViewBoxImageView {
    private final ImageViewGestureHandler mGestureHandler;
    private ImageView.ScaleType mPendingScaleType;

    public ViewBoxImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        this.mGestureHandler = new ImageViewGestureHandler(this);
        ImageView.ScaleType scaleType = this.mPendingScaleType;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.mPendingScaleType = null;
        }
    }

    private void postUpdate() {
        post(new Runnable() { // from class: com.amazon.alexa.hho.imagepicker.cropping.ViewBoxImageView.1
            @Override // java.lang.Runnable
            public void run() {
                if (ViewBoxImageView.this.mGestureHandler != null) {
                    ViewBoxImageView.this.mGestureHandler.update();
                }
            }
        });
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public Bitmap getCroppedImage(String str) {
        return this.mGestureHandler.getCroppedImage(str);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public Matrix getDisplayMatrix() {
        return this.mGestureHandler.getDrawMatrix();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public RectF getDisplayRect() {
        return this.mGestureHandler.getDisplayRect();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public float getMaximumScale() {
        return this.mGestureHandler.getMaximumScale();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public float getMediumScale() {
        return this.mGestureHandler.getMediumScale();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public float getMinimumScale() {
        return this.mGestureHandler.getMinimumScale();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public ImageViewGestureHandler.OnPhotoTapListener getOnPhotoTapListener() {
        return this.mGestureHandler.getOnPhotoTapListener();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public ImageViewGestureHandler.OnViewTapListener getOnViewTapListener() {
        return this.mGestureHandler.getOnViewTapListener();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public float getScale() {
        return this.mGestureHandler.getScale();
    }

    @Override // android.widget.ImageView, com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public ImageView.ScaleType getScaleType() {
        return this.mGestureHandler.getScaleType();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public Bitmap getVisibleRectBitmap() {
        return this.mGestureHandler.getVisibleRectBitmap();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        this.mGestureHandler.cleanup();
        super.onDetachedFromWindow();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void reset() {
        this.mGestureHandler.reset();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setAllowParentInterceptOnEdge(boolean z) {
        this.mGestureHandler.setAllowParentInterceptOnEdge(z);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setCropWindowRect(RectF rectF) {
        this.mGestureHandler.setCropWindowRect(rectF);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public boolean setDisplayMatrix(Matrix matrix) {
        return this.mGestureHandler.setDisplayMatrix(matrix);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setImageBoundsListener(IGetImageBounds iGetImageBounds) {
        this.mGestureHandler.setImageBoundsListener(iGetImageBounds);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        postUpdate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        postUpdate();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        postUpdate();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setMaximumScale(float f) {
        this.mGestureHandler.setMaximumScale(f);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setMediumScale(float f) {
        this.mGestureHandler.setMediumScale(f);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setMinimumScale(float f) {
        this.mGestureHandler.setMinimumScale(f);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public float setMinimumScaleToFit(Drawable drawable, float f, float f2) {
        return this.mGestureHandler.setMinimumScaleToFit(drawable, f, f2);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setOnDoubleTapListener(@NonNull GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mGestureHandler.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setOnMatrixChangeListener(@NonNull ImageViewGestureHandler.OnMatrixChangedListener onMatrixChangedListener) {
        this.mGestureHandler.setOnMatrixChangeListener(onMatrixChangedListener);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setOnPhotoTapListener(@NonNull ImageViewGestureHandler.OnPhotoTapListener onPhotoTapListener) {
        this.mGestureHandler.setOnPhotoTapListener(onPhotoTapListener);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setOnViewTapListener(ImageViewGestureHandler.OnViewTapListener onViewTapListener) {
        this.mGestureHandler.setOnViewTapListener(onViewTapListener);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setScale(float f) {
        this.mGestureHandler.setScale(f);
    }

    @Override // android.widget.ImageView, com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setScaleType(@NonNull ImageView.ScaleType scaleType) {
        ImageViewGestureHandler imageViewGestureHandler = this.mGestureHandler;
        if (imageViewGestureHandler != null) {
            imageViewGestureHandler.setScaleType(scaleType);
        } else {
            this.mPendingScaleType = scaleType;
        }
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setZoomTransitionDuration(int i) {
        this.mGestureHandler.setZoomTransitionDuration(i);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void update() {
        this.mGestureHandler.update();
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setScale(float f, boolean z) {
        this.mGestureHandler.setScale(f, z);
    }

    @Override // com.amazon.alexa.hho.imagepicker.cropping.IViewBoxImageView
    public void setScale(float f, float f2, float f3, boolean z) {
        this.mGestureHandler.setScale(f, f2, f3, z);
    }

    public ViewBoxImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewBoxImageView(Context context) {
        this(context, null);
    }
}
