package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaUserSpeechProviderScope;", "", "<init>", "(Ljava/lang/String;I)V", "EXTERNAL_DEVICE", "SYSTEM", "APPLICATION", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaUserSpeechProviderScope {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaUserSpeechProviderScope[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AlexaUserSpeechProviderScope EXTERNAL_DEVICE = new AlexaUserSpeechProviderScope("EXTERNAL_DEVICE", 0);
    public static final AlexaUserSpeechProviderScope SYSTEM = new AlexaUserSpeechProviderScope("SYSTEM", 1);
    public static final AlexaUserSpeechProviderScope APPLICATION = new AlexaUserSpeechProviderScope("APPLICATION", 2);

    private static final /* synthetic */ AlexaUserSpeechProviderScope[] $values() {
        return new AlexaUserSpeechProviderScope[]{EXTERNAL_DEVICE, SYSTEM, APPLICATION};
    }

    static {
        AlexaUserSpeechProviderScope[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private AlexaUserSpeechProviderScope(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaUserSpeechProviderScope> getEntries() {
        return $ENTRIES;
    }

    public static AlexaUserSpeechProviderScope valueOf(String str) {
        return (AlexaUserSpeechProviderScope) Enum.valueOf(AlexaUserSpeechProviderScope.class, str);
    }

    public static AlexaUserSpeechProviderScope[] values() {
        return (AlexaUserSpeechProviderScope[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaUserSpeechProviderScope$Companion;", "", "<init>", "()V", "convertToCompat", "Lcom/amazon/alexa/api/compat/AlexaUserSpeechProviderScope;", "noncompatScope", "Lcom/amazon/alexa/api/AlexaUserSpeechProviderScope;", "convertFromCompat", "compatScope", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final com.amazon.alexa.api.AlexaUserSpeechProviderScope convertFromCompat(@Nullable AlexaUserSpeechProviderScope compatScope) {
            if (compatScope != null) {
                return com.amazon.alexa.api.AlexaUserSpeechProviderScope.valueOf(compatScope.name());
            }
            return null;
        }

        @Nullable
        public final AlexaUserSpeechProviderScope convertToCompat(@Nullable com.amazon.alexa.api.AlexaUserSpeechProviderScope noncompatScope) {
            if (noncompatScope != null) {
                return AlexaUserSpeechProviderScope.valueOf(noncompatScope.name());
            }
            return null;
        }

        private Companion() {
        }
    }
}
