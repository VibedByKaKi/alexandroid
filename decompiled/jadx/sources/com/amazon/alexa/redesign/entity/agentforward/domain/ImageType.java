package com.amazon.alexa.redesign.entity.agentforward.domain;

import com.fasterxml.jackson.annotation.JsonValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/ImageType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "THUMBNAIL", "BACKGROUND", "ICON", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ImageType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageType[] $VALUES;

    @JsonValue
    @NotNull
    private final String value;
    public static final ImageType THUMBNAIL = new ImageType("THUMBNAIL", 0, "THUMBNAIL");
    public static final ImageType BACKGROUND = new ImageType("BACKGROUND", 1, "BACKGROUND");
    public static final ImageType ICON = new ImageType("ICON", 2, "ICON");

    private static final /* synthetic */ ImageType[] $values() {
        return new ImageType[]{THUMBNAIL, BACKGROUND, ICON};
    }

    static {
        ImageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ImageType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<ImageType> getEntries() {
        return $ENTRIES;
    }

    public static ImageType valueOf(String str) {
        return (ImageType) Enum.valueOf(ImageType.class, str);
    }

    public static ImageType[] values() {
        return (ImageType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
