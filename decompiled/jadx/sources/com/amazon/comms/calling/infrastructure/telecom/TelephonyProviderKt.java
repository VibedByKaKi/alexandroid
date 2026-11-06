package com.amazon.comms.calling.infrastructure.telecom;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"convertStateToTelephonyState", "Lcom/amazon/comms/calling/infrastructure/telecom/TelephonyState;", "state", "", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class TelephonyProviderKt {
    @NotNull
    public static final TelephonyState convertStateToTelephonyState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? TelephonyState.IDLE : TelephonyState.ACTIVE : TelephonyState.RINGING : TelephonyState.IDLE;
    }
}
