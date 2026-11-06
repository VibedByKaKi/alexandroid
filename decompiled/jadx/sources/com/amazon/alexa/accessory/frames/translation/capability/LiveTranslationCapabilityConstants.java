package com.amazon.alexa.accessory.frames.translation.capability;

import com.amazon.alexa.mobile.assistant.capabilities.localsearch.LocalSearchEngineCategories;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/capability/LiveTranslationCapabilityConstants;", "", "<init>", "()V", "NAMESPACE", "", "VERSION", "VOICE_STREAM_LEASE_PRIORITY", "", "Lcom/amazon/alexa/accessoryclient/client/accessories/VoiceStreamPriority;", "DIRECTIVE_START", "DIRECTIVE_STOP", "EVENT_SESSION_STARTED", "EVENT_SESSION_STOPPED", "EVENT_SESSION_START_FAILED", "EVENT_SESSION_STOP_FAILED", "ERROR_MESSAGE_UNSUPPORTED_DEVICE_SOFTWARE", "KEY_SESSION_ID", "KEY_INITIATOR_TYPE", "KEY_REASON", "KEY_TYPE", "KEY_ERROR", "KEY_MESSAGE", "InitiatorType", "StopReasonType", "StartErrorType", "StopErrorType", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LiveTranslationCapabilityConstants {

    @NotNull
    public static final String DIRECTIVE_START = "Start";

    @NotNull
    public static final String DIRECTIVE_STOP = "Stop";

    @NotNull
    public static final String ERROR_MESSAGE_UNSUPPORTED_DEVICE_SOFTWARE = "This device software version does not support Live Translation. Please update your device software to use this feature.";

    @NotNull
    public static final String EVENT_SESSION_STARTED = "SessionStarted";

    @NotNull
    public static final String EVENT_SESSION_START_FAILED = "SessionStartFailed";

    @NotNull
    public static final String EVENT_SESSION_STOPPED = "SessionStopped";

    @NotNull
    public static final String EVENT_SESSION_STOP_FAILED = "SessionStopFailed";

    @NotNull
    public static final LiveTranslationCapabilityConstants INSTANCE = new LiveTranslationCapabilityConstants();

    @NotNull
    public static final String KEY_ERROR = "error";

    @NotNull
    public static final String KEY_INITIATOR_TYPE = "initiatorType";

    @NotNull
    public static final String KEY_MESSAGE = "message";

    @NotNull
    public static final String KEY_REASON = "reason";

    @NotNull
    public static final String KEY_SESSION_ID = "sessionId";

    @NotNull
    public static final String KEY_TYPE = "type";

    @NotNull
    public static final String NAMESPACE = "Alexa.Translation.LiveSessionController";

    @NotNull
    public static final String VERSION = "1.0";
    public static final int VOICE_STREAM_LEASE_PRIORITY = 5;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/capability/LiveTranslationCapabilityConstants$InitiatorType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GESTURE", "VOICE", LocalSearchEngineCategories.APP, "toString", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InitiatorType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InitiatorType[] $VALUES;

        @NotNull
        private final String value;
        public static final InitiatorType GESTURE = new InitiatorType("GESTURE", 0, "GESTURE");
        public static final InitiatorType VOICE = new InitiatorType("VOICE", 1, "VOICE");
        public static final InitiatorType APP = new InitiatorType(LocalSearchEngineCategories.APP, 2, LocalSearchEngineCategories.APP);

        private static final /* synthetic */ InitiatorType[] $values() {
            return new InitiatorType[]{GESTURE, VOICE, APP};
        }

        static {
            InitiatorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private InitiatorType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<InitiatorType> getEntries() {
            return $ENTRIES;
        }

        public static InitiatorType valueOf(String str) {
            return (InitiatorType) Enum.valueOf(InitiatorType.class, str);
        }

        public static InitiatorType[] values() {
            return (InitiatorType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/capability/LiveTranslationCapabilityConstants$StartErrorType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SESSION_ALREADY_ACTIVE", "LANGUAGE_NOT_CONFIGURED", "PERMISSION_ERROR", "UNKNOWN", "toString", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StartErrorType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StartErrorType[] $VALUES;

        @NotNull
        private final String value;
        public static final StartErrorType SESSION_ALREADY_ACTIVE = new StartErrorType("SESSION_ALREADY_ACTIVE", 0, "SESSION_ALREADY_ACTIVE");
        public static final StartErrorType LANGUAGE_NOT_CONFIGURED = new StartErrorType("LANGUAGE_NOT_CONFIGURED", 1, "LANGUAGE_NOT_CONFIGURED");
        public static final StartErrorType PERMISSION_ERROR = new StartErrorType("PERMISSION_ERROR", 2, "PERMISSION_ERROR");
        public static final StartErrorType UNKNOWN = new StartErrorType("UNKNOWN", 3, "UNKNOWN");

        private static final /* synthetic */ StartErrorType[] $values() {
            return new StartErrorType[]{SESSION_ALREADY_ACTIVE, LANGUAGE_NOT_CONFIGURED, PERMISSION_ERROR, UNKNOWN};
        }

        static {
            StartErrorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private StartErrorType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<StartErrorType> getEntries() {
            return $ENTRIES;
        }

        public static StartErrorType valueOf(String str) {
            return (StartErrorType) Enum.valueOf(StartErrorType.class, str);
        }

        public static StartErrorType[] values() {
            return (StartErrorType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/capability/LiveTranslationCapabilityConstants$StopErrorType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INTERNAL_ERROR", "toString", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StopErrorType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StopErrorType[] $VALUES;
        public static final StopErrorType INTERNAL_ERROR = new StopErrorType("INTERNAL_ERROR", 0, "INTERNAL_ERROR");

        @NotNull
        private final String value;

        private static final /* synthetic */ StopErrorType[] $values() {
            return new StopErrorType[]{INTERNAL_ERROR};
        }

        static {
            StopErrorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private StopErrorType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<StopErrorType> getEntries() {
            return $ENTRIES;
        }

        public static StopErrorType valueOf(String str) {
            return (StopErrorType) Enum.valueOf(StopErrorType.class, str);
        }

        public static StopErrorType[] values() {
            return (StopErrorType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/capability/LiveTranslationCapabilityConstants$StopReasonType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "USER_LOCAL_STOP", "CLOUD_STOP", "DEVICE_DISCONNECTED", "LOCAL_INTERRUPTION", "TIMEOUT", "UNKNOWN", "toString", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StopReasonType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StopReasonType[] $VALUES;

        @NotNull
        private final String value;
        public static final StopReasonType USER_LOCAL_STOP = new StopReasonType("USER_LOCAL_STOP", 0, "USER_LOCAL_STOP");
        public static final StopReasonType CLOUD_STOP = new StopReasonType("CLOUD_STOP", 1, "CLOUD_STOP");
        public static final StopReasonType DEVICE_DISCONNECTED = new StopReasonType("DEVICE_DISCONNECTED", 2, "DEVICE_DISCONNECTED");
        public static final StopReasonType LOCAL_INTERRUPTION = new StopReasonType("LOCAL_INTERRUPTION", 3, "LOCAL_INTERRUPTION");
        public static final StopReasonType TIMEOUT = new StopReasonType("TIMEOUT", 4, "TIMEOUT");
        public static final StopReasonType UNKNOWN = new StopReasonType("UNKNOWN", 5, "UNKNOWN");

        private static final /* synthetic */ StopReasonType[] $values() {
            return new StopReasonType[]{USER_LOCAL_STOP, CLOUD_STOP, DEVICE_DISCONNECTED, LOCAL_INTERRUPTION, TIMEOUT, UNKNOWN};
        }

        static {
            StopReasonType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private StopReasonType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<StopReasonType> getEntries() {
            return $ENTRIES;
        }

        public static StopReasonType valueOf(String str) {
            return (StopReasonType) Enum.valueOf(StopReasonType.class, str);
        }

        public static StopReasonType[] values() {
            return (StopReasonType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.value;
        }
    }

    private LiveTranslationCapabilityConstants() {
    }
}
