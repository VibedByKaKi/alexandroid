package com.amazon.rtvi.alexa.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/rtvi/alexa/model/enums/ResumeReason;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLOUD_DIRECTIVE", "ON_DEVICE_INTELLIGENCE", "DEVICE_ERROR_RECOVERY", "USER_SPEECH_CLASSIFICATION", "USER_BUTTON_PRESS", "USER_GRAPHICAL_USER_INTERFACE", "USER_GESTURE", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ResumeReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResumeReason[] $VALUES;

    @JsonValue
    @NotNull
    private final String value;
    public static final ResumeReason CLOUD_DIRECTIVE = new ResumeReason("CLOUD_DIRECTIVE", 0, "CLOUD_DIRECTIVE");
    public static final ResumeReason ON_DEVICE_INTELLIGENCE = new ResumeReason("ON_DEVICE_INTELLIGENCE", 1, "ON_DEVICE_INTELLIGENCE");
    public static final ResumeReason DEVICE_ERROR_RECOVERY = new ResumeReason("DEVICE_ERROR_RECOVERY", 2, "DEVICE_ERROR_RECOVERY");
    public static final ResumeReason USER_SPEECH_CLASSIFICATION = new ResumeReason("USER_SPEECH_CLASSIFICATION", 3, "USER_SPEECH_CLASSIFICATION");
    public static final ResumeReason USER_BUTTON_PRESS = new ResumeReason("USER_BUTTON_PRESS", 4, "USER_BUTTON_PRESS");
    public static final ResumeReason USER_GRAPHICAL_USER_INTERFACE = new ResumeReason("USER_GRAPHICAL_USER_INTERFACE", 5, "USER_GRAPHICAL_USER_INTERFACE");
    public static final ResumeReason USER_GESTURE = new ResumeReason("USER_GESTURE", 6, "USER_GESTURE");

    private static final /* synthetic */ ResumeReason[] $values() {
        return new ResumeReason[]{CLOUD_DIRECTIVE, ON_DEVICE_INTELLIGENCE, DEVICE_ERROR_RECOVERY, USER_SPEECH_CLASSIFICATION, USER_BUTTON_PRESS, USER_GRAPHICAL_USER_INTERFACE, USER_GESTURE};
    }

    static {
        ResumeReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ResumeReason(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ResumeReason> getEntries() {
        return $ENTRIES;
    }

    public static ResumeReason valueOf(String str) {
        return (ResumeReason) Enum.valueOf(ResumeReason.class, str);
    }

    public static ResumeReason[] values() {
        return (ResumeReason[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
