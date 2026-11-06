package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class AlexaInputFragmentKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ AlexaInputFragmentKt$$ExternalSyntheticLambda10(boolean z, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = z;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit InputSectionAgentForwardLightPlaceHolder$lambda$222;
        Unit TypeModalityAgentRedesignUiPreview$lambda$39;
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                InputSectionAgentForwardLightPlaceHolder$lambda$222 = AlexaInputFragmentKt.InputSectionAgentForwardLightPlaceHolder$lambda$222(this.f$0, this.f$1, this.f$2, composer, intValue);
                return InputSectionAgentForwardLightPlaceHolder$lambda$222;
            default:
                TypeModalityAgentRedesignUiPreview$lambda$39 = ConversationScreenUiComponentsKt.TypeModalityAgentRedesignUiPreview$lambda$39(this.f$0, this.f$1, this.f$2, composer, intValue);
                return TypeModalityAgentRedesignUiPreview$lambda$39;
        }
    }
}
