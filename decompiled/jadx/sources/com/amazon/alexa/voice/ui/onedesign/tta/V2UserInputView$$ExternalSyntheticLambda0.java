package com.amazon.alexa.voice.ui.onedesign.tta;

import android.view.View;
import android.view.ViewTreeObserver;
import com.amazon.alexa.redesign.view.KeyboardFocusRingController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class V2UserInputView$$ExternalSyntheticLambda0 implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ V2UserInputView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((V2UserInputView) obj).onGlobalFocusChange(view, view2);
                break;
            default:
                ((KeyboardFocusRingController) obj).onGlobalFocusChanged(view2);
                break;
        }
    }
}
