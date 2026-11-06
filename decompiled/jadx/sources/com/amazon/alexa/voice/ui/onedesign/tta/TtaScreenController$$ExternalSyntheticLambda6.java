package com.amazon.alexa.voice.ui.onedesign.tta;

import android.view.View;
import android.view.ViewTreeObserver;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomSheetController;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class TtaScreenController$$ExternalSyntheticLambda6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ViewController f$0;
    public final /* synthetic */ View f$1;

    public /* synthetic */ TtaScreenController$$ExternalSyntheticLambda6(ViewController viewController, View view, int i) {
        this.$r8$classId = i;
        this.f$0 = viewController;
        this.f$1 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$r8$classId) {
            case 0:
                ((TtaScreenController) this.f$0).lambda$onCreateView$6(this.f$1);
                break;
            default:
                ((BottomSheetController) this.f$0).lambda$onCreateView$7(this.f$1);
                break;
        }
    }
}
