package com.amazon.alexa.home.viewprovider.react;

import android.os.Bundle;
import com.amazon.alexa.home.viewprovider.react.ReactViewModule;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class ReactViewModule$$ExternalSyntheticLambda2 implements ReactViewModule.BundleCallback, ReactViewModule.PerformanceEventRunnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactViewModule f$0;

    public /* synthetic */ ReactViewModule$$ExternalSyntheticLambda2(ReactViewModule reactViewModule, int i) {
        this.$r8$classId = i;
        this.f$0 = reactViewModule;
    }

    @Override // com.amazon.alexa.home.viewprovider.react.ReactViewModule.BundleCallback
    public void onBundleReady(Bundle bundle) {
        int i = this.$r8$classId;
        ReactViewModule reactViewModule = this.f$0;
        switch (i) {
            case 1:
                reactViewModule.lambda$refreshView$9(bundle);
                break;
            default:
                reactViewModule.lambda$refreshView$10(bundle);
                break;
        }
    }

    @Override // com.amazon.alexa.home.viewprovider.react.ReactViewModule.PerformanceEventRunnable
    public void run(JSONObject jSONObject) {
        this.f$0.lambda$new$0(jSONObject);
    }
}
