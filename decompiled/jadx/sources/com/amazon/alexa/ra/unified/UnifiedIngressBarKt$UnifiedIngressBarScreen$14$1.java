package com.amazon.alexa.ra.unified;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.ra.unified.UnifiedIngressBarKt$UnifiedIngressBarScreen$14$1", f = "UnifiedIngressBar.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes19.dex */
public final class UnifiedIngressBarKt$UnifiedIngressBarScreen$14$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $conversationActive;
    final /* synthetic */ UnifiedBarMode $mode;
    final /* synthetic */ String $page;
    final /* synthetic */ boolean $voiceOrLiveActive;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedIngressBarKt$UnifiedIngressBarScreen$14$1(UnifiedBarMode unifiedBarMode, boolean z, boolean z2, String str, Continuation<? super UnifiedIngressBarKt$UnifiedIngressBarScreen$14$1> continuation) {
        super(2, continuation);
        this.$mode = unifiedBarMode;
        this.$conversationActive = z;
        this.$voiceOrLiveActive = z2;
        this.$page = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnifiedIngressBarKt$UnifiedIngressBarScreen$14$1(this.$mode, this.$conversationActive, this.$voiceOrLiveActive, this.$page, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnifiedIngressBarKt$UnifiedIngressBarScreen$14$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        Objects.toString(this.$mode);
        return Unit.INSTANCE;
    }
}
