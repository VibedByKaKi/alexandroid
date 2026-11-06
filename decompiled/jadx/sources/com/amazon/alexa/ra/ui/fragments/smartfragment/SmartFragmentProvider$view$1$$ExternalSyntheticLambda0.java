package com.amazon.alexa.ra.ui.fragments.smartfragment;

import com.amazon.alexa.ra.android.smartfragment.messaging.SmartFragmentRenderState;
import com.amazon.alexa.ra.chrome.ui.events.ChromeRenderUpdateEvent;
import com.amazon.alexa.ra.core.data.fragments.FragmentData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class SmartFragmentProvider$view$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SmartFragmentProvider$view$1$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Render$lambda$2$lambda$1;
        Unit invoke$lambda$4$lambda$3;
        Unit invoke$lambda$10$lambda$9;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Render$lambda$2$lambda$1 = SmartFragmentProvider$view$1.Render$lambda$2$lambda$1((FragmentData) obj2, (SmartFragmentRenderState) obj);
                return Render$lambda$2$lambda$1;
            case 1:
                invoke$lambda$4$lambda$3 = SmartFragmentLightBoxScreenKt$SmartFragmentLightBoxScreen$3.invoke$lambda$4$lambda$3((Function1) obj2, (ChromeRenderUpdateEvent) obj);
                return invoke$lambda$4$lambda$3;
            default:
                invoke$lambda$10$lambda$9 = SmartFragmentLightBoxScreenKt$SmartFragmentLightBoxScreen$3.invoke$lambda$10$lambda$9((Function1) obj2, (ChromeRenderUpdateEvent) obj);
                return invoke$lambda$10$lambda$9;
        }
    }
}
