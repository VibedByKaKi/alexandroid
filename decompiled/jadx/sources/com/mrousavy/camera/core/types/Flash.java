package com.mrousavy.camera.core.types;

import com.mrousavy.camera.core.InvalidTypeScriptUnionError;
import com.mrousavy.camera.core.types.JSUnionValue;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000f"}, d2 = {"Lcom/mrousavy/camera/core/types/Flash;", "Lcom/mrousavy/camera/core/types/JSUnionValue;", "", "unionValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getUnionValue", "()Ljava/lang/String;", "OFF", "ON", "AUTO", "toFlashMode", "", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Flash implements JSUnionValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Flash[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String unionValue;
    public static final Flash OFF = new Flash("OFF", 0, "off");
    public static final Flash ON = new Flash("ON", 1, "on");
    public static final Flash AUTO = new Flash("AUTO", 2, "auto");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Flash.values().length];
            try {
                iArr[Flash.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Flash.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Flash.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ Flash[] $values() {
        return new Flash[]{OFF, ON, AUTO};
    }

    static {
        Flash[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private Flash(String str, int i, String str2) {
        this.unionValue = str2;
    }

    @NotNull
    public static EnumEntries<Flash> getEntries() {
        return $ENTRIES;
    }

    public static Flash valueOf(String str) {
        return (Flash) Enum.valueOf(Flash.class, str);
    }

    public static Flash[] values() {
        return (Flash[]) $VALUES.clone();
    }

    @Override // com.mrousavy.camera.core.types.JSUnionValue
    @NotNull
    public String getUnionValue() {
        return this.unionValue;
    }

    public final int toFlashMode() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 0;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return 0;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/mrousavy/camera/core/types/Flash$Companion;", "Lcom/mrousavy/camera/core/types/JSUnionValue$Companion;", "Lcom/mrousavy/camera/core/types/Flash;", "<init>", "()V", "fromUnionValue", "unionValue", "", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements JSUnionValue.Companion<Flash> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.mrousavy.camera.core.types.JSUnionValue.Companion
        @NotNull
        public Flash fromUnionValue(@Nullable String unionValue) {
            if (unionValue != null) {
                int hashCode = unionValue.hashCode();
                if (hashCode != 3551) {
                    if (hashCode != 109935) {
                        if (hashCode == 3005871 && unionValue.equals("auto")) {
                            return Flash.AUTO;
                        }
                    } else if (unionValue.equals("off")) {
                        return Flash.OFF;
                    }
                } else if (unionValue.equals("on")) {
                    return Flash.ON;
                }
            }
            if (unionValue == null) {
                unionValue = "(null)";
            }
            throw new InvalidTypeScriptUnionError("flash", unionValue);
        }

        private Companion() {
        }
    }
}
