package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzd extends com.google.android.gms.internal.tflite.zza implements IInterface {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLoggerCreator");
    }

    public final zzc zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException {
        zzc zzcVar;
        Parcel zza = zza();
        com.google.android.gms.internal.tflite.zzc.zzb(zza, iObjectWrapper);
        com.google.android.gms.internal.tflite.zzc.zza(zza, customerInfo);
        Parcel zzb = zzb(1, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        if (readStrongBinder == null) {
            zzcVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.tflite.dynamite.acceleration.IAccelerationLogger");
            zzcVar = queryLocalInterface instanceof zzc ? (zzc) queryLocalInterface : new zzc(readStrongBinder);
        }
        zzb.recycle();
        return zzcVar;
    }
}
