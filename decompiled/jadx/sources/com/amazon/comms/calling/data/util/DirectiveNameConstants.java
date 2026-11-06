package com.amazon.comms.calling.data.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/comms/calling/data/util/DirectiveNameConstants;", "", "<init>", "()V", "BEGIN_CALL", "", "WARM_UP", "ACCEPT_CALL", "END_CALL", "IGNORE_CALL", "RING_CALL", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class DirectiveNameConstants {

    @NotNull
    public static final String ACCEPT_CALL = "AcceptCall";

    @NotNull
    public static final String BEGIN_CALL = "BeginCall";

    @NotNull
    public static final String END_CALL = "EndCall";

    @NotNull
    public static final String IGNORE_CALL = "IgnoreCall";

    @NotNull
    public static final DirectiveNameConstants INSTANCE = new DirectiveNameConstants();

    @NotNull
    public static final String RING_CALL = "RingCall";

    @NotNull
    public static final String WARM_UP = "Warmup";

    private DirectiveNameConstants() {
    }
}
