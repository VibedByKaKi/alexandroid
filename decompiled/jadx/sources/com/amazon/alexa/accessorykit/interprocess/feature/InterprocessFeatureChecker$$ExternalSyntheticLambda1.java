package com.amazon.alexa.accessorykit.interprocess.feature;

import io.reactivex.rxjava3.functions.Action;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class InterprocessFeatureChecker$$ExternalSyntheticLambda1 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InterprocessFeatureChecker f$0;

    public /* synthetic */ InterprocessFeatureChecker$$ExternalSyntheticLambda1(InterprocessFeatureChecker interprocessFeatureChecker, int i) {
        this.$r8$classId = i;
        this.f$0 = interprocessFeatureChecker;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        int i = this.$r8$classId;
        InterprocessFeatureChecker interprocessFeatureChecker = this.f$0;
        switch (i) {
            case 0:
                interprocessFeatureChecker.lambda$loadFeatureFlag$2();
                break;
            default:
                interprocessFeatureChecker.lambda$loadFeatureFlagAsync$0();
                break;
        }
    }
}
