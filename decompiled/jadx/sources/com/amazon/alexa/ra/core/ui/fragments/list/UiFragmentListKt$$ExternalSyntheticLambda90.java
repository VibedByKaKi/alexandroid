package com.amazon.alexa.ra.core.ui.fragments.list;

import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UiFragmentListKt$$ExternalSyntheticLambda90 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Placeable f$0;

    public /* synthetic */ UiFragmentListKt$$ExternalSyntheticLambda90(Placeable placeable, int i) {
        this.$r8$classId = i;
        this.f$0 = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit measureIntrinsicSize$lambda$289$lambda$288;
        Unit bleedHorizontalPadding_3ABfNKs$lambda$78$lambda$76;
        int i = this.$r8$classId;
        Placeable placeable = this.f$0;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                measureIntrinsicSize$lambda$289$lambda$288 = UiFragmentListKt.measureIntrinsicSize$lambda$289$lambda$288(placeable, placementScope);
                return measureIntrinsicSize$lambda$289$lambda$288;
            default:
                bleedHorizontalPadding_3ABfNKs$lambda$78$lambda$76 = AlexaResponseFragmentKt.bleedHorizontalPadding_3ABfNKs$lambda$78$lambda$76(placeable, placementScope);
                return bleedHorizontalPadding_3ABfNKs$lambda$78$lambda$76;
        }
    }
}
