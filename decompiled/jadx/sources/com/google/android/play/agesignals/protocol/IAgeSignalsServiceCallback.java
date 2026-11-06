package com.google.android.play.agesignals.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.playcore_age_signals.zza;
import com.google.android.gms.internal.playcore_age_signals.zzb;
import com.google.android.gms.internal.playcore_age_signals.zzc;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface IAgeSignalsServiceCallback extends IInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends zzb implements IAgeSignalsServiceCallback {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy extends zza implements IAgeSignalsServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
            public void onCompleteCheckAgeSignals(@NonNull Bundle bundle) throws RemoteException {
                Parcel zza = zza();
                zzc.zzc(zza, bundle);
                zzb(1, zza);
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback
            public void onError(@NonNull Bundle bundle) throws RemoteException {
                Parcel zza = zza();
                zzc.zzc(zza, bundle);
                zzb(3, zza);
            }
        }

        public Stub() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        }

        @NonNull
        public static IAgeSignalsServiceCallback asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
            return queryLocalInterface instanceof IAgeSignalsServiceCallback ? (IAgeSignalsServiceCallback) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.playcore_age_signals.zzb
        public boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                onCompleteCheckAgeSignals(bundle);
            } else {
                if (i != 3) {
                    return false;
                }
                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
                zzc.zzb(parcel);
                onError(bundle2);
            }
            return true;
        }
    }

    void onCompleteCheckAgeSignals(@NonNull Bundle bundle) throws RemoteException;

    void onError(@NonNull Bundle bundle) throws RemoteException;
}
