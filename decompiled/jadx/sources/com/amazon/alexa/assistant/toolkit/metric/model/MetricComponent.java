package com.amazon.alexa.assistant.toolkit.metric.model;

import com.amazon.alexa.mobile.assistant.client.auth.RejectedTokenRefreshKt;
import com.amazon.alexa.voice.handsfree.settings.providers.BenefitsEntitlementProvider;
import com.amazon.alexa.voice.ui.onedesign.constants.Constants;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b'\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricComponent;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALERTS", "CAPABILITY", "AUDIOPLAYER", "DAVS", "DRM", "PRESENTATION_MEDIA", "RESOURCES_BUNDLE", "SPEECH_RECOGNIZER", "SPEECH_SYNTHESIZER", "WAKE_WORD_SUPPRESSION", "WAKE_WORD_RECOGNIZER", "TRANSPORT", "TRANSPORT_LAYER", "VOICE_SESSION", "ASSISTANT_BOOTSTRAP", "GEOLOCATION", "LINK_LAUNCHER", "AUTHORIZATION", "AUTHORIZATION_PREVIEW", "ENTITLEMENT", "INTERACTION_MODEL", "HYPERLOOP", "USER_PERCEIVED_LATENCY", "USER_PERCEIVED_LATENCY_VISUAL", "USER_PERCEIVED_FAULT", Constants.Keys.INPUT_TEXT_KEY, "VOICE_CHAT", "EXTERNAL_MEDIA_PLAYER", "APPLICATION_STATE_TRACKER", "KEYCHAIN_ACCESS", "CONVERSATION", "PROFILE", "TOOLKIT_LAYER", "SESSION_LAYER", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MetricComponent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MetricComponent[] $VALUES;

    @NotNull
    private final String value;
    public static final MetricComponent ALERTS = new MetricComponent("ALERTS", 0, "alerts");
    public static final MetricComponent CAPABILITY = new MetricComponent("CAPABILITY", 1, "capability");
    public static final MetricComponent AUDIOPLAYER = new MetricComponent("AUDIOPLAYER", 2, "audioplayer");
    public static final MetricComponent DAVS = new MetricComponent("DAVS", 3, "davs");
    public static final MetricComponent DRM = new MetricComponent("DRM", 4, "drm");
    public static final MetricComponent PRESENTATION_MEDIA = new MetricComponent("PRESENTATION_MEDIA", 5, "presentationMedia");
    public static final MetricComponent RESOURCES_BUNDLE = new MetricComponent("RESOURCES_BUNDLE", 6, "resourcesBundle");
    public static final MetricComponent SPEECH_RECOGNIZER = new MetricComponent("SPEECH_RECOGNIZER", 7, "speechRecognizer");
    public static final MetricComponent SPEECH_SYNTHESIZER = new MetricComponent("SPEECH_SYNTHESIZER", 8, "speechSynthesizer");
    public static final MetricComponent WAKE_WORD_SUPPRESSION = new MetricComponent("WAKE_WORD_SUPPRESSION", 9, "w[REDACTED:AWS_ACCESS_KEY]");
    public static final MetricComponent WAKE_WORD_RECOGNIZER = new MetricComponent("WAKE_WORD_RECOGNIZER", 10, "wakeWordRecognizer");
    public static final MetricComponent TRANSPORT = new MetricComponent("TRANSPORT", 11, "transport");
    public static final MetricComponent TRANSPORT_LAYER = new MetricComponent("TRANSPORT_LAYER", 12, "transportLayer");
    public static final MetricComponent VOICE_SESSION = new MetricComponent("VOICE_SESSION", 13, "voiceSession");
    public static final MetricComponent ASSISTANT_BOOTSTRAP = new MetricComponent("ASSISTANT_BOOTSTRAP", 14, "assistantBootstrap");
    public static final MetricComponent GEOLOCATION = new MetricComponent("GEOLOCATION", 15, "geolocation");
    public static final MetricComponent LINK_LAUNCHER = new MetricComponent("LINK_LAUNCHER", 16, "linkLauncher");
    public static final MetricComponent AUTHORIZATION = new MetricComponent("AUTHORIZATION", 17, RejectedTokenRefreshKt.AUTH_TOKEN_REFRESH_COMPONENT);
    public static final MetricComponent AUTHORIZATION_PREVIEW = new MetricComponent("AUTHORIZATION_PREVIEW", 18, "authorizationPreview");
    public static final MetricComponent ENTITLEMENT = new MetricComponent("ENTITLEMENT", 19, BenefitsEntitlementProvider.URI_PATH);
    public static final MetricComponent INTERACTION_MODEL = new MetricComponent("INTERACTION_MODEL", 20, "interactionModel");
    public static final MetricComponent HYPERLOOP = new MetricComponent("HYPERLOOP", 21, "hyperloop");
    public static final MetricComponent USER_PERCEIVED_LATENCY = new MetricComponent("USER_PERCEIVED_LATENCY", 22, "userPerceivedLatency");
    public static final MetricComponent USER_PERCEIVED_LATENCY_VISUAL = new MetricComponent("USER_PERCEIVED_LATENCY_VISUAL", 23, "assistant_conversation");
    public static final MetricComponent USER_PERCEIVED_FAULT = new MetricComponent("USER_PERCEIVED_FAULT", 24, "userPerceivedFault");
    public static final MetricComponent INPUT_TEXT = new MetricComponent(Constants.Keys.INPUT_TEXT_KEY, 25, "inputText");
    public static final MetricComponent VOICE_CHAT = new MetricComponent("VOICE_CHAT", 26, "voiceChat");
    public static final MetricComponent EXTERNAL_MEDIA_PLAYER = new MetricComponent("EXTERNAL_MEDIA_PLAYER", 27, "externalMediaPlayer");
    public static final MetricComponent APPLICATION_STATE_TRACKER = new MetricComponent("APPLICATION_STATE_TRACKER", 28, "applicationStateTracker");
    public static final MetricComponent KEYCHAIN_ACCESS = new MetricComponent("KEYCHAIN_ACCESS", 29, "keychainAccess");
    public static final MetricComponent CONVERSATION = new MetricComponent("CONVERSATION", 30, "conversation");
    public static final MetricComponent PROFILE = new MetricComponent("PROFILE", 31, Scopes.PROFILE);
    public static final MetricComponent TOOLKIT_LAYER = new MetricComponent("TOOLKIT_LAYER", 32, "toolkitLayer");
    public static final MetricComponent SESSION_LAYER = new MetricComponent("SESSION_LAYER", 33, "sessionLayer");

    private static final /* synthetic */ MetricComponent[] $values() {
        return new MetricComponent[]{ALERTS, CAPABILITY, AUDIOPLAYER, DAVS, DRM, PRESENTATION_MEDIA, RESOURCES_BUNDLE, SPEECH_RECOGNIZER, SPEECH_SYNTHESIZER, WAKE_WORD_SUPPRESSION, WAKE_WORD_RECOGNIZER, TRANSPORT, TRANSPORT_LAYER, VOICE_SESSION, ASSISTANT_BOOTSTRAP, GEOLOCATION, LINK_LAUNCHER, AUTHORIZATION, AUTHORIZATION_PREVIEW, ENTITLEMENT, INTERACTION_MODEL, HYPERLOOP, USER_PERCEIVED_LATENCY, USER_PERCEIVED_LATENCY_VISUAL, USER_PERCEIVED_FAULT, INPUT_TEXT, VOICE_CHAT, EXTERNAL_MEDIA_PLAYER, APPLICATION_STATE_TRACKER, KEYCHAIN_ACCESS, CONVERSATION, PROFILE, TOOLKIT_LAYER, SESSION_LAYER};
    }

    static {
        MetricComponent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MetricComponent(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<MetricComponent> getEntries() {
        return $ENTRIES;
    }

    public static MetricComponent valueOf(String str) {
        return (MetricComponent) Enum.valueOf(MetricComponent.class, str);
    }

    public static MetricComponent[] values() {
        return (MetricComponent[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
