package com.amazon.coral.model;

import com.amazon.coral.annotation.customtrait.TraitProperty;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ReflectiveTraitConstructorFactory implements TraitConstructorFactory {
    public static final String NO_TRAIT_PROPERTY_FOUND_FOR_PARAMETER_MESSAGE_TEMPLATE = "No @TraitProperty found for parameter %d of type '%s' on the constructor of '%s'";

    @Override // com.amazon.coral.model.TraitConstructorFactory
    public TraitConstructor getConstructorFor(Class<? extends Traits> cls) {
        Constructor<? extends Traits> constructorMethod = getConstructorMethod(cls);
        ArrayList arrayList = new ArrayList();
        return new TraitConstructor(cls, constructorMethod, Collections.unmodifiableList(arrayList), getPropertyParams(constructorMethod, arrayList), getValidPropertySets(constructorMethod));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Constructor<? extends Traits> getConstructorMethod(Class<? extends Traits> cls) {
        for (Constructor<? extends Traits> constructor : cls.getConstructors()) {
            ValidTrait validTrait = (ValidTrait) constructor.getAnnotation(ValidTrait.class);
            ValidTraitOr validTraitOr = (ValidTraitOr) constructor.getAnnotation(ValidTraitOr.class);
            if (validTrait != null && validTraitOr != null) {
                throw new ModelIndexFactoryException("@ValidTrait and @ValidTraitOr cannot both be present on constructor of '" + cls.getSimpleName() + "'");
            }
            if (validTrait != null || validTraitOr != null) {
                return constructor;
            }
        }
        throw new ModelIndexFactoryException("At least one constructor for trait '" + cls.getCanonicalName() + "' must be annotated with @ValidTrait or @ValidTraitOr'");
    }

    public Map<String, Class<?>> getPropertyParams(Constructor<? extends Traits> constructor, List<String> list) {
        String str;
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        HashMap hashMap = new HashMap();
        for (int i = 4; i < parameterAnnotations.length; i++) {
            Annotation[] annotationArr = parameterAnnotations[i];
            int length = annotationArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    str = null;
                    break;
                }
                Annotation annotation = annotationArr[i2];
                if (annotation instanceof TraitProperty) {
                    str = ((TraitProperty) annotation).name();
                    break;
                }
                i2++;
            }
            if (str == null) {
                throw new ModelIndexFactoryException(String.format(NO_TRAIT_PROPERTY_FOUND_FOR_PARAMETER_MESSAGE_TEMPLATE, Integer.valueOf(i), parameterTypes[i].getCanonicalName(), constructor.getDeclaringClass().getCanonicalName()));
            }
            list.add(str);
            hashMap.put(str, parameterTypes[i]);
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Collection<Set<String>> getValidPropertySets(Constructor<? extends Traits> constructor) {
        ArrayList arrayList = new ArrayList();
        ValidTrait validTrait = (ValidTrait) constructor.getAnnotation(ValidTrait.class);
        ValidTraitOr validTraitOr = (ValidTraitOr) constructor.getAnnotation(ValidTraitOr.class);
        if (validTrait != null) {
            arrayList.add(new HashSet(Arrays.asList(validTrait.requires())));
            return arrayList;
        }
        for (ValidTrait validTrait2 : validTraitOr.value()) {
            arrayList.add(new HashSet(Arrays.asList(validTrait2.requires())));
        }
        return arrayList;
    }
}
