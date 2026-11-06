package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zza implements AccelerationServiceLogger {
    private final zzc zza;

    @VisibleForTesting
    public zza(zzc zzcVar) {
        this.zza = zzcVar;
    }

    private final void zza(String str) {
        try {
            this.zza.zzd(str);
        } catch (RemoteException e) {
            Log.w("AccelerationLogger", "Failed to log counter: ".concat(str), e);
        }
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logApplyValidatedConfig(int i, ApplyValidatedConfigStatus applyValidatedConfigStatus) {
        try {
            this.zza.zzf(i, applyValidatedConfigStatus);
        } catch (RemoteException e) {
            Log.w("AccelerationLogger", String.format("Failed to log apply validated config outcome: delegate (%d), status: (%s)", Integer.valueOf(i), applyValidatedConfigStatus), e);
        }
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logGenerateBestConfigCounter() {
        zza("AccelerationServiceGenerateBestConfigCounter");
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logSelectBestConfigCounter() {
        zza("AccelerationServiceSelectBestConfigCounter");
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logValidateConfigCounter() {
        zza("AccelerationServiceValidateConfigCounter");
    }

    @Override // com.google.android.gms.tflite.dynamite.acceleration.AccelerationServiceLogger
    public final void logValidationResult(byte[] bArr, ValidationSettings validationSettings) {
        try {
            this.zza.zze(bArr, validationSettings);
        } catch (RemoteException e) {
            Log.w("AccelerationLogger", "Failed to log validation result; validation settings: ".concat(String.valueOf(validationSettings)), e);
        }
    }
}
