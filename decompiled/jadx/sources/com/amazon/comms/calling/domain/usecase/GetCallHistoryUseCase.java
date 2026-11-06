package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.dependency.IoDispatcher;
import com.amazon.comms.calling.domain.repo.CallHistoryRepository;
import com.amazon.deecomms.calling.api.HistoricalCall;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/GetCallHistoryUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "", "", "Lcom/amazon/deecomms/calling/api/HistoricalCall;", "callHistoryRepository", "Lcom/amazon/comms/calling/domain/repo/CallHistoryRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/CallHistoryRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class GetCallHistoryUseCase extends CoroutineUseCase<Integer, List<? extends HistoricalCall>> {

    @NotNull
    private final CallHistoryRepository callHistoryRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetCallHistoryUseCase(@NotNull CallHistoryRepository callHistoryRepository, @IoDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        callHistoryRepository.getClass();
        coroutineDispatcher.getClass();
        this.callHistoryRepository = callHistoryRepository;
    }

    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    public /* bridge */ /* synthetic */ Object execute(Integer num, Continuation<? super List<? extends HistoricalCall>> continuation) {
        return execute(num.intValue(), (Continuation<? super List<HistoricalCall>>) continuation);
    }

    @Nullable
    public Object execute(int i, @NotNull Continuation<? super List<HistoricalCall>> continuation) {
        return this.callHistoryRepository.getCallHistory(i, continuation);
    }
}
