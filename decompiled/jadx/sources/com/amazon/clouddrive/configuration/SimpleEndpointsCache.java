package com.amazon.clouddrive.configuration;

import android.os.SystemClock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SimpleEndpointsCache implements EndpointsCache {
    private static long CACHE_EXPIRY_MS = 86400000;
    private Endpoints mEndpoints;
    private long mUptimeMillisWhenCached;

    @Override // com.amazon.clouddrive.configuration.EndpointsCache
    public boolean cacheHasExpired() {
        return this.mEndpoints == null || this.mUptimeMillisWhenCached + CACHE_EXPIRY_MS <= SystemClock.uptimeMillis();
    }

    @Override // com.amazon.clouddrive.configuration.EndpointsCache
    public void clear() {
        this.mEndpoints = null;
        this.mUptimeMillisWhenCached = 0L;
    }

    @Override // com.amazon.clouddrive.configuration.EndpointsCache
    public Endpoints getEndpoints() {
        if (cacheHasExpired()) {
            clear();
        }
        return this.mEndpoints;
    }

    @Override // com.amazon.clouddrive.configuration.EndpointsCache
    public void setEndpoints(Endpoints endpoints) {
        this.mUptimeMillisWhenCached = SystemClock.uptimeMillis();
        this.mEndpoints = endpoints;
    }
}
