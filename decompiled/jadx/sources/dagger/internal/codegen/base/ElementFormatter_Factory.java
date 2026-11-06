package dagger.internal.codegen.base;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
/* loaded from: classes9.dex */
public final class ElementFormatter_Factory implements Factory<ElementFormatter> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final ElementFormatter_Factory INSTANCE = new ElementFormatter_Factory();

        private InstanceHolder() {
        }
    }

    public static ElementFormatter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ElementFormatter newInstance() {
        return new ElementFormatter();
    }

    @Override // javax.inject.Provider
    public ElementFormatter get() {
        return newInstance();
    }
}
