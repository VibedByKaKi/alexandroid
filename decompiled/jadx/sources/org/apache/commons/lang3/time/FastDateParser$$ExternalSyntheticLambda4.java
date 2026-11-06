package org.apache.commons.lang3.time;

import java.util.function.Consumer;
import org.apache.commons.lang3.time.FastDateParser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class FastDateParser$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StringBuilder f$0;

    public /* synthetic */ FastDateParser$$ExternalSyntheticLambda4(int i, StringBuilder sb) {
        this.$r8$classId = i;
        this.f$0 = sb;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        StringBuilder sb = this.f$0;
        String str = (String) obj;
        switch (i) {
            case 0:
                FastDateParser.lambda$appendDisplayNames$1(sb, str);
                break;
            default:
                FastDateParser.TimeZoneStrategy.lambda$new$0(sb, str);
                break;
        }
    }
}
