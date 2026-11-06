package io.ktor.network.sockets;

import io.ktor.network.sockets.DatagramReadChannel;
import io.ktor.network.sockets.DatagramWriteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/network/sockets/DatagramReadWriteChannel;", "Lio/ktor/network/sockets/DatagramReadChannel;", "Lio/ktor/network/sockets/DatagramWriteChannel;", "ktor-network"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public interface DatagramReadWriteChannel extends DatagramReadChannel, DatagramWriteChannel {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    public static final class DefaultImpls {
        @Nullable
        public static Object receive(DatagramReadWriteChannel datagramReadWriteChannel, @NotNull Continuation<? super Datagram> continuation) {
            return DatagramReadChannel.DefaultImpls.receive(datagramReadWriteChannel, continuation);
        }

        @Nullable
        public static Object send(DatagramReadWriteChannel datagramReadWriteChannel, @NotNull Datagram datagram, @NotNull Continuation<? super Unit> continuation) {
            return DatagramWriteChannel.DefaultImpls.send(datagramReadWriteChannel, datagram, continuation);
        }
    }
}
