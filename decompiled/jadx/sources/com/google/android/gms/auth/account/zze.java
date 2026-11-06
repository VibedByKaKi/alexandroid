package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface zze extends IInterface {
    void zzd(zzb zzbVar, String str) throws RemoteException;

    void zze(zzb zzbVar, Account account) throws RemoteException;

    void zzf(boolean z) throws RemoteException;
}
