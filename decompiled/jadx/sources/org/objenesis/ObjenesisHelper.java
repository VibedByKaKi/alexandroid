package org.objenesis;

import java.io.Serializable;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class ObjenesisHelper {
    private static final Objenesis OBJENESIS_STD = new ObjenesisStd();
    private static final Objenesis OBJENESIS_SERIALIZER = new ObjenesisSerializer();

    private ObjenesisHelper() {
    }

    public static <T> ObjectInstantiator<T> getInstantiatorOf(Class<T> cls) {
        return OBJENESIS_STD.getInstantiatorOf(cls);
    }

    public static <T extends Serializable> ObjectInstantiator<T> getSerializableObjectInstantiatorOf(Class<T> cls) {
        return OBJENESIS_SERIALIZER.getInstantiatorOf(cls);
    }

    public static <T> T newInstance(Class<T> cls) {
        return (T) OBJENESIS_STD.newInstance(cls);
    }

    public static <T extends Serializable> T newSerializableInstance(Class<T> cls) {
        return (T) OBJENESIS_SERIALIZER.newInstance(cls);
    }
}
