package com.amazon.apl.android.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.providers.ITelemetryProvider;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PooledBitmapFactory implements IBitmapFactory {
    static final String METRIC_BITMAP_FAIL = "PooledBitmapFactory.bitmap.fail";
    static final String METRIC_BITMAP_SUCCESS = "PooledBitmapFactory.bitmap.success";
    private static final String TAG = "PooledBitmapFactory";
    private final int cBitmapMetricFail;
    private final int cBitmapMetricSuccess;
    private final ITelemetryProvider mTelemetryProvider;
    private final IBitmapPool pool;

    public PooledBitmapFactory(ITelemetryProvider iTelemetryProvider, IBitmapPool iBitmapPool) {
        this.mTelemetryProvider = iTelemetryProvider;
        this.pool = iBitmapPool;
        ITelemetryProvider.Type type = ITelemetryProvider.Type.COUNTER;
        this.cBitmapMetricSuccess = iTelemetryProvider.createMetricId("APL-Android", METRIC_BITMAP_SUCCESS, type);
        this.cBitmapMetricFail = iTelemetryProvider.createMetricId("APL-Android", METRIC_BITMAP_FAIL, type);
    }

    private void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap.getWidth() != bitmap2.getWidth() || bitmap.getHeight() != bitmap2.getHeight() || bitmap.getConfig() != bitmap2.getConfig()) {
            Single$$ExternalSyntheticBUOutline0.m$3("both bitmaps must have same resolution and config");
            return;
        }
        Canvas canvas = new Canvas(bitmap2);
        canvas.drawBitmap(bitmap, new Matrix(), null);
        canvas.setBitmap(null);
    }

    public static PooledBitmapFactory create(ITelemetryProvider iTelemetryProvider, IBitmapPool iBitmapPool) {
        return new PooledBitmapFactory(iTelemetryProvider, iBitmapPool);
    }

    private static String createErrorMessage(int i, int i2) {
        return String.format("Unable to create bitmap (%d, %d).", Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public synchronized Bitmap copy(@NonNull Bitmap bitmap, boolean z) throws BitmapCreationException {
        if (!z) {
            return bitmap.copy(bitmap.getConfig(), false);
        }
        try {
            Bitmap bitmap2 = this.pool.get(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            copyBitmap(bitmap, bitmap2);
            this.mTelemetryProvider.incrementCount(this.cBitmapMetricSuccess);
            return bitmap2;
        } catch (NullPointerException | OutOfMemoryError e) {
            this.mTelemetryProvider.incrementCount(this.cBitmapMetricFail);
            throw new BitmapCreationException(createErrorMessage(bitmap.getWidth(), bitmap.getHeight()), e);
        }
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public synchronized Bitmap createBitmap(@NonNull Bitmap bitmap, int i, int i2, int i3, int i4, @Nullable Matrix matrix, boolean z) throws BitmapCreationException {
        Bitmap bitmap2;
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, i, i2, i3, i4, matrix, z);
            bitmap2 = this.pool.get(createBitmap.getWidth(), createBitmap.getHeight(), createBitmap.getConfig());
            copyBitmap(createBitmap, bitmap2);
            this.pool.put(createBitmap);
            this.mTelemetryProvider.incrementCount(this.cBitmapMetricSuccess);
        } catch (OutOfMemoryError e) {
            this.mTelemetryProvider.incrementCount(this.cBitmapMetricFail);
            throw new BitmapCreationException(createErrorMessage(i3, i4), e);
        }
        return bitmap2;
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public synchronized Bitmap createScaledBitmap(@NonNull Bitmap bitmap, int i, int i2, boolean z) throws BitmapCreationException {
        Bitmap bitmap2;
        try {
            bitmap2 = this.pool.get(i, i2, Bitmap.Config.ARGB_8888);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
            copyBitmap(createScaledBitmap, bitmap2);
            this.pool.put(createScaledBitmap);
            this.mTelemetryProvider.incrementCount(this.cBitmapMetricSuccess);
        } catch (OutOfMemoryError e) {
            this.mTelemetryProvider.incrementCount(this.cBitmapMetricFail);
            throw new BitmapCreationException(createErrorMessage(i, i2), e);
        }
        return bitmap2;
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public synchronized void disposeBitmap(@NonNull Bitmap bitmap) {
        this.pool.put(bitmap);
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public synchronized Bitmap createBitmap(Bitmap bitmap) throws BitmapCreationException {
        Bitmap bitmap2;
        try {
            bitmap2 = this.pool.get(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            copyBitmap(bitmap, bitmap2);
            this.mTelemetryProvider.incrementCount(this.cBitmapMetricSuccess);
        } catch (OutOfMemoryError e) {
            this.mTelemetryProvider.incrementCount(this.cBitmapMetricFail);
            throw new BitmapCreationException(createErrorMessage(bitmap.getWidth(), bitmap.getHeight()), e);
        }
        return bitmap2;
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public synchronized Bitmap createBitmap(int i, int i2) throws BitmapCreationException {
        Bitmap bitmap;
        try {
            bitmap = this.pool.get(i, i2, Bitmap.Config.ARGB_8888);
            try {
                this.mTelemetryProvider.incrementCount(this.cBitmapMetricSuccess);
            } catch (Exception unused) {
                Log.e(TAG, "Failed to increment metric success count for Bitmap creation");
            }
        } catch (OutOfMemoryError e) {
            this.mTelemetryProvider.incrementCount(this.cBitmapMetricFail);
            throw new BitmapCreationException(createErrorMessage(i, i2), e);
        }
        return bitmap;
    }
}
