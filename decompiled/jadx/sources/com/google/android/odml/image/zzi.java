package com.google.android.odml.image;

import android.media.Image;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(19)
/* loaded from: classes7.dex */
final class zzi implements zzg {
    private final Image zza;
    private final ImageProperties zzb;

    public zzi(Image image) {
        this.zza = image;
        zzb zzbVar = new zzb();
        zzbVar.zzb(3);
        int format = image.getFormat();
        zzbVar.zza(format == 42 ? 1 : format == 41 ? 2 : format != 35 ? format != 256 ? 0 : 9 : 7);
        this.zzb = zzbVar.zzc();
    }

    public final Image zza() {
        return this.zza;
    }

    @Override // com.google.android.odml.image.zzg
    public final ImageProperties zzb() {
        return this.zzb;
    }

    @Override // com.google.android.odml.image.zzg
    public final void zzc() {
        this.zza.close();
    }
}
