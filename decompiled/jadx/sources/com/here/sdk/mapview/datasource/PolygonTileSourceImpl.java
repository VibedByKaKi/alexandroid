package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.mapview.datasource.PolygonTileSource;
import com.here.sdk.mapview.datasource.TileSource;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class PolygonTileSourceImpl extends NativeBase implements PolygonTileSource {
    public PolygonTileSourceImpl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.PolygonTileSourceImpl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                PolygonTileSourceImpl.disposeNativeHandle(j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    @Override // com.here.sdk.mapview.datasource.TileSource
    public native void addListener(@NonNull TileSource.Listener listener);

    @Override // com.here.sdk.mapview.datasource.TileSource
    @NonNull
    public native TileSource.DataVersion getDataVersion(@NonNull TileKey tileKey);

    @Override // com.here.sdk.mapview.datasource.TileSource
    @NonNull
    public native List<Integer> getStorageLevels();

    @Override // com.here.sdk.mapview.datasource.TileSource
    @NonNull
    public native TilingScheme getTilingScheme();

    @Override // com.here.sdk.mapview.datasource.PolygonTileSource
    @Nullable
    public native TileSource.LoadTileRequestHandle loadTile(@NonNull TileKey tileKey, @NonNull PolygonTileSource.LoadResultHandler loadResultHandler);

    @Override // com.here.sdk.mapview.datasource.TileSource
    public native void removeListener(@NonNull TileSource.Listener listener);
}
