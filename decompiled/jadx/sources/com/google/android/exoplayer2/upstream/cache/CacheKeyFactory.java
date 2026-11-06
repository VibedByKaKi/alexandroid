package com.google.android.exoplayer2.upstream.cache;

import com.facebook.hermes.intl.Intl$$ExternalSyntheticBUOutline0;
import com.google.android.exoplayer2.upstream.DataSpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new Intl$$ExternalSyntheticBUOutline0(28);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }

    String buildCacheKey(DataSpec dataSpec);
}
