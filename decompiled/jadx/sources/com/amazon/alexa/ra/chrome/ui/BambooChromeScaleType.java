package com.amazon.alexa.ra.chrome.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/chrome/ui/BambooChromeScaleType;", "", "<init>", "(Ljava/lang/String;I)V", "FillWidth", "None", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class BambooChromeScaleType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BambooChromeScaleType[] $VALUES;
    public static final BambooChromeScaleType FillWidth = new BambooChromeScaleType("FillWidth", 0);
    public static final BambooChromeScaleType None = new BambooChromeScaleType("None", 1);

    private static final /* synthetic */ BambooChromeScaleType[] $values() {
        return new BambooChromeScaleType[]{FillWidth, None};
    }

    static {
        BambooChromeScaleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private BambooChromeScaleType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<BambooChromeScaleType> getEntries() {
        return $ENTRIES;
    }

    public static BambooChromeScaleType valueOf(String str) {
        return (BambooChromeScaleType) Enum.valueOf(BambooChromeScaleType.class, str);
    }

    public static BambooChromeScaleType[] values() {
        return (BambooChromeScaleType[]) $VALUES.clone();
    }
}
