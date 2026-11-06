package androidx.compose.animation.core;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class EasingKt$$ExternalSyntheticLambda0 implements Easing {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ EasingKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // androidx.compose.animation.core.Easing
    public final float transform(float f) {
        float LinearEasing$lambda$0;
        float EaseInElastic$lambda$0;
        float EaseOutElastic$lambda$1;
        float EaseInOutElastic$lambda$2;
        float EaseOutBounce$lambda$3;
        float EaseInBounce$lambda$4;
        float EaseInOutBounce$lambda$5;
        switch (this.$r8$classId) {
            case 0:
                LinearEasing$lambda$0 = EasingKt.LinearEasing$lambda$0(f);
                return LinearEasing$lambda$0;
            case 1:
                EaseInElastic$lambda$0 = EasingFunctionsKt.EaseInElastic$lambda$0(f);
                return EaseInElastic$lambda$0;
            case 2:
                EaseOutElastic$lambda$1 = EasingFunctionsKt.EaseOutElastic$lambda$1(f);
                return EaseOutElastic$lambda$1;
            case 3:
                EaseInOutElastic$lambda$2 = EasingFunctionsKt.EaseInOutElastic$lambda$2(f);
                return EaseInOutElastic$lambda$2;
            case 4:
                EaseOutBounce$lambda$3 = EasingFunctionsKt.EaseOutBounce$lambda$3(f);
                return EaseOutBounce$lambda$3;
            case 5:
                EaseInBounce$lambda$4 = EasingFunctionsKt.EaseInBounce$lambda$4(f);
                return EaseInBounce$lambda$4;
            default:
                EaseInOutBounce$lambda$5 = EasingFunctionsKt.EaseInOutBounce$lambda$5(f);
                return EaseInOutBounce$lambda$5;
        }
    }
}
