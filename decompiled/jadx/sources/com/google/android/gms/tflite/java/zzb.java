package com.google.android.gms.tflite.java;

import android.content.Context;
import com.google.android.gms.tflite.internal.TfLiteNativeInitializer;
import org.tensorflow.lite.TensorFlowLite;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzb extends TfLiteNativeInitializer {
    public zzb(Context context) {
        super(context);
    }

    @Override // com.google.android.gms.internal.tflite_java.zzg
    public final void zzc() {
        TensorFlowLite.init();
    }
}
