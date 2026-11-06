package com.amazon.alexa.assistant.transport;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "<unused var>", "", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.assistant.transport.ConnectionWaiter$tokenActivity$1", f = "ConnectionWaiter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
public final class ConnectionWaiter$tokenActivity$1 extends SuspendLambda implements Function4<Boolean, Boolean, Integer, Continuation<? super Unit>, Object> {
    int label;

    public ConnectionWaiter$tokenActivity$1(Continuation<? super ConnectionWaiter$tokenActivity$1> continuation) {
        super(4, continuation);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Integer num, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), bool2.booleanValue(), num.intValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(boolean z, boolean z2, int i, Continuation<? super Unit> continuation) {
        return new ConnectionWaiter$tokenActivity$1(continuation).invokeSuspend(Unit.INSTANCE);
    }
}
