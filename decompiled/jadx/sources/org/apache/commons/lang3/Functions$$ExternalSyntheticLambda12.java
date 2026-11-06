package org.apache.commons.lang3;

import java.util.function.BiPredicate;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableBiPredicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class Functions$$ExternalSyntheticLambda12 implements BiPredicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Functions$$ExternalSyntheticLambda12(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        boolean test;
        boolean test2;
        int i = this.$r8$classId;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                test = Functions.test((Functions.FailableBiPredicate) obj3, obj, obj2);
                return test;
            default:
                test2 = Failable.test((FailableBiPredicate) obj3, obj, obj2);
                return test2;
        }
    }
}
