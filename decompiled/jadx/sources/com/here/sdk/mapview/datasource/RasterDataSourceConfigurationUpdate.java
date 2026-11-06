package com.here.sdk.mapview.datasource;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class RasterDataSourceConfigurationUpdate {

    @Nullable
    public Long cacheDiskSize;

    @Nullable
    public Boolean ignoreExpiredData;

    @Nullable
    public Map<String, String> providerHeaders;

    public RasterDataSourceConfigurationUpdate(@Nullable Map<String, String> map, @Nullable Boolean bool, @Nullable Long l) {
        this.providerHeaders = map;
        this.ignoreExpiredData = bool;
        this.cacheDiskSize = l;
    }
}
