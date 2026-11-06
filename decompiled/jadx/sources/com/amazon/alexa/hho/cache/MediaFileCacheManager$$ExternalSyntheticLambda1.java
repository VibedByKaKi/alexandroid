package com.amazon.alexa.hho.cache;

import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class MediaFileCacheManager$$ExternalSyntheticLambda1 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaFileCacheManager f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ MediaFileCacheManager$$ExternalSyntheticLambda1(MediaFileCacheManager mediaFileCacheManager, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaFileCacheManager;
        this.f$1 = str;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$freeReservedSpace$1(this.f$1);
                break;
            default:
                this.f$0.lambda$delete$5(this.f$1);
                break;
        }
    }
}
