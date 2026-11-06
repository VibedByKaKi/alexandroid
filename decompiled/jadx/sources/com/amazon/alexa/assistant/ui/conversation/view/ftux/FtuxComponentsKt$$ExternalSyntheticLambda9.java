package com.amazon.alexa.assistant.ui.conversation.view.ftux;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class FtuxComponentsKt$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ FtuxComponentsKt$$ExternalSyntheticLambda9(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit FtuxScreenContainer$lambda$19$lambda$18;
        Unit CoBrandedLogoLockup$lambda$5$lambda$1$lambda$0;
        int i = this.$r8$classId;
        String str = this.f$0;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                FtuxScreenContainer$lambda$19$lambda$18 = FtuxComponentsKt.FtuxScreenContainer$lambda$19$lambda$18(str, semanticsPropertyReceiver);
                return FtuxScreenContainer$lambda$19$lambda$18;
            default:
                CoBrandedLogoLockup$lambda$5$lambda$1$lambda$0 = CoBrandedLogoLockupKt.CoBrandedLogoLockup$lambda$5$lambda$1$lambda$0(str, semanticsPropertyReceiver);
                return CoBrandedLogoLockup$lambda$5$lambda$1$lambda$0;
        }
    }
}
