package com.amazon.alexa.ra.ui.metrics;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.ui.metrics.LegacyOpenLatencyEmitter", f = "LegacyOpenLatencyEmitter.kt", i = {0, 0, 0}, l = {29}, m = "tryEmit", n = {"raUiOptions", "source", "latency"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes19.dex */
public final class LegacyOpenLatencyEmitter$tryEmit$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyOpenLatencyEmitter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyOpenLatencyEmitter$tryEmit$1(LegacyOpenLatencyEmitter legacyOpenLatencyEmitter, Continuation<? super LegacyOpenLatencyEmitter$tryEmit$1> continuation) {
        super(continuation);
        this.this$0 = legacyOpenLatencyEmitter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.tryEmit(null, false, this);
    }
}
