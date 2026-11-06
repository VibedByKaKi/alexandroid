package expo.modules.kotlin.objects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class PropertyComponentBuilderWithThis$get$1$1 implements Function1<Object[], Object> {
    final /* synthetic */ Function1<ThisType, R> $body;

    /* JADX WARN: Multi-variable type inference failed */
    public PropertyComponentBuilderWithThis$get$1$1(Function1<? super ThisType, ? extends R> function1) {
        this.$body = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object[] objArr) {
        objArr.getClass();
        return this.$body.invoke(objArr[0]);
    }
}
