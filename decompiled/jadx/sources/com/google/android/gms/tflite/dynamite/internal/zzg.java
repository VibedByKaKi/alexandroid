package com.google.android.gms.tflite.dynamite.internal;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final /* synthetic */ class zzg implements SuccessContinuation {
    private final /* synthetic */ zzh zza;
    private final /* synthetic */ TfLiteInitializationOptions zzb;

    public /* synthetic */ zzg(zzh zzhVar, TfLiteInitializationOptions tfLiteInitializationOptions) {
        this.zza = zzhVar;
        this.zzb = tfLiteInitializationOptions;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final /* synthetic */ Task then(Object obj) {
        return this.zza.zzb(this.zzb, (Void) obj);
    }
}
