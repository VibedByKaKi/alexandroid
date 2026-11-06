package com.amazon.photos.uploader;

import com.amazon.devicesetupservice.scap.v1.BleConnectionPriority;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/photos/uploader/Priority;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", BleConnectionPriority.LOW, "MEDIUM", BleConnectionPriority.HIGH, "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Priority {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Priority[] $VALUES;
    private final int value;
    public static final Priority LOW = new Priority(BleConnectionPriority.LOW, 0, 100);
    public static final Priority MEDIUM = new Priority("MEDIUM", 1, 200);
    public static final Priority HIGH = new Priority(BleConnectionPriority.HIGH, 2, 300);

    private static final /* synthetic */ Priority[] $values() {
        return new Priority[]{LOW, MEDIUM, HIGH};
    }

    static {
        Priority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Priority(String str, int i, int i2) {
        this.value = i2;
    }

    @NotNull
    public static EnumEntries<Priority> getEntries() {
        return $ENTRIES;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
