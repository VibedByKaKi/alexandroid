package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class LottieCompositionFactory$$ExternalSyntheticLambda4 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ LottieCompositionFactory$$ExternalSyntheticLambda4(Context context, int i, String str, String str2) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult lambda$fromUrl$0;
        LottieResult fromAssetSync;
        switch (this.$r8$classId) {
            case 0:
                lambda$fromUrl$0 = LottieCompositionFactory.lambda$fromUrl$0(this.f$0, this.f$1, this.f$2);
                return lambda$fromUrl$0;
            default:
                fromAssetSync = LottieCompositionFactory.fromAssetSync(this.f$0, this.f$1, this.f$2);
                return fromAssetSync;
        }
    }
}
