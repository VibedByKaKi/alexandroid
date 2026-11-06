package com.google.android.gms.tflite.client;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class TfLiteInitializationOptions {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Builder {
        @NonNull
        public abstract TfLiteInitializationOptions build();

        @NonNull
        @ShowFirstParty
        @KeepForSdk
        public abstract Builder setEnableAutomaticDownload(boolean z);

        @NonNull
        public abstract Builder setEnableGpuDelegateSupport(boolean z);

        @NonNull
        public abstract Builder zza(boolean z);
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public static Builder builder(@NonNull TfLiteInitializationOptions tfLiteInitializationOptions) {
        Builder builder = builder();
        builder.setEnableGpuDelegateSupport(tfLiteInitializationOptions.enableGpuDelegateSupport());
        tfLiteInitializationOptions.zza();
        builder.zza(false);
        builder.setEnableAutomaticDownload(tfLiteInitializationOptions.enableAutomaticDownload());
        return builder;
    }

    @ShowFirstParty
    @KeepForSdk
    public abstract boolean enableAutomaticDownload();

    public abstract boolean enableGpuDelegateSupport();

    public abstract boolean zza();

    @NonNull
    public static Builder builder() {
        zza zzaVar = new zza();
        zzaVar.setEnableGpuDelegateSupport(false);
        zzaVar.zza(false);
        zzaVar.setEnableAutomaticDownload(false);
        return zzaVar;
    }
}
