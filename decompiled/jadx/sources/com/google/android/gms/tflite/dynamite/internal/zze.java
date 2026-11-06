package com.google.android.gms.tflite.dynamite.internal;

import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final /* synthetic */ class zze implements OnFailureListener {
    private final /* synthetic */ Feature[] zza;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final /* synthetic */ void onFailure(Exception exc) {
        String arrays = Arrays.toString(this.zza);
        Locale locale = Locale.US;
        Log.w("TfLiteGMS", "Module installation for features " + arrays + " failed", exc);
    }
}
