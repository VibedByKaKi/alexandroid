package androidx.compose.foundation;

import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.ui.unit.Density;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class BasicMarqueeKt$$ExternalSyntheticLambda0 implements MarqueeSpacing {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;

    public /* synthetic */ BasicMarqueeKt$$ExternalSyntheticLambda0(float f, int i) {
        this.$r8$classId = i;
        this.f$0 = f;
    }

    @Override // androidx.compose.foundation.MarqueeSpacing
    public final int calculateSpacing(Density density, int i, int i2) {
        int MarqueeSpacing_0680j_4$lambda$1;
        int fractionOfContainer$lambda$0;
        int i3 = this.$r8$classId;
        float f = this.f$0;
        switch (i3) {
            case 0:
                MarqueeSpacing_0680j_4$lambda$1 = BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$1(f, density, i, i2);
                return MarqueeSpacing_0680j_4$lambda$1;
            default:
                fractionOfContainer$lambda$0 = MarqueeSpacing.Companion.fractionOfContainer$lambda$0(f, density, i, i2);
                return fractionOfContainer$lambda$0;
        }
    }
}
