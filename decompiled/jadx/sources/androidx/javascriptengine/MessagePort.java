package androidx.javascriptengine;

import androidx.annotation.VisibleForTesting;
import androidx.javascriptengine.common.MessagePortInternal;
import java.util.Objects;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes14.dex */
public final class MessagePort implements AutoCloseable {
    private final MessagePortInternal mMessagePortInternal;

    public MessagePort() {
        this.mMessagePortInternal = new MessagePortInternal();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mMessagePortInternal.close();
    }

    @VisibleForTesting
    public MessagePortInternal getMessagePortInternalForTest() {
        return this.mMessagePortInternal;
    }

    public void postMessage(Message message) {
        Objects.requireNonNull(message);
        int type = message.getType();
        if (type == 0) {
            this.mMessagePortInternal.postString(message.getString());
        } else {
            if (type == 1) {
                this.mMessagePortInternal.postArrayBuffer(message.getArrayBuffer());
                return;
            }
            throw new UnsupportedOperationException("Unsupported message type: " + message.getType());
        }
    }

    public MessagePort(MessagePortInternal messagePortInternal) {
        this.mMessagePortInternal = messagePortInternal;
    }
}
