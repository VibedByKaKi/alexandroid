package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.smarthomecameras.constants.ErrorConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaConnectingFailedReason;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "TIMEOUT", "NO_ALEXA_SERVICES_TO_CONNECT_TO", "NO_ALEXA_SERVICES_ACCOUNT_REGISTERED", "ALEXA_SERVICES_DISABLED", "CONNECTION_OBJECT_RELEASED", ErrorConstants.UNAUTHORIZED, "CANNOT_START_FOREGROUND_SERVICE_APP_IN_BACKGROUND", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaConnectingFailedReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaConnectingFailedReason[] $VALUES;
    public static final AlexaConnectingFailedReason UNKNOWN = new AlexaConnectingFailedReason("UNKNOWN", 0);
    public static final AlexaConnectingFailedReason TIMEOUT = new AlexaConnectingFailedReason("TIMEOUT", 1);
    public static final AlexaConnectingFailedReason NO_ALEXA_SERVICES_TO_CONNECT_TO = new AlexaConnectingFailedReason("NO_ALEXA_SERVICES_TO_CONNECT_TO", 2);
    public static final AlexaConnectingFailedReason NO_ALEXA_SERVICES_ACCOUNT_REGISTERED = new AlexaConnectingFailedReason("NO_ALEXA_SERVICES_ACCOUNT_REGISTERED", 3);
    public static final AlexaConnectingFailedReason ALEXA_SERVICES_DISABLED = new AlexaConnectingFailedReason("ALEXA_SERVICES_DISABLED", 4);
    public static final AlexaConnectingFailedReason CONNECTION_OBJECT_RELEASED = new AlexaConnectingFailedReason("CONNECTION_OBJECT_RELEASED", 5);
    public static final AlexaConnectingFailedReason UNAUTHORIZED = new AlexaConnectingFailedReason(ErrorConstants.UNAUTHORIZED, 6);
    public static final AlexaConnectingFailedReason CANNOT_START_FOREGROUND_SERVICE_APP_IN_BACKGROUND = new AlexaConnectingFailedReason("CANNOT_START_FOREGROUND_SERVICE_APP_IN_BACKGROUND", 7);

    private static final /* synthetic */ AlexaConnectingFailedReason[] $values() {
        return new AlexaConnectingFailedReason[]{UNKNOWN, TIMEOUT, NO_ALEXA_SERVICES_TO_CONNECT_TO, NO_ALEXA_SERVICES_ACCOUNT_REGISTERED, ALEXA_SERVICES_DISABLED, CONNECTION_OBJECT_RELEASED, UNAUTHORIZED, CANNOT_START_FOREGROUND_SERVICE_APP_IN_BACKGROUND};
    }

    static {
        AlexaConnectingFailedReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AlexaConnectingFailedReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaConnectingFailedReason> getEntries() {
        return $ENTRIES;
    }

    public static AlexaConnectingFailedReason valueOf(String str) {
        return (AlexaConnectingFailedReason) Enum.valueOf(AlexaConnectingFailedReason.class, str);
    }

    public static AlexaConnectingFailedReason[] values() {
        return (AlexaConnectingFailedReason[]) $VALUES.clone();
    }
}
