package com.amazon.alexa.voice.tta.typing.bottomsheet;

import com.amazon.alexa.voice.ui.tta.TtaRequestMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class BottomSheetTtaInteractor$initialize$1$$ExternalSyntheticLambda0 implements TtaRequestMessage {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ BottomSheetTtaInteractor$initialize$1$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // com.amazon.alexa.voice.ui.tta.TtaRequestMessage, com.amazon.alexa.voice.ui.tta.TtaMessage
    public final String getMessage() {
        String accept$lambda$0;
        String accept$lambda$02;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                accept$lambda$0 = BottomSheetTtaInteractor$initialize$1.accept$lambda$0(str);
                return accept$lambda$0;
            default:
                accept$lambda$02 = BottomSheetTtaInteractor$initialize$4.accept$lambda$0(str);
                return accept$lambda$02;
        }
    }
}
