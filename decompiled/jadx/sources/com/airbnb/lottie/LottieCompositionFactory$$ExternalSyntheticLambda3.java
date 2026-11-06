package com.airbnb.lottie;

import com.airbnb.lottie.utils.Utils;
import java.util.zip.ZipInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class LottieCompositionFactory$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ZipInputStream f$0;

    public /* synthetic */ LottieCompositionFactory$$ExternalSyntheticLambda3(ZipInputStream zipInputStream, int i) {
        this.$r8$classId = i;
        this.f$0 = zipInputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ZipInputStream zipInputStream = this.f$0;
        switch (i) {
            case 0:
                Utils.closeQuietly(zipInputStream);
                break;
            default:
                Utils.closeQuietly(zipInputStream);
                break;
        }
    }
}
