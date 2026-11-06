package com.amazon.alexa.assistant.foundation.authorization;

import com.amazon.alexa.mobilytics.configuration.BenefitConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/authorization/AlexaPlusEntitlement;", "", "<init>", "(Ljava/lang/String;I)V", "ENTITLED", BenefitConstants.BENEFIT_NOT_ENTITLED, "UNKNOWN", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AlexaPlusEntitlement {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaPlusEntitlement[] $VALUES;
    public static final AlexaPlusEntitlement ENTITLED = new AlexaPlusEntitlement("ENTITLED", 0);
    public static final AlexaPlusEntitlement NOT_ENTITLED = new AlexaPlusEntitlement(BenefitConstants.BENEFIT_NOT_ENTITLED, 1);
    public static final AlexaPlusEntitlement UNKNOWN = new AlexaPlusEntitlement("UNKNOWN", 2);

    private static final /* synthetic */ AlexaPlusEntitlement[] $values() {
        return new AlexaPlusEntitlement[]{ENTITLED, NOT_ENTITLED, UNKNOWN};
    }

    static {
        AlexaPlusEntitlement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AlexaPlusEntitlement(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaPlusEntitlement> getEntries() {
        return $ENTRIES;
    }

    public static AlexaPlusEntitlement valueOf(String str) {
        return (AlexaPlusEntitlement) Enum.valueOf(AlexaPlusEntitlement.class, str);
    }

    public static AlexaPlusEntitlement[] values() {
        return (AlexaPlusEntitlement[]) $VALUES.clone();
    }
}
