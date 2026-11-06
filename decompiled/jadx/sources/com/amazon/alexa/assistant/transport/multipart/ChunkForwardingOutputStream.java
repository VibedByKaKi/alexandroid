package com.amazon.alexa.assistant.transport.multipart;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\u0007J\b\u0010\u0013\u001a\u00020\bH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/assistant/transport/multipart/ChunkForwardingOutputStream;", "Ljava/io/OutputStream;", "shouldForward", "Lkotlin/Function0;", "", "onChunk", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "buffer", "Ljava/io/ByteArrayOutputStream;", "write", "b", "", "off", "len", "toByteArray", "forwardIfRequested", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ChunkForwardingOutputStream extends OutputStream {

    @NotNull
    private final ByteArrayOutputStream buffer;

    @NotNull
    private final Function1<byte[], Unit> onChunk;

    @NotNull
    private final Function0<Boolean> shouldForward;

    /* JADX WARN: Multi-variable type inference failed */
    public ChunkForwardingOutputStream(@NotNull Function0<Boolean> function0, @NotNull Function1<? super byte[], Unit> function1) {
        function0.getClass();
        function1.getClass();
        this.shouldForward = function0;
        this.onChunk = function1;
        this.buffer = new ByteArrayOutputStream();
    }

    private final void forwardIfRequested() {
        if (this.shouldForward.invoke().booleanValue()) {
            Function1<byte[], Unit> function1 = this.onChunk;
            byte[] byteArray = this.buffer.toByteArray();
            byteArray.getClass();
            function1.invoke(byteArray);
        }
    }

    @NotNull
    public final byte[] toByteArray() {
        byte[] byteArray = this.buffer.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    @Override // java.io.OutputStream
    public void write(@NotNull byte[] b, int off, int len) {
        b.getClass();
        if (len == 0) {
            return;
        }
        this.buffer.write(b, off, len);
        forwardIfRequested();
    }

    @Override // java.io.OutputStream
    public void write(int b) {
        this.buffer.write(b);
        forwardIfRequested();
    }
}
