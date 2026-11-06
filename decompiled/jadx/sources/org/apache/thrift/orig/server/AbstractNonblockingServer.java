package org.apache.thrift.orig.server;

import com.amazon.alexa.accessory.frames.media.transform.lce.LceConfigDefaults;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.thrift.orig.TAsyncProcessor;
import org.apache.thrift.orig.TByteArrayOutputStream;
import org.apache.thrift.orig.TException;
import org.apache.thrift.orig.protocol.TProtocol;
import org.apache.thrift.orig.server.TServer;
import org.apache.thrift.orig.transport.TIOStreamTransport;
import org.apache.thrift.orig.transport.TMemoryInputTransport;
import org.apache.thrift.orig.transport.TNonblockingServerTransport;
import org.apache.thrift.orig.transport.TNonblockingTransport;
import org.apache.thrift.orig.transport.TTransport;
import org.apache.thrift.orig.transport.TTransportException;
import org.apache.thrift.orig.transport.layered.TFramedTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class AbstractNonblockingServer extends TServer {
    protected final Logger LOGGER;
    final long MAX_READ_BUFFER_BYTES;
    final AtomicLong readBufferBytesAllocated;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.apache.thrift.orig.server.AbstractNonblockingServer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$thrift$server$AbstractNonblockingServer$FrameBufferState;

        static {
            int[] iArr = new int[FrameBufferState.values().length];
            $SwitchMap$org$apache$thrift$server$AbstractNonblockingServer$FrameBufferState = iArr;
            try {
                iArr[FrameBufferState.AWAITING_REGISTER_WRITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$thrift$server$AbstractNonblockingServer$FrameBufferState[FrameBufferState.AWAITING_REGISTER_READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$thrift$server$AbstractNonblockingServer$FrameBufferState[FrameBufferState.AWAITING_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class AbstractNonblockingServerArgs<T extends AbstractNonblockingServerArgs<T>> extends TServer.AbstractServerArgs<T> {
        public long maxReadBufferBytes;

        public AbstractNonblockingServerArgs(TNonblockingServerTransport tNonblockingServerTransport) {
            super(tNonblockingServerTransport);
            this.maxReadBufferBytes = LceConfigDefaults.MEMORY_HEADROOM_MARGIN_BYTES;
            transportFactory(new TFramedTransport.Factory());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public abstract class AbstractSelectThread extends Thread {
        protected final Set<FrameBuffer> selectInterestChanges = new HashSet();
        protected Selector selector = SelectorProvider.provider().openSelector();

        public AbstractSelectThread() throws IOException {
        }

        public void cleanupSelectionKey(SelectionKey selectionKey) {
            FrameBuffer frameBuffer = (FrameBuffer) selectionKey.attachment();
            if (frameBuffer != null) {
                frameBuffer.close();
            }
            selectionKey.cancel();
        }

        public void handleRead(SelectionKey selectionKey) {
            FrameBuffer frameBuffer = (FrameBuffer) selectionKey.attachment();
            if (!frameBuffer.read()) {
                cleanupSelectionKey(selectionKey);
            } else {
                if (!frameBuffer.isFrameFullyRead() || AbstractNonblockingServer.this.requestInvoke(frameBuffer)) {
                    return;
                }
                cleanupSelectionKey(selectionKey);
            }
        }

        public void handleWrite(SelectionKey selectionKey) {
            if (((FrameBuffer) selectionKey.attachment()).write()) {
                return;
            }
            cleanupSelectionKey(selectionKey);
        }

        public void processInterestChanges() {
            synchronized (this.selectInterestChanges) {
                try {
                    Iterator<FrameBuffer> it2 = this.selectInterestChanges.iterator();
                    while (it2.hasNext()) {
                        it2.next().changeSelectInterests();
                    }
                    this.selectInterestChanges.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void requestSelectInterestChange(FrameBuffer frameBuffer) {
            synchronized (this.selectInterestChanges) {
                this.selectInterestChanges.add(frameBuffer);
            }
            this.selector.wakeup();
        }

        public void wakeupSelector() {
            this.selector.wakeup();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class AsyncFrameBuffer extends FrameBuffer {
        public AsyncFrameBuffer(TNonblockingTransport tNonblockingTransport, SelectionKey selectionKey, AbstractSelectThread abstractSelectThread) throws TTransportException {
            super(tNonblockingTransport, selectionKey, abstractSelectThread);
        }

        public TProtocol getInputProtocol() {
            return this.inProt_;
        }

        public TProtocol getOutputProtocol() {
            return this.outProt_;
        }

        @Override // org.apache.thrift.orig.server.AbstractNonblockingServer.FrameBuffer
        public void invoke() {
            this.frameTrans_.reset(this.buffer_.array());
            this.response_.reset();
            try {
                TServerEventHandler tServerEventHandler = AbstractNonblockingServer.this.eventHandler_;
                if (tServerEventHandler != null) {
                    tServerEventHandler.processContext(this.context_, this.inTrans_, this.outTrans_);
                }
                ((TAsyncProcessor) AbstractNonblockingServer.this.processorFactory_.getProcessor(this.inTrans_)).process(this);
            } catch (TException e) {
                AbstractNonblockingServer.this.LOGGER.warn("Exception while invoking!", (Throwable) e);
                this.state_ = FrameBufferState.AWAITING_CLOSE;
                requestSelectInterestChange();
            } catch (Throwable th) {
                AbstractNonblockingServer.this.LOGGER.error("Unexpected throwable while invoking!", th);
                this.state_ = FrameBufferState.AWAITING_CLOSE;
                requestSelectInterestChange();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class FrameBuffer {
        protected final ServerContext context_;
        protected final TMemoryInputTransport frameTrans_;
        protected final TProtocol inProt_;
        protected final TTransport inTrans_;
        protected final TProtocol outProt_;
        protected final TTransport outTrans_;
        protected final TByteArrayOutputStream response_;
        protected final AbstractSelectThread selectThread_;
        protected SelectionKey selectionKey_;
        protected final TNonblockingTransport trans_;
        private final Logger LOGGER = LoggerFactory.getLogger(getClass().getName());
        protected FrameBufferState state_ = FrameBufferState.READING_FRAME_SIZE;
        protected ByteBuffer buffer_ = ByteBuffer.allocate(4);

        public FrameBuffer(TNonblockingTransport tNonblockingTransport, SelectionKey selectionKey, AbstractSelectThread abstractSelectThread) throws TTransportException {
            this.trans_ = tNonblockingTransport;
            this.selectionKey_ = selectionKey;
            this.selectThread_ = abstractSelectThread;
            TMemoryInputTransport tMemoryInputTransport = new TMemoryInputTransport();
            this.frameTrans_ = tMemoryInputTransport;
            TByteArrayOutputStream tByteArrayOutputStream = new TByteArrayOutputStream();
            this.response_ = tByteArrayOutputStream;
            TTransport transport = AbstractNonblockingServer.this.inputTransportFactory_.getTransport(tMemoryInputTransport);
            this.inTrans_ = transport;
            TTransport transport2 = AbstractNonblockingServer.this.outputTransportFactory_.getTransport(new TIOStreamTransport(tByteArrayOutputStream));
            this.outTrans_ = transport2;
            TProtocol protocol = AbstractNonblockingServer.this.inputProtocolFactory_.getProtocol(transport);
            this.inProt_ = protocol;
            TProtocol protocol2 = AbstractNonblockingServer.this.outputProtocolFactory_.getProtocol(transport2);
            this.outProt_ = protocol2;
            TServerEventHandler tServerEventHandler = AbstractNonblockingServer.this.eventHandler_;
            if (tServerEventHandler != null) {
                this.context_ = tServerEventHandler.createContext(protocol, protocol2);
            } else {
                this.context_ = null;
            }
        }

        private boolean internalRead() {
            try {
                return this.trans_.read(this.buffer_) >= 0;
            } catch (TTransportException e) {
                this.LOGGER.warn("Got an Exception in internalRead", (Throwable) e);
                return false;
            }
        }

        private void prepareRead() {
            if (this.selectionKey_.isValid()) {
                this.selectionKey_.interestOps(1);
            } else {
                this.LOGGER.warn("SelectionKey was invalidated before read");
            }
            this.buffer_ = ByteBuffer.allocate(4);
            this.state_ = FrameBufferState.READING_FRAME_SIZE;
        }

        public void changeSelectInterests() {
            int i = AnonymousClass1.$SwitchMap$org$apache$thrift$server$AbstractNonblockingServer$FrameBufferState[this.state_.ordinal()];
            if (i == 1) {
                if (!this.selectionKey_.isValid()) {
                    this.LOGGER.warn("SelectionKey was invalidated before write");
                    return;
                } else {
                    this.selectionKey_.interestOps(4);
                    this.state_ = FrameBufferState.WRITING;
                    return;
                }
            }
            if (i == 2) {
                prepareRead();
            } else if (i != 3) {
                this.LOGGER.error("changeSelectInterest was called, but state is invalid ({})", this.state_);
            } else {
                close();
                this.selectionKey_.cancel();
            }
        }

        public void close() {
            FrameBufferState frameBufferState = this.state_;
            if (frameBufferState == FrameBufferState.READING_FRAME || frameBufferState == FrameBufferState.READ_FRAME_COMPLETE || frameBufferState == FrameBufferState.AWAITING_CLOSE) {
                AbstractNonblockingServer.this.readBufferBytesAllocated.addAndGet(-this.buffer_.array().length);
            }
            this.trans_.close();
            TServerEventHandler tServerEventHandler = AbstractNonblockingServer.this.eventHandler_;
            if (tServerEventHandler != null) {
                tServerEventHandler.deleteContext(this.context_, this.inProt_, this.outProt_);
            }
        }

        public void invoke() {
            this.frameTrans_.reset(this.buffer_.array());
            this.response_.reset();
            try {
                TServerEventHandler tServerEventHandler = AbstractNonblockingServer.this.eventHandler_;
                if (tServerEventHandler != null) {
                    tServerEventHandler.processContext(this.context_, this.inTrans_, this.outTrans_);
                }
                AbstractNonblockingServer.this.processorFactory_.getProcessor(this.inTrans_).process(this.inProt_, this.outProt_);
                responseReady();
            } catch (TException e) {
                this.LOGGER.warn("Exception while invoking!", (Throwable) e);
                this.state_ = FrameBufferState.AWAITING_CLOSE;
                requestSelectInterestChange();
            } catch (Throwable th) {
                this.LOGGER.error("Unexpected throwable while invoking!", th);
                this.state_ = FrameBufferState.AWAITING_CLOSE;
                requestSelectInterestChange();
            }
        }

        public boolean isFrameFullyRead() {
            return this.state_ == FrameBufferState.READ_FRAME_COMPLETE;
        }

        public boolean read() {
            if (this.state_ == FrameBufferState.READING_FRAME_SIZE) {
                if (!internalRead()) {
                    return false;
                }
                if (this.buffer_.remaining() != 0) {
                    return true;
                }
                int i = this.buffer_.getInt(0);
                if (i <= 0) {
                    this.LOGGER.error("Read an invalid frame size of " + i + ". Are you using TFramedTransport on the client side?");
                    return false;
                }
                if (i > this.trans_.getMaxFrameSize()) {
                    Logger logger = this.LOGGER;
                    StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(i, "Read a frame size of ", ", which is bigger than the maximum allowable frame size ");
                    m0m.append(this.trans_.getMaxFrameSize());
                    m0m.append(" for ALL connections.");
                    logger.error(m0m.toString());
                    return false;
                }
                long j = AbstractNonblockingServer.this.readBufferBytesAllocated.get() + i;
                AbstractNonblockingServer abstractNonblockingServer = AbstractNonblockingServer.this;
                if (j > abstractNonblockingServer.MAX_READ_BUFFER_BYTES) {
                    return true;
                }
                int i2 = i + 4;
                abstractNonblockingServer.readBufferBytesAllocated.addAndGet(i2);
                ByteBuffer allocate = ByteBuffer.allocate(i2);
                this.buffer_ = allocate;
                allocate.putInt(i);
                this.state_ = FrameBufferState.READING_FRAME;
            }
            if (this.state_ != FrameBufferState.READING_FRAME) {
                this.LOGGER.error("Read was called but state is invalid (" + this.state_ + MarkdownConstants.RIGHT_PARENTHESIS);
                return false;
            }
            if (!internalRead()) {
                return false;
            }
            if (this.buffer_.remaining() == 0) {
                if (this.selectionKey_.isValid()) {
                    this.selectionKey_.interestOps(0);
                } else {
                    this.LOGGER.warn("SelectionKey was invalidated during read");
                }
                this.state_ = FrameBufferState.READ_FRAME_COMPLETE;
            }
            return true;
        }

        public void requestSelectInterestChange() {
            Thread currentThread = Thread.currentThread();
            AbstractSelectThread abstractSelectThread = this.selectThread_;
            if (currentThread == abstractSelectThread) {
                changeSelectInterests();
            } else {
                abstractSelectThread.requestSelectInterestChange(this);
            }
        }

        public void responseReady() {
            AbstractNonblockingServer.this.readBufferBytesAllocated.addAndGet(-this.buffer_.array().length);
            if (this.response_.len() == 0) {
                this.state_ = FrameBufferState.AWAITING_REGISTER_READ;
                this.buffer_ = null;
            } else {
                this.buffer_ = ByteBuffer.wrap(this.response_.get(), 0, this.response_.len());
                this.state_ = FrameBufferState.AWAITING_REGISTER_WRITE;
            }
            requestSelectInterestChange();
        }

        public void setSelectionKey(SelectionKey selectionKey) {
            this.selectionKey_ = selectionKey;
        }

        public boolean write() {
            if (this.state_ != FrameBufferState.WRITING) {
                this.LOGGER.error("Write was called, but state is invalid (" + this.state_ + MarkdownConstants.RIGHT_PARENTHESIS);
                return false;
            }
            try {
                if (this.trans_.write(this.buffer_) < 0) {
                    return false;
                }
                if (this.buffer_.remaining() != 0) {
                    return true;
                }
                prepareRead();
                return true;
            } catch (TTransportException e) {
                this.LOGGER.warn("Got an Exception during write", (Throwable) e);
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FrameBufferState {
        READING_FRAME_SIZE,
        READING_FRAME,
        READ_FRAME_COMPLETE,
        AWAITING_REGISTER_WRITE,
        WRITING,
        AWAITING_REGISTER_READ,
        AWAITING_CLOSE
    }

    public AbstractNonblockingServer(AbstractNonblockingServerArgs<?> abstractNonblockingServerArgs) {
        super(abstractNonblockingServerArgs);
        this.LOGGER = LoggerFactory.getLogger(getClass().getName());
        this.readBufferBytesAllocated = new AtomicLong(0L);
        this.MAX_READ_BUFFER_BYTES = abstractNonblockingServerArgs.maxReadBufferBytes;
    }

    public abstract boolean requestInvoke(FrameBuffer frameBuffer);

    @Override // org.apache.thrift.orig.server.TServer
    public void serve() {
        if (startThreads() && startListening()) {
            setServing(true);
            waitForShutdown();
            setServing(false);
            stopListening();
        }
    }

    public boolean startListening() {
        try {
            this.serverTransport_.listen();
            return true;
        } catch (TTransportException e) {
            this.LOGGER.error("Failed to start listening on server socket!", (Throwable) e);
            return false;
        }
    }

    public abstract boolean startThreads();

    public void stopListening() {
        this.serverTransport_.close();
    }

    public abstract void waitForShutdown();
}
