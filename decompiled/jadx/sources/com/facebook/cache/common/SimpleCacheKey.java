package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class SimpleCacheKey implements CacheKey {
    final boolean mIsResourceIdForDebugging;
    final String mKey;

    public SimpleCacheKey(String str, boolean z) {
        this.mKey = (String) Preconditions.checkNotNull(str);
        this.mIsResourceIdForDebugging = z;
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean containsUri(Uri uri) {
        return this.mKey.contains(uri.toString());
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SimpleCacheKey) {
            return this.mKey.equals(((SimpleCacheKey) obj).mKey);
        }
        return false;
    }

    @Override // com.facebook.cache.common.CacheKey
    public String getUriString() {
        return this.mKey;
    }

    @Override // com.facebook.cache.common.CacheKey
    public int hashCode() {
        return this.mKey.hashCode();
    }

    @Override // com.facebook.cache.common.CacheKey
    public boolean isResourceIdForDebugging() {
        return this.mIsResourceIdForDebugging;
    }

    @Override // com.facebook.cache.common.CacheKey
    public String toString() {
        return this.mKey;
    }

    public SimpleCacheKey(String str) {
        this(str, false);
    }
}
