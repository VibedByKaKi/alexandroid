package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_common.zzp;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class Triangle<T> {
    private final zzp zza;

    @KeepForSdk
    public Triangle(@NonNull T t, @NonNull T t2, @NonNull T t3) {
        this.zza = zzp.zzj(t, t2, t3);
    }

    @NonNull
    public List<T> getAllPoints() {
        return this.zza;
    }
}
