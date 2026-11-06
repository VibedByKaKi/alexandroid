package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
interface AssetsLoader {
    boolean checkAssetAvailability(@NonNull String str);

    @NonNull
    String getAssetsPath();

    @NonNull
    List<String> getSubfolderNames(@NonNull String str);

    @NonNull
    String loadAsset(@NonNull String str);

    @NonNull
    byte[] loadAssetBlob(@NonNull String str);
}
