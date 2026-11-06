package dagger.producers.internal;

import dagger.Binds;
import dagger.Module;
import dagger.producers.Production;
import dagger.producers.ProductionScope;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes9.dex */
public abstract class ProductionExecutorModule {
    private ProductionExecutorModule() {
    }

    @ProductionScope
    @Binds
    @ProductionImplementation
    public abstract Executor productionImplementationExecutor(@Production Executor executor);
}
