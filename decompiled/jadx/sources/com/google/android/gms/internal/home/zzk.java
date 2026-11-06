package com.google.android.gms.internal.home;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.home.matter.discovery.ResolveServiceResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zzk extends zzb implements zzl {
    public zzk() {
        super("com.google.android.gms.home.internal.IResolveServiceCallback");
    }

    @Override // com.google.android.gms.internal.home.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ResolveServiceResult resolveServiceResult = (ResolveServiceResult) zzc.zza(parcel, ResolveServiceResult.CREATOR);
            zzc.zzb(parcel);
            zzc(resolveServiceResult);
        } else {
            if (i != 2) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            zzc.zzb(parcel);
            zzb(status);
        }
        return true;
    }
}
