package com.amazon.alexa.ra.unified;

import android.content.Context;
import com.amazon.alexa.ra.unified.UnifiedIngressBarController;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class UnifiedIngressBarController$Companion$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ UnifiedIngressBarController$Companion$$ExternalSyntheticLambda0(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean shouldEnableUnifiedIngressBar$lambda$0;
        int i = this.$r8$classId;
        Context context = this.f$0;
        switch (i) {
            case 0:
                shouldEnableUnifiedIngressBar$lambda$0 = UnifiedIngressBarController.Companion.shouldEnableUnifiedIngressBar$lambda$0(context);
                break;
            default:
                shouldEnableUnifiedIngressBar$lambda$0 = UnifiedIngressBarController.Companion.readUnifiedIngressBarGate$lambda$1(context);
                break;
        }
        return Boolean.valueOf(shouldEnableUnifiedIngressBar$lambda$0);
    }
}
