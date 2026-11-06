package com.amazon.alexa.ra.core.ui.screen;

import androidx.navigation.NavHostController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class OverFlowMenuUiKt$$ExternalSyntheticLambda19 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NavHostController f$0;

    public /* synthetic */ OverFlowMenuUiKt$$ExternalSyntheticLambda19(NavHostController navHostController, int i) {
        this.$r8$classId = i;
        this.f$0 = navHostController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit OverflowMenuScreenDialog$lambda$5$lambda$4;
        Unit OverflowDropdownMenuDialog$lambda$12$lambda$11;
        int i = this.$r8$classId;
        NavHostController navHostController = this.f$0;
        switch (i) {
            case 0:
                OverflowMenuScreenDialog$lambda$5$lambda$4 = OverFlowMenuUiKt.OverflowMenuScreenDialog$lambda$5$lambda$4(navHostController);
                return OverflowMenuScreenDialog$lambda$5$lambda$4;
            default:
                OverflowDropdownMenuDialog$lambda$12$lambda$11 = OverFlowDropDownMenuUiKt.OverflowDropdownMenuDialog$lambda$12$lambda$11(navHostController);
                return OverflowDropdownMenuDialog$lambda$12$lambda$11;
        }
    }
}
