package com.amazon.alexa.assistant.profile;

import com.amazon.deecomms.alexa.CallTypeEventConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/profile/AlexaTermsConditionsStatus;", "", "<init>", "(Ljava/lang/String;I)V", "FULLY_REGISTERED", CallTypeEventConstants.VUI_ONLY, "NOT_REGISTERED", "UNKNOWN", "Companion", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AlexaTermsConditionsStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaTermsConditionsStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AlexaTermsConditionsStatus FULLY_REGISTERED = new AlexaTermsConditionsStatus("FULLY_REGISTERED", 0);
    public static final AlexaTermsConditionsStatus VUI_ONLY = new AlexaTermsConditionsStatus(CallTypeEventConstants.VUI_ONLY, 1);
    public static final AlexaTermsConditionsStatus NOT_REGISTERED = new AlexaTermsConditionsStatus("NOT_REGISTERED", 2);
    public static final AlexaTermsConditionsStatus UNKNOWN = new AlexaTermsConditionsStatus("UNKNOWN", 3);

    private static final /* synthetic */ AlexaTermsConditionsStatus[] $values() {
        return new AlexaTermsConditionsStatus[]{FULLY_REGISTERED, VUI_ONLY, NOT_REGISTERED, UNKNOWN};
    }

    static {
        AlexaTermsConditionsStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private AlexaTermsConditionsStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaTermsConditionsStatus> getEntries() {
        return $ENTRIES;
    }

    public static AlexaTermsConditionsStatus valueOf(String str) {
        return (AlexaTermsConditionsStatus) Enum.valueOf(AlexaTermsConditionsStatus.class, str);
    }

    public static AlexaTermsConditionsStatus[] values() {
        return (AlexaTermsConditionsStatus[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/profile/AlexaTermsConditionsStatus$Companion;", "", "<init>", "()V", "fromRaw", "Lcom/amazon/alexa/assistant/profile/AlexaTermsConditionsStatus;", "raw", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AlexaTermsConditionsStatus fromRaw(@Nullable String raw) {
            if (raw != null) {
                int hashCode = raw.hashCode();
                if (hashCode != -526380146) {
                    if (hashCode != -133671583) {
                        if (hashCode == -74409417 && raw.equals("FULLY_REGISTERED")) {
                            return AlexaTermsConditionsStatus.FULLY_REGISTERED;
                        }
                    } else if (raw.equals(CallTypeEventConstants.VUI_ONLY)) {
                        return AlexaTermsConditionsStatus.VUI_ONLY;
                    }
                } else if (raw.equals("NOT_REGISTERED")) {
                    return AlexaTermsConditionsStatus.NOT_REGISTERED;
                }
            }
            return AlexaTermsConditionsStatus.UNKNOWN;
        }

        private Companion() {
        }
    }
}
