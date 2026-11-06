package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzej extends zzel {
    public static zzet zza(Object obj) {
        return new zzem(obj);
    }

    public static void zzb(zzet zzetVar, zzeh zzehVar, Executor executor) {
        zzetVar.zzl(new zzei(zzetVar, zzehVar), executor);
    }

    public static zzet zzc(zzxh zzxhVar, Executor executor) {
        zzew zzewVar = new zzew(zzxhVar);
        zzewVar.run();
        return zzewVar;
    }
}
