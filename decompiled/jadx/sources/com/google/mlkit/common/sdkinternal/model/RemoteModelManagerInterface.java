package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.model.DownloadConditions;
import com.google.mlkit.common.model.RemoteModel;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes8.dex */
public interface RemoteModelManagerInterface<RemoteT extends RemoteModel> {
    @NonNull
    @KeepForSdk
    Task<Void> deleteDownloadedModel(@NonNull RemoteT remotet);

    @NonNull
    @KeepForSdk
    Task<Void> download(@NonNull RemoteT remotet, @NonNull DownloadConditions downloadConditions);

    @NonNull
    @KeepForSdk
    Task<Set<RemoteT>> getDownloadedModels();

    @NonNull
    @KeepForSdk
    Task<Boolean> isModelDownloaded(@NonNull RemoteT remotet);
}
