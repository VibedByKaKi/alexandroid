package com.amazon.alexa.voice.ui.onedesign.rv;

import android.os.Bundle;
import android.view.View;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomSheetController;
import com.amazon.alexa.voice.ui.onedesign.remarkable.RemarkableAlexaConversationController;
import com.amazon.alexa.voice.ui.onedesign.remarkable.settings.RemarkableAlexaSettingsController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class RvAdapter$$ExternalSyntheticLambda0 implements RvActionHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RvAdapter$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.rv.RvActionHandler
    public final void handle(int i, int i2, Object obj, View view, Bundle bundle) {
        int i3 = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i3) {
            case 0:
                ((RvAdapter) obj2).lambda$new$0(i, i2, obj, view, bundle);
                break;
            case 1:
                ((BottomSheetController) obj2).lambda$setupPillsAdapter$14(i, i2, obj, view, bundle);
                break;
            case 2:
                ((RemarkableAlexaConversationController) obj2).lambda$onCreate$0(i, i2, obj, view, bundle);
                break;
            default:
                ((RemarkableAlexaSettingsController) obj2).lambda$onCreateView$0(i, i2, obj, view, bundle);
                break;
        }
    }
}
