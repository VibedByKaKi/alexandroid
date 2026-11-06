package com.amazon.alexa.api.compat;

import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/api/compat/DriveModeState;", "", "<init>", "(Ljava/lang/String;I)V", "ACCESSORY", "AUTOBLUETOOTH", "MANUAL", "NONE", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DriveModeState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DriveModeState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final DriveModeState ACCESSORY = new DriveModeState("ACCESSORY", 0);
    public static final DriveModeState AUTOBLUETOOTH = new DriveModeState("AUTOBLUETOOTH", 1);
    public static final DriveModeState MANUAL = new DriveModeState("MANUAL", 2);
    public static final DriveModeState NONE = new DriveModeState("NONE", 3);

    private static final /* synthetic */ DriveModeState[] $values() {
        return new DriveModeState[]{ACCESSORY, AUTOBLUETOOTH, MANUAL, NONE};
    }

    static {
        DriveModeState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private DriveModeState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<DriveModeState> getEntries() {
        return $ENTRIES;
    }

    public static DriveModeState valueOf(String str) {
        return (DriveModeState) Enum.valueOf(DriveModeState.class, str);
    }

    public static DriveModeState[] values() {
        return (DriveModeState[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/DriveModeState$Companion;", "", "<init>", "()V", "convertToCompat", "Lcom/amazon/alexa/api/compat/DriveModeState;", "state", "Lcom/amazon/alexa/api/DriveModeState;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.amazon.alexa.api.DriveModeState.values().length];
                try {
                    iArr[com.amazon.alexa.api.DriveModeState.ACCESSORY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.amazon.alexa.api.DriveModeState.AUTOBLUETOOTH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.amazon.alexa.api.DriveModeState.MANUAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.amazon.alexa.api.DriveModeState.NONE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DriveModeState convertToCompat(@NotNull com.amazon.alexa.api.DriveModeState state) {
            state.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                return DriveModeState.ACCESSORY;
            }
            if (i == 2) {
                return DriveModeState.AUTOBLUETOOTH;
            }
            if (i == 3) {
                return DriveModeState.MANUAL;
            }
            if (i == 4) {
                return DriveModeState.NONE;
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        private Companion() {
        }
    }
}
