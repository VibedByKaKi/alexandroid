package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003¨\u0006\n"}, d2 = {"FastOutLinearInEasing", "Landroidx/compose/animation/core/Easing;", "getFastOutLinearInEasing", "()Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", "getFastOutSlowInEasing", "LinearEasing", "getLinearEasing", "LinearOutSlowInEasing", "getLinearOutSlowInEasing", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EasingKt {

    @NotNull
    private static final Easing FastOutSlowInEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    @NotNull
    private static final Easing LinearOutSlowInEasing = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    @NotNull
    private static final Easing FastOutLinearInEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    @NotNull
    private static final Easing LinearEasing = new EasingKt$$ExternalSyntheticLambda0(0);

    @NotNull
    public static final Easing getFastOutLinearInEasing() {
        return FastOutLinearInEasing;
    }

    @NotNull
    public static final Easing getFastOutSlowInEasing() {
        return FastOutSlowInEasing;
    }

    @NotNull
    public static final Easing getLinearEasing() {
        return LinearEasing;
    }

    @NotNull
    public static final Easing getLinearOutSlowInEasing() {
        return LinearOutSlowInEasing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearEasing$lambda$0(float f) {
        return f;
    }
}
