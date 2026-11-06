package com.amazon.comms.calling.data.extensions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.comms.calling.data.extensions.CoroutineExtKt$execute$2", f = "CoroutineExt.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {"start$iv"}, s = {"J$0"})
@SourceDebugExtension({"SMAP\nCoroutineExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExt.kt\ncom/amazon/comms/calling/data/extensions/CoroutineExtKt$execute$2\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,99:1\n29#2,3:100\n*S KotlinDebug\n*F\n+ 1 CoroutineExt.kt\ncom/amazon/comms/calling/data/extensions/CoroutineExtKt$execute$2\n*L\n35#1:100,3\n*E\n"})
/* loaded from: classes20.dex */
public final class CoroutineExtKt$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<CoroutineScope, Continuation<? super T>, Object> $block;
    final /* synthetic */ Function1<Long, Unit> $latency;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtKt$execute$2(Function1<? super Long, Unit> function1, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super CoroutineExtKt$execute$2> continuation) {
        super(2, continuation);
        this.$latency = function1;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoroutineExtKt$execute$2 coroutineExtKt$execute$2 = new CoroutineExtKt$execute$2(this.$latency, this.$block, continuation);
        coroutineExtKt$execute$2.L$0 = obj;
        return coroutineExtKt$execute$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoroutineExtKt$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Function2<CoroutineScope, Continuation<? super T>, Object> function2 = this.$block;
            long currentTimeMillis = System.currentTimeMillis();
            this.J$0 = currentTimeMillis;
            this.label = 1;
            if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = currentTimeMillis;
        } else {
            if (i != 1) {
                Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
        }
        this.$latency.invoke(Boxing.boxLong(System.currentTimeMillis() - j));
        return Unit.INSTANCE;
    }
}
