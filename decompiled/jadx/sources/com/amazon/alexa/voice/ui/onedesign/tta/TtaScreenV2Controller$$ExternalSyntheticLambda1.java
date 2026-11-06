package com.amazon.alexa.voice.ui.onedesign.tta;

import android.os.Bundle;
import android.view.View;
import com.amazon.alexa.voice.ui.onedesign.rv.RvActionHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TtaScreenV2Controller$$ExternalSyntheticLambda1 implements RvActionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TtaScreenV2Controller f$0;

    public /* synthetic */ TtaScreenV2Controller$$ExternalSyntheticLambda1(TtaScreenV2Controller ttaScreenV2Controller, int i) {
        this.$r8$classId = i;
        this.f$0 = ttaScreenV2Controller;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.rv.RvActionHandler
    public final void handle(int i, int i2, Object obj, View view, Bundle bundle) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setupPillsAdapter$0(i, i2, obj, view, bundle);
                break;
            case 1:
                this.f$0.lambda$setupSuggestionsAdapter$1(i, i2, obj, view, bundle);
                break;
            default:
                this.f$0.lambda$setupSuggestionsAdapter$2(i, i2, obj, view, bundle);
                break;
        }
    }
}
