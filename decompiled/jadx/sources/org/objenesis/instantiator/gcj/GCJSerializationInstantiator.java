package org.objenesis.instantiator.gcj;

import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.SerializationInstantiatorHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class GCJSerializationInstantiator<T> extends GCJInstantiatorBase<T> {
    private Class<? super T> superType;

    public GCJSerializationInstantiator(Class<T> cls) {
        super(cls);
        this.superType = SerializationInstantiatorHelper.getNonSerializableSuperClass(cls);
    }

    @Override // org.objenesis.instantiator.gcj.GCJInstantiatorBase, org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            Class<T> cls = this.type;
            return cls.cast(GCJInstantiatorBase.newObjectMethod.invoke(GCJInstantiatorBase.dummyStream, cls, this.superType));
        } catch (Exception e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
