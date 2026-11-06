package com.amazon.tarazed.type.rotation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/tarazed/type/rotation/Rotation;", "", "degrees", "", "(Ljava/lang/String;II)V", "getDegrees", "()I", "ROTATION_0", "ROTATION_90", "ROTATION_180", "ROTATION_270", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class Rotation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Rotation[] $VALUES;
    private final int degrees;
    public static final Rotation ROTATION_0 = new Rotation("ROTATION_0", 0, 0);
    public static final Rotation ROTATION_90 = new Rotation("ROTATION_90", 1, 90);
    public static final Rotation ROTATION_180 = new Rotation("ROTATION_180", 2, 180);
    public static final Rotation ROTATION_270 = new Rotation("ROTATION_270", 3, 270);

    private static final /* synthetic */ Rotation[] $values() {
        return new Rotation[]{ROTATION_0, ROTATION_90, ROTATION_180, ROTATION_270};
    }

    static {
        Rotation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Rotation(String str, int i, int i2) {
        this.degrees = i2;
    }

    @NotNull
    public static EnumEntries<Rotation> getEntries() {
        return $ENTRIES;
    }

    public static Rotation valueOf(String str) {
        return (Rotation) Enum.valueOf(Rotation.class, str);
    }

    public static Rotation[] values() {
        return (Rotation[]) $VALUES.clone();
    }

    public final int getDegrees() {
        return this.degrees;
    }
}
