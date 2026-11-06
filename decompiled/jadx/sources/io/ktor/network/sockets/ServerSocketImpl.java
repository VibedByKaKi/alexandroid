package io.ktor.network.sockets;

import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.mapbox.common.HttpHeaders;
import io.ktor.network.selector.InterestSuspensionsMap;
import io.ktor.network.selector.SelectInterest;
import io.ktor.network.selector.Selectable;
import io.ktor.network.selector.SelectableBase;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.ServerSocket;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u001d\u001a\u00020\u001eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0011\u0010 \u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\u0019\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0096\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lio/ktor/network/sockets/ServerSocketImpl;", "Lio/ktor/network/sockets/ServerSocket;", "Lio/ktor/network/selector/Selectable;", "channel", "Ljava/nio/channels/ServerSocketChannel;", "selector", "Lio/ktor/network/selector/SelectorManager;", "(Ljava/nio/channels/ServerSocketChannel;Lio/ktor/network/selector/SelectorManager;)V", "getChannel", "()Ljava/nio/channels/ServerSocketChannel;", "interestedOps", "", "getInterestedOps", "()I", "localAddress", "Ljava/net/SocketAddress;", "getLocalAddress", "()Ljava/net/SocketAddress;", "getSelector", "()Lio/ktor/network/selector/SelectorManager;", "socketContext", "Lkotlinx/coroutines/CompletableDeferred;", "", "getSocketContext", "()Lkotlinx/coroutines/CompletableDeferred;", "suspensions", "Lio/ktor/network/selector/InterestSuspensionsMap;", "getSuspensions", "()Lio/ktor/network/selector/InterestSuspensionsMap;", HttpHeaders.ACCEPT, "Lio/ktor/network/sockets/Socket;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acceptSuspend", BizMetricsConstants.ACCEPTED_BY_CUSTOMER_TRUE, "nioChannel", "Ljava/nio/channels/SocketChannel;", "close", "dispose", "interestOp", "interest", "Lio/ktor/network/selector/SelectInterest;", "state", "", "ktor-network"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class ServerSocketImpl implements ServerSocket, Selectable {
    private final /* synthetic */ SelectableBase $$delegate_0;

    @NotNull
    private final ServerSocketChannel channel;

    @NotNull
    private final SelectorManager selector;

    @NotNull
    private final CompletableDeferred<Unit> socketContext;

    public ServerSocketImpl(@NotNull ServerSocketChannel serverSocketChannel, @NotNull SelectorManager selectorManager) {
        serverSocketChannel.getClass();
        selectorManager.getClass();
        this.$$delegate_0 = new SelectableBase(serverSocketChannel);
        this.channel = serverSocketChannel;
        this.selector = selectorManager;
        if (getChannel().isBlocking()) {
            Single$$ExternalSyntheticBUOutline0.m$3("channel need to be configured as non-blocking");
            throw null;
        }
        this.socketContext = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    }

    private final Socket accepted(SocketChannel nioChannel) {
        interestOp(SelectInterest.ACCEPT, false);
        java.net.Socket socket = nioChannel.socket();
        if (socket == null) {
            Intrinsics.throwNpe();
        }
        nioChannel.configureBlocking(false);
        socket.setTcpNoDelay(true);
        return new SocketImpl(nioChannel, socket, this.selector);
    }

    @Override // io.ktor.network.sockets.Acceptable
    @Nullable
    public Object accept(@NotNull Continuation<? super Socket> continuation) {
        SocketChannel accept = getChannel().accept();
        return accept != null ? accepted(accept) : acceptSuspend(continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:14:0x0050). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object acceptSuspend(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super io.ktor.network.sockets.Socket> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1 r0 = (io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1 r0 = new io.ktor.network.sockets.ServerSocketImpl$acceptSuspend$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$0
            io.ktor.network.sockets.ServerSocketImpl r4 = (io.ktor.network.sockets.ServerSocketImpl) r4
            boolean r2 = r5 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L2e
            goto L50
        L2e:
            kotlin.Result$Failure r5 = (kotlin.Result.Failure) r5
            java.lang.Throwable r4 = r5.exception
            throw r4
        L33:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r4)
            r4 = 0
            return r4
        L3a:
            boolean r2 = r5 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L5f
        L3e:
            io.ktor.network.selector.SelectInterest r5 = io.ktor.network.selector.SelectInterest.ACCEPT
            r4.interestOp(r5, r3)
            io.ktor.network.selector.SelectorManager r2 = r4.selector
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r2.select(r4, r5, r0)
            if (r5 != r1) goto L50
            return r1
        L50:
            java.nio.channels.ServerSocketChannel r5 = r4.getChannel()
            java.nio.channels.SocketChannel r5 = r5.accept()
            if (r5 == 0) goto L3e
            io.ktor.network.sockets.Socket r4 = r4.accepted(r5)
            return r4
        L5f:
            kotlin.Result$Failure r5 = (kotlin.Result.Failure) r5
            java.lang.Throwable r4 = r5.exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.ServerSocketImpl.acceptSuspend(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            try {
                getChannel().close();
                this.selector.notifyClosed(this);
                getSocketContext().complete(Unit.INSTANCE);
            } catch (Throwable th) {
                this.selector.notifyClosed(this);
                throw th;
            }
        } catch (Throwable th2) {
            getSocketContext().completeExceptionally(th2);
        }
    }

    @Override // io.ktor.network.sockets.ASocket, kotlinx.coroutines.DisposableHandle
    public void dispose() {
        ServerSocket.DefaultImpls.dispose(this);
    }

    @Override // io.ktor.network.selector.Selectable
    public int getInterestedOps() {
        return this.$$delegate_0.getInterestedOps();
    }

    @Override // io.ktor.network.sockets.ABoundSocket
    @NotNull
    public SocketAddress getLocalAddress() {
        java.net.ServerSocket socket = getChannel().socket();
        socket.getClass();
        SocketAddress localSocketAddress = socket.getLocalSocketAddress();
        localSocketAddress.getClass();
        return localSocketAddress;
    }

    @NotNull
    public final SelectorManager getSelector() {
        return this.selector;
    }

    @Override // io.ktor.network.selector.Selectable
    @NotNull
    public InterestSuspensionsMap getSuspensions() {
        return this.$$delegate_0.getSuspensions();
    }

    @Override // io.ktor.network.selector.Selectable
    public void interestOp(@NotNull SelectInterest interest, boolean state) {
        interest.getClass();
        this.$$delegate_0.interestOp(interest, state);
    }

    @Override // io.ktor.network.selector.Selectable
    @NotNull
    public ServerSocketChannel getChannel() {
        return this.channel;
    }

    @Override // io.ktor.network.sockets.ASocket
    @NotNull
    public CompletableDeferred<Unit> getSocketContext() {
        return this.socketContext;
    }
}
