package io.ktor.util.cio;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import io.ktor.util.InternalAPI;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlinx.io.pool.DefaultPool;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAPI
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0002H\u0014¨\u0006\u0007"}, d2 = {"Lio/ktor/util/cio/ByteBufferPool;", "Lkotlinx/io/pool/DefaultPool;", "Ljava/nio/ByteBuffer;", "()V", "clearInstance", AlexaEventBundleKeys.INSTANCE, "produceInstance", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class ByteBufferPool extends DefaultPool<ByteBuffer> {
    public ByteBufferPool() {
        super(2048);
    }

    @Override // kotlinx.io.pool.DefaultPool
    @NotNull
    public ByteBuffer produceInstance() {
        ByteBuffer allocate = ByteBuffer.allocate(4098);
        allocate.getClass();
        return allocate;
    }

    @Override // kotlinx.io.pool.DefaultPool
    @NotNull
    public ByteBuffer clearInstance(@NotNull ByteBuffer instance) {
        instance.getClass();
        instance.clear();
        return instance;
    }
}
