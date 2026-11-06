package androidx.media3.datasource.cache;

import androidx.fragment.app.Fragment$$ExternalSyntheticBUOutline0;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new Fragment$$ExternalSyntheticBUOutline0(17);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
        String str = dataSpec.key;
        return str != null ? str : dataSpec.uri.toString();
    }

    String buildCacheKey(DataSpec dataSpec);
}
