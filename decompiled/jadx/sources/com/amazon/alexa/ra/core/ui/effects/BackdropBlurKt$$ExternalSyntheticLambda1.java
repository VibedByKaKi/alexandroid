package com.amazon.alexa.ra.core.ui.effects;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class BackdropBlurKt$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BackdropBlurState f$0;

    public /* synthetic */ BackdropBlurKt$$ExternalSyntheticLambda1(BackdropBlurState backdropBlurState, int i) {
        this.$r8$classId = i;
        this.f$0 = backdropBlurState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit backdropBlurSource$lambda$5$lambda$4;
        Unit backdropBlur_N3hlwXA$lambda$12$lambda$11;
        int i = this.$r8$classId;
        BackdropBlurState backdropBlurState = this.f$0;
        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
        switch (i) {
            case 0:
                backdropBlurSource$lambda$5$lambda$4 = BackdropBlurKt.backdropBlurSource$lambda$5$lambda$4(backdropBlurState, layoutCoordinates);
                return backdropBlurSource$lambda$5$lambda$4;
            default:
                backdropBlur_N3hlwXA$lambda$12$lambda$11 = BackdropBlurKt.backdropBlur_N3hlwXA$lambda$12$lambda$11(backdropBlurState, layoutCoordinates);
                return backdropBlur_N3hlwXA$lambda$12$lambda$11;
        }
    }
}
