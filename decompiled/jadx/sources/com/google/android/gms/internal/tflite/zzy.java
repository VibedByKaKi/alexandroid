package com.google.android.gms.internal.tflite;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzy {
    private String zza = null;

    public final zzy zza(String str) {
        Locale locale = Locale.ROOT;
        this.zza = "TFLiteClient-%d";
        return this;
    }

    public final ThreadFactory zzb() {
        String str = this.zza;
        return new zzx(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, null, null, null);
    }
}
