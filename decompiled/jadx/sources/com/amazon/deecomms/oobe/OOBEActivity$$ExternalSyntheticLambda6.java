package com.amazon.deecomms.oobe;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomSheetController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class OOBEActivity$$ExternalSyntheticLambda6 implements OnApplyWindowInsetsListener {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OOBEActivity$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat lambda$setupWindowInsets$0;
        WindowInsetsCompat lambda$setupImeAnimationsCallback$15;
        switch (this.$r8$classId) {
            case 0:
                lambda$setupWindowInsets$0 = OOBEActivity.lambda$setupWindowInsets$0(view, windowInsetsCompat);
                return lambda$setupWindowInsets$0;
            default:
                lambda$setupImeAnimationsCallback$15 = BottomSheetController.lambda$setupImeAnimationsCallback$15(view, windowInsetsCompat);
                return lambda$setupImeAnimationsCallback$15;
        }
    }
}
