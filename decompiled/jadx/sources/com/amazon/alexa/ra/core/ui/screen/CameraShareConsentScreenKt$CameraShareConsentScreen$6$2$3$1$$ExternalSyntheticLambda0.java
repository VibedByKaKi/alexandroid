package com.amazon.alexa.ra.core.ui.screen;

import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CameraShareConsentScreenKt$CameraShareConsentScreen$6$2$3$1$$ExternalSyntheticLambda0 implements LinkInteractionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ CameraShareConsentScreenKt$CameraShareConsentScreen$6$2$3$1$$ExternalSyntheticLambda0(Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(LinkAnnotation linkAnnotation) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                CameraShareConsentScreenKt$CameraShareConsentScreen$6$2$3$1.invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(function1, linkAnnotation);
                break;
            default:
                ScreenShareConsentScreenKt$ScreenShareConsentScreen$6$2$3$1.invoke$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(function1, linkAnnotation);
                break;
        }
    }
}
