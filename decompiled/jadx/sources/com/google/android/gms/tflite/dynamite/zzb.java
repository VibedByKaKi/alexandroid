package com.google.android.gms.tflite.dynamite;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zzb extends com.google.android.gms.internal.tflite.zzb implements zzc {
    public static zzc zza(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tflite.dynamite.ITfLiteDynamiteLoader");
        return queryLocalInterface instanceof zzc ? (zzc) queryLocalInterface : new zza(iBinder);
    }
}
