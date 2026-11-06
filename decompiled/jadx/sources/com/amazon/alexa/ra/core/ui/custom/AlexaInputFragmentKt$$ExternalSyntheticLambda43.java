package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AlexaInputFragmentKt$$ExternalSyntheticLambda43 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Integer f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ String f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ int f$7;

    public /* synthetic */ AlexaInputFragmentKt$$ExternalSyntheticLambda43(boolean z, Function0 function0, Integer num, boolean z2, boolean z3, String str, int i, int i2) {
        this.f$0 = z;
        this.f$1 = function0;
        this.f$2 = num;
        this.f$3 = z2;
        this.f$4 = z3;
        this.f$5 = str;
        this.f$6 = i;
        this.f$7 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit TypeModalityPlusAttachButton$lambda$109;
        Unit TypeModalityPaperClipAttachButton$lambda$110;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TypeModalityPlusAttachButton$lambda$109 = AlexaInputFragmentKt.TypeModalityPlusAttachButton$lambda$109(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, intValue);
                return TypeModalityPlusAttachButton$lambda$109;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                boolean z = this.f$0;
                Function0 function0 = this.f$1;
                Integer num = this.f$2;
                TypeModalityPaperClipAttachButton$lambda$110 = AlexaInputFragmentKt.TypeModalityPaperClipAttachButton$lambda$110(z, function0, this.f$3, num, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, intValue2);
                return TypeModalityPaperClipAttachButton$lambda$110;
        }
    }

    public /* synthetic */ AlexaInputFragmentKt$$ExternalSyntheticLambda43(boolean z, Function0 function0, boolean z2, Integer num, boolean z3, String str, int i, int i2) {
        this.f$0 = z;
        this.f$1 = function0;
        this.f$3 = z2;
        this.f$2 = num;
        this.f$4 = z3;
        this.f$5 = str;
        this.f$6 = i;
        this.f$7 = i2;
    }
}
