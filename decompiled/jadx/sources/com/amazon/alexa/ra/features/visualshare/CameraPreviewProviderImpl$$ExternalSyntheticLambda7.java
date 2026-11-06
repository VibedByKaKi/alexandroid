package com.amazon.alexa.ra.features.visualshare;

import android.os.Handler;
import com.amazon.alexa.ra.features.visualshare.LiveModeScreenShareGuard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CameraPreviewProviderImpl$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Handler f$0;

    public /* synthetic */ CameraPreviewProviderImpl$$ExternalSyntheticLambda7(Handler handler, int i) {
        this.$r8$classId = i;
        this.f$0 = handler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit Render$lambda$15$lambda$14$lambda$5;
        Unit instance$lambda$4$lambda$2$lambda$1;
        int i = this.$r8$classId;
        Handler handler = this.f$0;
        switch (i) {
            case 0:
                Render$lambda$15$lambda$14$lambda$5 = CameraPreviewProviderImpl.Render$lambda$15$lambda$14$lambda$5(handler, (Function0) obj);
                return Render$lambda$15$lambda$14$lambda$5;
            default:
                instance$lambda$4$lambda$2$lambda$1 = LiveModeScreenShareGuard.Companion.getInstance$lambda$4$lambda$2$lambda$1(handler, (Runnable) obj);
                return instance$lambda$4$lambda$2$lambda$1;
        }
    }
}
