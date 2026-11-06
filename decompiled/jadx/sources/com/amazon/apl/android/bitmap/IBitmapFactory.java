package com.amazon.apl.android.bitmap;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IBitmapFactory {
    Bitmap copy(@NonNull Bitmap bitmap, boolean z) throws BitmapCreationException;

    Bitmap createBitmap(int i, int i2) throws BitmapCreationException;

    Bitmap createBitmap(Bitmap bitmap) throws BitmapCreationException;

    Bitmap createBitmap(@NonNull Bitmap bitmap, int i, int i2, int i3, int i4, @Nullable Matrix matrix, boolean z) throws BitmapCreationException;

    Bitmap createScaledBitmap(@NonNull Bitmap bitmap, int i, int i2, boolean z) throws BitmapCreationException;

    void disposeBitmap(@NonNull Bitmap bitmap);
}
