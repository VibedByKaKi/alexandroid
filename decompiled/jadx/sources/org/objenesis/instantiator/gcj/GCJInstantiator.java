package org.objenesis.instantiator.gcj;

import java.lang.reflect.InvocationTargetException;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class GCJInstantiator<T> extends GCJInstantiatorBase<T> {
    public GCJInstantiator(Class<T> cls) {
        super(cls);
    }

    @Override // org.objenesis.instantiator.gcj.GCJInstantiatorBase, org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(GCJInstantiatorBase.newObjectMethod.invoke(GCJInstantiatorBase.dummyStream, cls, Object.class));
        } catch (IllegalAccessException e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (RuntimeException e2) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        } catch (InvocationTargetException e3) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            return null;
        }
    }
}
