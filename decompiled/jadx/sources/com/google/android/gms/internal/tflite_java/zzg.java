package com.google.android.gms.internal.tflite_java;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tflite.client.TfLiteClient;
import com.google.android.gms.tflite.client.TfLiteInitializationOptions;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;
import com.google.android.gms.tflite.dynamite.TfLiteDynamite;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ShowFirstParty
/* loaded from: classes7.dex */
public abstract class zzg {
    private static final Map zzd = Collections.synchronizedMap(new EnumMap(zzn.class));
    private final Executor zza;
    private final zzn zzb;
    private final TfLiteClient zzc;

    public zzg(Context context, Executor executor, zzn zznVar) {
        TfLiteClient client = TfLiteDynamite.getClient(context, zznVar.zza(), executor);
        this.zza = executor;
        this.zzb = zznVar;
        this.zzc = client;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ Task zzf(NativeInitializationHandle nativeInitializationHandle) throws Exception {
        try {
            zzc();
            initializeNative(nativeInitializationHandle.getInternal());
            return Tasks.forResult(null);
        } catch (UnsatisfiedLinkError e) {
            return Tasks.forException(new Exception("Native initialization method not found", e));
        }
    }

    public abstract void initializeNative(Object obj);

    @ShowFirstParty
    public Task zzb(TfLiteInitializationOptions tfLiteInitializationOptions) {
        Map map = zzd;
        synchronized (map) {
            try {
                zzn zznVar = this.zzb;
                zzf zzfVar = (zzf) map.get(zznVar);
                if (zzfVar != null) {
                    return zzfVar.zza(tfLiteInitializationOptions);
                }
                Task<TContinuationResult> onSuccessTask = this.zzc.getTfLiteNativeInitializationHandle(tfLiteInitializationOptions).onSuccessTask(this.zza, new SuccessContinuation() { // from class: com.google.android.gms.internal.tflite_java.zzd
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final /* synthetic */ Task then(Object obj) {
                        return zzg.this.zzf((NativeInitializationHandle) obj);
                    }
                });
                map.put(zznVar, new zzf(onSuccessTask, tfLiteInitializationOptions, null));
                onSuccessTask.addOnFailureListener(zzm.zza(), new OnFailureListener() { // from class: com.google.android.gms.internal.tflite_java.zze
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final /* synthetic */ void onFailure(Exception exc) {
                        zzg.this.zze(exc);
                    }
                });
                return onSuccessTask;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final TfLiteClient zzd() {
        return this.zzc;
    }

    public final /* synthetic */ void zze(Exception exc) {
        zzd.remove(this.zzb);
    }

    public void zzc() throws UnsatisfiedLinkError {
    }
}
