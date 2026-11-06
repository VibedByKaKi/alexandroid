package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaAutoCaptureSessionStopReason;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "USER_LOCAL_STOP", "CLOUD_STOP", "TIMEOUT", "DEVICE_DISCONNECTED", "PRIVACY_MODE_ON", "ASSET_CAPTURE_FAILED", "LOCAL_INTERRUPTION", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaAutoCaptureSessionStopReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaAutoCaptureSessionStopReason[] $VALUES;
    public static final AlexaAutoCaptureSessionStopReason UNKNOWN = new AlexaAutoCaptureSessionStopReason("UNKNOWN", 0);
    public static final AlexaAutoCaptureSessionStopReason USER_LOCAL_STOP = new AlexaAutoCaptureSessionStopReason("USER_LOCAL_STOP", 1);
    public static final AlexaAutoCaptureSessionStopReason CLOUD_STOP = new AlexaAutoCaptureSessionStopReason("CLOUD_STOP", 2);
    public static final AlexaAutoCaptureSessionStopReason TIMEOUT = new AlexaAutoCaptureSessionStopReason("TIMEOUT", 3);
    public static final AlexaAutoCaptureSessionStopReason DEVICE_DISCONNECTED = new AlexaAutoCaptureSessionStopReason("DEVICE_DISCONNECTED", 4);
    public static final AlexaAutoCaptureSessionStopReason PRIVACY_MODE_ON = new AlexaAutoCaptureSessionStopReason("PRIVACY_MODE_ON", 5);
    public static final AlexaAutoCaptureSessionStopReason ASSET_CAPTURE_FAILED = new AlexaAutoCaptureSessionStopReason("ASSET_CAPTURE_FAILED", 6);
    public static final AlexaAutoCaptureSessionStopReason LOCAL_INTERRUPTION = new AlexaAutoCaptureSessionStopReason("LOCAL_INTERRUPTION", 7);

    private static final /* synthetic */ AlexaAutoCaptureSessionStopReason[] $values() {
        return new AlexaAutoCaptureSessionStopReason[]{UNKNOWN, USER_LOCAL_STOP, CLOUD_STOP, TIMEOUT, DEVICE_DISCONNECTED, PRIVACY_MODE_ON, ASSET_CAPTURE_FAILED, LOCAL_INTERRUPTION};
    }

    static {
        AlexaAutoCaptureSessionStopReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AlexaAutoCaptureSessionStopReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaAutoCaptureSessionStopReason> getEntries() {
        return $ENTRIES;
    }

    public static AlexaAutoCaptureSessionStopReason valueOf(String str) {
        return (AlexaAutoCaptureSessionStopReason) Enum.valueOf(AlexaAutoCaptureSessionStopReason.class, str);
    }

    public static AlexaAutoCaptureSessionStopReason[] values() {
        return (AlexaAutoCaptureSessionStopReason[]) $VALUES.clone();
    }
}
