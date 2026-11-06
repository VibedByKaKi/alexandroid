package expo.modules.kotlin;

import com.amazon.alexa.presence.utils.MetricsUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public /* synthetic */ class PromiseKt$toBridgePromise$resolveMethod$2 extends FunctionReferenceImpl implements Function1<Object, Unit> {
    public PromiseKt$toBridgePromise$resolveMethod$2(Object obj) {
        super(1, obj, Promise.class, MetricsUtil.MetricsId.RESOLVE, "resolve(Ljava/lang/Object;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) {
        ((Promise) this.receiver).resolve(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }
}
