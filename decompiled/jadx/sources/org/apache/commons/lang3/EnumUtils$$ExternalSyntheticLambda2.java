package org.apache.commons.lang3;

import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class EnumUtils$$ExternalSyntheticLambda2 implements Predicate {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function f$1;

    public /* synthetic */ EnumUtils$$ExternalSyntheticLambda2(String str, Function function) {
        this.f$0 = str;
        this.f$1 = function;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$getFirstEnumIgnoreCase$0;
        boolean lambda$namePredicate$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$getFirstEnumIgnoreCase$0 = EnumUtils.lambda$getFirstEnumIgnoreCase$0(this.f$0, this.f$1, (Enum) obj);
                return lambda$getFirstEnumIgnoreCase$0;
            default:
                lambda$namePredicate$0 = ThreadUtils.lambda$namePredicate$0(this.f$1, this.f$0, obj);
                return lambda$namePredicate$0;
        }
    }

    public /* synthetic */ EnumUtils$$ExternalSyntheticLambda2(Function function, String str) {
        this.f$1 = function;
        this.f$0 = str;
    }
}
