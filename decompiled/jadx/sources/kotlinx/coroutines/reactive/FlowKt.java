package kotlinx.coroutines.reactive;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import org.reactivestreams.Publisher;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"kotlinx/coroutines/reactive/FlowKt__MigrationKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlowKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced in favor of ReactiveFlow extension, please import kotlinx.coroutines.reactive.* instead of kotlinx.coroutines.reactive.FlowKt")
    @JvmName(name = "asPublisher")
    public static final /* synthetic */ Publisher asPublisher(Flow flow) {
        Publisher asPublisher$default;
        asPublisher$default = ReactiveFlowKt.asPublisher$default(flow, null, 1, null);
        return asPublisher$default;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "batchSize parameter is deprecated, use .buffer() instead to control the backpressure", replaceWith = @ReplaceWith(expression = "asFlow().buffer(batchSize)", imports = {"kotlinx.coroutines.flow.*"}))
    public static final /* synthetic */ Flow asFlow(Publisher publisher, int i) {
        Flow buffer$default;
        buffer$default = FlowKt__ContextKt.buffer$default(ReactiveFlowKt.asFlow(publisher), i, null, 2, null);
        return buffer$default;
    }
}
