package com.amazon.alexa.api.compat.model.assistant.subcomponent;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/model/assistant/subcomponent/UserPerceivedLatencyBundleKeys;", "", "<init>", "()V", "DIALOG_REQUEST_ID", "", "ESTIMATED_USER_PERCEIVED_LATENCY", "END_OF_SPEECH_OFFSET", "USER_PERCEIVED_LATENCY", "ALEXA_SPEECH_STARTED", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UserPerceivedLatencyBundleKeys {
    public static final int $stable = 0;

    @NotNull
    public static final String ALEXA_SPEECH_STARTED = "alexaSpeechStarted";

    @NotNull
    public static final String DIALOG_REQUEST_ID = "dialogRequestId";

    @NotNull
    public static final String END_OF_SPEECH_OFFSET = "endOfSpeechOffset";

    @NotNull
    public static final String ESTIMATED_USER_PERCEIVED_LATENCY = "estimatedUserPerceivedLatency";

    @NotNull
    public static final UserPerceivedLatencyBundleKeys INSTANCE = new UserPerceivedLatencyBundleKeys();

    @NotNull
    public static final String USER_PERCEIVED_LATENCY = "userPerceivedLatency";

    private UserPerceivedLatencyBundleKeys() {
    }
}
