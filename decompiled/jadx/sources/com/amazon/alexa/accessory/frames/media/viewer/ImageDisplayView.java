package com.amazon.alexa.accessory.frames.media.viewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.accessory.frames.R;
import com.amazon.alexa.accessory.frames.media.transform.BitmapUtils;
import com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.dee.app.http.listener.NetworkMetricsEventListenerReporter$$ExternalSyntheticLambda0;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ImageDisplayView extends MediaDisplayView {
    private static final ExecutorService DECODE_EXECUTOR = Executors.newSingleThreadExecutor();
    private static final int MAX_DECODE_DIMENSION_PX = 2048;
    private static final String TAG = "ImageDisplayView";

    @Nullable
    private View autoCaptureIndicator;

    @Nullable
    private FrameLayout contentContainer;

    @Nullable
    private ImageView imageView;
    private int lastSampleSize;
    private long loadToken;
    private final Handler mainHandler;
    private boolean shouldShowAutoCaptureIndicator;
    private float zoomTransX;
    private float zoomTransY;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DecodedImage {

        @Nullable
        final Bitmap bitmap;
        final int sampleSize;

        public DecodedImage(@Nullable Bitmap bitmap, int i) {
            this.bitmap = bitmap;
            this.sampleSize = i;
        }
    }

    public ImageDisplayView(@NonNull Context context) {
        super(context);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.loadToken = 0L;
        this.lastSampleSize = 1;
        this.shouldShowAutoCaptureIndicator = false;
        this.zoomTransX = 0.0f;
        this.zoomTransY = 0.0f;
        initializeView(context);
    }

    private void applyContentTransform() {
        FrameLayout frameLayout = this.contentContainer;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setScaleX(this.currentScale);
        frameLayout.setScaleY(this.currentScale);
        frameLayout.setTranslationX(this.zoomTransX);
        frameLayout.setTranslationY(this.zoomTransY);
    }

    @NonNull
    public static Bitmap applyExifOrientation(@NonNull Context context, @NonNull Uri uri, @NonNull Bitmap bitmap) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                if (openInputStream == null) {
                    return bitmap;
                }
                openInputStream.close();
                return bitmap;
            }
            try {
                Bitmap applyExifOrientation = BitmapUtils.applyExifOrientation(bitmap, new ExifInterface(openInputStream));
                if (applyExifOrientation != bitmap) {
                    bitmap.recycle();
                }
                openInputStream.close();
                return applyExifOrientation;
            } finally {
            }
        } catch (Exception e) {
            Log.w(TAG, "EXIF orientation read failed, showing un-rotated bitmap for " + uri, e);
            return bitmap;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 < r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkAndApplyBounds() {
        /*
            r7 = this;
            android.graphics.RectF r0 = r7.getTransformedImageRect()
            if (r0 == 0) goto L63
            android.widget.ImageView r1 = r7.imageView
            if (r1 != 0) goto Lb
            goto L63
        Lb:
            int r1 = r1.getWidth()
            android.widget.ImageView r2 = r7.imageView
            int r2 = r2.getHeight()
            float r3 = r0.width()
            float r1 = (float) r1
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            if (r3 > 0) goto L28
            float r1 = r1 / r4
            float r3 = r0.centerX()
        L26:
            float r1 = r1 - r3
            goto L38
        L28:
            float r3 = r0.left
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L30
            float r1 = -r3
            goto L38
        L30:
            float r3 = r0.right
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 >= 0) goto L37
            goto L26
        L37:
            r1 = r5
        L38:
            float r3 = r0.height()
            float r2 = (float) r2
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 > 0) goto L49
            float r2 = r2 / r4
            float r0 = r0.centerY()
        L46:
            float r5 = r2 - r0
            goto L58
        L49:
            float r3 = r0.top
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 <= 0) goto L51
            float r5 = -r3
            goto L58
        L51:
            float r0 = r0.bottom
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L58
            goto L46
        L58:
            float r0 = r7.zoomTransX
            float r0 = r0 + r1
            r7.zoomTransX = r0
            float r0 = r7.zoomTransY
            float r0 = r0 + r5
            r7.zoomTransY = r0
            return
        L63:
            java.lang.String r7 = com.amazon.alexa.accessory.frames.media.viewer.ImageDisplayView.TAG
            java.lang.String r0 = "Cannot check and apply bounds - transformed image rect unavailable"
            com.amazon.alexa.accessory.frames.utils.Log.w(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.accessory.frames.media.viewer.ImageDisplayView.checkAndApplyBounds():void");
    }

    public static int computeInSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i3 <= 0 || i4 <= 0) {
            return 1;
        }
        while (true) {
            if (i / i5 <= i3 && i2 / i5 <= i4) {
                return i5;
            }
            i5 *= 2;
        }
    }

    public static float computeMaxZoomScale(int i, int i2, int i3, int i4, int i5) {
        if (i2 <= 0 || i3 <= 0 || i4 <= 0 || i5 <= 0) {
            return 10.0f;
        }
        return Math.max(1.0f, (i * 2.0f) / Math.min(i2 / i4, i3 / i5));
    }

    @NonNull
    public static DecodedImage decodeSampledImage(@NonNull Context context, @NonNull Uri uri) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.decodeStream(openInputStream, null, options);
                if (openInputStream != null) {
                    openInputStream.close();
                }
                if (options.outWidth > 0 && options.outHeight > 0) {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = computeInSampleSize(options.outWidth, options.outHeight, 2048, 2048);
                    openInputStream = context.getContentResolver().openInputStream(uri);
                    try {
                        Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options2);
                        if (openInputStream != null) {
                            openInputStream.close();
                        }
                        if (decodeStream != null) {
                            Bitmap applyExifOrientation = applyExifOrientation(context, uri, decodeStream);
                            Log.i(MemTrace.TAG, "[image-decode] src=%dx%d sample=%d -> %dx%d ~%dKB | %s", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), Integer.valueOf(options2.inSampleSize), Integer.valueOf(applyExifOrientation.getWidth()), Integer.valueOf(applyExifOrientation.getHeight()), Integer.valueOf(applyExifOrientation.getAllocationByteCount() / 1024), MemTrace.heap());
                            return new DecodedImage(applyExifOrientation, options2.inSampleSize);
                        }
                        Log.w(TAG, "Pixel decode returned null for " + uri);
                        return new DecodedImage(null, 1);
                    } finally {
                    }
                }
                Log.w(TAG, "Bounds decode yielded no dimensions for " + uri);
                return new DecodedImage(null, 1);
            } finally {
            }
        } catch (Exception e) {
            Log.e(TAG, "decodeSampledImage failed for " + uri, e);
            return new DecodedImage(null, 1);
        } catch (OutOfMemoryError e2) {
            Log.e(TAG, "OOM while decoding " + uri, e2);
            return new DecodedImage(null, 1);
        }
    }

    @Nullable
    private RectF getTransformedImageRect() {
        ImageView imageView = this.imageView;
        if (imageView == null || imageView.getDrawable() == null) {
            return null;
        }
        RectF rectF = new RectF(0.0f, 0.0f, this.imageView.getDrawable().getIntrinsicWidth(), this.imageView.getDrawable().getIntrinsicHeight());
        this.imageView.getImageMatrix().mapRect(rectF);
        float f = this.zoomTransX;
        float f2 = rectF.left;
        float f3 = this.currentScale;
        float f4 = this.zoomTransY;
        rectF.set((f2 * f3) + f, (rectF.top * f3) + f4, (rectF.right * f3) + f, (rectF.bottom * f3) + f4);
        return rectF;
    }

    private void initializeView(@NonNull Context context) {
        Log.d(TAG, "Initializing ImageDisplayView");
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.contentContainer = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.contentContainer.setPivotX(0.0f);
        this.contentContainer.setPivotY(0.0f);
        this.contentContainer.addView(this.imageView);
        addView(this.contentContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMedia$0(long j, Bitmap bitmap, DecodedImage decodedImage, Uri uri) {
        ImageView imageView;
        if (j != this.loadToken || (imageView = this.imageView) == null) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        this.lastSampleSize = decodedImage.sampleSize;
        if (bitmap == null) {
            Log.w(TAG, "Downsampled decode failed, falling back to setImageURI: " + uri);
            this.imageView.setImageURI(uri);
        } else {
            imageView.setImageBitmap(bitmap);
        }
        if (this.imageView.getDrawable() == null) {
            Log.w(TAG, "Image loaded but drawable is null");
            return;
        }
        Log.i(TAG, "Image loaded successfully");
        positionAutoCaptureIndicator();
        notifyMediaLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadMedia$1(Context context, final Uri uri, final long j) {
        final DecodedImage decodeSampledImage = decodeSampledImage(context, uri);
        final Bitmap bitmap = decodeSampledImage.bitmap;
        this.mainHandler.post(new Runnable() { // from class: com.amazon.alexa.accessory.frames.media.viewer.ImageDisplayView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ImageDisplayView.this.lambda$loadMedia$0(j, bitmap, decodeSampledImage, uri);
            }
        });
    }

    private void positionAutoCaptureIndicator() {
        Drawable drawable;
        View view = this.autoCaptureIndicator;
        ImageView imageView = this.imageView;
        if (view == null || imageView == null || !this.shouldShowAutoCaptureIndicator || (drawable = imageView.getDrawable()) == null || imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            return;
        }
        RectF rectF = new RectF();
        Matrix imageMatrix = imageView.getImageMatrix();
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        imageMatrix.mapRect(rectF);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.margin_md);
        if (layoutParams != null && (layoutParams.gravity != 8388691 || layoutParams.bottomMargin != dimensionPixelSize || layoutParams.leftMargin != dimensionPixelSize)) {
            layoutParams.gravity = 8388691;
            layoutParams.bottomMargin = dimensionPixelSize;
            layoutParams.leftMargin = dimensionPixelSize;
            view.setLayoutParams(layoutParams);
        }
        view.setTranslationX(rectF.left);
        view.setTranslationY(rectF.bottom - imageView.getHeight());
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView
    public void applyPan(float f, float f2) {
        this.zoomTransX += f;
        this.zoomTransY += f2;
        checkAndApplyBounds();
        applyContentTransform();
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView
    public void applyZoom(float f, float f2, float f3, float f4) {
        if (f2 == 1.0f) {
            this.zoomTransX = 0.0f;
            this.zoomTransY = 0.0f;
        } else {
            float f5 = f2 / f;
            this.zoomTransX = f3 - ((f3 - this.zoomTransX) * f5);
            this.zoomTransY = f4 - ((f4 - this.zoomTransY) * f5);
            checkAndApplyBounds();
        }
        applyContentTransform();
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView
    public void cleanup() {
        Log.d(TAG, "Cleaning up ImageDisplayView");
        this.autoCaptureIndicator = null;
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView
    @NonNull
    public MediaDisplayView.EdgeState getEdgeState() {
        ImageView imageView;
        RectF transformedImageRect = getTransformedImageRect();
        if (transformedImageRect == null || (imageView = this.imageView) == null) {
            return new MediaDisplayView.EdgeState(false, false, false, false);
        }
        float width = imageView.getWidth();
        float height = this.imageView.getHeight();
        return new MediaDisplayView.EdgeState(transformedImageRect.width() <= width || transformedImageRect.left >= -20.0f, transformedImageRect.width() <= width || transformedImageRect.right <= width + 20.0f, transformedImageRect.height() <= height || transformedImageRect.top >= -20.0f, transformedImageRect.height() <= height || transformedImageRect.bottom <= height + 20.0f);
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView
    public float getMaxZoomScale() {
        ImageView imageView = this.imageView;
        if (imageView == null || imageView.getDrawable() == null) {
            return 10.0f;
        }
        return computeMaxZoomScale(this.lastSampleSize, this.imageView.getWidth(), this.imageView.getHeight(), this.imageView.getDrawable().getIntrinsicWidth(), this.imageView.getDrawable().getIntrinsicHeight());
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView
    public void loadMedia(@NonNull Uri uri) {
        String str = TAG;
        Log.d(str, "Loading image from URI: " + uri);
        if (this.imageView == null) {
            Log.e(str, "Cannot load image - imageView is null");
            return;
        }
        long j = this.loadToken + 1;
        this.loadToken = j;
        DECODE_EXECUTOR.execute(new NetworkMetricsEventListenerReporter$$ExternalSyntheticLambda0(this, getContext().getApplicationContext(), uri, j, 1));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        positionAutoCaptureIndicator();
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.lastTouchPoint.set(motionEvent.getX(), motionEvent.getY());
            return onTouchEvent;
        }
        if (action != 2) {
            if (action == 5) {
                return true;
            }
            if (action == 6) {
                if (motionEvent.getPointerCount() == 2) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.lastTouchPoint.set(motionEvent.getX(i), motionEvent.getY(i));
                }
                if (motionEvent.getPointerCount() == 1) {
                    this.isPinching = false;
                    return onTouchEvent;
                }
            }
        } else if (this.isZoomed && !isScaleGestureActive()) {
            return handlePanWhenZoomed(motionEvent);
        }
        return onTouchEvent;
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView
    public void resetZoom() {
        Log.d(TAG, "Resetting zoom to 1x");
        this.currentScale = 1.0f;
        this.isZoomed = false;
        setTranslationY(0.0f);
        setAlpha(1.0f);
        this.isDragging = false;
        this.zoomTransX = 0.0f;
        this.zoomTransY = 0.0f;
        applyContentTransform();
    }

    public void setAutoCaptureIndicator(@Nullable View view, boolean z) {
        this.autoCaptureIndicator = view;
        this.shouldShowAutoCaptureIndicator = z;
        if (view == null || this.contentContainer == null || view.getParent() == this.contentContainer) {
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        this.contentContainer.addView(view, layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : new FrameLayout.LayoutParams(-2, -2));
    }

    @Override // com.amazon.alexa.accessory.frames.media.viewer.MediaDisplayView
    public boolean supportsZoom() {
        return true;
    }
}
