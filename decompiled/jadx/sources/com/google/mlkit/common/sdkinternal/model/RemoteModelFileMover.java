package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes8.dex */
public interface RemoteModelFileMover {
    @NonNull
    @KeepForSdk
    File getModelFileDestination() throws MlKitException;

    @Nullable
    @KeepForSdk
    File moveAllFilesFromPrivateTempToPrivateDestination(@NonNull File file) throws MlKitException;
}
