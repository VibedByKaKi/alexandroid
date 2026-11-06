package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ShimmerEffectKt$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State f$0;

    public /* synthetic */ ShimmerEffectKt$$ExternalSyntheticLambda4(State state, int i) {
        this.$r8$classId = i;
        this.f$0 = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit skeletonPlaceholder_XO_JAsU$lambda$49;
        Unit invoke$lambda$96$lambda$89$lambda$88$lambda$65$lambda$64$lambda$59$lambda$58;
        Unit invokeSuspend$lambda$0;
        Unit thumbnailClickable$lambda$4$lambda$3;
        Unit PasteAwareTextField$lambda$5$lambda$4$lambda$3$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                skeletonPlaceholder_XO_JAsU$lambda$49 = ShimmerEffectKt.skeletonPlaceholder_XO_JAsU$lambda$49(this.f$0, (GraphicsLayerScope) obj);
                return skeletonPlaceholder_XO_JAsU$lambda$49;
            case 1:
                invoke$lambda$96$lambda$89$lambda$88$lambda$65$lambda$64$lambda$59$lambda$58 = ConversationScreenKt$ConversationScreen$23.invoke$lambda$96$lambda$89$lambda$88$lambda$65$lambda$64$lambda$59$lambda$58(this.f$0, (GraphicsLayerScope) obj);
                return invoke$lambda$96$lambda$89$lambda$88$lambda$65$lambda$64$lambda$59$lambda$58;
            case 2:
                invokeSuspend$lambda$0 = MediaThumbnailsForCamKt$thumbnailClickable$1$1.invokeSuspend$lambda$0(this.f$0, (Offset) obj);
                return invokeSuspend$lambda$0;
            case 3:
                thumbnailClickable$lambda$4$lambda$3 = MediaThumbnailsForCamKt.thumbnailClickable$lambda$4$lambda$3(this.f$0, (SemanticsPropertyReceiver) obj);
                return thumbnailClickable$lambda$4$lambda$3;
            default:
                PasteAwareTextField$lambda$5$lambda$4$lambda$3$lambda$0 = PasteAwareTextFieldKt.PasteAwareTextField$lambda$5$lambda$4$lambda$3$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
                return PasteAwareTextField$lambda$5$lambda$4$lambda$3$lambda$0;
        }
    }
}
