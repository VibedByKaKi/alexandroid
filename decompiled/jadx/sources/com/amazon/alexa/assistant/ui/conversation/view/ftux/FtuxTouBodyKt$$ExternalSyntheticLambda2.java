package com.amazon.alexa.assistant.ui.conversation.view.ftux;

import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class FtuxTouBodyKt$$ExternalSyntheticLambda2 implements LinkInteractionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ FtuxTouBodyKt$$ExternalSyntheticLambda2(int i, String str, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = str;
    }

    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(LinkAnnotation linkAnnotation) {
        switch (this.$r8$classId) {
            case 0:
                FtuxTouBodyKt.FtuxTouBody$lambda$18$lambda$17$lambda$16$lambda$10$lambda$8$lambda$7(this.f$0, this.f$1, linkAnnotation);
                break;
            default:
                FtuxTouBodyKt.buildTermsAcceptance$lambda$32$lambda$31$lambda$29(this.f$0, this.f$1, linkAnnotation);
                break;
        }
    }
}
