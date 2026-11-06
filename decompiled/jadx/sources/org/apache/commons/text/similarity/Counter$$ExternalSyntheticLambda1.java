package org.apache.commons.text.similarity;

import java.util.HashMap;
import java.util.function.Consumer;
import org.apache.commons.text.similarity.IntersectionSimilarity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class Counter$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Counter$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Counter.lambda$of$1((HashMap) obj2, (CharSequence) obj);
                break;
            default:
                IntersectionSimilarity.TinyBag.access$700((IntersectionSimilarity.TinyBag) obj2, obj);
                break;
        }
    }
}
