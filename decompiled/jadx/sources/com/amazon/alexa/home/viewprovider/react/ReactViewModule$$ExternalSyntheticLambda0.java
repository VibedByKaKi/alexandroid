package com.amazon.alexa.home.viewprovider.react;

import android.os.Bundle;
import com.amazon.alexa.home.viewprovider.react.ReactViewModule;
import java.util.Map;
import rx.functions.Action1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class ReactViewModule$$ExternalSyntheticLambda0 implements Action1, ReactViewModule.BundleCallback {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ReactViewModule$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // rx.functions.Action1
    /* renamed from: call */
    public void mo8903call(Object obj) {
        ReactViewModule.lambda$buildAppPropertiesBundle$11((Bundle) this.f$0, (ReactViewModule.BundleCallback) this.f$1, (Map) obj);
    }

    @Override // com.amazon.alexa.home.viewprovider.react.ReactViewModule.BundleCallback
    public void onBundleReady(Bundle bundle) {
        ((ReactViewModule) this.f$0).lambda$getView$1((String) this.f$1, bundle);
    }
}
