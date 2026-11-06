package org.apache.commons.lang3.text;

import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class StrBuilder$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StrBuilder f$0;

    public /* synthetic */ StrBuilder$$ExternalSyntheticLambda0(StrBuilder strBuilder, int i) {
        this.$r8$classId = i;
        this.f$0 = strBuilder;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        char[] lambda$minimizeCapacity$0;
        int i = this.$r8$classId;
        StrBuilder strBuilder = this.f$0;
        switch (i) {
            case 0:
                lambda$minimizeCapacity$0 = strBuilder.lambda$minimizeCapacity$0();
                return lambda$minimizeCapacity$0;
            default:
                return strBuilder.getNullText();
        }
    }
}
