package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes10.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static /* bridge */ /* synthetic */ Appendable joinTo$default(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i) {
        Appendable joinTo;
        joinTo = CollectionsKt___CollectionsKt.joinTo(iterable, appendable, (r14 & 2) != 0 ? ", " : str, (r14 & 4) != 0 ? "" : str2, (r14 & 8) == 0 ? str3 : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : function1);
        return joinTo;
    }

    public static /* bridge */ /* synthetic */ String joinToString$default(Iterable iterable, String str, String str2, String str3, Function1 function1, int i) {
        return CollectionsKt___CollectionsKt.joinToString$default(iterable, str, str2, str3, 0, null, function1, i, null);
    }
}
