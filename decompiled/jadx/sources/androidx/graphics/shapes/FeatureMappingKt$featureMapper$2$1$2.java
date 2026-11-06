package androidx.graphics.shapes;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "i", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FeatureMappingKt$featureMapper$2$1$2 extends Lambda implements Function1<Integer, CharSequence> {
    final /* synthetic */ int $N;
    final /* synthetic */ DoubleMapper $dm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureMappingKt$featureMapper$2$1$2(DoubleMapper doubleMapper, int i) {
        super(1);
        this.$dm = doubleMapper;
        this.$N = i;
    }

    @NotNull
    public final CharSequence invoke(int i) {
        return Format_jvmKt.toStringWithLessPrecision(this.$dm.mapBack(i / this.$N));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
        return invoke(num.intValue());
    }
}
