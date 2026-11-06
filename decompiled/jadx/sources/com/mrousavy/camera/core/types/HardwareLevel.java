package com.mrousavy.camera.core.types;

import com.amazon.alexa.voice.ui.suggestions.SuggestionAction;
import com.dee.app.contacts.common.constants.AppUrlConstants;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0013"}, d2 = {"Lcom/mrousavy/camera/core/types/HardwareLevel;", "Lcom/mrousavy/camera/core/types/JSUnionValue;", "", "unionValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getUnionValue", "()Ljava/lang/String;", "LEGACY", "LIMITED", SuggestionAction.EXTERNAL, "FULL", "LEVEL_3", "rank", "", "getRank", "()I", "Companion", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HardwareLevel implements JSUnionValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HardwareLevel[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String unionValue;
    public static final HardwareLevel LEGACY = new HardwareLevel("LEGACY", 0, "legacy");
    public static final HardwareLevel LIMITED = new HardwareLevel("LIMITED", 1, "limited");
    public static final HardwareLevel EXTERNAL = new HardwareLevel(SuggestionAction.EXTERNAL, 2, "limited");
    public static final HardwareLevel FULL = new HardwareLevel("FULL", 3, AppUrlConstants.ACMS.QueryParam.Values.VIEW_QUERY_PARAM_VALUE);
    public static final HardwareLevel LEVEL_3 = new HardwareLevel("LEVEL_3", 4, AppUrlConstants.ACMS.QueryParam.Values.VIEW_QUERY_PARAM_VALUE);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HardwareLevel.values().length];
            try {
                iArr[HardwareLevel.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HardwareLevel.LIMITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HardwareLevel.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HardwareLevel.FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HardwareLevel.LEVEL_3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ HardwareLevel[] $values() {
        return new HardwareLevel[]{LEGACY, LIMITED, EXTERNAL, FULL, LEVEL_3};
    }

    static {
        HardwareLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private HardwareLevel(String str, int i, String str2) {
        this.unionValue = str2;
    }

    @NotNull
    public static EnumEntries<HardwareLevel> getEntries() {
        return $ENTRIES;
    }

    private final int getRank() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 5) {
            return 3;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return 0;
    }

    public static HardwareLevel valueOf(String str) {
        return (HardwareLevel) Enum.valueOf(HardwareLevel.class, str);
    }

    public static HardwareLevel[] values() {
        return (HardwareLevel[]) $VALUES.clone();
    }

    @Override // com.mrousavy.camera.core.types.JSUnionValue
    @NotNull
    public String getUnionValue() {
        return this.unionValue;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/mrousavy/camera/core/types/HardwareLevel$Companion;", "", "<init>", "()V", "fromCameraHardwareLevel", "Lcom/mrousavy/camera/core/types/HardwareLevel;", "hardwareLevel", "", "react-native-vision-camera_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HardwareLevel fromCameraHardwareLevel(int hardwareLevel) {
            return hardwareLevel != 0 ? hardwareLevel != 1 ? hardwareLevel != 2 ? hardwareLevel != 3 ? hardwareLevel != 4 ? HardwareLevel.LEGACY : HardwareLevel.EXTERNAL : HardwareLevel.LEVEL_3 : HardwareLevel.LEGACY : HardwareLevel.FULL : HardwareLevel.LIMITED;
        }

        private Companion() {
        }
    }
}
