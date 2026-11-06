package com.amazon.alexa.api.compat.model.assistant.subcomponent;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.metrics.VisualShareErrorType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/api/compat/model/assistant/subcomponent/AlexaEventBundleKeys;", "", "<init>", "()V", "NAMESPACE", "", "NAME", "MESSAGE_ID", VisualShareErrorType.PAYLOAD, "CORRELATION_TOKEN", "DIALOG_REQUEST_ID", "PAYLOAD_VERSION", "PRESENTATION_URI", "UNIVERSAL_PRIVACY_CODE", "EVENT_CORRELATION_TOKEN", "INSTANCE", "ENDPOINT_ID", "EVENT_REQUIRES_CONTEXTS", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaEventBundleKeys {
    public static final int $stable = 0;

    @NotNull
    public static final String CORRELATION_TOKEN = "correlationToken";

    @NotNull
    public static final String DIALOG_REQUEST_ID = "dialogRequestId";

    @NotNull
    public static final String ENDPOINT_ID = "endpointId";

    @NotNull
    public static final String EVENT_CORRELATION_TOKEN = "eventCorrelationToken";

    @NotNull
    public static final String EVENT_REQUIRES_CONTEXTS = "eventRequiresContexts";

    @NotNull
    public static final AlexaEventBundleKeys INSTANCE = new AlexaEventBundleKeys();

    @NotNull
    public static final String INSTANCE = "instance";

    @NotNull
    public static final String MESSAGE_ID = "messageId";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String NAMESPACE = "namespace";

    @NotNull
    public static final String PAYLOAD = "payload";

    @NotNull
    public static final String PAYLOAD_VERSION = "payloadVersion";

    @NotNull
    public static final String PRESENTATION_URI = "presentationUri";

    @NotNull
    public static final String UNIVERSAL_PRIVACY_CODE = "universalPrivacyCode";

    private AlexaEventBundleKeys() {
    }
}
