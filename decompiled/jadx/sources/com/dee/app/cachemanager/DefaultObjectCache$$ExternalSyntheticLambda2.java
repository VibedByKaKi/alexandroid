package com.dee.app.cachemanager;

import com.dee.app.function.BiCallback;
import com.dee.app.function.Callback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class DefaultObjectCache$$ExternalSyntheticLambda2 implements BiCallback, Callback {
    public final /* synthetic */ DefaultObjectCache f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ DefaultObjectCache$$ExternalSyntheticLambda2(DefaultObjectCache defaultObjectCache, String str) {
        this.f$0 = defaultObjectCache;
        this.f$1 = str;
    }

    @Override // com.dee.app.function.Callback
    public void accept(Object obj) {
        this.f$0.lambda$clear$13(this.f$1, (byte[]) obj);
    }

    @Override // com.dee.app.function.BiCallback
    public void accept(Object obj, Object obj2) {
        this.f$0.lambda$clear$11(this.f$1, (String) obj, obj2);
    }
}
