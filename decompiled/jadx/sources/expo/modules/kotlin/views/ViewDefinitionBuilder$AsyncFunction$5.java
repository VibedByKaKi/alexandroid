package expo.modules.kotlin.views;

import expo.modules.kotlin.Promise;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes9.dex */
public final class ViewDefinitionBuilder$AsyncFunction$5 implements Function2<Object[], Promise, Unit> {
    final /* synthetic */ Function1<P0, R> $body;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewDefinitionBuilder$AsyncFunction$5(Function1<? super P0, ? extends R> function1) {
        this.$body = function1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Object[] objArr, Promise promise) {
        objArr.getClass();
        promise.getClass();
        Function1<P0, R> function1 = this.$body;
        Intrinsics.reifiedOperationMarker(1, "P0");
        function1.invoke(promise);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
        invoke2(objArr, promise);
        return Unit.INSTANCE;
    }
}
