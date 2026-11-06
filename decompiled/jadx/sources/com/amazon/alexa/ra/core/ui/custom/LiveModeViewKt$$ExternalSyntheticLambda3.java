package com.amazon.alexa.ra.core.ui.custom;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class LiveModeViewKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Shape f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ LiveModeViewKt$$ExternalSyntheticLambda3(boolean z, Function1 function1, Shape shape, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = z;
        this.f$1 = function1;
        this.f$2 = shape;
        this.f$3 = i;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit ScreenShareButton$lambda$75;
        Unit MutedButton$lambda$60;
        Unit CancelButton$lambda$65;
        Unit UnMutedButton$lambda$55;
        Unit CameraButton$lambda$70;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ScreenShareButton$lambda$75 = LiveModeViewKt.ScreenShareButton$lambda$75(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue);
                return ScreenShareButton$lambda$75;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                MutedButton$lambda$60 = LiveModeViewKt.MutedButton$lambda$60(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue2);
                return MutedButton$lambda$60;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                CancelButton$lambda$65 = LiveModeViewKt.CancelButton$lambda$65(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue3);
                return CancelButton$lambda$65;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                UnMutedButton$lambda$55 = LiveModeViewKt.UnMutedButton$lambda$55(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue4);
                return UnMutedButton$lambda$55;
            default:
                int intValue5 = ((Integer) obj2).intValue();
                CameraButton$lambda$70 = LiveModeViewKt.CameraButton$lambda$70(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, intValue5);
                return CameraButton$lambda$70;
        }
    }
}
