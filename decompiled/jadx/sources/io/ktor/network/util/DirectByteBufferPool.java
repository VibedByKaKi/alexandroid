package io.ktor.network.util;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlinx.io.pool.DefaultPool;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0014J\b\u0010\t\u001a\u00020\u0002H\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/ktor/network/util/DirectByteBufferPool;", "Lkotlinx/io/pool/DefaultPool;", "Ljava/nio/ByteBuffer;", "bufferSize", "", "size", "(II)V", "clearInstance", AlexaEventBundleKeys.INSTANCE, "produceInstance", "validateInstance", "", "ktor-network"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class DirectByteBufferPool extends DefaultPool<ByteBuffer> {
    private final int bufferSize;

    public DirectByteBufferPool(int i, int i2) {
        super(i2);
        this.bufferSize = i;
    }

    @Override // kotlinx.io.pool.DefaultPool
    @NotNull
    public ByteBuffer produceInstance() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.bufferSize);
        allocateDirect.getClass();
        return allocateDirect;
    }

    @Override // kotlinx.io.pool.DefaultPool
    public void validateInstance(@NotNull ByteBuffer instance) {
        instance.getClass();
        if (!instance.isDirect()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        } else {
            if (instance.capacity() == this.bufferSize) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        }
    }

    @Override // kotlinx.io.pool.DefaultPool
    @NotNull
    public ByteBuffer clearInstance(@NotNull ByteBuffer instance) {
        instance.getClass();
        instance.clear();
        return instance;
    }
}
