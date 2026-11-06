package dagger.internal.codegen.kotlin;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
/* loaded from: classes9.dex */
public final class KotlinMetadataFactory_Factory implements Factory<KotlinMetadataFactory> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final KotlinMetadataFactory_Factory INSTANCE = new KotlinMetadataFactory_Factory();

        private InstanceHolder() {
        }
    }

    public static KotlinMetadataFactory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static KotlinMetadataFactory newInstance() {
        return new KotlinMetadataFactory();
    }

    @Override // javax.inject.Provider
    public KotlinMetadataFactory get() {
        return newInstance();
    }
}
