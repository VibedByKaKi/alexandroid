package dagger.producers.monitoring;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class ProducerTimingRecorder {
    private static final ProducerTimingRecorder NO_OP = new ProducerTimingRecorder() { // from class: dagger.producers.monitoring.ProducerTimingRecorder.1
    };

    public static ProducerTimingRecorder noOp() {
        return NO_OP;
    }

    public void recordSkip(Throwable th) {
    }

    public void recordSuccess(long j) {
    }

    public void recordFailure(Throwable th, long j) {
    }

    public void recordMethod(long j, long j2) {
    }
}
