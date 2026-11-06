package com.google.android.gms.tflite.client;

import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zza extends TfLiteInitializationOptions.Builder {
    private boolean zza;
    private boolean zzb;
    private byte zzc;

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions build() {
        if (this.zzc == 7) {
            return new zzb(this.zza, false, this.zzb, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" enableGpuDelegateSupport");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" enableTpuDelegateSupport");
        }
        if ((this.zzc & 4) == 0) {
            sb.append(" enableAutomaticDownload");
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions.Builder setEnableAutomaticDownload(boolean z) {
        this.zzb = z;
        this.zzc = (byte) (this.zzc | 4);
        return this;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions.Builder setEnableGpuDelegateSupport(boolean z) {
        this.zza = z;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions.Builder
    public final TfLiteInitializationOptions.Builder zza(boolean z) {
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }
}
