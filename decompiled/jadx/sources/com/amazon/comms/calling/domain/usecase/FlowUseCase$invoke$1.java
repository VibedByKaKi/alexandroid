package com.amazon.comms.calling.domain.usecase;

import com.amazon.deecomms.calling.api.Result;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import rx.Single$$ExternalSyntheticBUOutline0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/amazon/deecomms/calling/api/Result;", "e", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.comms.calling.domain.usecase.FlowUseCase$invoke$1", f = "FlowUseCase.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes20.dex */
public final class FlowUseCase$invoke$1<R> extends SuspendLambda implements Function3<FlowCollector<? super Result<R>>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public FlowUseCase$invoke$1(Continuation<? super FlowUseCase$invoke$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Result<R>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        FlowUseCase$invoke$1 flowUseCase$invoke$1 = new FlowUseCase$invoke$1(continuation);
        flowUseCase$invoke$1.L$0 = flowCollector;
        flowUseCase$invoke$1.L$1 = th;
        return flowUseCase$invoke$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Result.Error error = new Result.Error(new Exception((Throwable) this.L$1));
            this.L$0 = null;
            this.label = 1;
            if (flowCollector.emit(error, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
