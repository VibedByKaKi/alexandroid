package rx.internal.util.unsafe;

import rx.internal.util.atomic.LinkedQueueNode;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract /* synthetic */ class MpscLinkedQueue$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(Unsafe unsafe, MpscLinkedQueue mpscLinkedQueue, long j, Object obj, LinkedQueueNode linkedQueueNode) {
        while (!unsafe.compareAndSwapObject(mpscLinkedQueue, j, obj, linkedQueueNode)) {
            if (unsafe.getObject(mpscLinkedQueue, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
