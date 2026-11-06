package com.amazon.comms.calling.domain.usecase.pcc;

import com.amazon.comms.calling.domain.model.pcc.PCCEvents;
import com.amazon.comms.calling.infrastructure.telecom.TelephonyState;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"mapCallStateToPCCEvent", "Lcom/amazon/comms/calling/domain/model/pcc/PCCEvents;", "state", "Lcom/amazon/comms/calling/infrastructure/telecom/TelephonyState;", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RegisterPhoneCallControllerUseCaseKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TelephonyState.values().length];
            try {
                iArr[TelephonyState.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TelephonyState.RINGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TelephonyState.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final PCCEvents mapCallStateToPCCEvent(@NotNull TelephonyState telephonyState) {
        telephonyState.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[telephonyState.ordinal()];
        if (i == 1) {
            return PCCEvents.CallActivated;
        }
        if (i == 2) {
            return PCCEvents.InboundRingingStarted;
        }
        if (i == 3) {
            return PCCEvents.CallTerminated;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
