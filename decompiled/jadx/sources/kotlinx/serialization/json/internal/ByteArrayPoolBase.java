package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0004R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/serialization/json/internal/ByteArrayPoolBase;", "", "<init>", "()V", "arrays", "Lkotlin/collections/ArrayDeque;", "", "bytesTotal", "", "take", "size", "releaseImpl", "", "array", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArrayPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayPools.kt\nkotlinx/serialization/json/internal/ByteArrayPoolBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* loaded from: classes10.dex */
public class ByteArrayPoolBase {

    @NotNull
    private final ArrayDeque<byte[]> arrays = new ArrayDeque<>();
    private int bytesTotal;

    public final void releaseImpl(@NotNull byte[] array) {
        int i;
        array.getClass();
        synchronized (this) {
            try {
                int length = this.bytesTotal + array.length;
                i = ArrayPoolsKt.MAX_CHARS_IN_POOL;
                if (length < i) {
                    this.bytesTotal += array.length / 2;
                    this.arrays.addLast(array);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NotNull
    public final byte[] take(int size) {
        byte[] removeLastOrNull;
        synchronized (this) {
            removeLastOrNull = this.arrays.removeLastOrNull();
            if (removeLastOrNull != null) {
                this.bytesTotal -= removeLastOrNull.length / 2;
            } else {
                removeLastOrNull = null;
            }
        }
        return removeLastOrNull == null ? new byte[size] : removeLastOrNull;
    }
}
