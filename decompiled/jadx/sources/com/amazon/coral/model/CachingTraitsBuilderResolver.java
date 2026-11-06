package com.amazon.coral.model;

import com.amazon.coral.model.xml.TraitsBuilder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class CachingTraitsBuilderResolver implements TraitsBuilderResolver {
    private static final TraitsBuilderResolver INSTANCE = new CachingTraitsBuilderResolver();
    private final Map<Class<? extends Traits>, TraitsBuilder> traitsBuilders = new ConcurrentHashMap();
    private final TraitsBuilderResolver delegate = new ReflectiveTraitsBuilderResolver();

    public static TraitsBuilderResolver getInstance() {
        return INSTANCE;
    }

    @Override // com.amazon.coral.model.TraitsBuilderResolver
    public TraitsBuilder getBuilderFor(Class<? extends Traits> cls) {
        if (this.traitsBuilders.containsKey(cls)) {
            return this.traitsBuilders.get(cls);
        }
        TraitsBuilder builderFor = this.delegate.getBuilderFor(cls);
        this.traitsBuilders.put(cls, builderFor);
        return builderFor;
    }
}
