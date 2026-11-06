package com.amazon.alexa.ra.ui.screen;

import com.amazon.alexa.ra.chrome.ui.events.ChromeRenderUpdateEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class APLLightBoxScreenKt$APLLightBoxScreen$2$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ APLLightBoxScreenKt$APLLightBoxScreen$2$$ExternalSyntheticLambda0(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit invoke$lambda$2$lambda$1;
        Unit invoke$lambda$3$lambda$2;
        Unit invoke$lambda$9$lambda$8;
        Unit invoke$lambda$8$lambda$7;
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        ChromeRenderUpdateEvent chromeRenderUpdateEvent = (ChromeRenderUpdateEvent) obj;
        switch (i) {
            case 0:
                invoke$lambda$2$lambda$1 = APLLightBoxScreenKt$APLLightBoxScreen$2.invoke$lambda$2$lambda$1(function1, chromeRenderUpdateEvent);
                return invoke$lambda$2$lambda$1;
            case 1:
                invoke$lambda$3$lambda$2 = APLFullScreenFragmentScreenKt$APLFullScreenFragmentScreen$3.invoke$lambda$3$lambda$2(function1, chromeRenderUpdateEvent);
                return invoke$lambda$3$lambda$2;
            case 2:
                invoke$lambda$9$lambda$8 = APLFullScreenFragmentScreenKt$APLFullScreenFragmentScreen$3.invoke$lambda$9$lambda$8(function1, chromeRenderUpdateEvent);
                return invoke$lambda$9$lambda$8;
            default:
                invoke$lambda$8$lambda$7 = APLLightBoxScreenKt$APLLightBoxScreen$2.invoke$lambda$8$lambda$7(function1, chromeRenderUpdateEvent);
                return invoke$lambda$8$lambda$7;
        }
    }
}
