package com.amazon.alexa.capabilityagent.cardstudiosurface.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/capabilityagent/cardstudiosurface/core/RejectionCause;", "", "<init>", "(Ljava/lang/String;I)V", "MALFORMED_PAYLOAD", "MISSING_SURFACE", "MISSING_REASON", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RejectionCause {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RejectionCause[] $VALUES;
    public static final RejectionCause MALFORMED_PAYLOAD = new RejectionCause("MALFORMED_PAYLOAD", 0);
    public static final RejectionCause MISSING_SURFACE = new RejectionCause("MISSING_SURFACE", 1);
    public static final RejectionCause MISSING_REASON = new RejectionCause("MISSING_REASON", 2);

    private static final /* synthetic */ RejectionCause[] $values() {
        return new RejectionCause[]{MALFORMED_PAYLOAD, MISSING_SURFACE, MISSING_REASON};
    }

    static {
        RejectionCause[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private RejectionCause(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RejectionCause> getEntries() {
        return $ENTRIES;
    }

    public static RejectionCause valueOf(String str) {
        return (RejectionCause) Enum.valueOf(RejectionCause.class, str);
    }

    public static RejectionCause[] values() {
        return (RejectionCause[]) $VALUES.clone();
    }
}
