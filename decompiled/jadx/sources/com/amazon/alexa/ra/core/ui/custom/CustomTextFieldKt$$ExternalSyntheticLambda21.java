package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.amazon.alexa.ra.core.ui.fragments.list.UiFragmentListKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class CustomTextFieldKt$$ExternalSyntheticLambda21 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ CustomTextFieldKt$$ExternalSyntheticLambda21(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit AlexaLogoStatic$lambda$38;
        Unit ScrollButton$lambda$273;
        Unit LinearProgressbar$lambda$44;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AlexaLogoStatic$lambda$38 = CustomTextFieldKt.AlexaLogoStatic$lambda$38((Function0) this.f$0, this.f$1, this.f$2, (Composer) obj, intValue);
                return AlexaLogoStatic$lambda$38;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ScrollButton$lambda$273 = UiFragmentListKt.ScrollButton$lambda$273((Function0) this.f$0, this.f$1, this.f$2, (Composer) obj, intValue2);
                return ScrollButton$lambda$273;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                LinearProgressbar$lambda$44 = RAConversationHeaderKt.LinearProgressbar$lambda$44((MutableState) this.f$0, this.f$1, this.f$2, (Composer) obj, intValue3);
                return LinearProgressbar$lambda$44;
        }
    }
}
