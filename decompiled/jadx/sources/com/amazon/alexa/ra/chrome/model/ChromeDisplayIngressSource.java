package com.amazon.alexa.ra.chrome.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/ChromeDisplayIngressSource;", "", "<init>", "(Ljava/lang/String;I)V", "HOME_MIC", "CONVERSATION_MIC", "WAKE_WORD", "LIVE_MODE", "OTHER", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ChromeDisplayIngressSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChromeDisplayIngressSource[] $VALUES;
    public static final ChromeDisplayIngressSource HOME_MIC = new ChromeDisplayIngressSource("HOME_MIC", 0);
    public static final ChromeDisplayIngressSource CONVERSATION_MIC = new ChromeDisplayIngressSource("CONVERSATION_MIC", 1);
    public static final ChromeDisplayIngressSource WAKE_WORD = new ChromeDisplayIngressSource("WAKE_WORD", 2);
    public static final ChromeDisplayIngressSource LIVE_MODE = new ChromeDisplayIngressSource("LIVE_MODE", 3);
    public static final ChromeDisplayIngressSource OTHER = new ChromeDisplayIngressSource("OTHER", 4);

    private static final /* synthetic */ ChromeDisplayIngressSource[] $values() {
        return new ChromeDisplayIngressSource[]{HOME_MIC, CONVERSATION_MIC, WAKE_WORD, LIVE_MODE, OTHER};
    }

    static {
        ChromeDisplayIngressSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ChromeDisplayIngressSource(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ChromeDisplayIngressSource> getEntries() {
        return $ENTRIES;
    }

    public static ChromeDisplayIngressSource valueOf(String str) {
        return (ChromeDisplayIngressSource) Enum.valueOf(ChromeDisplayIngressSource.class, str);
    }

    public static ChromeDisplayIngressSource[] values() {
        return (ChromeDisplayIngressSource[]) $VALUES.clone();
    }
}
