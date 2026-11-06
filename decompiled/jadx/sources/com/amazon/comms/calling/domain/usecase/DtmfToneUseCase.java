package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.domain.repo.DtmfRepository;
import com.amazon.comms.calling.domain.usecase.DtmfUseCaseData;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/DtmfToneUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "Lcom/amazon/comms/calling/domain/usecase/DtmfUseCaseData;", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "dtmfRepository", "Lcom/amazon/comms/calling/domain/repo/DtmfRepository;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/amazon/comms/calling/domain/repo/DtmfRepository;)V", "getDtmfRepository", "()Lcom/amazon/comms/calling/domain/repo/DtmfRepository;", "execute", "parameters", "(Lcom/amazon/comms/calling/domain/usecase/DtmfUseCaseData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class DtmfToneUseCase extends CoroutineUseCase<DtmfUseCaseData, Unit> {

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final DtmfRepository dtmfRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public DtmfToneUseCase(@DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull DtmfRepository dtmfRepository) {
        super(coroutineDispatcher);
        coroutineDispatcher.getClass();
        dtmfRepository.getClass();
        this.dispatcher = coroutineDispatcher;
        this.dtmfRepository = dtmfRepository;
    }

    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    @Nullable
    public Object execute(@NotNull DtmfUseCaseData dtmfUseCaseData, @NotNull Continuation<? super Unit> continuation) {
        if (dtmfUseCaseData instanceof DtmfUseCaseData.PlayDtmf) {
            DtmfRepository dtmfRepository = this.dtmfRepository;
            DtmfUseCaseData.PlayDtmf playDtmf = (DtmfUseCaseData.PlayDtmf) dtmfUseCaseData;
            dtmfRepository.playDTMFTone(playDtmf.getTone());
            dtmfRepository.sendDTMFTone(playDtmf.getTone());
        } else {
            if (!(dtmfUseCaseData instanceof DtmfUseCaseData.StopDtmf)) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            this.dtmfRepository.stopTones();
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final DtmfRepository getDtmfRepository() {
        return this.dtmfRepository;
    }
}
