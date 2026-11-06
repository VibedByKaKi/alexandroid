package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.MutableState;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AlexaInputFragmentKt$$ExternalSyntheticLambda33 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Function f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ MutableState f$4;

    public /* synthetic */ AlexaInputFragmentKt$$ExternalSyntheticLambda33(Function3 function3, boolean z, Function1 function1, Function0 function0, MutableState mutableState) {
        this.f$0 = function3;
        this.f$1 = z;
        this.f$2 = function1;
        this.f$3 = function0;
        this.f$4 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit TypeModalityTextField$lambda$183$lambda$182;
        Unit invoke$lambda$4$lambda$3$lambda$2;
        switch (this.$r8$classId) {
            case 0:
                TypeModalityTextField$lambda$183$lambda$182 = AlexaInputFragmentKt.TypeModalityTextField$lambda$183$lambda$182((Function3) this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
                return TypeModalityTextField$lambda$183$lambda$182;
            default:
                invoke$lambda$4$lambda$3$lambda$2 = AlexaInputFragmentKt$TypeModalityTextField$trailingControls$1.invoke$lambda$4$lambda$3$lambda$2(this.f$1, this.f$2, this.f$3, (Function1) this.f$0, this.f$4);
                return invoke$lambda$4$lambda$3$lambda$2;
        }
    }

    public /* synthetic */ AlexaInputFragmentKt$$ExternalSyntheticLambda33(boolean z, Function1 function1, Function0 function0, Function1 function12, MutableState mutableState) {
        this.f$1 = z;
        this.f$2 = function1;
        this.f$3 = function0;
        this.f$0 = function12;
        this.f$4 = mutableState;
    }
}
