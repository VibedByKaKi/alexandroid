package com.dee.app.data;

import com.amazon.alexa.app.notification.messaging.MessagingSettings;
import com.dee.app.cachemanager.AppDataCacheEntry;
import com.google.common.base.Optional;
import rx.functions.Action1;
import rx.functions.Func1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DefaultElementLocalStorage$$ExternalSyntheticLambda0 implements Action1, Func1 {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ DefaultElementLocalStorage$$ExternalSyntheticLambda0(Object obj, boolean z) {
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override // rx.functions.Func1
    public Object call(Object obj) {
        AppDataCacheEntry lambda$get$0;
        lambda$get$0 = ((DefaultElementLocalStorage) this.f$0).lambda$get$0(this.f$1, (Optional) obj);
        return lambda$get$0;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        ((MessagingSettings) this.f$0).lambda$setAndroidOSNotificationsEnabled$2(this.f$1, (Void) obj);
    }
}
