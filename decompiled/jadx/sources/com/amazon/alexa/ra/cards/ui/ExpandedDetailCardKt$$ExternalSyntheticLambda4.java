package com.amazon.alexa.ra.cards.ui;

import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class ExpandedDetailCardKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ExpandedDetailCardKt$$ExternalSyntheticLambda4(int i, int i2, long j, String str) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = j;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Unit AttributionSection_RPmYEkk$lambda$2;
        Unit AttributionSection_RPmYEkk$lambda$5;
        switch (this.$r8$classId) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                AttributionSection_RPmYEkk$lambda$2 = ExpandedDetailCardKt.AttributionSection_RPmYEkk$lambda$2(this.f$0, this.f$1, this.f$2, (Composer) obj, intValue);
                return AttributionSection_RPmYEkk$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                AttributionSection_RPmYEkk$lambda$5 = ExpandedFullImageCardKt.AttributionSection_RPmYEkk$lambda$5(this.f$0, this.f$1, this.f$2, (Composer) obj, intValue2);
                return AttributionSection_RPmYEkk$lambda$5;
        }
    }
}
