package com.amazon.alexa.assistant.api;

import com.amazon.alexa.assistant.ui.conversation.settings.model.RetailCookieProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.amazon.alexa.assistant.api.AssistantWithUIBuilder$buildWithUI$profileManager$1$3", f = "AssistantWithUIBuilder.kt", i = {}, l = {1113}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
public final class AssistantWithUIBuilder$buildWithUI$profileManager$1$3 extends SuspendLambda implements Function1<Continuation<? super List<? extends String>>, Object> {
    final /* synthetic */ RetailCookieProvider $provider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantWithUIBuilder$buildWithUI$profileManager$1$3(RetailCookieProvider retailCookieProvider, Continuation<? super AssistantWithUIBuilder$buildWithUI$profileManager$1$3> continuation) {
        super(1, continuation);
        this.$provider = retailCookieProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AssistantWithUIBuilder$buildWithUI$profileManager$1$3(this.$provider, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<String>> continuation) {
        return ((AssistantWithUIBuilder$buildWithUI$profileManager$1$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.throwOnFailure(obj);
        RetailCookieProvider retailCookieProvider = this.$provider;
        this.label = 1;
        Object cookies = retailCookieProvider.getCookies(this);
        return cookies == coroutine_suspended ? coroutine_suspended : cookies;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends String>> continuation) {
        return invoke2((Continuation<? super List<String>>) continuation);
    }
}
