package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.amazon.alexa.ra.core.data.model.LiveTranscriptTurn;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveTranscriptOverlayKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ LiveTranscriptOverlayKt$$ExternalSyntheticLambda5(MutableState mutableState, boolean z) {
        this.f$1 = z;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit LiveTranscriptOverlay$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13;
        Unit invoke$lambda$1$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                LiveTranscriptOverlay$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13 = LiveTranscriptOverlayKt.LiveTranscriptOverlay$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13((LiveTranscriptTurn) this.f$0, this.f$1, (SemanticsPropertyReceiver) obj);
                return LiveTranscriptOverlay$lambda$17$lambda$16$lambda$15$lambda$14$lambda$13;
            default:
                invoke$lambda$1$lambda$0 = AlexaInputFragmentKt$TypeModalityTextField$textField$1.invoke$lambda$1$lambda$0(this.f$1, (MutableState) this.f$0, (FocusProperties) obj);
                return invoke$lambda$1$lambda$0;
        }
    }

    public /* synthetic */ LiveTranscriptOverlayKt$$ExternalSyntheticLambda5(LiveTranscriptTurn liveTranscriptTurn, boolean z) {
        this.f$0 = liveTranscriptTurn;
        this.f$1 = z;
    }
}
