package com.google.android.gms.internal.home;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.home.matter.commissioning.CommissioningRequestMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class zzh extends zzb implements zzi {
    public zzh() {
        super("com.google.android.gms.home.internal.ICommissioningService");
    }

    @Override // com.google.android.gms.internal.home.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzj zzjVar;
        if (i == 1) {
            CommissioningRequestMetadata commissioningRequestMetadata = (CommissioningRequestMetadata) zzc.zza(parcel, CommissioningRequestMetadata.CREATOR);
            zzc.zzb(parcel);
            zzb(commissioningRequestMetadata);
        } else {
            if (i != 2) {
                return false;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzjVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.home.internal.ICommissioningServiceCallback");
                zzjVar = queryLocalInterface instanceof zzj ? (zzj) queryLocalInterface : new zzj(readStrongBinder);
            }
            zzc.zzb(parcel);
            zzc(zzjVar);
        }
        return true;
    }
}
