package com.amazon.alexa.ra.cards.ui;

import androidx.compose.runtime.MutableState;
import com.amazon.alexa.ra.apl.deepbrowse.composables.DeepBrowseScreenKt;
import com.amazon.alexa.ra.core.ui.screen.RaMainScreenKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class PaginatedViewPagerKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ PaginatedViewPagerKt$$ExternalSyntheticLambda1(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int PaginatedViewPager$lambda$3$lambda$2;
        MutableState DeepBrowseScreen$lambda$3$lambda$2;
        MutableState RaScreen$lambda$20$lambda$19;
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                PaginatedViewPager$lambda$3$lambda$2 = PaginatedViewPagerKt.PaginatedViewPager$lambda$3$lambda$2(i2);
                return Integer.valueOf(PaginatedViewPager$lambda$3$lambda$2);
            case 1:
                DeepBrowseScreen$lambda$3$lambda$2 = DeepBrowseScreenKt.DeepBrowseScreen$lambda$3$lambda$2(i2);
                return DeepBrowseScreen$lambda$3$lambda$2;
            default:
                RaScreen$lambda$20$lambda$19 = RaMainScreenKt.RaScreen$lambda$20$lambda$19(i2);
                return RaScreen$lambda$20$lambda$19;
        }
    }
}
