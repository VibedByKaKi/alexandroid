package com.google.android.odml.image;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class BitmapExtractor {
    private BitmapExtractor() {
    }

    @NonNull
    public static Bitmap extract(@NonNull MlImage mlImage) {
        zzg zza = mlImage.zza();
        if (zza.zzb().getStorageType() == 1) {
            return ((zze) zza).zza();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
        return null;
    }
}
