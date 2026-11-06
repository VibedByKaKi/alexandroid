package com.google.android.odml.image;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(19)
/* loaded from: classes7.dex */
public class MediaMlImageBuilder {
    private final Image zza;
    private int zzb = 0;
    private Rect zzc;

    public MediaMlImageBuilder(@NonNull Image image) {
        this.zza = image;
        this.zzc = new Rect(0, 0, image.getWidth(), image.getHeight());
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new zzi(this.zza), this.zzb, this.zzc, 0L, this.zza.getWidth(), this.zza.getHeight());
    }

    @NonNull
    public MediaMlImageBuilder setRotation(int i) {
        MlImage.zzc(i);
        this.zzb = i;
        return this;
    }
}
