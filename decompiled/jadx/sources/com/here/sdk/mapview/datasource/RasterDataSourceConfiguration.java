package com.here.sdk.mapview.datasource;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.dee.app.elements.bridges.LeapfrogSceneAssetsDownloader;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RasterDataSourceConfiguration {

    @NonNull
    public Cache cache;
    public boolean ignoreExpiredData;

    @NonNull
    public String name;

    @NonNull
    public Provider provider;

    public RasterDataSourceConfiguration(@NonNull String str, @NonNull Provider provider, @NonNull Cache cache) {
        this.name = str;
        this.provider = provider;
        this.cache = cache;
        this.ignoreExpiredData = false;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Cache {
        public long diskSize;

        @NonNull
        public String path;

        public Cache(@NonNull String str) {
            this.path = str;
            this.diskSize = LeapfrogSceneAssetsDownloader.MAX_ARTIFACT_BYTES;
        }

        public Cache(@NonNull String str, long j) {
            this.path = str;
            this.diskSize = j;
        }
    }

    public RasterDataSourceConfiguration(@NonNull String str, @NonNull Provider provider, @NonNull Cache cache, boolean z) {
        this.name = str;
        this.provider = provider;
        this.cache = cache;
        this.ignoreExpiredData = z;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Provider {
        public boolean hasAlphaChannel;

        @Nullable
        public Map<String, String> headers;

        @NonNull
        public List<Integer> storageLevels;

        @NonNull
        public TilingScheme tilingScheme;

        @NonNull
        public TileUrlProviderCallback urlProvider;

        public Provider(@NonNull TileUrlProviderCallback tileUrlProviderCallback, @NonNull TilingScheme tilingScheme, @NonNull List<Integer> list) {
            this.urlProvider = tileUrlProviderCallback;
            this.tilingScheme = tilingScheme;
            this.storageLevels = list;
            this.hasAlphaChannel = false;
            this.headers = null;
        }

        public Provider(@NonNull TileUrlProviderCallback tileUrlProviderCallback, @NonNull TilingScheme tilingScheme, @NonNull List<Integer> list, boolean z, @Nullable Map<String, String> map) {
            this.urlProvider = tileUrlProviderCallback;
            this.tilingScheme = tilingScheme;
            this.storageLevels = list;
            this.hasAlphaChannel = z;
            this.headers = map;
        }
    }
}
