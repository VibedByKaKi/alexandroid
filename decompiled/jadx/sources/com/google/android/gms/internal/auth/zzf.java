package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface zzf extends IInterface {
    Bundle zzd(String str, Bundle bundle) throws RemoteException;

    @Nullable
    Bundle zze(Account account, String str, Bundle bundle) throws RemoteException;

    @Nullable
    Bundle zzf(Account account) throws RemoteException;

    Bundle zzg(String str) throws RemoteException;

    AccountChangeEventsResponse zzh(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;
}
