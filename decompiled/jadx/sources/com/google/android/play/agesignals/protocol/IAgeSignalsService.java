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
import com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface IAgeSignalsService extends IInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Stub extends zzb implements IAgeSignalsService {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class Proxy extends zza implements IAgeSignalsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsService");
            }

            @Override // com.google.android.play.agesignals.protocol.IAgeSignalsService
            public void checkAgeRange(@NonNull String str, @NonNull Bundle bundle, @NonNull IAgeSignalsServiceCallback iAgeSignalsServiceCallback) throws RemoteException {
                Parcel zza = zza();
                zza.writeString(str);
                zzc.zzc(zza, bundle);
                if (iAgeSignalsServiceCallback == null) {
                    zza.writeStrongBinder(null);
                } else {
                    zza.writeStrongBinder(iAgeSignalsServiceCallback.asBinder());
                }
                zzb(1, zza);
            }
        }

        public Stub() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsService");
        }

        @NonNull
        public static IAgeSignalsService asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            return queryLocalInterface instanceof IAgeSignalsService ? (IAgeSignalsService) queryLocalInterface : new Proxy(iBinder);
        }

        @Override // com.google.android.gms.internal.playcore_age_signals.zzb
        public boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            IAgeSignalsServiceCallback asInterface = IAgeSignalsServiceCallback.Stub.asInterface(parcel.readStrongBinder());
            zzc.zzb(parcel);
            checkAgeRange(readString, bundle, asInterface);
            return true;
        }
    }

    void checkAgeRange(@NonNull String str, @NonNull Bundle bundle, @NonNull IAgeSignalsServiceCallback iAgeSignalsServiceCallback) throws RemoteException;
}
