package com.amazon.alexa.voice.ui.onedesign.tta;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.alexa.voice.ui.onedesign.bottomsheet.items.BottomSheetUserInput;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class V1UserInputView$$ExternalSyntheticLambda0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FrameLayout f$0;

    public /* synthetic */ V1UserInputView$$ExternalSyntheticLambda0(FrameLayout frameLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean lambda$new$0;
        boolean lambda$new$02;
        boolean lambda$new$03;
        int i2 = this.$r8$classId;
        FrameLayout frameLayout = this.f$0;
        switch (i2) {
            case 0:
                lambda$new$0 = ((V1UserInputView) frameLayout).lambda$new$0(textView, i, keyEvent);
                return lambda$new$0;
            case 1:
                lambda$new$02 = ((BottomSheetUserInput) frameLayout).lambda$new$0(textView, i, keyEvent);
                return lambda$new$02;
            default:
                lambda$new$03 = ((V2UserInputView) frameLayout).lambda$new$0(textView, i, keyEvent);
                return lambda$new$03;
        }
    }
}
