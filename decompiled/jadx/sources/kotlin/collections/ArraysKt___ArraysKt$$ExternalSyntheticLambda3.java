package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ArrayIteratorsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class ArraysKt___ArraysKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ArraysKt___ArraysKt$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        Iterator it8;
        Iterator it9;
        Iterator it10;
        Iterator it11;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                it2 = ArrayIteratorsKt.iterator((char[]) obj);
                return it2;
            case 1:
                it3 = ArrayIteratorsKt.iterator((int[]) obj);
                return it3;
            case 2:
                it4 = ArrayIteratorsKt.iterator((double[]) obj);
                return it4;
            case 3:
                it5 = ArrayIteratorsKt.iterator((short[]) obj);
                return it5;
            case 4:
                it6 = ArrayIteratorsKt.iterator((float[]) obj);
                return it6;
            case 5:
                it7 = ArrayIteratorsKt.iterator((boolean[]) obj);
                return it7;
            case 6:
                it8 = ArrayIteratorsKt.iterator((long[]) obj);
                return it8;
            case 7:
                it9 = ArrayIteratorsKt.iterator((byte[]) obj);
                return it9;
            case 8:
                it10 = ArrayIteratorKt.iterator((Object[]) obj);
                return it10;
            default:
                it11 = ((Iterable) obj).iterator();
                return it11;
        }
    }
}
