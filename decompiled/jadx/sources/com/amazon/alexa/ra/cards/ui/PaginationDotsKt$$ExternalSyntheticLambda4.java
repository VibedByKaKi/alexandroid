package com.amazon.alexa.ra.cards.ui;

import androidx.compose.runtime.Composer;
import com.amazon.alexa.ra.core.ui.custom.ShimmerEffectKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class PaginationDotsKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ PaginationDotsKt$$ExternalSyntheticLambda4(int i, int i2, boolean z, boolean z2) {
        this.$r8$classId = i2;
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit PaginationDot$lambda$7;
        Unit PaginationDot$lambda$72;
        Unit TurnSkeleton$lambda$25;
        Unit TurnSkeleton$lambda$26;
        Unit TurnSkeleton$lambda$29;
        Unit LoadingSkeletonContent$lambda$23;
        Unit LoadingSkeletonContent$lambda$24;
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                PaginationDot$lambda$7 = PaginationDotsKt.PaginationDot$lambda$7(this.f$0, this.f$1, this.f$2, composer, intValue);
                return PaginationDot$lambda$7;
            case 1:
                PaginationDot$lambda$72 = com.amazon.alexa.ra.apl.fragments.composables.PaginationDotsKt.PaginationDot$lambda$7(this.f$0, this.f$1, this.f$2, composer, intValue);
                return PaginationDot$lambda$72;
            case 2:
                TurnSkeleton$lambda$25 = ShimmerEffectKt.TurnSkeleton$lambda$25(this.f$0, this.f$1, this.f$2, composer, intValue);
                return TurnSkeleton$lambda$25;
            case 3:
                TurnSkeleton$lambda$26 = ShimmerEffectKt.TurnSkeleton$lambda$26(this.f$0, this.f$1, this.f$2, composer, intValue);
                return TurnSkeleton$lambda$26;
            case 4:
                TurnSkeleton$lambda$29 = ShimmerEffectKt.TurnSkeleton$lambda$29(this.f$0, this.f$1, this.f$2, composer, intValue);
                return TurnSkeleton$lambda$29;
            case 5:
                LoadingSkeletonContent$lambda$23 = ShimmerEffectKt.LoadingSkeletonContent$lambda$23(this.f$0, this.f$1, this.f$2, composer, intValue);
                return LoadingSkeletonContent$lambda$23;
            default:
                LoadingSkeletonContent$lambda$24 = ShimmerEffectKt.LoadingSkeletonContent$lambda$24(this.f$0, this.f$1, this.f$2, composer, intValue);
                return LoadingSkeletonContent$lambda$24;
        }
    }
}
