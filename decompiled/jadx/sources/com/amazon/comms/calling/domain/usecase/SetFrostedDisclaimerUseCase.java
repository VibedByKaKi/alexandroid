package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.model.CallModel;
import com.amazon.comms.calling.domain.repo.CallStateRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/SetFrostedDisclaimerUseCase;", "", "callStateRepository", "Lcom/amazon/comms/calling/domain/repo/CallStateRepository;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/CallStateRepository;)V", "execute", "", "frostedDisclaimerShowed", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SetFrostedDisclaimerUseCase {

    @NotNull
    private final CallStateRepository callStateRepository;

    @Inject
    public SetFrostedDisclaimerUseCase(@NotNull CallStateRepository callStateRepository) {
        callStateRepository.getClass();
        this.callStateRepository = callStateRepository;
    }

    public final void execute(boolean frostedDisclaimerShowed) {
        CallModel currentCall = this.callStateRepository.getCurrentCall();
        if (currentCall != null) {
            this.callStateRepository.setCurrentCall(CallModel.copy$default(currentCall, null, null, null, null, null, false, false, false, false, null, false, false, 0L, 0L, 0L, 0L, null, null, null, false, false, null, false, frostedDisclaimerShowed, null, null, 58720255, null));
        }
    }
}
