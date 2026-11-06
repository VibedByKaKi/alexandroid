package com.amazon.coral.util;

import android.os.SystemClock;
import com.amazon.alexa.accessory.frames.media.transform.lce.LceRetoucherProcessor;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AtomicOnlineInterarrivalTimer$$ExternalSyntheticLambda0 implements LongSupplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AtomicOnlineInterarrivalTimer$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.LongSupplier
    public final long getAsLong() {
        long heldPoolBytes;
        switch (this.$r8$classId) {
            case 0:
                return System.nanoTime();
            case 1:
                heldPoolBytes = LceRetoucherProcessor.heldPoolBytes();
                return heldPoolBytes;
            default:
                return SystemClock.elapsedRealtime();
        }
    }
}
