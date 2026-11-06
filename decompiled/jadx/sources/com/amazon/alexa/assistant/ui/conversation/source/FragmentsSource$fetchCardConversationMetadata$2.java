package com.amazon.alexa.assistant.ui.conversation.source;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.assistant.ui.conversation.source.FragmentsSource$fetchCardConversationMetadata$2", f = "FragmentsSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
public final class FragmentsSource$fetchCardConversationMetadata$2 extends SuspendLambda implements Function2<String, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $conversationId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentsSource$fetchCardConversationMetadata$2(String str, Continuation<? super FragmentsSource$fetchCardConversationMetadata$2> continuation) {
        super(2, continuation);
        this.$conversationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FragmentsSource$fetchCardConversationMetadata$2 fragmentsSource$fetchCardConversationMetadata$2 = new FragmentsSource$fetchCardConversationMetadata$2(this.$conversationId, continuation);
        fragmentsSource$fetchCardConversationMetadata$2.L$0 = obj;
        return fragmentsSource$fetchCardConversationMetadata$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Boolean> continuation) {
        return ((FragmentsSource$fetchCardConversationMetadata$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(Intrinsics.areEqual((String) this.L$0, this.$conversationId));
        }
        Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
