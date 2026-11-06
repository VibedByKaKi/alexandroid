package com.google.android.gms.tflite.dynamite;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes7.dex */
public class NativeInitializationHandle {
    private final Object zza;

    public NativeInitializationHandle(@NonNull Object obj) {
        this.zza = obj;
    }

    @NonNull
    @KeepForSdk
    public Object getInternal() {
        return this.zza;
    }
}
