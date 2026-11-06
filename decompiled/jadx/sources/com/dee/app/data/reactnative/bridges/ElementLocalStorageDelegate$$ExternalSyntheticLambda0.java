package com.dee.app.data.reactnative.bridges;

import com.dee.app.cachemanager.AppDataCacheEntry;
import com.facebook.react.bridge.Promise;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ElementLocalStorageDelegate$$ExternalSyntheticLambda0 implements Action1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Promise f$1;

    public /* synthetic */ ElementLocalStorageDelegate$$ExternalSyntheticLambda0(String str, int i, Promise promise) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = promise;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public final void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ElementLocalStorageDelegate.lambda$get$0(this.f$0, this.f$1, (AppDataCacheEntry) obj);
                break;
            default:
                ElementLocalStorageDelegate.lambda$put$1(this.f$0, this.f$1, (AppDataCacheEntry) obj);
                break;
        }
    }
}
