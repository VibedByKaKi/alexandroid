package com.mapbox.common;

import androidx.annotation.NonNull;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Geometry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface TileStoreObserver {
    void onRegionGeometryChanged(@NonNull String str, @NonNull Geometry geometry);

    void onRegionLoadFinished(@NonNull String str, @NonNull Expected<TileRegionError, TileRegion> expected);

    void onRegionLoadProgress(@NonNull String str, @NonNull TileRegionLoadProgress tileRegionLoadProgress);

    void onRegionMetadataChanged(@NonNull String str, @NonNull Value value);

    void onRegionRemoved(@NonNull String str);
}
