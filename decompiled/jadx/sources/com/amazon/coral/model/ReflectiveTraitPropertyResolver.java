package com.amazon.coral.model;

import com.amazon.coral.google.common.base.Preconditions;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class ReflectiveTraitPropertyResolver implements TraitPropertyResolver {
    private final TraitPropertyDescriptorConversionStrategy<Method> converter;

    public ReflectiveTraitPropertyResolver(TraitPropertyDescriptorConversionStrategy<Method> traitPropertyDescriptorConversionStrategy) {
        Preconditions.checkArgument(traitPropertyDescriptorConversionStrategy != null, "should not get null converter");
        this.converter = traitPropertyDescriptorConversionStrategy;
    }

    @Override // com.amazon.coral.model.TraitPropertyResolver
    public Map<String, TraitPropertyDescriptor> getPropertiesFor(Class<? extends Traits> cls) {
        Preconditions.checkArgument(cls != null, "should not get null type");
        HashMap hashMap = new HashMap();
        Iterable<TraitPropertyDescriptor> fromIterable = this.converter.fromIterable(Arrays.asList(cls.getMethods()));
        if (fromIterable != null) {
            for (TraitPropertyDescriptor traitPropertyDescriptor : fromIterable) {
                hashMap.put(traitPropertyDescriptor.getName().toLowerCase(), traitPropertyDescriptor);
            }
        }
        return hashMap;
    }
}
