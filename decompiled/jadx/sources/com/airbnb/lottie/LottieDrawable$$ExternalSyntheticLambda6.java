package com.airbnb.lottie;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class LottieDrawable$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LottieDrawable f$0;

    public /* synthetic */ LottieDrawable$$ExternalSyntheticLambda6(LottieDrawable lottieDrawable, int i) {
        this.$r8$classId = i;
        this.f$0 = lottieDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        LottieDrawable lottieDrawable = this.f$0;
        switch (i) {
            case 0:
                lottieDrawable.lambda$new$2();
                break;
            default:
                lottieDrawable.lambda$new$1();
                break;
        }
    }
}
