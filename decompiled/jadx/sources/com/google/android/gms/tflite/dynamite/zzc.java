package com.google.android.gms.tflite.dynamite;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface zzc extends IInterface {
    long zzd(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException;

    IObjectWrapper zze(IObjectWrapper iObjectWrapper, CustomerInfo customerInfo) throws RemoteException;

    IObjectWrapper zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.tflite.dynamite.internal.zzb zzbVar) throws RemoteException;
}
