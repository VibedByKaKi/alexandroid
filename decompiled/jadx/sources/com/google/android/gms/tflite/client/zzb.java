package com.google.android.gms.tflite.client;

import com.google.android.gms.common.internal.ShowFirstParty;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzb extends TfLiteInitializationOptions {
    private final boolean zza;

    @ShowFirstParty
    private final boolean zzb;

    public /* synthetic */ zzb(boolean z, boolean z2, boolean z3, byte[] bArr) {
        this.zza = z;
        this.zzb = z3;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions
    @ShowFirstParty
    public final boolean enableAutomaticDownload() {
        return this.zzb;
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions
    public final boolean enableGpuDelegateSupport() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TfLiteInitializationOptions) {
            TfLiteInitializationOptions tfLiteInitializationOptions = (TfLiteInitializationOptions) obj;
            if (this.zza == tfLiteInitializationOptions.enableGpuDelegateSupport()) {
                tfLiteInitializationOptions.zza();
                if (this.zzb == tfLiteInitializationOptions.enableAutomaticDownload()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.zza ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ (true != this.zzb ? 1237 : 1231);
    }

    public final String toString() {
        boolean z = this.zza;
        int length = String.valueOf(z).length();
        boolean z2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 111 + String.valueOf(z2).length() + 1);
        sb.append("TfLiteInitializationOptions{enableGpuDelegateSupport=");
        sb.append(z);
        sb.append(", enableTpuDelegateSupport=false, enableAutomaticDownload=");
        sb.append(z2);
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    @Override // com.google.android.gms.tflite.client.TfLiteInitializationOptions
    public final boolean zza() {
        return false;
    }
}
