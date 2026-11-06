package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class LottieCompositionFactory$$ExternalSyntheticLambda2 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ ZipInputStream f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ LottieCompositionFactory$$ExternalSyntheticLambda2(Context context, ZipInputStream zipInputStream, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = zipInputStream;
        this.f$2 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult fromZipStreamSync;
        LottieResult fromZipStreamSync2;
        switch (this.$r8$classId) {
            case 0:
                fromZipStreamSync = LottieCompositionFactory.fromZipStreamSync(this.f$0, this.f$1, this.f$2);
                return fromZipStreamSync;
            default:
                fromZipStreamSync2 = LottieCompositionFactory.fromZipStreamSync(this.f$0, this.f$1, this.f$2);
                return fromZipStreamSync2;
        }
    }
}
