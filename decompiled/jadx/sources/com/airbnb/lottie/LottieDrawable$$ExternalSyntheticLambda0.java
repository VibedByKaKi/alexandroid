package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class LottieDrawable$$ExternalSyntheticLambda0 implements LottieDrawable.LazyCompositionTask {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LottieDrawable f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LottieDrawable$$ExternalSyntheticLambda0(LottieDrawable lottieDrawable, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = lottieDrawable;
        this.f$1 = str;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setMinAndMaxFrame$11(this.f$1, lottieComposition);
                break;
            case 1:
                this.f$0.lambda$setMaxFrame$10(this.f$1, lottieComposition);
                break;
            default:
                this.f$0.lambda$setMinFrame$9(this.f$1, lottieComposition);
                break;
        }
    }
}
