package org.apache.commons.collections4.functors;

import java.io.Serializable;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class FactoryTransformer<I, O> implements Transformer<I, O>, Serializable {
    private static final long serialVersionUID = -6817674502475353160L;
    private final Factory<? extends O> iFactory;

    public FactoryTransformer(Factory<? extends O> factory) {
        this.iFactory = factory;
    }

    public static <I, O> Transformer<I, O> factoryTransformer(Factory<? extends O> factory) {
        if (factory != null) {
            return new FactoryTransformer(factory);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Factory must not be null");
        return null;
    }

    public Factory<? extends O> getFactory() {
        return this.iFactory;
    }

    @Override // org.apache.commons.collections4.Transformer
    public O transform(I i) {
        return this.iFactory.create();
    }
}
