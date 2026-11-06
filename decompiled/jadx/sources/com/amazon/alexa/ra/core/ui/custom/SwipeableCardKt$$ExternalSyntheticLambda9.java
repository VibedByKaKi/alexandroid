package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class SwipeableCardKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ SwipeableCardKt$$ExternalSyntheticLambda9(boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit DeleteSwipeableCardImageView$lambda$16;
        Unit GradientBackground$lambda$6;
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                DeleteSwipeableCardImageView$lambda$16 = SwipeableCardKt.DeleteSwipeableCardImageView$lambda$16(this.f$0, this.f$1, composer, intValue);
                return DeleteSwipeableCardImageView$lambda$16;
            default:
                GradientBackground$lambda$6 = GradientBackgroundKt.GradientBackground$lambda$6(this.f$0, this.f$1, composer, intValue);
                return GradientBackground$lambda$6;
        }
    }
}
