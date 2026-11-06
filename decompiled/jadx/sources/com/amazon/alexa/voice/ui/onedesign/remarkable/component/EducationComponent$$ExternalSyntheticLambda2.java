package com.amazon.alexa.voice.ui.onedesign.remarkable.component;

import android.widget.LinearLayout;
import com.amazon.alexa.voice.ui.onedesign.remarkable.component.FeedbackComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class EducationComponent$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Runnable f$1;

    public /* synthetic */ EducationComponent$$ExternalSyntheticLambda2(Object obj, int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((EducationComponent) this.f$0).lambda$hideWithAnimation$2(this.f$1);
                break;
            default:
                FeedbackComponent.AnonymousClass1.lambda$onAnimationEnd$0((LinearLayout) this.f$0, this.f$1);
                break;
        }
    }
}
