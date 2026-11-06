package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;
import com.here.sdk.mapview.datasource.TileSource;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface LineTileSource extends TileSource {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LoadResultHandler {
        void failed(@NonNull TileKey tileKey);

        void loaded(@NonNull TileKey tileKey, @NonNull List<LineData> list, @NonNull TileSource.TileMetadata tileMetadata);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LoadResultHandlerImpl extends NativeBase implements LoadResultHandler {
        public LoadResultHandlerImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.LineTileSource.LoadResultHandlerImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    LoadResultHandlerImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.datasource.LineTileSource.LoadResultHandler
        public native void failed(@NonNull TileKey tileKey);

        @Override // com.here.sdk.mapview.datasource.LineTileSource.LoadResultHandler
        public native void loaded(@NonNull TileKey tileKey, @NonNull List<LineData> list, @NonNull TileSource.TileMetadata tileMetadata);
    }

    @Nullable
    TileSource.LoadTileRequestHandle loadTile(@NonNull TileKey tileKey, @NonNull LoadResultHandler loadResultHandler);
}
