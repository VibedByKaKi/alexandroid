package org.apache.commons.lang3;

import java.util.Set;
import java.util.function.IntPredicate;
import org.apache.commons.io.input.CharacterSetFilterReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ArrayUtils$$ExternalSyntheticLambda11 implements IntPredicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ArrayUtils$$ExternalSyntheticLambda11(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        boolean contains;
        boolean lambda$toIntPredicate$0;
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                contains = ArrayUtils.contains((int[]) obj, i);
                return contains;
            default:
                lambda$toIntPredicate$0 = CharacterSetFilterReader.lambda$toIntPredicate$0((Set) obj, i);
                return lambda$toIntPredicate$0;
        }
    }
}
