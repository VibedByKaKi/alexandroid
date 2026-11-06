package com.amazon.coral.reflect;

import com.amazon.coral.reflect.instantiate.BytecodeInstantiatorFactory;
import com.amazon.coral.reflect.instantiate.CachedInstantiatorFactory;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SystemInstantiatorFactory implements InstantiatorFactory {
    private static final String INSTANTIATOR_FACTORY_PROPERTY = InstantiatorFactory.class.getName();
    private final InstantiatorFactory instantiatorFactory;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InitializationOnDemand {
        static final InstantiatorFactory instance = SystemInstantiatorFactory.createInstance();

        private InitializationOnDemand() {
        }
    }

    private SystemInstantiatorFactory(InstantiatorFactory instantiatorFactory) {
        this.instantiatorFactory = instantiatorFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InstantiatorFactory createInstance() {
        String str = null;
        try {
            str = System.getProperty(INSTANTIATOR_FACTORY_PROPERTY, BytecodeInstantiatorFactory.class.getName());
            return new SystemInstantiatorFactory(new CachedInstantiatorFactory((InstantiatorFactory) Class.forName(str).newInstance()));
        } catch (Throwable th) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, " is not a valid ");
            m1m.append(InstantiatorFactory.class.getName());
            throw new IllegalArgumentException(m1m.toString(), th);
        }
    }

    public static InstantiatorFactory newInstance() {
        return InitializationOnDemand.instance;
    }

    @Override // com.amazon.coral.reflect.InstantiatorFactory
    public <T> Instantiator<T> newInstantiator(Class<T> cls, Class<?>... clsArr) {
        return this.instantiatorFactory.newInstantiator(cls, clsArr);
    }
}
