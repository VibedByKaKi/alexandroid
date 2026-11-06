package dagger.producers.monitoring;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class TimingProducerMonitor extends ProducerMonitor {
    private final Stopwatch componentStopwatch;
    private final ProducerTimingRecorder recorder;
    private long startNanos = -1;
    private final Stopwatch stopwatch;

    public TimingProducerMonitor(ProducerTimingRecorder producerTimingRecorder, Ticker ticker, Stopwatch stopwatch) {
        this.recorder = producerTimingRecorder;
        this.stopwatch = Stopwatch.createUnstarted(ticker);
        this.componentStopwatch = stopwatch;
    }

    @Override // dagger.producers.monitoring.ProducerMonitor
    public void failed(Throwable th) {
        if (!this.stopwatch.isRunning()) {
            this.recorder.recordSkip(th);
        } else {
            this.recorder.recordFailure(th, this.stopwatch.elapsed(TimeUnit.NANOSECONDS));
        }
    }

    @Override // dagger.producers.monitoring.ProducerMonitor
    public void methodFinished() {
        this.recorder.recordMethod(this.startNanos, this.stopwatch.elapsed(TimeUnit.NANOSECONDS));
    }

    @Override // dagger.producers.monitoring.ProducerMonitor
    public void methodStarting() {
        this.startNanos = this.componentStopwatch.elapsed(TimeUnit.NANOSECONDS);
        this.stopwatch.start();
    }

    @Override // dagger.producers.monitoring.ProducerMonitor
    public void succeeded(Object obj) {
        this.recorder.recordSuccess(this.stopwatch.elapsed(TimeUnit.NANOSECONDS));
    }
}
