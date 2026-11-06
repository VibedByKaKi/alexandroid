package com.amazon.alexa.assistant.foundation.metric.model;

import com.amazon.alexa.mobilytics.configuration.Constants;
import com.amazon.alexa.voiceui.VoiceModule;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/metric/model/TimeToActionComponent;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BOTTOM_SHEET", "CONVERSATION", "TIMELINE", "HOME_SCREEN_TO_VOICE_CHROME", "CONVERSATION_TO_VOICE_CHROME", "PERSONALITY_LATENCY", "PERSONALITY_VUPL", "STARTER_PILL", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TimeToActionComponent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TimeToActionComponent[] $VALUES;

    @NotNull
    private final String value;
    public static final TimeToActionComponent BOTTOM_SHEET = new TimeToActionComponent("BOTTOM_SHEET", 0, VoiceModule.BOTTOM_SHEET_PERMISSION_REQUESTER);
    public static final TimeToActionComponent CONVERSATION = new TimeToActionComponent("CONVERSATION", 1, "conversation");
    public static final TimeToActionComponent TIMELINE = new TimeToActionComponent("TIMELINE", 2, Constants.TIMELINE);
    public static final TimeToActionComponent HOME_SCREEN_TO_VOICE_CHROME = new TimeToActionComponent("HOME_SCREEN_TO_VOICE_CHROME", 3, "homeScreenToVoiceChrome");
    public static final TimeToActionComponent CONVERSATION_TO_VOICE_CHROME = new TimeToActionComponent("CONVERSATION_TO_VOICE_CHROME", 4, "conversationToVoiceChrome");
    public static final TimeToActionComponent PERSONALITY_LATENCY = new TimeToActionComponent("PERSONALITY_LATENCY", 5, "personalityLatency");
    public static final TimeToActionComponent PERSONALITY_VUPL = new TimeToActionComponent("PERSONALITY_VUPL", 6, "personalityVUPL");
    public static final TimeToActionComponent STARTER_PILL = new TimeToActionComponent("STARTER_PILL", 7, "starterPill");

    private static final /* synthetic */ TimeToActionComponent[] $values() {
        return new TimeToActionComponent[]{BOTTOM_SHEET, CONVERSATION, TIMELINE, HOME_SCREEN_TO_VOICE_CHROME, CONVERSATION_TO_VOICE_CHROME, PERSONALITY_LATENCY, PERSONALITY_VUPL, STARTER_PILL};
    }

    static {
        TimeToActionComponent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TimeToActionComponent(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<TimeToActionComponent> getEntries() {
        return $ENTRIES;
    }

    public static TimeToActionComponent valueOf(String str) {
        return (TimeToActionComponent) Enum.valueOf(TimeToActionComponent.class, str);
    }

    public static TimeToActionComponent[] values() {
        return (TimeToActionComponent[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
