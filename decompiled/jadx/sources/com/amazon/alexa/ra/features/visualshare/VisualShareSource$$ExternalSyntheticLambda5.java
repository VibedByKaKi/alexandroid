package com.amazon.alexa.ra.features.visualshare;

import android.content.Context;
import com.amazon.alexa.api.compat.AVSFrameworkApisV2Interface;
import com.amazon.alexa.ra.features.backgroundvoice.BackgroundVoiceSource;
import com.amazon.alexa.ra.features.visualshare.LiveModeScreenShareGuard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class VisualShareSource$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ VisualShareSource$$ExternalSyntheticLambda5(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit armLiveModeGuard$lambda$5;
        boolean _init_$lambda$1;
        AVSFrameworkApisV2Interface instance$lambda$4$lambda$2$lambda$0;
        int i = this.$r8$classId;
        Context context = this.f$0;
        switch (i) {
            case 0:
                armLiveModeGuard$lambda$5 = VisualShareSource.armLiveModeGuard$lambda$5(context);
                return armLiveModeGuard$lambda$5;
            case 1:
                _init_$lambda$1 = BackgroundVoiceSource._init_$lambda$1(context);
                return Boolean.valueOf(_init_$lambda$1);
            default:
                instance$lambda$4$lambda$2$lambda$0 = LiveModeScreenShareGuard.Companion.getInstance$lambda$4$lambda$2$lambda$0(context);
                return instance$lambda$4$lambda$2$lambda$0;
        }
    }
}
