package com.mapbox.common;

import androidx.annotation.NonNull;
import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@MapboxExperimental
/* loaded from: classes8.dex */
public class TileStoreFilter {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TileStoreFilterPeerCleaner implements Runnable {
        private long peer;

        public TileStoreFilterPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            TileStoreFilter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public TileStoreFilter(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @NonNull
    @MapboxExperimental
    public static native TileStoreFilter make();

    private static native void nativeSelfRegister();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new TileStoreFilterPeerCleaner(j));
    }

    @NonNull
    @MapboxExperimental
    public native TileStoreFilter byDomain(@NonNull TileDataDomain tileDataDomain);

    @NonNull
    @MapboxExperimental
    public native TileStoreFilter byStylePack(@NonNull String str);

    @NonNull
    @MapboxExperimental
    public native TileStoreFilter byTileDataset(@NonNull String str);

    @NonNull
    @MapboxExperimental
    public native TileStoreFilter byTileRegion(@NonNull String str);

    @NonNull
    @MapboxExperimental
    public native TileStoreFilter byTileVersion(@NonNull String str);

    @NonNull
    @MapboxExperimental
    public native TileStoreFilter excludeResources();

    @NonNull
    @MapboxExperimental
    public native TileStoreFilter excludeTiles();

    @NonNull
    @MapboxExperimental
    public native TileStoreFilter excludeUnavailable();
}
