package com.amazon.mobile.heremapsexplore.Utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import com.amazon.mobile.heremapsexplore.Constants.Constants;
import com.amazon.mobile.heremapsexplore.Factories.GraphicsFactory;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ImageUtils {
    private static ImageUtils instance;
    private WeakReference<Context> context;
    private GraphicsFactory mGraphicsFactory = GraphicsFactory.getInstance();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.mobile.heremapsexplore.Utilities.ImageUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$mobile$heremapsexplore$Utilities$ImageUtils$ImageLayoutPosition;

        static {
            int[] iArr = new int[ImageLayoutPosition.values().length];
            $SwitchMap$com$amazon$mobile$heremapsexplore$Utilities$ImageUtils$ImageLayoutPosition = iArr;
            try {
                iArr[ImageLayoutPosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ImageLayoutPosition {
        CENTER,
        BOTTOM_CENTER
    }

    private ImageUtils() {
    }

    public static ImageUtils getInstance() {
        synchronized (ImageUtils.class) {
            try {
                if (instance == null) {
                    instance = new ImageUtils();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return instance;
    }

    public Bitmap combineImage(Bitmap bitmap, Bitmap bitmap2, ImageLayoutPosition imageLayoutPosition) {
        if (AnonymousClass1.$SwitchMap$com$amazon$mobile$heremapsexplore$Utilities$ImageUtils$ImageLayoutPosition[imageLayoutPosition.ordinal()] != 1) {
            return null;
        }
        return combineImageWithForegroundOriginInPx(bitmap, bitmap2, (int) (((bitmap2.getWidth() - bitmap.getWidth()) / 2.0f) + 0.5f), (int) (((bitmap2.getHeight() - bitmap.getHeight()) / 2.0f) + 0.5f));
    }

    public Bitmap combineImageWithForegroundOriginInPx(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        int max = Math.max(bitmap2.getWidth(), bitmap.getWidth() + i) - Math.min(0, i);
        int max2 = Math.max(bitmap2.getHeight(), bitmap.getHeight() + i2) - Math.min(0, i2);
        int i3 = i < 0 ? 0 : i;
        int i4 = i2 < 0 ? 0 : i2;
        int i5 = i > 0 ? 0 : -i;
        int i6 = i2 <= 0 ? -i2 : 0;
        Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
        Canvas createCanvas = this.mGraphicsFactory.createCanvas(createBitmap);
        createCanvas.drawBitmap(bitmap2, i5, i6, (Paint) null);
        createCanvas.drawBitmap(bitmap, i3, i4, (Paint) null);
        return createBitmap;
    }

    public Bitmap cropImage(Bitmap bitmap, int i, int i2, int i3, int i4) {
        int dpToPx = (int) (UIUtils.dpToPx(getContext(), i) + 0.5f);
        Bitmap createBitmap = Bitmap.createBitmap(Math.min(bitmap.getWidth(), (bitmap.getWidth() - dpToPx) - ((int) (UIUtils.dpToPx(getContext(), i2) + 0.5f))), Math.min(bitmap.getHeight(), (bitmap.getHeight() - ((int) (UIUtils.dpToPx(getContext(), i3) + 0.5f))) - ((int) (UIUtils.dpToPx(getContext(), i4) + 0.5f))), Bitmap.Config.ARGB_8888);
        this.mGraphicsFactory.createCanvas(createBitmap).drawBitmap(bitmap, -dpToPx, -r6, (Paint) null);
        return createBitmap;
    }

    public Bitmap drawCircles(List<Map<String, Integer>> list) {
        int i = 0;
        for (Map<String, Integer> map : list) {
            if (map.containsKey("radius")) {
                i = Math.max(i, map.get("radius").intValue());
            }
        }
        int dpToPx = ((int) (UIUtils.dpToPx(getContext(), i) + 0.5f)) * 2;
        Bitmap createBitmap = Bitmap.createBitmap(dpToPx, dpToPx, Bitmap.Config.ARGB_8888);
        Canvas createCanvas = this.mGraphicsFactory.createCanvas(createBitmap);
        Paint createPaint = this.mGraphicsFactory.createPaint();
        for (Map<String, Integer> map2 : list) {
            if (map2.containsKey("color")) {
                createPaint.setColor(map2.get("color").intValue());
            }
            if (map2.containsKey("radius")) {
                float f = dpToPx / 2.0f;
                createCanvas.drawCircle(f, f, (int) (UIUtils.dpToPx(getContext(), map2.get("radius").intValue()) + 0.5f), createPaint);
            }
        }
        return createBitmap;
    }

    public Bitmap dropShadow(Bitmap bitmap, int i, int i2, int i3, int i4) throws IllegalStateException {
        if (getContext() == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Context is not set for ImageUtils class");
            return null;
        }
        int dpToPx = (int) (UIUtils.dpToPx(getContext(), i) + 0.5f);
        int dpToPx2 = (int) (UIUtils.dpToPx(getContext(), i2) + 0.5f);
        float f = i3;
        int i5 = (int) (0.5f + f);
        int i6 = dpToPx + i5;
        int i7 = i5 + dpToPx2;
        int width = (i6 * 2) + bitmap.getWidth();
        int height = (i7 * 2) + bitmap.getHeight();
        Matrix createMatrix = this.mGraphicsFactory.createMatrix();
        createMatrix.setTranslate(i6, i7);
        Matrix createMatrix2 = this.mGraphicsFactory.createMatrix(createMatrix);
        createMatrix2.postTranslate(dpToPx, dpToPx2);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
        Canvas createCanvas = this.mGraphicsFactory.createCanvas(createBitmap);
        Paint createPaint = this.mGraphicsFactory.createPaint(1);
        createCanvas.drawBitmap(bitmap, createMatrix2, createPaint);
        BlurMaskFilter createBlurMaskFilter = this.mGraphicsFactory.createBlurMaskFilter(f, BlurMaskFilter.Blur.NORMAL);
        createPaint.reset();
        createPaint.setAntiAlias(true);
        createPaint.setColor(i4);
        createPaint.setMaskFilter(createBlurMaskFilter);
        createPaint.setFilterBitmap(true);
        Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas createCanvas2 = this.mGraphicsFactory.createCanvas(createBitmap2);
        createCanvas2.drawBitmap(createBitmap, 0.0f, 0.0f, createPaint);
        createCanvas2.drawBitmap(bitmap, createMatrix, null);
        createBitmap.recycle();
        return createBitmap2;
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.context;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public Bitmap imageFromText(String str, Font font, int i, int i2) throws IllegalStateException {
        if (getContext() == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("Context is not set for ImageUtils class");
            return null;
        }
        Rect createRect = this.mGraphicsFactory.createRect();
        Paint createPaint = this.mGraphicsFactory.createPaint();
        createPaint.setColor(i2);
        createPaint.setTextAlign(Paint.Align.LEFT);
        createPaint.setTextSize((int) (UIUtils.dpToPx(getContext(), i) + 0.5f));
        try {
            createPaint.setTypeface(FontResolver.getFont(getContext(), font));
        } catch (Exception e) {
            createPaint.setFakeBoldText(true);
            Log.w(Constants.LOG_TAG, e.toString());
        }
        createPaint.getTextBounds(str, 0, str.length(), createRect);
        Bitmap createBitmap = Bitmap.createBitmap(createRect.width(), createRect.height(), Bitmap.Config.ARGB_8888);
        this.mGraphicsFactory.createCanvas(createBitmap).drawText(str, -createRect.left, createRect.height() - createRect.bottom, createPaint);
        return createBitmap;
    }

    public Bitmap loadImage(int i) {
        return BitmapFactory.decodeResource(getContext().getResources(), i);
    }

    public Bitmap loadImageWithTintColor(int i, int i2) {
        return tintImage(loadImage(i), i2);
    }

    public void setContext(Context context) {
        this.context = new WeakReference<>(context);
    }

    public Bitmap tintImage(Bitmap bitmap, int i) {
        Paint createPaint = this.mGraphicsFactory.createPaint();
        createPaint.setColorFilter(this.mGraphicsFactory.createPorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        this.mGraphicsFactory.createCanvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, createPaint);
        return createBitmap;
    }

    public Bitmap combineImage(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        return combineImageWithForegroundOriginInPx(bitmap, bitmap2, (int) (UIUtils.dpToPx(getContext(), i) + 0.5f), (int) (UIUtils.dpToPx(getContext(), i2) + 0.5f));
    }
}
