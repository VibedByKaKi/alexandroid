package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.dependency.IoDispatcher;
import com.amazon.comms.calling.domain.repo.CallActionRepository;
import com.amazon.comms.calling.domain.repo.CallStateRepository;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0094@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/RejectCallUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "", "", "callActionRepository", "Lcom/amazon/comms/calling/domain/repo/CallActionRepository;", "callStateRepository", "Lcom/amazon/comms/calling/domain/repo/CallStateRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/CallActionRepository;Lcom/amazon/comms/calling/domain/repo/CallStateRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "execute", "parameters", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RejectCallUseCase extends CoroutineUseCase<String, Unit> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(RejectCallUseCase.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final CallActionRepository callActionRepository;

    @NotNull
    private final CallStateRepository callStateRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public RejectCallUseCase(@NotNull CallActionRepository callActionRepository, @NotNull CallStateRepository callStateRepository, @IoDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        callActionRepository.getClass();
        callStateRepository.getClass();
        coroutineDispatcher.getClass();
        this.callActionRepository = callActionRepository;
        this.callStateRepository = callStateRepository;
        this.LOG = new CallingLogger();
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r5.rejectCall(r6, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        if (r7.rejectCall(r6, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(@org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.comms.calling.domain.usecase.RejectCallUseCase$execute$1
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.comms.calling.domain.usecase.RejectCallUseCase$execute$1 r0 = (com.amazon.comms.calling.domain.usecase.RejectCallUseCase$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.domain.usecase.RejectCallUseCase$execute$1 r0 = new com.amazon.comms.calling.domain.usecase.RejectCallUseCase$execute$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            com.amazon.comms.calling.domain.usecase.RejectCallUseCase r5 = (com.amazon.comms.calling.domain.usecase.RejectCallUseCase) r5
            kotlin.ResultKt.throwOnFailure(r7)
            goto L7e
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r5)
            r5 = 0
            return r5
        L37:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L59
        L3b:
            kotlin.ResultKt.throwOnFailure(r7)
            com.amazon.comms.calling.domain.repo.CallStateRepository r7 = r5.callStateRepository
            com.amazon.deecomms.calling.api.enums.CallState r2 = com.amazon.deecomms.calling.api.enums.CallState.INACTIVE
            r7.setCallState(r2)
            if (r6 == 0) goto L5c
            int r7 = r6.length()
            if (r7 != 0) goto L4e
            goto L5c
        L4e:
            com.amazon.comms.calling.domain.repo.CallActionRepository r5 = r5.callActionRepository
            r0.label = r4
            java.lang.Object r5 = r5.rejectCall(r6, r0)
            if (r5 != r1) goto L59
            goto L7d
        L59:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L5c:
            com.amazon.comms.calling.domain.repo.CallStateRepository r6 = r5.callStateRepository
            com.amazon.comms.calling.domain.model.CallModel r6 = r6.getCurrentCall()
            if (r6 == 0) goto L81
            com.amazon.comms.log.CommsLogger r7 = r5.getLOG()
            java.lang.String r2 = "reject call"
            r7.i(r2)
            com.amazon.comms.calling.domain.repo.CallActionRepository r7 = r5.callActionRepository
            java.lang.String r6 = r6.getCallId()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r5 = r7.rejectCall(r6, r0)
            if (r5 != r1) goto L7e
        L7d:
            return r1
        L7e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L81:
            com.amazon.comms.log.CommsLogger r5 = r5.getLOG()
            java.lang.String r6 = "throw NoCallToRejectException"
            r5.i(r6)
            com.amazon.comms.calling.domain.exceptions.NoCallToEndException r5 = new com.amazon.comms.calling.domain.exceptions.NoCallToEndException
            java.lang.String r6 = "Call is interrupted while no call exists yet."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.domain.usecase.RejectCallUseCase.execute(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
