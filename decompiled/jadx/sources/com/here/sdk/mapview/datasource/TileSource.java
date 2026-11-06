package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import java.util.Date;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface TileSource {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DataVersion {
        public int majorVersion;
        public int minorVersion;

        public DataVersion(int i, int i2) {
            this.majorVersion = i;
            this.minorVersion = i2;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        void onDataVersionChanged(@NonNull DataVersion dataVersion);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ListenerImpl extends NativeBase implements Listener {
        public ListenerImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.TileSource.ListenerImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    ListenerImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.datasource.TileSource.Listener
        public native void onDataVersionChanged(@NonNull DataVersion dataVersion);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LoadTileRequestHandle {
        void cancel();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LoadTileRequestHandleImpl extends NativeBase implements LoadTileRequestHandle {
        public LoadTileRequestHandleImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.datasource.TileSource.LoadTileRequestHandleImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    LoadTileRequestHandleImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.datasource.TileSource.LoadTileRequestHandle
        public native void cancel();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class TileMetadata {

        @NonNull
        public Date dataExpiryTimestamp;

        @NonNull
        public DataVersion dataVersion;

        public TileMetadata(@NonNull DataVersion dataVersion, @NonNull Date date) {
            this.dataVersion = dataVersion;
            this.dataExpiryTimestamp = date;
        }
    }

    void addListener(@NonNull Listener listener);

    @NonNull
    DataVersion getDataVersion(@NonNull TileKey tileKey);

    @NonNull
    List<Integer> getStorageLevels();

    @NonNull
    TilingScheme getTilingScheme();

    void removeListener(@NonNull Listener listener);
}
