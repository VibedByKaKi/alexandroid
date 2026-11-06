package com.amazon.dee.app.services.internetsharing.socks5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/dee/app/services/internetsharing/socks5/Socks5Command;", "", "value", "", "<init>", "(Ljava/lang/String;IB)V", "getValue", "()B", "CONNECT", "BIND", "UDP_ASSOCIATE", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Socks5Command {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Socks5Command[] $VALUES;
    private final byte value;
    public static final Socks5Command CONNECT = new Socks5Command("CONNECT", 0, (byte) 1);
    public static final Socks5Command BIND = new Socks5Command("BIND", 1, (byte) 2);
    public static final Socks5Command UDP_ASSOCIATE = new Socks5Command("UDP_ASSOCIATE", 2, (byte) 3);

    private static final /* synthetic */ Socks5Command[] $values() {
        return new Socks5Command[]{CONNECT, BIND, UDP_ASSOCIATE};
    }

    static {
        Socks5Command[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Socks5Command(String str, int i, byte b) {
        this.value = b;
    }

    @NotNull
    public static EnumEntries<Socks5Command> getEntries() {
        return $ENTRIES;
    }

    public static Socks5Command valueOf(String str) {
        return (Socks5Command) Enum.valueOf(Socks5Command.class, str);
    }

    public static Socks5Command[] values() {
        return (Socks5Command[]) $VALUES.clone();
    }

    public final byte getValue() {
        return this.value;
    }
}
