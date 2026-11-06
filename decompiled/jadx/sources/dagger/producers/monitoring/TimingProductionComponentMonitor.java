package dagger.producers.monitoring;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import dagger.producers.monitoring.ProductionComponentMonitor;
import dagger.producers.monitoring.ProductionComponentTimingRecorder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class TimingProductionComponentMonitor extends ProductionComponentMonitor {
    private final ProductionComponentTimingRecorder recorder;
    private final Stopwatch stopwatch;
    private final Ticker ticker;

    public TimingProductionComponentMonitor(ProductionComponentTimingRecorder productionComponentTimingRecorder, Ticker ticker) {
        this.recorder = productionComponentTimingRecorder;
        this.ticker = ticker;
        this.stopwatch = Stopwatch.createStarted(ticker);
    }

    @Override // dagger.producers.monitoring.ProductionComponentMonitor
    public ProducerMonitor producerMonitorFor(ProducerToken producerToken) {
        return new TimingProducerMonitor(this.recorder.producerTimingRecorderFor(producerToken), this.ticker, this.stopwatch);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Factory extends ProductionComponentMonitor.Factory {
        private final ProductionComponentTimingRecorder.Factory recorderFactory;
        private final Ticker ticker;

        public Factory(ProductionComponentTimingRecorder.Factory factory) {
            this(factory, Ticker.systemTicker());
        }

        @Override // dagger.producers.monitoring.ProductionComponentMonitor.Factory
        public ProductionComponentMonitor create(Object obj) {
            return new TimingProductionComponentMonitor(this.recorderFactory.create(obj), this.ticker);
        }

        public Factory(ProductionComponentTimingRecorder.Factory factory, Ticker ticker) {
            this.recorderFactory = factory;
            this.ticker = ticker;
        }
    }
}
