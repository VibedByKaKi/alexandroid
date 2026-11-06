package com.amazon.tarazed.notifier;

import com.amazon.devicesetupservice.scap.v1.BleConnectionPriority;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/notifier/ListenerPriority;", "", "(Ljava/lang/String;I)V", BleConnectionPriority.HIGH, "MEDIUM", BleConnectionPriority.LOW, "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ListenerPriority {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ListenerPriority[] $VALUES;
    public static final ListenerPriority HIGH = new ListenerPriority(BleConnectionPriority.HIGH, 0);
    public static final ListenerPriority MEDIUM = new ListenerPriority("MEDIUM", 1);
    public static final ListenerPriority LOW = new ListenerPriority(BleConnectionPriority.LOW, 2);

    private static final /* synthetic */ ListenerPriority[] $values() {
        return new ListenerPriority[]{HIGH, MEDIUM, LOW};
    }

    static {
        ListenerPriority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ListenerPriority(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ListenerPriority> getEntries() {
        return $ENTRIES;
    }

    public static ListenerPriority valueOf(String str) {
        return (ListenerPriority) Enum.valueOf(ListenerPriority.class, str);
    }

    public static ListenerPriority[] values() {
        return (ListenerPriority[]) $VALUES.clone();
    }
}
