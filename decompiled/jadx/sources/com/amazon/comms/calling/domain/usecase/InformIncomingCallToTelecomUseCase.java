package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.domain.repo.TelecomRepository;
import com.amazon.comms.calling.infrastructure.telecom.TelecomEvent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/InformIncomingCallToTelecomUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "Lcom/amazon/comms/calling/domain/usecase/InformIncomingCallToTelecomParameters;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomEvent;", "telecomRepository", "Lcom/amazon/comms/calling/domain/repo/TelecomRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/TelecomRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lcom/amazon/comms/calling/domain/usecase/InformIncomingCallToTelecomParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class InformIncomingCallToTelecomUseCase extends CoroutineUseCase<InformIncomingCallToTelecomParameters, Flow<? extends TelecomEvent>> {

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final TelecomRepository telecomRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public InformIncomingCallToTelecomUseCase(@NotNull TelecomRepository telecomRepository, @DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        telecomRepository.getClass();
        coroutineDispatcher.getClass();
        this.telecomRepository = telecomRepository;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    @Nullable
    public Object execute(@NotNull InformIncomingCallToTelecomParameters informIncomingCallToTelecomParameters, @NotNull Continuation<? super Flow<? extends TelecomEvent>> continuation) {
        return this.telecomRepository.addIncomingCall(informIncomingCallToTelecomParameters.getCallerName(), informIncomingCallToTelecomParameters.isVideoCall(), continuation);
    }
}
