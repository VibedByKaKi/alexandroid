package com.amazon.alexa.smarthomecameras.fabric.cameraview;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/fabric/cameraview/SpeakerState;", "", "<init>", "(Ljava/lang/String;I)V", "MUTED", "UNMUTED", "Companion", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SpeakerState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SpeakerState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final SpeakerState MUTED = new SpeakerState("MUTED", 0);
    public static final SpeakerState UNMUTED = new SpeakerState("UNMUTED", 1);

    private static final /* synthetic */ SpeakerState[] $values() {
        return new SpeakerState[]{MUTED, UNMUTED};
    }

    static {
        SpeakerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private SpeakerState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SpeakerState> getEntries() {
        return $ENTRIES;
    }

    public static SpeakerState valueOf(String str) {
        return (SpeakerState) Enum.valueOf(SpeakerState.class, str);
    }

    public static SpeakerState[] values() {
        return (SpeakerState[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/fabric/cameraview/SpeakerState$Companion;", "", "<init>", "()V", "fromCommandArg", "Lcom/amazon/alexa/smarthomecameras/fabric/cameraview/SpeakerState;", "raw", "", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SpeakerState fromCommandArg(@Nullable String raw) {
            if (Intrinsics.areEqual(raw, "MUTE")) {
                return SpeakerState.MUTED;
            }
            if (Intrinsics.areEqual(raw, "UNMUTE")) {
                return SpeakerState.UNMUTED;
            }
            return null;
        }

        private Companion() {
        }
    }
}
