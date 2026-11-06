package com.amazon.alexa.ra.core.ui.custom;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/BottomSheetContent;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Share", "Feedback", "SmartActionsFeedback", "BgVoiceMode", "OverlayPermission", "CitationSources", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class BottomSheetContent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BottomSheetContent[] $VALUES;
    public static final BottomSheetContent None = new BottomSheetContent("None", 0);
    public static final BottomSheetContent Share = new BottomSheetContent("Share", 1);
    public static final BottomSheetContent Feedback = new BottomSheetContent("Feedback", 2);
    public static final BottomSheetContent SmartActionsFeedback = new BottomSheetContent("SmartActionsFeedback", 3);
    public static final BottomSheetContent BgVoiceMode = new BottomSheetContent("BgVoiceMode", 4);
    public static final BottomSheetContent OverlayPermission = new BottomSheetContent("OverlayPermission", 5);
    public static final BottomSheetContent CitationSources = new BottomSheetContent("CitationSources", 6);

    private static final /* synthetic */ BottomSheetContent[] $values() {
        return new BottomSheetContent[]{None, Share, Feedback, SmartActionsFeedback, BgVoiceMode, OverlayPermission, CitationSources};
    }

    static {
        BottomSheetContent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private BottomSheetContent(String str, int i) {
    }

    @NotNull
    public static EnumEntries<BottomSheetContent> getEntries() {
        return $ENTRIES;
    }

    public static BottomSheetContent valueOf(String str) {
        return (BottomSheetContent) Enum.valueOf(BottomSheetContent.class, str);
    }

    public static BottomSheetContent[] values() {
        return (BottomSheetContent[]) $VALUES.clone();
    }
}
