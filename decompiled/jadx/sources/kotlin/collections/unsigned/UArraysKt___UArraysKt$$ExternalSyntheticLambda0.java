package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class UArraysKt___UArraysKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ UArraysKt___UArraysKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterator m25453iteratorimpl;
        Iterator m25532iteratorimpl;
        Iterator m25374iteratorimpl;
        Iterator m25637iteratorimpl;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                m25453iteratorimpl = UIntArray.m25453iteratorimpl((int[]) obj);
                return m25453iteratorimpl;
            case 1:
                m25532iteratorimpl = ULongArray.m25532iteratorimpl((long[]) obj);
                return m25532iteratorimpl;
            case 2:
                m25374iteratorimpl = UByteArray.m25374iteratorimpl((byte[]) obj);
                return m25374iteratorimpl;
            default:
                m25637iteratorimpl = UShortArray.m25637iteratorimpl((short[]) obj);
                return m25637iteratorimpl;
        }
    }
}
