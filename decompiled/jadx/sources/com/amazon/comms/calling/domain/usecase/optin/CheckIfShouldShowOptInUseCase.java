package com.amazon.comms.calling.domain.usecase.optin;

import com.amazon.comms.calling.data.extensions.BooleanExtKt;
import com.amazon.comms.calling.domain.extensions.BeginCallPayloadExtKt;
import com.amazon.comms.calling.domain.model.BeginCallPayload;
import com.amazon.comms.calling.domain.model.CallModel;
import com.amazon.comms.calling.domain.repo.CallStateRepository;
import com.amazon.comms.calling.presentation.ui.OptInFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/optin/CheckIfShouldShowOptInUseCase;", "", "callStateRepository", "Lcom/amazon/comms/calling/domain/repo/CallStateRepository;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/CallStateRepository;)V", "execute", "", "beginCallPayload", "Lcom/amazon/comms/calling/domain/model/BeginCallPayload;", OptInFragment.KEY_OUTGOING_CALL, "", "shouldShowOptIn", "Lkotlin/Function1;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CheckIfShouldShowOptInUseCase {

    @NotNull
    private final CallStateRepository callStateRepository;

    @Inject
    public CheckIfShouldShowOptInUseCase(@NotNull CallStateRepository callStateRepository) {
        callStateRepository.getClass();
        this.callStateRepository = callStateRepository;
    }

    public final void execute(@Nullable BeginCallPayload beginCallPayload, boolean isOutgoingCall, @NotNull Function1<? super Boolean, Unit> shouldShowOptIn) {
        shouldShowOptIn.getClass();
        if (isOutgoingCall) {
            shouldShowOptIn.invoke(Boolean.valueOf(beginCallPayload != null && BooleanExtKt.ifNullFalse(BeginCallPayloadExtKt.isOptInRequired(beginCallPayload))));
            return;
        }
        CallModel currentCall = this.callStateRepository.getCurrentCall();
        if (currentCall != null) {
            shouldShowOptIn.invoke(Boolean.valueOf(currentCall.isOptInRequired()));
        } else {
            shouldShowOptIn.invoke(Boolean.FALSE);
        }
    }
}
