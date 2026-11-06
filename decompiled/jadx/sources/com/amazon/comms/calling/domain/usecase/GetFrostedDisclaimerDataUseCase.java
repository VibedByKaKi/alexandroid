package com.amazon.comms.calling.domain.usecase;

import com.amazon.comms.calling.domain.model.CallModel;
import com.amazon.comms.calling.domain.model.FrostedEffectData;
import com.amazon.comms.calling.domain.repo.CallStateRepository;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.calling.foundation.features.FeatureCheck;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/GetFrostedDisclaimerDataUseCase;", "", "callStateRepository", "Lcom/amazon/comms/calling/domain/repo/CallStateRepository;", "featureGating", "Lcom/amazon/comms/calling/foundation/features/FeatureCheck;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/CallStateRepository;Lcom/amazon/comms/calling/foundation/features/FeatureCheck;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "execute", "Lcom/amazon/comms/calling/domain/model/FrostedEffectData;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class GetFrostedDisclaimerDataUseCase {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(GetFrostedDisclaimerDataUseCase.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final CallStateRepository callStateRepository;

    @NotNull
    private final FeatureCheck featureGating;

    @Inject
    public GetFrostedDisclaimerDataUseCase(@NotNull CallStateRepository callStateRepository, @NotNull FeatureCheck featureCheck) {
        callStateRepository.getClass();
        featureCheck.getClass();
        this.callStateRepository = callStateRepository;
        this.featureGating = featureCheck;
        this.LOG = new CallingLogger();
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final FrostedEffectData execute() {
        boolean z;
        CallModel currentCall = this.callStateRepository.getCurrentCall();
        boolean z2 = false;
        if (currentCall != null) {
            if (currentCall.isDropInCall() && this.featureGating.isFrostedEffectDisclaimerEnabled()) {
                z2 = true;
            }
            z = currentCall.isFrostedDisclaimerFinished();
            getLOG().i("frostedDisclaimerEnabled = " + z2 + " wasShowed = " + z);
        } else {
            z = false;
        }
        return new FrostedEffectData(z2, z);
    }
}
