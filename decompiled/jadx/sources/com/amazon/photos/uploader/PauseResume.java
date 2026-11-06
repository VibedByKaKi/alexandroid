package com.amazon.photos.uploader;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/photos/uploader/PauseResume;", "", "(Ljava/lang/String;I)V", "PAUSE", "RESUME", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PauseResume {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PauseResume[] $VALUES;
    public static final PauseResume PAUSE = new PauseResume("PAUSE", 0);
    public static final PauseResume RESUME = new PauseResume("RESUME", 1);

    private static final /* synthetic */ PauseResume[] $values() {
        return new PauseResume[]{PAUSE, RESUME};
    }

    static {
        PauseResume[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PauseResume(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PauseResume> getEntries() {
        return $ENTRIES;
    }

    public static PauseResume valueOf(String str) {
        return (PauseResume) Enum.valueOf(PauseResume.class, str);
    }

    public static PauseResume[] values() {
        return (PauseResume[]) $VALUES.clone();
    }
}
