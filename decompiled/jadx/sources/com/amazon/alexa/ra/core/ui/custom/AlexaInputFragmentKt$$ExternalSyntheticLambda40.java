package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AlexaInputFragmentKt$$ExternalSyntheticLambda40 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ AlexaInputFragmentKt$$ExternalSyntheticLambda40(boolean z, boolean z2, Function0 function0, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = function0;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit StopButton$lambda$204;
        Unit ShareMyScreenButton$lambda$213;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                StopButton$lambda$204 = AlexaInputFragmentKt.StopButton$lambda$204(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue);
                return StopButton$lambda$204;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ShareMyScreenButton$lambda$213 = AlexaInputFragmentKt.ShareMyScreenButton$lambda$213(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue2);
                return ShareMyScreenButton$lambda$213;
        }
    }
}
