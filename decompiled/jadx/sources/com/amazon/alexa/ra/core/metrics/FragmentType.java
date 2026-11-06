package com.amazon.alexa.ra.core.metrics;

import com.amazon.alexa.client.alexaservice.localfragment.LocalFragmentResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/core/metrics/FragmentType;", "", "<init>", "(Ljava/lang/String;I)V", LocalFragmentResult.DEFAULT_PURPOSE, "PREAMBLE", "USER", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
final class FragmentType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FragmentType[] $VALUES;
    public static final FragmentType AGENT = new FragmentType(LocalFragmentResult.DEFAULT_PURPOSE, 0);
    public static final FragmentType PREAMBLE = new FragmentType("PREAMBLE", 1);
    public static final FragmentType USER = new FragmentType("USER", 2);

    private static final /* synthetic */ FragmentType[] $values() {
        return new FragmentType[]{AGENT, PREAMBLE, USER};
    }

    static {
        FragmentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private FragmentType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FragmentType> getEntries() {
        return $ENTRIES;
    }

    public static FragmentType valueOf(String str) {
        return (FragmentType) Enum.valueOf(FragmentType.class, str);
    }

    public static FragmentType[] values() {
        return (FragmentType[]) $VALUES.clone();
    }
}
