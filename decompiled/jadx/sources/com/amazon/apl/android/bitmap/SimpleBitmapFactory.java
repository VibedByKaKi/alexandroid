package com.amazon.apl.android.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SimpleBitmapFactory implements IBitmapFactory {
    static final Bitmap.Config CONFIG = Bitmap.Config.ARGB_8888;

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public Bitmap copy(@NonNull Bitmap bitmap, boolean z) throws BitmapCreationException {
        return bitmap.copy(CONFIG, z);
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public Bitmap createBitmap(int i, int i2) throws BitmapCreationException {
        return Bitmap.createBitmap(i, i2, CONFIG);
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public Bitmap createScaledBitmap(@NonNull Bitmap bitmap, int i, int i2, boolean z) throws BitmapCreationException {
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public void disposeBitmap(@NonNull Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public Bitmap createBitmap(Bitmap bitmap) throws BitmapCreationException {
        return Bitmap.createBitmap(bitmap);
    }

    @Override // com.amazon.apl.android.bitmap.IBitmapFactory
    public Bitmap createBitmap(@NonNull Bitmap bitmap, int i, int i2, int i3, int i4, @Nullable Matrix matrix, boolean z) throws BitmapCreationException {
        return Bitmap.createBitmap(bitmap, i, i2, i3, i4, matrix, z);
    }
}
