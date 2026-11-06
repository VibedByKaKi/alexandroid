package com.amazon.dee.app.services.internetsharing.socks5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/socks5/AddressType;", "", "value", "", "<init>", "(Ljava/lang/String;IB)V", "getValue", "()B", "IPV4", "DOMAIN", "IPV6", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AddressType[] $VALUES;
    private final byte value;
    public static final AddressType IPV4 = new AddressType("IPV4", 0, (byte) 1);
    public static final AddressType DOMAIN = new AddressType("DOMAIN", 1, (byte) 3);
    public static final AddressType IPV6 = new AddressType("IPV6", 2, (byte) 4);

    private static final /* synthetic */ AddressType[] $values() {
        return new AddressType[]{IPV4, DOMAIN, IPV6};
    }

    static {
        AddressType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AddressType(String str, int i, byte b) {
        this.value = b;
    }

    @NotNull
    public static EnumEntries<AddressType> getEntries() {
        return $ENTRIES;
    }

    public static AddressType valueOf(String str) {
        return (AddressType) Enum.valueOf(AddressType.class, str);
    }

    public static AddressType[] values() {
        return (AddressType[]) $VALUES.clone();
    }

    public final byte getValue() {
        return this.value;
    }
}
