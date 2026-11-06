package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.domain.repo.WarmupMediaStackRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0094@¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/WarmupMediaStackUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "", "", "warmupMediaStackRepository", "Lcom/amazon/comms/calling/domain/repo/WarmupMediaStackRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/WarmupMediaStackRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class WarmupMediaStackUseCase extends CoroutineUseCase<Integer, Unit> {

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final WarmupMediaStackRepository warmupMediaStackRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public WarmupMediaStackUseCase(@NotNull WarmupMediaStackRepository warmupMediaStackRepository, @DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        warmupMediaStackRepository.getClass();
        coroutineDispatcher.getClass();
        this.warmupMediaStackRepository = warmupMediaStackRepository;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    @Nullable
    public Object execute(@Nullable Integer num, @NotNull Continuation<? super Unit> continuation) {
        this.warmupMediaStackRepository.warmup(num != null ? num.intValue() : 10000);
        return Unit.INSTANCE;
    }
}
