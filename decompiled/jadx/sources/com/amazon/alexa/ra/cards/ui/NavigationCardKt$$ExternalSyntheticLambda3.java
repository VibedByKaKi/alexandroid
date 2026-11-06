package com.amazon.alexa.ra.cards.ui;

import androidx.compose.runtime.Composer;
import com.amazon.alexa.ra.core.ui.custom.HoverlessRippleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class NavigationCardKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ NavigationCardKt$$ExternalSyntheticLambda3(boolean z, Function2 function2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = function2;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit NeoPreviewColors$lambda$24;
        Unit ProvideHoverlessRippleIf$lambda$0;
        Unit ProvideHoverlessRippleIf$lambda$1;
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                NeoPreviewColors$lambda$24 = NavigationCardKt.NeoPreviewColors$lambda$24(this.f$0, this.f$1, this.f$2, composer, intValue);
                return NeoPreviewColors$lambda$24;
            case 1:
                ProvideHoverlessRippleIf$lambda$0 = HoverlessRippleKt.ProvideHoverlessRippleIf$lambda$0(this.f$0, this.f$1, this.f$2, composer, intValue);
                return ProvideHoverlessRippleIf$lambda$0;
            default:
                ProvideHoverlessRippleIf$lambda$1 = HoverlessRippleKt.ProvideHoverlessRippleIf$lambda$1(this.f$0, this.f$1, this.f$2, composer, intValue);
                return ProvideHoverlessRippleIf$lambda$1;
        }
    }
}
