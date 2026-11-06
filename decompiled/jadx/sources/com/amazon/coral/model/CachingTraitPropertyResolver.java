package com.amazon.coral.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class CachingTraitPropertyResolver implements TraitPropertyResolver {
    private static final TraitPropertyResolver INSTANCE = new CachingTraitPropertyResolver();
    private final TraitPropertyResolver delegate;
    private final Map<Class<? extends Traits>, Map<String, TraitPropertyDescriptor>> propertyMap;

    public CachingTraitPropertyResolver(TraitPropertyResolver traitPropertyResolver, Map<Class<? extends Traits>, Map<String, TraitPropertyDescriptor>> map) {
        if (traitPropertyResolver == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("delegate cannot be null");
            throw null;
        }
        if (map == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("propertyMap cannot be null");
            throw null;
        }
        this.delegate = traitPropertyResolver;
        this.propertyMap = map;
    }

    public static TraitPropertyResolver getInstance() {
        return INSTANCE;
    }

    @Override // com.amazon.coral.model.TraitPropertyResolver
    public Map<String, TraitPropertyDescriptor> getPropertiesFor(Class<? extends Traits> cls) {
        Map<String, TraitPropertyDescriptor> map = this.propertyMap.get(cls);
        if (map != null) {
            return map;
        }
        Map<String, TraitPropertyDescriptor> propertiesFor = this.delegate.getPropertiesFor(cls);
        this.propertyMap.put(cls, propertiesFor);
        return propertiesFor;
    }

    public CachingTraitPropertyResolver() {
        this(new ReflectiveTraitPropertyResolver(new TraitPropertyDescriptorFromMethods()), new ConcurrentHashMap());
    }
}
