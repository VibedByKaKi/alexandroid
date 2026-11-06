package com.amazon.rtvi.capture.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/rtvi/capture/model/EnrichmentType;", "", "<init>", "(Ljava/lang/String;I)V", "OCR_TEXT_RECOGNITION", "FACE_DETECTION", "GESTURE_DETECTION", "OPTICAL_CODE_DETECTION", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnrichmentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnrichmentType[] $VALUES;
    public static final EnrichmentType OCR_TEXT_RECOGNITION = new EnrichmentType("OCR_TEXT_RECOGNITION", 0);
    public static final EnrichmentType FACE_DETECTION = new EnrichmentType("FACE_DETECTION", 1);
    public static final EnrichmentType GESTURE_DETECTION = new EnrichmentType("GESTURE_DETECTION", 2);
    public static final EnrichmentType OPTICAL_CODE_DETECTION = new EnrichmentType("OPTICAL_CODE_DETECTION", 3);

    private static final /* synthetic */ EnrichmentType[] $values() {
        return new EnrichmentType[]{OCR_TEXT_RECOGNITION, FACE_DETECTION, GESTURE_DETECTION, OPTICAL_CODE_DETECTION};
    }

    static {
        EnrichmentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnrichmentType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<EnrichmentType> getEntries() {
        return $ENTRIES;
    }

    public static EnrichmentType valueOf(String str) {
        return (EnrichmentType) Enum.valueOf(EnrichmentType.class, str);
    }

    public static EnrichmentType[] values() {
        return (EnrichmentType[]) $VALUES.clone();
    }
}
