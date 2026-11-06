package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.dependency.IoDispatcher;
import com.amazon.comms.calling.domain.repo.RegisterSIPRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/ShutdownSipUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "", "registerSIPRepository", "Lcom/amazon/comms/calling/domain/repo/RegisterSIPRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/RegisterSIPRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ShutdownSipUseCase extends CoroutineUseCase<Unit, Unit> {

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final RegisterSIPRepository registerSIPRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ShutdownSipUseCase(@NotNull RegisterSIPRepository registerSIPRepository, @IoDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        registerSIPRepository.getClass();
        coroutineDispatcher.getClass();
        this.registerSIPRepository = registerSIPRepository;
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
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull kotlin.Unit r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof com.amazon.comms.calling.domain.usecase.ShutdownSipUseCase$execute$1
            if (r4 == 0) goto L13
            r4 = r5
            com.amazon.comms.calling.domain.usecase.ShutdownSipUseCase$execute$1 r4 = (com.amazon.comms.calling.domain.usecase.ShutdownSipUseCase$execute$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.label = r0
            goto L18
        L13:
            com.amazon.comms.calling.domain.usecase.ShutdownSipUseCase$execute$1 r4 = new com.amazon.comms.calling.domain.usecase.ShutdownSipUseCase$execute$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3e
        L29:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r3)
            r3 = 0
            return r3
        L30:
            kotlin.ResultKt.throwOnFailure(r5)
            com.amazon.comms.calling.domain.repo.RegisterSIPRepository r3 = r3.registerSIPRepository
            r4.label = r2
            java.lang.Object r3 = r3.shutDown(r4)
            if (r3 != r0) goto L3e
            return r0
        L3e:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.comms.calling.domain.usecase.ShutdownSipUseCase.execute(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
