package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaSupportedInitiationType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/SupportedInitiationType;", "", "<init>", "(Ljava/lang/String;I)V", "WAKE_WORD", "TAP_TO_TALK", "SERVER", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SupportedInitiationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SupportedInitiationType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final SupportedInitiationType WAKE_WORD = new SupportedInitiationType("WAKE_WORD", 0);
    public static final SupportedInitiationType TAP_TO_TALK = new SupportedInitiationType("TAP_TO_TALK", 1);
    public static final SupportedInitiationType SERVER = new SupportedInitiationType("SERVER", 2);

    private static final /* synthetic */ SupportedInitiationType[] $values() {
        return new SupportedInitiationType[]{WAKE_WORD, TAP_TO_TALK, SERVER};
    }

    static {
        SupportedInitiationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private SupportedInitiationType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SupportedInitiationType> getEntries() {
        return $ENTRIES;
    }

    public static SupportedInitiationType valueOf(String str) {
        return (SupportedInitiationType) Enum.valueOf(SupportedInitiationType.class, str);
    }

    public static SupportedInitiationType[] values() {
        return (SupportedInitiationType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/SupportedInitiationType$Companion;", "", "<init>", "()V", "convertToCompat", "Lcom/amazon/alexa/api/compat/SupportedInitiationType;", "noncompatType", "Lcom/amazon/alexa/api/AlexaSupportedInitiationType;", "convertFromCompat", "compatType", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AlexaSupportedInitiationType convertFromCompat(@Nullable SupportedInitiationType compatType) {
            if (compatType != null) {
                return AlexaSupportedInitiationType.valueOf(compatType.name());
            }
            return null;
        }

        @Nullable
        public final SupportedInitiationType convertToCompat(@Nullable AlexaSupportedInitiationType noncompatType) {
            if (noncompatType != null) {
                return SupportedInitiationType.valueOf(noncompatType.name());
            }
            return null;
        }

        private Companion() {
        }
    }
}
