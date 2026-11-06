package com.amazon.alexa.ra.core.ui.fragments.list;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* renamed from: com.amazon.alexa.ra.core.ui.fragments.list.ComposableSingletons$AlexaRequestFragmentKt$lambda-1$1$$ExternalSyntheticLambda6, reason: invalid class name */
/* loaded from: classes18.dex */
public final /* synthetic */ class ComposableSingletons$AlexaRequestFragmentKt$lambda1$1$$ExternalSyntheticLambda6 implements Function4 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ComposableSingletons$AlexaRequestFragmentKt$lambda1$1$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Unit invoke$lambda$18$lambda$13$lambda$12;
        Unit invoke$lambda$18$lambda$13$lambda$122;
        Unit invoke$lambda$18$lambda$13$lambda$123;
        Uri uri = (Uri) obj;
        String str = (String) obj2;
        Integer num = (Integer) obj3;
        switch (this.$r8$classId) {
            case 0:
                invoke$lambda$18$lambda$13$lambda$12 = ComposableSingletons$AlexaRequestFragmentKt$lambda1$1.invoke$lambda$18$lambda$13$lambda$12(uri, str, num.intValue(), ((Integer) obj4).intValue());
                return invoke$lambda$18$lambda$13$lambda$12;
            case 1:
                invoke$lambda$18$lambda$13$lambda$122 = ComposableSingletons$AlexaRequestFragmentKt$lambda2$1.invoke$lambda$18$lambda$13$lambda$12(uri, str, num.intValue(), ((Integer) obj4).intValue());
                return invoke$lambda$18$lambda$13$lambda$122;
            default:
                invoke$lambda$18$lambda$13$lambda$123 = ComposableSingletons$AlexaRequestFragmentKt$lambda3$1.invoke$lambda$18$lambda$13$lambda$12(uri, str, num.intValue(), ((Integer) obj4).intValue());
                return invoke$lambda$18$lambda$13$lambda$123;
        }
    }
}
