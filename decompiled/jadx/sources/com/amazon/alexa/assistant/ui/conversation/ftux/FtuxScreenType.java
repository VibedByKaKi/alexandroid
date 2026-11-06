package com.amazon.alexa.assistant.ui.conversation.ftux;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/ftux/FtuxScreenType;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMER", "TERMS_OF_USE", "PRIMER_WITH_TERMS", "MIC_PERMISSION", "CAMERA_PERMISSION", "LOCATION_PERMISSION", "COMPLETION", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FtuxScreenType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FtuxScreenType[] $VALUES;
    public static final FtuxScreenType PRIMER = new FtuxScreenType("PRIMER", 0);
    public static final FtuxScreenType TERMS_OF_USE = new FtuxScreenType("TERMS_OF_USE", 1);
    public static final FtuxScreenType PRIMER_WITH_TERMS = new FtuxScreenType("PRIMER_WITH_TERMS", 2);
    public static final FtuxScreenType MIC_PERMISSION = new FtuxScreenType("MIC_PERMISSION", 3);
    public static final FtuxScreenType CAMERA_PERMISSION = new FtuxScreenType("CAMERA_PERMISSION", 4);
    public static final FtuxScreenType LOCATION_PERMISSION = new FtuxScreenType("LOCATION_PERMISSION", 5);
    public static final FtuxScreenType COMPLETION = new FtuxScreenType("COMPLETION", 6);

    private static final /* synthetic */ FtuxScreenType[] $values() {
        return new FtuxScreenType[]{PRIMER, TERMS_OF_USE, PRIMER_WITH_TERMS, MIC_PERMISSION, CAMERA_PERMISSION, LOCATION_PERMISSION, COMPLETION};
    }

    static {
        FtuxScreenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private FtuxScreenType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FtuxScreenType> getEntries() {
        return $ENTRIES;
    }

    public static FtuxScreenType valueOf(String str) {
        return (FtuxScreenType) Enum.valueOf(FtuxScreenType.class, str);
    }

    public static FtuxScreenType[] values() {
        return (FtuxScreenType[]) $VALUES.clone();
    }
}
