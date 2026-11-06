package com.amazon.alexa.api.compat.migration.sdk;

import com.amazon.alexa.assistant.capability.legacyflags.LegacyFlags;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/SdkType;", "", "<init>", "(Ljava/lang/String;I)V", LegacyFlags.DEFAULT_FRIENDLY_NAME_TEMPLATE, "ASSISTANT", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SdkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SdkType[] $VALUES;
    public static final SdkType ASSISTANT;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final SdkType DEFAULT;
    public static final SdkType VOX;

    private static final /* synthetic */ SdkType[] $values() {
        return new SdkType[]{VOX, ASSISTANT};
    }

    static {
        SdkType sdkType = new SdkType(LegacyFlags.DEFAULT_FRIENDLY_NAME_TEMPLATE, 0);
        VOX = sdkType;
        ASSISTANT = new SdkType("ASSISTANT", 1);
        SdkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        DEFAULT = sdkType;
    }

    private SdkType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SdkType> getEntries() {
        return $ENTRIES;
    }

    public static SdkType valueOf(String str) {
        return (SdkType) Enum.valueOf(SdkType.class, str);
    }

    public static SdkType[] values() {
        return (SdkType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/migration/sdk/SdkType$Companion;", "", "<init>", "()V", "DEFAULT", "Lcom/amazon/alexa/api/compat/migration/sdk/SdkType;", "getDEFAULT", "()Lcom/amazon/alexa/api/compat/migration/sdk/SdkType;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SdkType getDEFAULT() {
            return SdkType.DEFAULT;
        }

        private Companion() {
        }
    }
}
