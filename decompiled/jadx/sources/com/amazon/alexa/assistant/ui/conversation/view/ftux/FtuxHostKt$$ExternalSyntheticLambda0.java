package com.amazon.alexa.assistant.ui.conversation.view.ftux;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class FtuxHostKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FtuxHostKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        Unit unit2;
        float bringIntoViewAboveBottomFade$lambda$13;
        Unit unit3;
        MutableState rememberPermissionRequestState$lambda$1$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                unit = Unit.INSTANCE;
                return unit;
            case 1:
                unit2 = Unit.INSTANCE;
                return unit2;
            case 2:
                bringIntoViewAboveBottomFade$lambda$13 = FtuxComponentsKt.bringIntoViewAboveBottomFade$lambda$13();
                return Float.valueOf(bringIntoViewAboveBottomFade$lambda$13);
            case 3:
                unit3 = Unit.INSTANCE;
                return unit3;
            default:
                rememberPermissionRequestState$lambda$1$lambda$0 = PermissionRequestStateKt.rememberPermissionRequestState$lambda$1$lambda$0();
                return rememberPermissionRequestState$lambda$1$lambda$0;
        }
    }
}
