package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.ReactiveSubscriber", f = "ReactiveFlow.kt", i = {}, l = {125}, m = "takeNextOrNull", n = {}, s = {})
/* loaded from: classes10.dex */
public final class ReactiveSubscriber$takeNextOrNull$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReactiveSubscriber<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactiveSubscriber$takeNextOrNull$1(ReactiveSubscriber<T> reactiveSubscriber, Continuation<? super ReactiveSubscriber$takeNextOrNull$1> continuation) {
        super(continuation);
        this.this$0 = reactiveSubscriber;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.takeNextOrNull(this);
    }
}
