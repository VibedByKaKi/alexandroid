package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzc extends com.google.android.gms.internal.tflite.zza implements IInterface {
    public zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLogger");
    }

    public final void zzd(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzc(1, zza);
    }

    public final void zze(byte[] bArr, ValidationSettings validationSettings) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        com.google.android.gms.internal.tflite.zzc.zza(zza, validationSettings);
        zzc(2, zza);
    }

    public final void zzf(int i, ApplyValidatedConfigStatus applyValidatedConfigStatus) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        com.google.android.gms.internal.tflite.zzc.zza(zza, applyValidatedConfigStatus);
        zzc(3, zza);
    }
}
