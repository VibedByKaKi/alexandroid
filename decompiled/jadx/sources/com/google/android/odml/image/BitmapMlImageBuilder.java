package com.google.android.odml.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class BitmapMlImageBuilder {
    private final Bitmap zza;
    private int zzb;
    private Rect zzc;

    public BitmapMlImageBuilder(@NonNull Bitmap bitmap) {
        this.zza = bitmap;
        this.zzb = 0;
        this.zzc = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new zze(this.zza), this.zzb, this.zzc, 0L, this.zza.getWidth(), this.zza.getHeight());
    }

    @NonNull
    public BitmapMlImageBuilder setRotation(int i) {
        MlImage.zzc(i);
        this.zzb = i;
        return this;
    }

    public BitmapMlImageBuilder(@NonNull Context context, @NonNull Uri uri) throws IOException {
        this(MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri));
    }
}
