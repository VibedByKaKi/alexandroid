package com.google.common.util.concurrent;

import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.common.base.Supplier;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Striped$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ Striped$$ExternalSyntheticLambda2(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        Semaphore lambda$semaphore$0;
        HandlerThread lambda$new$0;
        HandlerThread lambda$new$1;
        HandlerThread lambda$new$02;
        HandlerThread lambda$new$12;
        Semaphore lambda$lazyWeakSemaphore$0;
        int i = this.$r8$classId;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                lambda$semaphore$0 = Striped.lambda$semaphore$0(i2);
                return lambda$semaphore$0;
            case 1:
                lambda$new$0 = AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i2);
                return lambda$new$0;
            case 2:
                lambda$new$1 = AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i2);
                return lambda$new$1;
            case 3:
                lambda$new$02 = AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i2);
                return lambda$new$02;
            case 4:
                lambda$new$12 = AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i2);
                return lambda$new$12;
            default:
                lambda$lazyWeakSemaphore$0 = Striped.lambda$lazyWeakSemaphore$0(i2);
                return lambda$lazyWeakSemaphore$0;
        }
    }
}
