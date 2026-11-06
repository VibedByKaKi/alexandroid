package com.google.android.gms.tflite.dynamite.acceleration;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public interface AccelerationServiceLogger {
    @KeepForSdk
    void logApplyValidatedConfig(int i, @NonNull ApplyValidatedConfigStatus applyValidatedConfigStatus);

    @KeepForSdk
    void logGenerateBestConfigCounter();

    @KeepForSdk
    void logSelectBestConfigCounter();

    @KeepForSdk
    void logValidateConfigCounter();

    @KeepForSdk
    void logValidationResult(@NonNull byte[] bArr, @NonNull ValidationSettings validationSettings);
}
