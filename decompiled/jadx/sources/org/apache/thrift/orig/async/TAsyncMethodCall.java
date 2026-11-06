package org.apache.thrift.orig.async;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.concurrent.atomic.AtomicLong;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.thrift.orig.TException;
import org.apache.thrift.orig.protocol.TProtocol;
import org.apache.thrift.orig.protocol.TProtocolFactory;
import org.apache.thrift.orig.transport.TMemoryBuffer;
import org.apache.thrift.orig.transport.TNonblockingTransport;
import org.apache.thrift.orig.transport.TTransportException;
import org.apache.thrift.orig.transport.layered.TFramedTransport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TAsyncMethodCall<T> {
    private static final int INITIAL_MEMORY_BUFFER_SIZE = 128;
    private static final AtomicLong sequenceIdCounter = new AtomicLong(0);
    private final AsyncMethodCallback<T> callback;
    protected final TAsyncClient client;
    private ByteBuffer frameBuffer;
    private final boolean isOneway;
    private final TProtocolFactory protocolFactory;
    private ByteBuffer sizeBuffer;
    private final long timeout;
    protected final TNonblockingTransport transport;
    private State state = null;
    private final byte[] sizeBufferArray = new byte[4];
    private final long startTime = System.currentTimeMillis();
    private final long sequenceId = sequenceIdCounter.getAndIncrement();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.apache.thrift.orig.async.TAsyncMethodCall$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State = iArr;
            try {
                iArr[State.CONNECTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[State.WRITING_REQUEST_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[State.WRITING_REQUEST_BODY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[State.READING_RESPONSE_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[State.READING_RESPONSE_BODY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        CONNECTING,
        WRITING_REQUEST_SIZE,
        WRITING_REQUEST_BODY,
        READING_RESPONSE_SIZE,
        READING_RESPONSE_BODY,
        RESPONSE_READ,
        ERROR
    }

    public TAsyncMethodCall(TAsyncClient tAsyncClient, TProtocolFactory tProtocolFactory, TNonblockingTransport tNonblockingTransport, AsyncMethodCallback<T> asyncMethodCallback, boolean z) {
        this.transport = tNonblockingTransport;
        this.callback = asyncMethodCallback;
        this.protocolFactory = tProtocolFactory;
        this.client = tAsyncClient;
        this.isOneway = z;
        this.timeout = tAsyncClient.getTimeout();
    }

    private void cleanUpAndFireCallback(SelectionKey selectionKey) {
        this.state = State.RESPONSE_READ;
        selectionKey.interestOps(0);
        selectionKey.attach(null);
        try {
            T result = getResult();
            this.client.onComplete();
            this.callback.onComplete(result);
        } catch (Exception e) {
            selectionKey.cancel();
            onError(e);
        }
    }

    private void doConnecting(SelectionKey selectionKey) throws IOException {
        if (selectionKey.isConnectable() && this.transport.finishConnect()) {
            registerForFirstWrite(selectionKey);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$2("not connectable or finishConnect returned false after we got an OP_CONNECT");
        }
    }

    private void doReadingResponseBody(SelectionKey selectionKey) throws TTransportException {
        if (this.transport.read(this.frameBuffer) < 0) {
            throw new TTransportException(4, "Read call frame failed");
        }
        if (this.frameBuffer.remaining() == 0) {
            cleanUpAndFireCallback(selectionKey);
        }
    }

    private void doReadingResponseSize() throws TTransportException {
        if (this.transport.read(this.sizeBuffer) < 0) {
            throw new TTransportException(4, "Read call frame size failed");
        }
        if (this.sizeBuffer.remaining() == 0) {
            this.state = State.READING_RESPONSE_BODY;
            this.frameBuffer = ByteBuffer.allocate(TFramedTransport.decodeFrameSize(this.sizeBufferArray));
        }
    }

    private void doWritingRequestBody(SelectionKey selectionKey) throws TTransportException {
        if (this.transport.write(this.frameBuffer) < 0) {
            throw new TTransportException(4, "Write call frame failed");
        }
        if (this.frameBuffer.remaining() == 0) {
            if (this.isOneway) {
                cleanUpAndFireCallback(selectionKey);
                return;
            }
            this.state = State.READING_RESPONSE_SIZE;
            this.sizeBuffer.rewind();
            selectionKey.interestOps(1);
        }
    }

    private void doWritingRequestSize() throws TTransportException {
        if (this.transport.write(this.sizeBuffer) < 0) {
            throw new TTransportException(4, "Write call frame size failed");
        }
        if (this.sizeBuffer.remaining() == 0) {
            this.state = State.WRITING_REQUEST_BODY;
        }
    }

    public TAsyncClient getClient() {
        return this.client;
    }

    public ByteBuffer getFrameBuffer() {
        return this.frameBuffer;
    }

    public abstract T getResult() throws Exception;

    public long getSequenceId() {
        return this.sequenceId;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public State getState() {
        return this.state;
    }

    public long getTimeoutTimestamp() {
        return this.timeout + this.startTime;
    }

    public boolean hasTimeout() {
        return this.timeout > 0;
    }

    public boolean isFinished() {
        return this.state == State.RESPONSE_READ;
    }

    public void onError(Exception exc) {
        this.client.onError(exc);
        this.callback.onError(exc);
        this.state = State.ERROR;
    }

    public void prepareMethodCall() throws TException {
        TMemoryBuffer tMemoryBuffer = new TMemoryBuffer(128);
        write_args(this.protocolFactory.getProtocol(tMemoryBuffer));
        int length = tMemoryBuffer.length();
        this.frameBuffer = ByteBuffer.wrap(tMemoryBuffer.getArray(), 0, length);
        TFramedTransport.encodeFrameSize(length, this.sizeBufferArray);
        this.sizeBuffer = ByteBuffer.wrap(this.sizeBufferArray);
    }

    public void registerForFirstWrite(SelectionKey selectionKey) throws IOException {
        this.state = State.WRITING_REQUEST_SIZE;
        selectionKey.interestOps(4);
    }

    public void start(Selector selector) throws IOException {
        SelectionKey registerSelector;
        if (this.transport.isOpen()) {
            this.state = State.WRITING_REQUEST_SIZE;
            registerSelector = this.transport.registerSelector(selector, 4);
        } else {
            this.state = State.CONNECTING;
            registerSelector = this.transport.registerSelector(selector, 8);
            if (this.transport.startConnect()) {
                registerForFirstWrite(registerSelector);
            }
        }
        registerSelector.attach(this);
    }

    public void transition(SelectionKey selectionKey) {
        if (!selectionKey.isValid()) {
            selectionKey.cancel();
            onError(new TTransportException("Selection key not valid!"));
            return;
        }
        try {
            int i = AnonymousClass1.$SwitchMap$org$apache$thrift$async$TAsyncMethodCall$State[this.state.ordinal()];
            if (i == 1) {
                doConnecting(selectionKey);
                return;
            }
            if (i == 2) {
                doWritingRequestSize();
                return;
            }
            if (i == 3) {
                doWritingRequestBody(selectionKey);
                return;
            }
            if (i == 4) {
                doReadingResponseSize();
            } else {
                if (i == 5) {
                    doReadingResponseBody(selectionKey);
                    return;
                }
                throw new IllegalStateException("Method call in state " + this.state + " but selector called transition method. Seems like a bug...");
            }
        } catch (Exception e) {
            selectionKey.cancel();
            selectionKey.attach(null);
            onError(e);
        }
    }

    public abstract void write_args(TProtocol tProtocol) throws TException;
}
