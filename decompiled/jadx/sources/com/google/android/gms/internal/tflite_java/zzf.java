package com.google.android.gms.internal.tflite_java;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzf {
    private final Task zza;
    private final TfLiteInitializationOptions zzb;

    public /* synthetic */ zzf(Task task, TfLiteInitializationOptions tfLiteInitializationOptions, byte[] bArr) {
        this.zza = task;
        this.zzb = tfLiteInitializationOptions;
    }

    public final Task zza(TfLiteInitializationOptions tfLiteInitializationOptions) {
        if (!tfLiteInitializationOptions.enableGpuDelegateSupport() || this.zzb.enableGpuDelegateSupport()) {
            return this.zza;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("TFLite has already been initialized without GPU delegate support");
        return null;
    }
}
