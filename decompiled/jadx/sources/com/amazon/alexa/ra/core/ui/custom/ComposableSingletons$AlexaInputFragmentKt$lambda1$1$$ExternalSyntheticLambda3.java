package com.amazon.alexa.ra.core.ui.custom;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* renamed from: com.amazon.alexa.ra.core.ui.custom.ComposableSingletons$AlexaInputFragmentKt$lambda-1$1$$ExternalSyntheticLambda3, reason: invalid class name */
/* loaded from: classes18.dex */
public final /* synthetic */ class ComposableSingletons$AlexaInputFragmentKt$lambda1$1$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$AlexaInputFragmentKt$lambda1$1$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit invoke$lambda$10$lambda$9;
        Unit invoke$lambda$7$lambda$6;
        Unit invoke$lambda$7$lambda$62;
        int i = this.$r8$classId;
        String str = (String) obj;
        long longValue = ((Long) obj2).longValue();
        String str2 = (String) obj3;
        switch (i) {
            case 0:
                invoke$lambda$10$lambda$9 = ComposableSingletons$AlexaInputFragmentKt$lambda1$1.invoke$lambda$10$lambda$9(str, longValue, str2);
                return invoke$lambda$10$lambda$9;
            case 1:
                invoke$lambda$7$lambda$6 = ComposableSingletons$AlexaInputFragmentKt$lambda3$1.invoke$lambda$7$lambda$6(str, longValue, str2);
                return invoke$lambda$7$lambda$6;
            default:
                invoke$lambda$7$lambda$62 = ComposableSingletons$AlexaInputFragmentKt$lambda4$1.invoke$lambda$7$lambda$6(str, longValue, str2);
                return invoke$lambda$7$lambda$62;
        }
    }
}
