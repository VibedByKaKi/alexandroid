package com.google.android.gms.internal.home;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.home.matter.commissioning.CommissioningCompleteMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzj extends zza implements IInterface {
    public zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.home.internal.ICommissioningServiceCallback");
    }

    public final int zzd(CommissioningCompleteMetadata commissioningCompleteMetadata) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, commissioningCompleteMetadata);
        Parcel zzb = zzb(2, zza);
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    public final int zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        Parcel zzb = zzb(3, zza);
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }
}
