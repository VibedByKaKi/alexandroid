package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzc extends com.google.android.gms.internal.auth.zza implements zze {
    public zzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzd(zzb zzbVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzbVar);
        zza.writeString(str);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zze(zzb zzbVar, Account account) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.auth.zzc.zzd(zza, zzbVar);
        com.google.android.gms.internal.auth.zzc.zzc(zza, account);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzf(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = com.google.android.gms.internal.auth.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(1, zza);
    }
}
