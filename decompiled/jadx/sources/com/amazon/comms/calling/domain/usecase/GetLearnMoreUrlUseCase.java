package com.amazon.comms.calling.domain.usecase;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.domain.repo.EndPointRepository;
import com.amazon.comms.calling.domain.repo.RemoteConfigRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/GetLearnMoreUrlUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "", "", "remoteConfigRepository", "Lcom/amazon/comms/calling/domain/repo/RemoteConfigRepository;", "endPointRepository", "Lcom/amazon/comms/calling/domain/repo/EndPointRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/RemoteConfigRepository;Lcom/amazon/comms/calling/domain/repo/EndPointRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class GetLearnMoreUrlUseCase extends CoroutineUseCase<Unit, String> {

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final EndPointRepository endPointRepository;

    @NotNull
    private final RemoteConfigRepository remoteConfigRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetLearnMoreUrlUseCase(@NotNull RemoteConfigRepository remoteConfigRepository, @NotNull EndPointRepository endPointRepository, @DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        remoteConfigRepository.getClass();
        endPointRepository.getClass();
        coroutineDispatcher.getClass();
        this.remoteConfigRepository = remoteConfigRepository;
        this.endPointRepository = endPointRepository;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    @Nullable
    public Object execute(@NotNull Unit unit, @NotNull Continuation<? super String> continuation) {
        String retailEndpoint = this.endPointRepository.getRetailEndpoint();
        return (retailEndpoint == null || Intrinsics.areEqual(retailEndpoint, "")) ? this.remoteConfigRepository.getRemoteConfiguration("ExternalUrls.EnhancedProcessingLearnMore.PFM.${PFM}", "").toString() : BitVector$$ExternalSyntheticOutline0.m(retailEndpoint, this.remoteConfigRepository.getRemoteConfiguration("ExternalUrls.EnhancedProcessingLearnMore.Path", "").toString());
    }
}
