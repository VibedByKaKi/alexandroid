package com.google.mlkit.vision.common;

import android.media.Image;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class zzb {
    private final Image zza;

    public zzb(Image image) {
        this.zza = image;
    }

    public final Image zza() {
        return this.zza;
    }

    public final Image.Plane[] zzb() {
        return this.zza.getPlanes();
    }
}
