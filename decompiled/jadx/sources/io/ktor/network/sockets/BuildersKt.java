package io.ktor.network.sockets;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import java.nio.channels.SelectableChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a#\u0010\u0007\u001a\u0002H\b\"\u0012\b\u0000\u0010\b*\f\u0012\u0004\u0012\u0002H\b\u0012\u0002\b\u00030\t*\u0002H\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"aSocket", "Lio/ktor/network/sockets/SocketBuilder;", "selector", "Lio/ktor/network/selector/SelectorManager;", "nonBlocking", "", "Ljava/nio/channels/SelectableChannel;", "tcpNoDelay", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/network/sockets/Configurable;", "(Lio/ktor/network/sockets/Configurable;)Lio/ktor/network/sockets/Configurable;", "ktor-network"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class BuildersKt {
    @NotNull
    public static final SocketBuilder aSocket(@NotNull SelectorManager selectorManager) {
        selectorManager.getClass();
        return new SocketBuilder(selectorManager, SocketOptions.INSTANCE.create$ktor_network());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nonBlocking(@NotNull SelectableChannel selectableChannel) {
        selectableChannel.configureBlocking(false);
    }

    @NotNull
    public static final <T extends Configurable<? extends T, ?>> T tcpNoDelay(@NotNull T t) {
        t.getClass();
        return (T) t.configure(new Function1<SocketOptions, Unit>() { // from class: io.ktor.network.sockets.BuildersKt$tcpNoDelay$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SocketOptions socketOptions) {
                socketOptions.getClass();
                if (socketOptions instanceof SocketOptions.TCPClientSocketOptions) {
                    ((SocketOptions.TCPClientSocketOptions) socketOptions).setNoDelay(true);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SocketOptions socketOptions) {
                invoke2(socketOptions);
                return Unit.INSTANCE;
            }
        });
    }
}
