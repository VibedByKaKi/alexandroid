package com.amazon.comms.calling.domain.usecase.sepia;

import com.amazon.comms.calling.domain.extensions.CallModelExtKt;
import com.amazon.comms.calling.domain.model.CallModel;
import com.amazon.comms.calling.domain.repo.CallStateRepository;
import com.amazon.comms.calling.foundation.features.FeatureCheck;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/CheckIfCallCaptioningEnabledUseCase;", "", "callStateRepository", "Lcom/amazon/comms/calling/domain/repo/CallStateRepository;", "featureCheck", "Lcom/amazon/comms/calling/foundation/features/FeatureCheck;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/CallStateRepository;Lcom/amazon/comms/calling/foundation/features/FeatureCheck;)V", "execute", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CheckIfCallCaptioningEnabledUseCase {

    @NotNull
    private final CallStateRepository callStateRepository;

    @NotNull
    private final FeatureCheck featureCheck;

    @Inject
    public CheckIfCallCaptioningEnabledUseCase(@NotNull CallStateRepository callStateRepository, @NotNull FeatureCheck featureCheck) {
        callStateRepository.getClass();
        featureCheck.getClass();
        this.callStateRepository = callStateRepository;
        this.featureCheck = featureCheck;
    }

    public final boolean execute() {
        boolean isCallCaptioningEnabled = this.featureCheck.isCallCaptioningEnabled();
        CallModel currentCall = this.callStateRepository.getCurrentCall();
        return currentCall != null && (CallModelExtKt.isA2A(currentCall) || CallModelExtKt.isAlexa(currentCall)) && isCallCaptioningEnabled && !currentCall.isGroupCall() && currentCall.isVideoCall();
    }
}
