package com.amazon.comms.calling.infrastructure.extensions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.comms.calling.infrastructure.extensions.WakelockExtKt", f = "WakelockExt.kt", i = {0}, l = {15}, m = "applyWakelock", n = {"wakeLock"}, s = {"L$0"})
/* loaded from: classes20.dex */
public final class WakelockExtKt$applyWakelock$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public WakelockExtKt$applyWakelock$1(Continuation<? super WakelockExtKt$applyWakelock$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WakelockExtKt.applyWakelock(null, null, null, this);
    }
}
