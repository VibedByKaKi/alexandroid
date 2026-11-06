package com.dee.app.cachemanager;

import com.google.common.base.Optional;
import rx.functions.Action1;
import rx.functions.Func1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DefaultObjectCache$$ExternalSyntheticLambda1 implements Action1, Func1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultObjectCache f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ CacheMetadata f$2;

    public /* synthetic */ DefaultObjectCache$$ExternalSyntheticLambda1(DefaultObjectCache defaultObjectCache, String str, CacheMetadata cacheMetadata, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultObjectCache;
        this.f$1 = str;
        this.f$2 = cacheMetadata;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$put$6(this.f$1, this.f$2, (Throwable) obj);
                break;
            default:
                this.f$0.lambda$remove$8(this.f$1, this.f$2, (Throwable) obj);
                break;
        }
    }

    @Override // rx.functions.Func1
    public Object call(Object obj) {
        Optional lambda$get$4;
        lambda$get$4 = this.f$0.lambda$get$4(this.f$1, this.f$2, (Optional) obj);
        return lambda$get$4;
    }
}
