package dagger.internal.codegen.bindinggraphvalidation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
/* loaded from: classes9.dex */
public final class SetMultibindingValidator_Factory implements Factory<SetMultibindingValidator> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final SetMultibindingValidator_Factory INSTANCE = new SetMultibindingValidator_Factory();

        private InstanceHolder() {
        }
    }

    public static SetMultibindingValidator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SetMultibindingValidator newInstance() {
        return new SetMultibindingValidator();
    }

    @Override // javax.inject.Provider
    public SetMultibindingValidator get() {
        return newInstance();
    }
}
