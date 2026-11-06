package com.amazon.alexa.ra.android.smartfragment.views;

import android.content.Context;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SandboxView$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SandboxView f$0;

    public /* synthetic */ SandboxView$$ExternalSyntheticLambda0(SandboxView sandboxView, int i) {
        this.$r8$classId = i;
        this.f$0 = sandboxView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit metricsTracker$lambda$0;
        SandboxView ReactSandboxView$lambda$25$lambda$24;
        Unit mapTokenResponder$lambda$2;
        int i = this.$r8$classId;
        SandboxView sandboxView = this.f$0;
        switch (i) {
            case 0:
                metricsTracker$lambda$0 = SandboxView.metricsTracker$lambda$0(sandboxView, (Throwable) obj);
                return metricsTracker$lambda$0;
            case 1:
                ReactSandboxView$lambda$25$lambda$24 = SandboxComposableKt.ReactSandboxView$lambda$25$lambda$24(sandboxView, (Context) obj);
                return ReactSandboxView$lambda$25$lambda$24;
            default:
                mapTokenResponder$lambda$2 = SandboxView.mapTokenResponder$lambda$2(sandboxView, (Map) obj);
                return mapTokenResponder$lambda$2;
        }
    }
}
