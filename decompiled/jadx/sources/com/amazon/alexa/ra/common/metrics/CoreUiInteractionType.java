package com.amazon.alexa.ra.common.metrics;

import com.amazon.alexa.voice.ui.suggestions.SuggestionAction;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/common/metrics/CoreUiInteractionType;", "", "<init>", "(Ljava/lang/String;I)V", "PAGE_VIEW", "CLICK", "VIEW", "APP_START", "SLIDER", "DEEP_LINK_CLICK", SuggestionAction.UTTERANCE, "LONG_PRESS", "COMMS_MESSAGE", "COMMS_CALL", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class CoreUiInteractionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CoreUiInteractionType[] $VALUES;
    public static final CoreUiInteractionType PAGE_VIEW = new CoreUiInteractionType("PAGE_VIEW", 0);
    public static final CoreUiInteractionType CLICK = new CoreUiInteractionType("CLICK", 1);
    public static final CoreUiInteractionType VIEW = new CoreUiInteractionType("VIEW", 2);
    public static final CoreUiInteractionType APP_START = new CoreUiInteractionType("APP_START", 3);
    public static final CoreUiInteractionType SLIDER = new CoreUiInteractionType("SLIDER", 4);
    public static final CoreUiInteractionType DEEP_LINK_CLICK = new CoreUiInteractionType("DEEP_LINK_CLICK", 5);
    public static final CoreUiInteractionType UTTERANCE = new CoreUiInteractionType(SuggestionAction.UTTERANCE, 6);
    public static final CoreUiInteractionType LONG_PRESS = new CoreUiInteractionType("LONG_PRESS", 7);
    public static final CoreUiInteractionType COMMS_MESSAGE = new CoreUiInteractionType("COMMS_MESSAGE", 8);
    public static final CoreUiInteractionType COMMS_CALL = new CoreUiInteractionType("COMMS_CALL", 9);

    private static final /* synthetic */ CoreUiInteractionType[] $values() {
        return new CoreUiInteractionType[]{PAGE_VIEW, CLICK, VIEW, APP_START, SLIDER, DEEP_LINK_CLICK, UTTERANCE, LONG_PRESS, COMMS_MESSAGE, COMMS_CALL};
    }

    static {
        CoreUiInteractionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CoreUiInteractionType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CoreUiInteractionType> getEntries() {
        return $ENTRIES;
    }

    public static CoreUiInteractionType valueOf(String str) {
        return (CoreUiInteractionType) Enum.valueOf(CoreUiInteractionType.class, str);
    }

    public static CoreUiInteractionType[] values() {
        return (CoreUiInteractionType[]) $VALUES.clone();
    }
}
