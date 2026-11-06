package expo.modules.fetch;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0010J\u0006\u0010\u0011\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lexpo/modules/fetch/ResponseSink;", "", "<init>", "()V", "bodyQueue", "", "", "isFinalized", "", "value", "bodyUsed", "getBodyUsed", "()Z", "appendBufferBody", "", "data", "appendBufferBody$expo_release", "finalize", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResponseSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseSink.kt\nexpo/modules/fetch/ResponseSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
/* loaded from: classes9.dex */
public final class ResponseSink {

    @NotNull
    private final List<byte[]> bodyQueue = new ArrayList();
    private boolean bodyUsed;
    private boolean isFinalized;

    public final void appendBufferBody$expo_release(@NotNull byte[] data) {
        data.getClass();
        this.bodyUsed = true;
        this.bodyQueue.add(data);
    }

    @NotNull
    public final byte[] finalize() {
        Iterator<T> it2 = this.bodyQueue.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += ((byte[]) it2.next()).length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Iterator<byte[]> it3 = this.bodyQueue.iterator();
        while (it3.hasNext()) {
            allocate.put(it3.next());
        }
        this.bodyQueue.clear();
        this.bodyUsed = true;
        this.isFinalized = true;
        byte[] array = allocate.array();
        array.getClass();
        return array;
    }

    public final boolean getBodyUsed() {
        return this.bodyUsed;
    }
}
