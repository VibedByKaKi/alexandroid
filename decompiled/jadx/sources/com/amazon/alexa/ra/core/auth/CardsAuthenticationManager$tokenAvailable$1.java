package com.amazon.alexa.ra.core.auth;

import com.amazon.alexa.ra.core.features.user.UserSourceApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"com/amazon/alexa/ra/core/auth/CardsAuthenticationManager$tokenAvailable$1", "Lkotlinx/coroutines/flow/StateFlow;", "", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "value", "getValue", "()Ljava/lang/Boolean;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CardsAuthenticationManager$tokenAvailable$1 implements StateFlow<Boolean> {
    final /* synthetic */ CardsAuthenticationManager this$0;

    public CardsAuthenticationManager$tokenAvailable$1(CardsAuthenticationManager cardsAuthenticationManager) {
        this.this$0 = cardsAuthenticationManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(final kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> r5, kotlin.coroutines.Continuation<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.alexa.ra.core.auth.CardsAuthenticationManager$tokenAvailable$1$collect$1
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.alexa.ra.core.auth.CardsAuthenticationManager$tokenAvailable$1$collect$1 r0 = (com.amazon.alexa.ra.core.auth.CardsAuthenticationManager$tokenAvailable$1$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.ra.core.auth.CardsAuthenticationManager$tokenAvailable$1$collect$1 r0 = new com.amazon.alexa.ra.core.auth.CardsAuthenticationManager$tokenAvailable$1$collect$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2c
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
        L2a:
            r4 = 0
            return r4
        L2c:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4b
        L30:
            kotlin.ResultKt.throwOnFailure(r6)
            com.amazon.alexa.ra.core.auth.CardsAuthenticationManager r4 = r4.this$0
            com.amazon.alexa.ra.core.features.user.UserSourceApi r4 = com.amazon.alexa.ra.core.auth.CardsAuthenticationManager.access$getUserSourceApi$p(r4)
            kotlinx.coroutines.flow.StateFlow r4 = r4.getAuthToken()
            com.amazon.alexa.ra.core.auth.CardsAuthenticationManager$tokenAvailable$1$collect$2 r6 = new com.amazon.alexa.ra.core.auth.CardsAuthenticationManager$tokenAvailable$1$collect$2
            r6.<init>()
            r0.label = r3
            java.lang.Object r4 = r4.collect(r6, r0)
            if (r4 != r1) goto L4b
            return r1
        L4b:
            io.ktor.util.PathKt$$ExternalSyntheticBUOutline0.m$1()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.auth.CardsAuthenticationManager$tokenAvailable$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<Boolean> getReplayCache() {
        return CollectionsKt.listOf(getValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.StateFlow
    public Boolean getValue() {
        UserSourceApi userSourceApi;
        userSourceApi = this.this$0.userSourceApi;
        return Boolean.valueOf(userSourceApi.getAuthToken().getValue() != null);
    }
}
