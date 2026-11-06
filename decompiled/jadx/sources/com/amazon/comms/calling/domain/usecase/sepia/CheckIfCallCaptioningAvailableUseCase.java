package com.amazon.comms.calling.domain.usecase.sepia;

import com.amazon.comms.calling.domain.repo.sepia.CallCaptioningRepository;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/sepia/CheckIfCallCaptioningAvailableUseCase;", "", "callCaptioningRepository", "Lcom/amazon/comms/calling/domain/repo/sepia/CallCaptioningRepository;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/sepia/CallCaptioningRepository;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "execute", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CheckIfCallCaptioningAvailableUseCase {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(CheckIfCallCaptioningAvailableUseCase.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final CallCaptioningRepository callCaptioningRepository;

    @Inject
    public CheckIfCallCaptioningAvailableUseCase(@NotNull CallCaptioningRepository callCaptioningRepository) {
        callCaptioningRepository.getClass();
        this.callCaptioningRepository = callCaptioningRepository;
        this.LOG = new CallingLogger();
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean execute() {
        if (this.callCaptioningRepository.isCallCaptioningAvailable()) {
            getLOG().i("[SCRIBE] scribe is available as an effect");
        }
        return this.callCaptioningRepository.isCallCaptioningAvailable();
    }
}
