package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.TraitProperty;
import com.amazon.coral.google.common.base.Function;
import com.amazon.coral.google.common.base.Predicate;
import com.amazon.coral.google.common.collect.FluentIterable;
import com.amazon.coral.google.common.collect.Iterables;
import java.lang.reflect.Method;
import java.util.Collections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class TraitPropertyDescriptorFromMethods implements TraitPropertyDescriptorConversionStrategy<Method> {
    public TraitPropertyDescriptor createTraitPropertyDescriptor(Method method) {
        TraitProperty traitProperty = (TraitProperty) method.getAnnotation(TraitProperty.class);
        return new TraitPropertyDescriptor(traitProperty.name(), traitProperty.attributeName(), traitProperty.emitIfNull(), method);
    }

    @Override // com.amazon.coral.model.TraitPropertyDescriptorConversionStrategy
    public Iterable<TraitPropertyDescriptor> fromIterable(Iterable<Method> iterable) {
        return (iterable == null || Iterables.isEmpty(iterable)) ? Collections.EMPTY_SET : FluentIterable.from(Iterables.filter(iterable, new Predicate<Method>() { // from class: com.amazon.coral.model.TraitPropertyDescriptorFromMethods.2
            @Override // com.amazon.coral.google.common.base.Predicate
            public boolean apply(Method method) {
                return TraitPropertyDescriptorFromMethods.this.isPropertyGetter(method);
            }
        })).transform(new Function<Method, TraitPropertyDescriptor>() { // from class: com.amazon.coral.model.TraitPropertyDescriptorFromMethods.1
            @Override // com.amazon.coral.google.common.base.Function, java.util.function.Function
            public TraitPropertyDescriptor apply(Method method) {
                return TraitPropertyDescriptorFromMethods.this.createTraitPropertyDescriptor(method);
            }
        });
    }

    public boolean isPropertyGetter(Method method) {
        return (method.getParameterTypes().length != 0 || method.getReturnType().equals(Void.TYPE) || ((TraitProperty) method.getAnnotation(TraitProperty.class)) == null) ? false : true;
    }
}
