package com.google.android.gms.internal.home;

import android.accounts.Account;
import android.content.IntentSender;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.home.matter.commissioning.CommissioningRequest;
import com.google.android.gms.home.matter.commissioning.ShareDeviceRequest;
import com.google.android.gms.home.matter.discovery.ResolveServiceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.home.internal.IChipService");
    }

    public final IntentSender zzd(CommissioningRequest commissioningRequest) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, commissioningRequest);
        Parcel zzb = zzb(2, zza);
        IntentSender intentSender = (IntentSender) zzc.zza(zzb, IntentSender.CREATOR);
        zzb.recycle();
        return intentSender;
    }

    public final IntentSender zze(Account account) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, account);
        Parcel zzb = zzb(6, zza);
        IntentSender intentSender = (IntentSender) zzc.zza(zzb, IntentSender.CREATOR);
        zzb.recycle();
        return intentSender;
    }

    public final IntentSender zzf(ShareDeviceRequest shareDeviceRequest) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, shareDeviceRequest);
        Parcel zzb = zzb(3, zza);
        IntentSender intentSender = (IntentSender) zzc.zza(zzb, IntentSender.CREATOR);
        zzb.recycle();
        return intentSender;
    }

    public final void zzg(ResolveServiceRequest resolveServiceRequest, zzl zzlVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, resolveServiceRequest);
        zzc.zze(zza, zzlVar);
        zzc(5, zza);
    }

    public final void zzh(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, z);
        zzc(9, zza);
    }
}
