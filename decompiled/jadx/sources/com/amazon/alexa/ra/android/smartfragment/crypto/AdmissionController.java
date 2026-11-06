package com.amazon.alexa.ra.android.smartfragment.crypto;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/AdmissionController;", "", "maxInFlightBytes", "", "maxInFlightCount", "<init>", "(II)V", "inFlightBytes", "inFlightCount", "peakInFlightBytes", "Ljava/util/concurrent/atomic/AtomicInteger;", "getPeakInFlightBytes$AVSMobileFramework_ra_android_smart_fragment_runtime_release", "()Ljava/util/concurrent/atomic/AtomicInteger;", "peakInFlightCount", "getPeakInFlightCount$AVSMobileFramework_ra_android_smart_fragment_runtime_release", JoinPoint.SYNCHRONIZATION_LOCK, "tryAcquire", "", "bytes", "release", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AdmissionController {
    public static final int $stable = 8;
    private int inFlightBytes;
    private int inFlightCount;
    private final int maxInFlightBytes;
    private final int maxInFlightCount;

    @NotNull
    private final AtomicInteger peakInFlightBytes = new AtomicInteger(0);

    @NotNull
    private final AtomicInteger peakInFlightCount = new AtomicInteger(0);

    @NotNull
    private final Object lock = new Object();

    public AdmissionController(int i, int i2) {
        this.maxInFlightBytes = i;
        this.maxInFlightCount = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tryAcquire$lambda$2$lambda$0(AdmissionController admissionController, int i) {
        return Math.max(i, admissionController.inFlightBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int tryAcquire$lambda$2$lambda$1(AdmissionController admissionController, int i) {
        return Math.max(i, admissionController.inFlightCount);
    }

    @NotNull
    /* renamed from: getPeakInFlightBytes$AVSMobileFramework_ra_android_smart_fragment_runtime_release, reason: from getter */
    public final AtomicInteger getPeakInFlightBytes() {
        return this.peakInFlightBytes;
    }

    @NotNull
    /* renamed from: getPeakInFlightCount$AVSMobileFramework_ra_android_smart_fragment_runtime_release, reason: from getter */
    public final AtomicInteger getPeakInFlightCount() {
        return this.peakInFlightCount;
    }

    public final void release(int bytes) {
        synchronized (this.lock) {
            this.inFlightBytes = Math.max(0, this.inFlightBytes - bytes);
            this.inFlightCount = Math.max(0, this.inFlightCount - 1);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean tryAcquire(int bytes) {
        synchronized (this.lock) {
            int i = this.inFlightBytes + bytes;
            if (i > this.maxInFlightBytes) {
                return false;
            }
            int i2 = this.inFlightCount + 1;
            if (i2 > this.maxInFlightCount) {
                return false;
            }
            this.inFlightBytes = i;
            this.inFlightCount = i2;
            final int i3 = 0;
            this.peakInFlightBytes.updateAndGet(new IntUnaryOperator(this) { // from class: com.amazon.alexa.ra.android.smartfragment.crypto.AdmissionController$$ExternalSyntheticLambda0
                public final /* synthetic */ AdmissionController f$0;

                {
                    this.f$0 = this;
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i4) {
                    int tryAcquire$lambda$2$lambda$0;
                    int tryAcquire$lambda$2$lambda$1;
                    int i5 = i3;
                    AdmissionController admissionController = this.f$0;
                    switch (i5) {
                        case 0:
                            tryAcquire$lambda$2$lambda$0 = AdmissionController.tryAcquire$lambda$2$lambda$0(admissionController, i4);
                            return tryAcquire$lambda$2$lambda$0;
                        default:
                            tryAcquire$lambda$2$lambda$1 = AdmissionController.tryAcquire$lambda$2$lambda$1(admissionController, i4);
                            return tryAcquire$lambda$2$lambda$1;
                    }
                }
            });
            final int i4 = 1;
            this.peakInFlightCount.updateAndGet(new IntUnaryOperator(this) { // from class: com.amazon.alexa.ra.android.smartfragment.crypto.AdmissionController$$ExternalSyntheticLambda0
                public final /* synthetic */ AdmissionController f$0;

                {
                    this.f$0 = this;
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i42) {
                    int tryAcquire$lambda$2$lambda$0;
                    int tryAcquire$lambda$2$lambda$1;
                    int i5 = i4;
                    AdmissionController admissionController = this.f$0;
                    switch (i5) {
                        case 0:
                            tryAcquire$lambda$2$lambda$0 = AdmissionController.tryAcquire$lambda$2$lambda$0(admissionController, i42);
                            return tryAcquire$lambda$2$lambda$0;
                        default:
                            tryAcquire$lambda$2$lambda$1 = AdmissionController.tryAcquire$lambda$2$lambda$1(admissionController, i42);
                            return tryAcquire$lambda$2$lambda$1;
                    }
                }
            });
            return true;
        }
    }
}
