package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(19)
/* loaded from: classes7.dex */
public class MediaImageExtractor {
    private MediaImageExtractor() {
    }

    @NonNull
    public static Image extract(@NonNull MlImage mlImage) {
        zzg zza = mlImage.zza();
        if (zza.zzb().getStorageType() == 3) {
            return ((zzi) zza).zza();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
        return null;
    }
}
