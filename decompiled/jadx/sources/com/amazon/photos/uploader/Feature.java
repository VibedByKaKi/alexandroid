package com.amazon.photos.uploader;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/photos/uploader/Feature;", "", "(Ljava/lang/String;I)V", "VISUAL_DIGEST", "DEBUG_MODE", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Feature {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Feature[] $VALUES;
    public static final Feature VISUAL_DIGEST = new Feature("VISUAL_DIGEST", 0);
    public static final Feature DEBUG_MODE = new Feature("DEBUG_MODE", 1);

    private static final /* synthetic */ Feature[] $values() {
        return new Feature[]{VISUAL_DIGEST, DEBUG_MODE};
    }

    static {
        Feature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Feature(String str, int i) {
    }

    @NotNull
    public static EnumEntries<Feature> getEntries() {
        return $ENTRIES;
    }

    public static Feature valueOf(String str) {
        return (Feature) Enum.valueOf(Feature.class, str);
    }

    public static Feature[] values() {
        return (Feature[]) $VALUES.clone();
    }
}
