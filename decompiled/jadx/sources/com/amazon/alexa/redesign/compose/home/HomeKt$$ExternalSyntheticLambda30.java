package com.amazon.alexa.redesign.compose.home;

import android.content.Context;
import android.view.View;
import com.amazon.alexa.redesign.view.ReactViewFactory;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class HomeKt$$ExternalSyntheticLambda30 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ReactViewFactory f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeKt$$ExternalSyntheticLambda30(ReactViewFactory reactViewFactory, String str) {
        this.f$0 = reactViewFactory;
        this.f$1 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View ReactNativeEndComponent$lambda$175$lambda$174;
        View ReactNativePremisesSelectionDropDown$lambda$168$lambda$167;
        switch (this.$r8$classId) {
            case 0:
                ReactNativeEndComponent$lambda$175$lambda$174 = HomeKt.ReactNativeEndComponent$lambda$175$lambda$174(this.f$0, this.f$1, (Context) obj);
                return ReactNativeEndComponent$lambda$175$lambda$174;
            default:
                ReactNativePremisesSelectionDropDown$lambda$168$lambda$167 = HomeKt.ReactNativePremisesSelectionDropDown$lambda$168$lambda$167(this.f$1, this.f$0, (Context) obj);
                return ReactNativePremisesSelectionDropDown$lambda$168$lambda$167;
        }
    }

    public /* synthetic */ HomeKt$$ExternalSyntheticLambda30(String str, ReactViewFactory reactViewFactory) {
        this.f$1 = str;
        this.f$0 = reactViewFactory;
    }
}
