package com.amazon.alexa.cantilever;

import android.view.View;
import com.amazon.alexa.redesign.utils.PageHorizontalMargin;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class HelpViewController$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ View f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ HelpViewController$$ExternalSyntheticLambda3(View view, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = view;
        this.f$1 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.setPadding(0, 0, 0, this.f$1);
                break;
            default:
                PageHorizontalMargin.wrapWithResponsiveMargin$lambda$3$lambda$1$lambda$0(this.f$0, this.f$1);
                break;
        }
    }
}
