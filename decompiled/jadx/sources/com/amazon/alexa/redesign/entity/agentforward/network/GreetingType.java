package com.amazon.alexa.redesign.entity.agentforward.network;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingType;", "", "<init>", "(Ljava/lang/String;I)V", "SEASONAL", "DAY_PARTED", "GENERIC", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class GreetingType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GreetingType[] $VALUES;
    public static final GreetingType SEASONAL = new GreetingType("SEASONAL", 0);
    public static final GreetingType DAY_PARTED = new GreetingType("DAY_PARTED", 1);
    public static final GreetingType GENERIC = new GreetingType("GENERIC", 2);

    private static final /* synthetic */ GreetingType[] $values() {
        return new GreetingType[]{SEASONAL, DAY_PARTED, GENERIC};
    }

    static {
        GreetingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private GreetingType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<GreetingType> getEntries() {
        return $ENTRIES;
    }

    public static GreetingType valueOf(String str) {
        return (GreetingType) Enum.valueOf(GreetingType.class, str);
    }

    public static GreetingType[] values() {
        return (GreetingType[]) $VALUES.clone();
    }
}
