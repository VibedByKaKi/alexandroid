package com.google.android.gms.tflite.client;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tflite.dynamite.NativeInitializationHandle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public interface TfLiteClient extends OptionalModuleApi {

    @NonNull
    @KeepForSdk
    public static final TfLiteInitializationOptions DEFAULT_TFLITE_INITIALIZATION_OPTIONS = TfLiteInitializationOptions.builder().build();

    @NonNull
    @KeepForSdk
    Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle();

    @NonNull
    @KeepForSdk
    Task<NativeInitializationHandle> getTfLiteNativeInitializationHandle(@NonNull TfLiteInitializationOptions tfLiteInitializationOptions);
}
