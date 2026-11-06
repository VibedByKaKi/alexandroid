package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lkotlinx/serialization/json/internal/ByteArrayPool8k;", "Lkotlinx/serialization/json/internal/ByteArrayPoolBase;", "<init>", "()V", "take", "", "release", "", "array", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ByteArrayPool8k extends ByteArrayPoolBase {

    @NotNull
    public static final ByteArrayPool8k INSTANCE = new ByteArrayPool8k();

    private ByteArrayPool8k() {
    }

    public final void release(@NotNull byte[] array) {
        array.getClass();
        releaseImpl(array);
    }

    @NotNull
    public final byte[] take() {
        return take(8196);
    }
}
