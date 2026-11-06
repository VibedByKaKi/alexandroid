package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

import android.widget.LinearLayout;
import com.amazon.alexa.voice.ui.onedesign.remarkable.component.FeedbackComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class FeedbackComponent$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FeedbackComponent$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                FeedbackComponent.lambda$create$0((FeedbackComponent.FeedbackItem) obj);
                break;
            default:
                ((LinearLayout) obj).removeViewAt(0);
                break;
        }
    }
}
