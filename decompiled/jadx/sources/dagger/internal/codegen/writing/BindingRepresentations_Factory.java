package dagger.internal.codegen.writing;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
/* loaded from: classes9.dex */
public final class BindingRepresentations_Factory implements Factory<BindingRepresentations> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final BindingRepresentations_Factory INSTANCE = new BindingRepresentations_Factory();

        private InstanceHolder() {
        }
    }

    public static BindingRepresentations_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BindingRepresentations newInstance() {
        return new BindingRepresentations();
    }

    @Override // javax.inject.Provider
    public BindingRepresentations get() {
        return newInstance();
    }
}
