package com.amazon.alexa.assistant.session.serverBoundMessage;

import com.amazon.alexa.assistant.foundation.model.CapabilityAgent;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nServerBoundMessageAggregator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerBoundMessageAggregator.kt\ncom/amazon/alexa/assistant/session/serverBoundMessage/ServerBoundMessageAggregator$subscribeToMessages$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,368:1\n1869#2,2:369\n1563#2:371\n1634#2,3:372\n1869#2,2:375\n*S KotlinDebug\n*F\n+ 1 ServerBoundMessageAggregator.kt\ncom/amazon/alexa/assistant/session/serverBoundMessage/ServerBoundMessageAggregator$subscribeToMessages$2\n*L\n219#1:369,2\n224#1:371\n224#1:372,3\n231#1:375,2\n*E\n"})
/* loaded from: classes17.dex */
public final class ServerBoundMessageAggregator$subscribeToMessages$2<T> implements FlowCollector {
    final /* synthetic */ ServerBoundMessageAggregator this$0;

    public ServerBoundMessageAggregator$subscribeToMessages$2(ServerBoundMessageAggregator serverBoundMessageAggregator) {
        this.this$0 = serverBoundMessageAggregator;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9 A[LOOP:0: B:11:0x00a3->B:13:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.util.List<? extends com.amazon.alexa.assistant.foundation.model.CapabilityAgent> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator$subscribeToMessages$2$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator$subscribeToMessages$2$emit$1 r0 = (com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator$subscribeToMessages$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator$subscribeToMessages$2$emit$1 r0 = new com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator$subscribeToMessages$2$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r0.L$0
            com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator$subscribeToMessages$2 r0 = (com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator$subscribeToMessages$2) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L9b
        L35:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r6)
            r6 = 0
            return r6
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator r8 = r6.this$0
            java.util.List r8 = com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator.access$getMessageSubscriptionJobs$p(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L4b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r8.next()
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r4 = 0
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r2, r4, r3, r4)
            goto L4b
        L5c:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r4)
            r2.<init>(r4)
            java.util.Iterator r7 = r7.iterator()
        L72:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r7.next()
            com.amazon.alexa.assistant.foundation.model.CapabilityAgent r4 = (com.amazon.alexa.assistant.foundation.model.CapabilityAgent) r4
            com.amazon.alexa.assistant.toolkit.capability.CapabilityAgentServerBoundMessageSource r5 = new com.amazon.alexa.assistant.toolkit.capability.CapabilityAgentServerBoundMessageSource
            r5.<init>(r4)
            r2.add(r5)
            goto L72
        L87:
            com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator r7 = r6.this$0
            r0.L$0 = r6
            r0.L$1 = r8
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r7 = com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator.access$indexSourcesByCapabilityName(r7, r2, r0)
            if (r7 != r1) goto L98
            return r1
        L98:
            r0 = r6
            r7 = r8
            r6 = r2
        L9b:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator r8 = r0.this$0
            java.util.Iterator r6 = r6.iterator()
        La3:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lb9
            java.lang.Object r1 = r6.next()
            com.amazon.alexa.assistant.toolkit.serverBoundMessage.ServerBoundMessageSource r1 = (com.amazon.alexa.assistant.toolkit.serverBoundMessage.ServerBoundMessageSource) r1
            java.util.List r1 = com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator.access$subscribeTo(r8, r1)
            java.util.Collection r1 = (java.util.Collection) r1
            r7.addAll(r1)
            goto La3
        Lb9:
            com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator r6 = r0.this$0
            com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator.access$setMessageSubscriptionJobs$p(r6, r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.assistant.session.serverBoundMessage.ServerBoundMessageAggregator$subscribeToMessages$2.emit(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return emit((List<? extends CapabilityAgent>) obj, (Continuation<? super Unit>) continuation);
    }
}
