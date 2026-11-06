package org.objenesis.instantiator.basic;

import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objenesis.instantiator.ObjectInstantiator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class NewInstanceInstantiator<T> implements ObjectInstantiator<T> {
    private final Class<T> type;

    public NewInstanceInstantiator(Class<T> cls) {
        this.type = cls;
    }

    @Override // org.objenesis.instantiator.ObjectInstantiator
    public T newInstance() {
        try {
            return this.type.newInstance();
        } catch (Exception e) {
            XML$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }
}
