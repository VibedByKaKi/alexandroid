package com.amazon.alexa.pmi.implementation.taplatency;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.amazon.alexa.pmi.implementation.taplatency.TapLatencyCloserHooks;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class TapLatencyCloserHooks$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ TapLatencyCloserHooks$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit hookWindow$lambda$4$lambda$3$lambda$2;
        Unit registerSystemBackObserver$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                hookWindow$lambda$4$lambda$3$lambda$2 = TapLatencyCloserHooks.hookWindow$lambda$4$lambda$3$lambda$2((TapLatencyCloserHooks) this.f$0, (TapLatencyCloserHooks.Installed) this.f$1);
                return hookWindow$lambda$4$lambda$3$lambda$2;
            default:
                registerSystemBackObserver$lambda$0 = TapLatencyCloserHooksKt.registerSystemBackObserver$lambda$0((OnBackInvokedDispatcher) this.f$0, (OnBackInvokedCallback) this.f$1);
                return registerSystemBackObserver$lambda$0;
        }
    }
}
