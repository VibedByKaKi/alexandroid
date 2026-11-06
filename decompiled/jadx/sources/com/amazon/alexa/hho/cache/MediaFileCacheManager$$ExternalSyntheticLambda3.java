package com.amazon.alexa.hho.cache;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MediaFileCacheManager$$ExternalSyntheticLambda3 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaFileCacheManager f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ MediaFileCacheManager$$ExternalSyntheticLambda3(MediaFileCacheManager mediaFileCacheManager, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaFileCacheManager;
        this.f$1 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String lambda$get$6;
        Boolean lambda$isSpaceReserved$2;
        switch (this.$r8$classId) {
            case 0:
                lambda$get$6 = this.f$0.lambda$get$6(this.f$1);
                return lambda$get$6;
            default:
                lambda$isSpaceReserved$2 = this.f$0.lambda$isSpaceReserved$2(this.f$1);
                return lambda$isSpaceReserved$2;
        }
    }
}
