package com.google.android.odml.image;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class ByteBufferExtractor {
    private ByteBufferExtractor() {
    }

    @NonNull
    public static ByteBuffer extract(@NonNull MlImage mlImage) {
        zzg zza = mlImage.zza();
        if (zza.zzb().getStorageType() == 2) {
            return ((zzf) zza).zza().asReadOnlyBuffer();
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
        return null;
    }
}
