package com.amazon.alexa.ra.core.ui.screen.utils;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.core.ui.screen.utils.SingleEventExecutionEffectKt$SingleEventExecutionEffect$2$1", f = "SingleEventExecutionEffect.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes18.dex */
public final class SingleEventExecutionEffectKt$SingleEventExecutionEffect$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ MutableState<Boolean> $blockExecutionPending;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleEventExecutionEffectKt$SingleEventExecutionEffect$2$1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, MutableState<Boolean> mutableState, Continuation<? super SingleEventExecutionEffectKt$SingleEventExecutionEffect$2$1> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.$blockExecutionPending = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SingleEventExecutionEffectKt$SingleEventExecutionEffect$2$1 singleEventExecutionEffectKt$SingleEventExecutionEffect$2$1 = new SingleEventExecutionEffectKt$SingleEventExecutionEffect$2$1(this.$block, this.$blockExecutionPending, continuation);
        singleEventExecutionEffectKt$SingleEventExecutionEffect$2$1.L$0 = obj;
        return singleEventExecutionEffectKt$SingleEventExecutionEffect$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingleEventExecutionEffectKt$SingleEventExecutionEffect$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
            this.label = 1;
            if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$blockExecutionPending.setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
