package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ImageThumbnailDisplay;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_FIELD", "CHAT_SCREEN", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ImageThumbnailDisplay {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageThumbnailDisplay[] $VALUES;
    public static final ImageThumbnailDisplay TEXT_FIELD = new ImageThumbnailDisplay("TEXT_FIELD", 0);
    public static final ImageThumbnailDisplay CHAT_SCREEN = new ImageThumbnailDisplay("CHAT_SCREEN", 1);

    private static final /* synthetic */ ImageThumbnailDisplay[] $values() {
        return new ImageThumbnailDisplay[]{TEXT_FIELD, CHAT_SCREEN};
    }

    static {
        ImageThumbnailDisplay[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ImageThumbnailDisplay(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ImageThumbnailDisplay> getEntries() {
        return $ENTRIES;
    }

    public static ImageThumbnailDisplay valueOf(String str) {
        return (ImageThumbnailDisplay) Enum.valueOf(ImageThumbnailDisplay.class, str);
    }

    public static ImageThumbnailDisplay[] values() {
        return (ImageThumbnailDisplay[]) $VALUES.clone();
    }
}
