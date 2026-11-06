package com.amazon.comms.calling.domain.usecase.audio;

import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.domain.repo.AudioManagementRepository;
import com.amazon.comms.calling.domain.usecase.CoroutineUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/audio/ResetAudioUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "", "audioManagementRepository", "Lcom/amazon/comms/calling/domain/repo/AudioManagementRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/AudioManagementRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class ResetAudioUseCase extends CoroutineUseCase<Unit, Unit> {

    @NotNull
    private final AudioManagementRepository audioManagementRepository;

    @NotNull
    private final CoroutineDispatcher dispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ResetAudioUseCase(@NotNull AudioManagementRepository audioManagementRepository, @DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        audioManagementRepository.getClass();
        coroutineDispatcher.getClass();
        this.audioManagementRepository = audioManagementRepository;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    @Nullable
    public Object execute(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) {
        this.audioManagementRepository.resetAudioStates();
        return Unit.INSTANCE;
    }
}
