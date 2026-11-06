package com.amazon.comms.calling.presentation.viewmodel;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.comms.calling.presentation.viewmodel.NativeCallViewModel$onPermissionGranted$1$1$1", f = "NativeCallViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes20.dex */
public final class NativeCallViewModel$onPermissionGranted$1$1$1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;

    public NativeCallViewModel$onPermissionGranted$1$1$1(Continuation<? super NativeCallViewModel$onPermissionGranted$1$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NativeCallViewModel$onPermissionGranted$1$1$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((NativeCallViewModel$onPermissionGranted$1$1$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
}
