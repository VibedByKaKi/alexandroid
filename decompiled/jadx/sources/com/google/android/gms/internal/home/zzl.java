package com.google.android.gms.internal.home;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.home.matter.discovery.ResolveServiceResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface zzl extends IInterface {
    void zzb(Status status) throws RemoteException;

    void zzc(ResolveServiceResult resolveServiceResult) throws RemoteException;
}
