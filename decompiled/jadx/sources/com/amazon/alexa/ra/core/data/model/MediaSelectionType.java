package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/MediaSelectionType;", "", "<init>", "(Ljava/lang/String;I)V", "CAMERA", "GALLERY", "DOCUMENT", "SHARE_SHEET", "CLIPBOARD", "NONE", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MediaSelectionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaSelectionType[] $VALUES;
    public static final MediaSelectionType CAMERA = new MediaSelectionType("CAMERA", 0);
    public static final MediaSelectionType GALLERY = new MediaSelectionType("GALLERY", 1);
    public static final MediaSelectionType DOCUMENT = new MediaSelectionType("DOCUMENT", 2);
    public static final MediaSelectionType SHARE_SHEET = new MediaSelectionType("SHARE_SHEET", 3);
    public static final MediaSelectionType CLIPBOARD = new MediaSelectionType("CLIPBOARD", 4);
    public static final MediaSelectionType NONE = new MediaSelectionType("NONE", 5);

    private static final /* synthetic */ MediaSelectionType[] $values() {
        return new MediaSelectionType[]{CAMERA, GALLERY, DOCUMENT, SHARE_SHEET, CLIPBOARD, NONE};
    }

    static {
        MediaSelectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MediaSelectionType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<MediaSelectionType> getEntries() {
        return $ENTRIES;
    }

    public static MediaSelectionType valueOf(String str) {
        return (MediaSelectionType) Enum.valueOf(MediaSelectionType.class, str);
    }

    public static MediaSelectionType[] values() {
        return (MediaSelectionType[]) $VALUES.clone();
    }
}
