package com.amazon.alexa.assistant.capability.speechrecognizer;

import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/BufferedStreamBinding;", "", "bufferSize", "", "<init>", "(I)V", "pipedOutput", "Ljava/io/PipedOutputStream;", "pipedInput", "Ljava/io/PipedInputStream;", VoiceChatContract.COLUMN_IS_ACTIVE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "getOutputStream", "()Ljava/io/OutputStream;", "finishOutput", "", "finishOutput$voice_release", "stopOutput", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BufferedStreamBinding {

    @NotNull
    private final InputStream inputStream;

    @NotNull
    private final AtomicBoolean isActive;

    @NotNull
    private final OutputStream outputStream;

    @NotNull
    private final PipedInputStream pipedInput;

    @NotNull
    private final PipedOutputStream pipedOutput;

    public BufferedStreamBinding(int i) {
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.pipedOutput = pipedOutputStream;
        this.pipedInput = new PipedInputStream(pipedOutputStream, i);
        this.isActive = new AtomicBoolean(true);
        this.inputStream = new InputStream() { // from class: com.amazon.alexa.assistant.capability.speechrecognizer.BufferedStreamBinding$inputStream$1
            @Override // java.io.InputStream
            public int available() {
                PipedInputStream pipedInputStream;
                pipedInputStream = BufferedStreamBinding.this.pipedInput;
                return pipedInputStream.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                PipedInputStream pipedInputStream;
                pipedInputStream = BufferedStreamBinding.this.pipedInput;
                pipedInputStream.close();
            }

            @Override // java.io.InputStream
            public int read(byte[] b, int off, int len) {
                AtomicBoolean atomicBoolean;
                PipedInputStream pipedInputStream;
                b.getClass();
                atomicBoolean = BufferedStreamBinding.this.isActive;
                if (!atomicBoolean.get()) {
                    return -1;
                }
                pipedInputStream = BufferedStreamBinding.this.pipedInput;
                return pipedInputStream.read(b, off, len);
            }

            @Override // java.io.InputStream
            public int read() {
                AtomicBoolean atomicBoolean;
                PipedInputStream pipedInputStream;
                atomicBoolean = BufferedStreamBinding.this.isActive;
                if (!atomicBoolean.get()) {
                    return -1;
                }
                pipedInputStream = BufferedStreamBinding.this.pipedInput;
                return pipedInputStream.read();
            }
        };
        this.outputStream = pipedOutputStream;
    }

    public final void finishOutput$voice_release() {
        this.pipedOutput.close();
    }

    @NotNull
    public final InputStream getInputStream() {
        return this.inputStream;
    }

    @NotNull
    public final OutputStream getOutputStream() {
        return this.outputStream;
    }

    public final void stopOutput() {
        this.isActive.set(false);
        this.pipedOutput.close();
    }

    public BufferedStreamBinding() {
        this(0, 1, null);
    }

    public /* synthetic */ BufferedStreamBinding(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 65536 : i);
    }
}
