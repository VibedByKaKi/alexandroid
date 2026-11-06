package com.google.mlkit.common.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.ModelType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class CustomRemoteModel extends RemoteModel {
    private final RemoteModelSource zzb;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {

        @NonNull
        private final RemoteModelSource zza;

        public Builder(@NonNull RemoteModelSource remoteModelSource) {
            Preconditions.checkNotNull(remoteModelSource);
            this.zza = remoteModelSource;
        }

        @NonNull
        public CustomRemoteModel build() {
            return new CustomRemoteModel(this.zza, null);
        }
    }

    public /* synthetic */ CustomRemoteModel(RemoteModelSource remoteModelSource, zza zzaVar) {
        super(TextUtils.isEmpty(remoteModelSource.zza()) ? "no_model_name" : remoteModelSource.zza(), null, ModelType.CUSTOM);
        this.zzb = remoteModelSource;
    }

    @NonNull
    @KeepForSdk
    public RemoteModelSource getRemoteModelSource() {
        return this.zzb;
    }
}
