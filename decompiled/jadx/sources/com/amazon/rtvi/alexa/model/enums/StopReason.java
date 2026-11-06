package com.amazon.rtvi.alexa.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/rtvi/alexa/model/enums/StopReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLOUD_DIRECTIVE", "ON_DEVICE_INTELLIGENCE", "USER_SPEECH_CLASSIFICATION", "USER_BUTTON_PRESS", "USER_GRAPHICAL_USER_INTERFACE", "USER_GESTURE", "PAUSE_TIMEOUT", "SYSTEM_INTERRUPTION", "CAPTURE_SOURCE_ERROR", "DEVICE_ERROR", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StopReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StopReason[] $VALUES;

    @JsonValue
    @NotNull
    private final String value;
    public static final StopReason CLOUD_DIRECTIVE = new StopReason("CLOUD_DIRECTIVE", 0, "CLOUD_DIRECTIVE");
    public static final StopReason ON_DEVICE_INTELLIGENCE = new StopReason("ON_DEVICE_INTELLIGENCE", 1, "ON_DEVICE_INTELLIGENCE");
    public static final StopReason USER_SPEECH_CLASSIFICATION = new StopReason("USER_SPEECH_CLASSIFICATION", 2, "USER_SPEECH_CLASSIFICATION");
    public static final StopReason USER_BUTTON_PRESS = new StopReason("USER_BUTTON_PRESS", 3, "USER_BUTTON_PRESS");
    public static final StopReason USER_GRAPHICAL_USER_INTERFACE = new StopReason("USER_GRAPHICAL_USER_INTERFACE", 4, "USER_GRAPHICAL_USER_INTERFACE");
    public static final StopReason USER_GESTURE = new StopReason("USER_GESTURE", 5, "USER_GESTURE");
    public static final StopReason PAUSE_TIMEOUT = new StopReason("PAUSE_TIMEOUT", 6, "PAUSE_TIMEOUT");
    public static final StopReason SYSTEM_INTERRUPTION = new StopReason("SYSTEM_INTERRUPTION", 7, "SYSTEM_INTERRUPTION");
    public static final StopReason CAPTURE_SOURCE_ERROR = new StopReason("CAPTURE_SOURCE_ERROR", 8, "CAPTURE_SOURCE_ERROR");
    public static final StopReason DEVICE_ERROR = new StopReason("DEVICE_ERROR", 9, "DEVICE_ERROR");

    private static final /* synthetic */ StopReason[] $values() {
        return new StopReason[]{CLOUD_DIRECTIVE, ON_DEVICE_INTELLIGENCE, USER_SPEECH_CLASSIFICATION, USER_BUTTON_PRESS, USER_GRAPHICAL_USER_INTERFACE, USER_GESTURE, PAUSE_TIMEOUT, SYSTEM_INTERRUPTION, CAPTURE_SOURCE_ERROR, DEVICE_ERROR};
    }

    static {
        StopReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private StopReason(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<StopReason> getEntries() {
        return $ENTRIES;
    }

    public static StopReason valueOf(String str) {
        return (StopReason) Enum.valueOf(StopReason.class, str);
    }

    public static StopReason[] values() {
        return (StopReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
