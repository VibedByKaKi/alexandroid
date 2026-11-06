package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/MediaStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_EMPTY_FILE", "ERROR_UNKNOWN_FILE", "ERROR_FILE_SIZE_EXCEED", "ERROR_INVALID_FORMAT", "VALID_FILE", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MediaStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MediaStatus[] $VALUES;
    public static final MediaStatus ERROR_EMPTY_FILE = new MediaStatus("ERROR_EMPTY_FILE", 0);
    public static final MediaStatus ERROR_UNKNOWN_FILE = new MediaStatus("ERROR_UNKNOWN_FILE", 1);
    public static final MediaStatus ERROR_FILE_SIZE_EXCEED = new MediaStatus("ERROR_FILE_SIZE_EXCEED", 2);
    public static final MediaStatus ERROR_INVALID_FORMAT = new MediaStatus("ERROR_INVALID_FORMAT", 3);
    public static final MediaStatus VALID_FILE = new MediaStatus("VALID_FILE", 4);

    private static final /* synthetic */ MediaStatus[] $values() {
        return new MediaStatus[]{ERROR_EMPTY_FILE, ERROR_UNKNOWN_FILE, ERROR_FILE_SIZE_EXCEED, ERROR_INVALID_FORMAT, VALID_FILE};
    }

    static {
        MediaStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MediaStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<MediaStatus> getEntries() {
        return $ENTRIES;
    }

    public static MediaStatus valueOf(String str) {
        return (MediaStatus) Enum.valueOf(MediaStatus.class, str);
    }

    public static MediaStatus[] values() {
        return (MediaStatus[]) $VALUES.clone();
    }
}
