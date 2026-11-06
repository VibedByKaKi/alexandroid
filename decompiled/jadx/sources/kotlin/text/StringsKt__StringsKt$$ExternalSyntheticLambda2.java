package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class StringsKt__StringsKt$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CharSequence f$0;

    public /* synthetic */ StringsKt__StringsKt$$ExternalSyntheticLambda2(CharSequence charSequence, int i) {
        this.$r8$classId = i;
        this.f$0 = charSequence;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String splitToSequence$lambda$1$StringsKt__StringsKt;
        String splitToSequence$lambda$0$StringsKt__StringsKt;
        int i = this.$r8$classId;
        CharSequence charSequence = this.f$0;
        IntRange intRange = (IntRange) obj;
        switch (i) {
            case 0:
                splitToSequence$lambda$1$StringsKt__StringsKt = StringsKt__StringsKt.splitToSequence$lambda$1$StringsKt__StringsKt(charSequence, intRange);
                return splitToSequence$lambda$1$StringsKt__StringsKt;
            default:
                splitToSequence$lambda$0$StringsKt__StringsKt = StringsKt__StringsKt.splitToSequence$lambda$0$StringsKt__StringsKt(charSequence, intRange);
                return splitToSequence$lambda$0$StringsKt__StringsKt;
        }
    }
}
