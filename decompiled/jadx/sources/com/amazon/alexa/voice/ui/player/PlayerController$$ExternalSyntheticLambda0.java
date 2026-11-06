package com.amazon.alexa.voice.ui.player;

import android.view.ViewTreeObserver;
import com.amazon.alexa.navigation.menu.viewcontroller.SmartHomeNavigationViewController;
import com.amazon.deecomms.calling.incallexperiences.effects.ui.CallCaptionBottomSheetDialogFragmentView;
import com.amazon.deecomms.calling.incallexperiences.effects.ui.EffectsBottomSheetDialogFragmentView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class PlayerController$$ExternalSyntheticLambda0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PlayerController$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((PlayerController) obj).lambda$onCreateView$0();
                break;
            case 1:
                ((SmartHomeNavigationViewController) obj).lambda$setViewPagerHeight$5();
                break;
            case 2:
                ((CallCaptionBottomSheetDialogFragmentView) obj).lambda$setupDialog$0();
                break;
            default:
                ((EffectsBottomSheetDialogFragmentView) obj).lambda$setupDialog$1();
                break;
        }
    }
}
