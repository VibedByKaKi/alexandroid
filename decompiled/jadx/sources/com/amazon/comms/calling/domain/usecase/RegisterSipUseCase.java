package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.domain.repo.RegisterSIPRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/RegisterSipUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "Lcom/amazon/comms/calling/domain/usecase/RegisterSipParams;", "", "registerSIPRepository", "Lcom/amazon/comms/calling/domain/repo/RegisterSIPRepository;", "utils", "Lcom/amazon/comms/calling/data/util/Utils;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/RegisterSIPRepository;Lcom/amazon/comms/calling/data/util/Utils;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lcom/amazon/comms/calling/domain/usecase/RegisterSipParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RegisterSipUseCase extends CoroutineUseCase<RegisterSipParams, Unit> {

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final RegisterSIPRepository registerSIPRepository;

    @NotNull
    private final Utils utils;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public RegisterSipUseCase(@NotNull RegisterSIPRepository registerSIPRepository, @NotNull Utils utils, @DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        registerSIPRepository.getClass();
        utils.getClass();
        coroutineDispatcher.getClass();
        this.registerSIPRepository = registerSIPRepository;
        this.utils = utils;
        this.dispatcher = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull com.amazon.comms.calling.domain.usecase.RegisterSipParams r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.comms.calling.domain.usecase.RegisterSipUseCase$execute$1
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.comms.calling.domain.usecase.RegisterSipUseCase$execute$1 r0 = (com.amazon.comms.calling.domain.usecase.RegisterSipUseCase$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.amazon.comms.calling.domain.usecase.RegisterSipUseCase$execute$1 r0 = new com.amazon.comms.calling.domain.usecase.RegisterSipUseCase$execute$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L62
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L30:
            kotlin.ResultKt.throwOnFailure(r6)
            com.amazon.comms.calling.data.util.Utils r6 = r4.utils
            boolean r6 = r6.shouldSaveBattery()
            if (r6 == 0) goto L4b
            boolean r6 = r5.isOutgoingCall()
            if (r6 != 0) goto L4b
            java.lang.String r6 = r5.getCallToken()
            if (r6 == 0) goto L48
            goto L4b
        L48:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L4b:
            com.amazon.comms.calling.domain.repo.RegisterSIPRepository r4 = r4.registerSIPRepository
            com.amazon.comms.calling.domain.model.SipRegistrationReason r6 = r5.getSipRegistrationReason()
            java.lang.String r2 = r5.getCallToken()
            java.lang.String r5 = r5.getCallTokenVersion()
            r0.label = r3
            java.lang.Object r4 = r4.registerSIP(r6, r2, r5, r0)
            if (r4 != r1) goto L62
            return r1
        L62:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.domain.usecase.RegisterSipUseCase.execute(com.amazon.comms.calling.domain.usecase.RegisterSipParams, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
