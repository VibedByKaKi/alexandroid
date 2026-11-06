package dagger.producers.monitoring;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class ProductionComponentMonitor {
    private static final ProductionComponentMonitor NO_OP = new ProductionComponentMonitor() { // from class: dagger.producers.monitoring.ProductionComponentMonitor.1
        @Override // dagger.producers.monitoring.ProductionComponentMonitor
        public ProducerMonitor producerMonitorFor(ProducerToken producerToken) {
            return ProducerMonitor.noOp();
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Factory {
        private static final Factory NO_OP_FACTORY = new Factory() { // from class: dagger.producers.monitoring.ProductionComponentMonitor.Factory.1
            @Override // dagger.producers.monitoring.ProductionComponentMonitor.Factory
            public ProductionComponentMonitor create(Object obj) {
                return ProductionComponentMonitor.noOp();
            }
        };

        public static Factory noOp() {
            return NO_OP_FACTORY;
        }

        public abstract ProductionComponentMonitor create(Object obj);
    }

    public static ProductionComponentMonitor noOp() {
        return NO_OP;
    }

    public abstract ProducerMonitor producerMonitorFor(ProducerToken producerToken);
}
