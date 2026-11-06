package io.ktor.network.sockets;

import java.net.SocketAddress;
import kotlin.Metadata;
import kotlinx.io.core.ByteReadPacket;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/network/sockets/Datagram;", "", "packet", "Lkotlinx/io/core/ByteReadPacket;", "address", "Ljava/net/SocketAddress;", "(Lkotlinx/io/core/ByteReadPacket;Ljava/net/SocketAddress;)V", "getAddress", "()Ljava/net/SocketAddress;", "getPacket", "()Lkotlinx/io/core/ByteReadPacket;", "ktor-network"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class Datagram {

    @NotNull
    private final SocketAddress address;

    @NotNull
    private final ByteReadPacket packet;

    public Datagram(@NotNull ByteReadPacket byteReadPacket, @NotNull SocketAddress socketAddress) {
        byteReadPacket.getClass();
        socketAddress.getClass();
        this.packet = byteReadPacket;
        this.address = socketAddress;
        if (byteReadPacket.m26896getRemaining() <= 65535) {
            return;
        }
        throw new IllegalArgumentException(("Datagram size limit exceeded: " + byteReadPacket.m26896getRemaining() + " of possible 65535").toString());
    }

    @NotNull
    public final SocketAddress getAddress() {
        return this.address;
    }

    @NotNull
    public final ByteReadPacket getPacket() {
        return this.packet;
    }
}
