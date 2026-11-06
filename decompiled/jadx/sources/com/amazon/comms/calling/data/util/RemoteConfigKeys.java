package com.amazon.comms.calling.data.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/data/util/RemoteConfigKeys;", "", "<init>", "()V", "CALL_RATING_MIN_CALL_DURATION", "", "CALL_RATING_CALL_FREQUENCY", com.amazon.deecomms.common.Constants.CALL_RATING_SCREEN_DURATION, "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RemoteConfigKeys {

    @NotNull
    public static final String CALL_RATING_CALL_FREQUENCY = "CallRating.ShowPerCallFrequency";

    @NotNull
    public static final String CALL_RATING_MIN_CALL_DURATION = "CallRating.MinCallDurationSeconds";

    @NotNull
    public static final String CALL_RATING_SCREEN_DURATION = "CallRating.MaxScreenDurationSeconds";

    @NotNull
    public static final RemoteConfigKeys INSTANCE = new RemoteConfigKeys();

    private RemoteConfigKeys() {
    }
}
