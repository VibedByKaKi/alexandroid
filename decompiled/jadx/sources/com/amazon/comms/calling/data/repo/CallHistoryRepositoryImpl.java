package com.amazon.comms.calling.data.repo;

import com.amazon.comms.calling.data.network.CallHistoryProvider;
import com.amazon.comms.calling.domain.repo.CallHistoryRepository;
import com.amazon.deecomms.calling.api.HistoricalCall;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0096@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/data/repo/CallHistoryRepositoryImpl;", "Lcom/amazon/comms/calling/domain/repo/CallHistoryRepository;", "callHistoryProvider", "Lcom/amazon/comms/calling/data/network/CallHistoryProvider;", "<init>", "(Lcom/amazon/comms/calling/data/network/CallHistoryProvider;)V", "getCallHistory", "", "Lcom/amazon/deecomms/calling/api/HistoricalCall;", "numberOfEntries", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallHistoryRepositoryImpl implements CallHistoryRepository {

    @NotNull
    private final CallHistoryProvider callHistoryProvider;

    @Inject
    public CallHistoryRepositoryImpl(@NotNull CallHistoryProvider callHistoryProvider) {
        callHistoryProvider.getClass();
        this.callHistoryProvider = callHistoryProvider;
    }

    @Override // com.amazon.comms.calling.domain.repo.CallHistoryRepository
    @Nullable
    public Object getCallHistory(int i, @NotNull Continuation<? super List<HistoricalCall>> continuation) {
        return this.callHistoryProvider.getCallHistory(i, continuation);
    }
}
