package com.amazon.coral.model.util;

import com.amazon.coral.model.JavaTraits;
import com.amazon.coral.model.Model;
import com.amazon.coral.util.reflection.ClassLoadingStrategies;
import com.amazon.coral.util.reflection.ClassLoadingStrategy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultCoralModelClassResolver implements CoralModelClassResolver {
    private ClassLoadingStrategy classLoadingStrategy;

    public DefaultCoralModelClassResolver() {
        this(ClassLoadingStrategies.THREAD);
    }

    @Override // com.amazon.coral.model.util.CoralModelClassResolver
    public Class<?> getClassFor(Model model) {
        Model.Id id = model.getId();
        String replace = id.getId().replace('#', '.');
        JavaTraits javaTraits = (JavaTraits) model.getTraits(JavaTraits.class);
        if (javaTraits != null) {
            replace = javaTraits.getClassName();
        }
        try {
            return this.classLoadingStrategy.loadClassFor(replace);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Invalid type " + id.toString(), e);
        }
    }

    public DefaultCoralModelClassResolver(ClassLoadingStrategy classLoadingStrategy) {
        this.classLoadingStrategy = classLoadingStrategy;
    }
}
