package dagger.internal.codegen.bindinggraphvalidation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
/* loaded from: classes9.dex */
public final class ProvisionDependencyOnProducerBindingValidator_Factory implements Factory<ProvisionDependencyOnProducerBindingValidator> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final ProvisionDependencyOnProducerBindingValidator_Factory INSTANCE = new ProvisionDependencyOnProducerBindingValidator_Factory();

        private InstanceHolder() {
        }
    }

    public static ProvisionDependencyOnProducerBindingValidator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ProvisionDependencyOnProducerBindingValidator newInstance() {
        return new ProvisionDependencyOnProducerBindingValidator();
    }

    @Override // javax.inject.Provider
    public ProvisionDependencyOnProducerBindingValidator get() {
        return newInstance();
    }
}
