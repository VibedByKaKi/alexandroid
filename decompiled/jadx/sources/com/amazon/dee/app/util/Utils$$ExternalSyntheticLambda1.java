package com.amazon.dee.app.util;

import android.app.Activity;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.swmansion.rnscreens.ScreenWindowTraits;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class Utils$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Activity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ Utils$$ExternalSyntheticLambda1(Activity activity, int i, String str) {
        this.$r8$classId = i;
        this.f$0 = activity;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                Utils.showToast$lambda$2(this.f$0, this.f$1);
                break;
            case 1:
                StatusBarModule.setStyle$lambda$2(this.f$0, this.f$1);
                break;
            default:
                ScreenWindowTraits.setStyle$lambda$0(this.f$0, this.f$1);
                break;
        }
    }
}
