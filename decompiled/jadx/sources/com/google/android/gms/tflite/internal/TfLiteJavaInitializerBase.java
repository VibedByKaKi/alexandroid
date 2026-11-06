package com.google.android.gms.tflite.internal;

import android.content.Context;
import com.google.android.gms.internal.tflite_java.zzg;
import com.google.android.gms.internal.tflite_java.zzn;
import com.google.android.gms.tflite.dynamite.TfLiteDynamite;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class TfLiteJavaInitializerBase extends zzg {
    public TfLiteJavaInitializerBase(Context context) {
        super(context, TfLiteDynamite.createDefaultExecutor(), zzn.CUSTOMER_3P_JAVA_API);
    }

    @Override // com.google.android.gms.internal.tflite_java.zzg
    public native void initializeNative(Object obj);
}
