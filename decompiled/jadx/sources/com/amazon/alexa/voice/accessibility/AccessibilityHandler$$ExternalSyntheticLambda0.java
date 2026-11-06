package com.amazon.alexa.voice.accessibility;

import com.amazon.alexa.voice.ui.onedesign.tta.TtaScreenInteractor;
import com.amazon.alexa.voice.ui.util.BaseProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AccessibilityHandler$$ExternalSyntheticLambda0 implements BaseProperty.OnChangedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessibilityHandler$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.voice.ui.util.BaseProperty.OnChangedListener
    public final void onPropertyChanged() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((AccessibilityHandler) obj).setCurrentAccessibility();
                break;
            default:
                ((TtaScreenInteractor) obj).lambda$new$0();
                break;
        }
    }
}
