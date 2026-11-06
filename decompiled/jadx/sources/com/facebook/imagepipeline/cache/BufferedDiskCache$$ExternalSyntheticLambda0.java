package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class BufferedDiskCache$$ExternalSyntheticLambda0 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ BufferedDiskCache f$1;
    public final /* synthetic */ CacheKey f$2;

    public /* synthetic */ BufferedDiskCache$$ExternalSyntheticLambda0(Object obj, BufferedDiskCache bufferedDiskCache, CacheKey cacheKey, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = bufferedDiskCache;
        this.f$2 = cacheKey;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean containsAsync$lambda$0;
        Void remove$lambda$7;
        Void probe$lambda$3;
        switch (this.$r8$classId) {
            case 0:
                containsAsync$lambda$0 = BufferedDiskCache.containsAsync$lambda$0(this.f$0, this.f$1, this.f$2);
                return containsAsync$lambda$0;
            case 1:
                remove$lambda$7 = BufferedDiskCache.remove$lambda$7(this.f$0, this.f$1, this.f$2);
                return remove$lambda$7;
            default:
                probe$lambda$3 = BufferedDiskCache.probe$lambda$3(this.f$0, this.f$1, this.f$2);
                return probe$lambda$3;
        }
    }
}
