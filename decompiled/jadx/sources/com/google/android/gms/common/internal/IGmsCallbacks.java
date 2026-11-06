package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int i, @NonNull IBinder iBinder, @NonNull Bundle bundle) throws RemoteException;

    void zzb(int i, @NonNull Bundle bundle) throws RemoteException;

    void zzc(int i, IBinder iBinder, zzj zzjVar) throws RemoteException;
}
