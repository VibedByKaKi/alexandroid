package com.google.gson.internal;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.apache.commons.lang3.reflect.TypeUtils$$ExternalSyntheticLambda3;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ConstructorConstructor {
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private final List<ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceCreatorConstructor<T> implements ObjectConstructor<T> {
        private final InstanceCreator<T> instanceCreator;
        private final Type type;

        public InstanceCreatorConstructor(InstanceCreator<T> instanceCreator, Type type) {
            this.instanceCreator = instanceCreator;
            this.type = type;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public T construct() {
            return this.instanceCreator.createInstance(this.type);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ThrowingObjectConstructor<T> implements ObjectConstructor<T> {
        private final String exceptionMessage;

        public ThrowingObjectConstructor(String str) {
            this.exceptionMessage = str;
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public T construct() {
            throw new JsonIOException(this.exceptionMessage);
        }
    }

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z, List<ReflectionAccessFilter> list) {
        this.instanceCreators = map;
        this.useJdkUnsafe = z;
        this.reflectionFilters = list;
    }

    public static String checkInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + TroubleshootingGuide.createUrl("r8-abstract-class");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultConstructor$2(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e3.getCause());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newSpecialCollectionConstructor$0(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException(ParcelCompat$$ExternalSyntheticOutline0.m("Invalid EnumSet type: ", type));
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException(ParcelCompat$$ExternalSyntheticOutline0.m("Invalid EnumSet type: ", type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newSpecialCollectionConstructor$1(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException(ParcelCompat$$ExternalSyntheticOutline0.m("Invalid EnumMap type: ", type));
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new JsonIOException(ParcelCompat$$ExternalSyntheticOutline0.m("Invalid EnumMap type: ", type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newUnsafeAllocator$3(Class cls) {
        try {
            return UnsafeAllocator.INSTANCE.newInstance(cls);
        } catch (Exception e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Unable to create instance of ", cls, ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e);
            return null;
        }
    }

    private static ObjectConstructor<? extends Collection<?>> newCollectionConstructor(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new Gson$$ExternalSyntheticBUOutline0(14);
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new Gson$$ExternalSyntheticBUOutline0(15);
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new Gson$$ExternalSyntheticBUOutline0(16);
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new Gson$$ExternalSyntheticBUOutline0(17);
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls, ReflectionAccessFilter.FilterResult filterResult) {
        String tryMakeAccessible;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            ReflectionAccessFilter.FilterResult filterResult2 = ReflectionAccessFilter.FilterResult.ALLOW;
            return (filterResult == filterResult2 || (ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) && (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) ? (filterResult != filterResult2 || (tryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) == null) ? new ConstructorConstructor$$ExternalSyntheticLambda11(declaredConstructor, 0) : new ThrowingObjectConstructor(tryMakeAccessible) : new ThrowingObjectConstructor(a$$ExternalSyntheticOutline0.m("Unable to invoke no-args constructor of ", cls, "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> ObjectConstructor<T> newDefaultImplementationConstructor(Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newCollectionConstructor(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newMapConstructor(cls);
        }
        return null;
    }

    private static ObjectConstructor<? extends Map<?, Object>> newMapConstructor(Class<?> cls) {
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new Gson$$ExternalSyntheticBUOutline0(18);
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new Gson$$ExternalSyntheticBUOutline0(19);
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new Gson$$ExternalSyntheticBUOutline0(20);
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new Gson$$ExternalSyntheticBUOutline0(21);
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newSpecialCollectionConstructor(Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new TypeUtils$$ExternalSyntheticLambda3(2, type);
        }
        if (cls == EnumMap.class) {
            return new TypeUtils$$ExternalSyntheticLambda3(1, type);
        }
        return null;
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(Class<? super T> cls) {
        if (this.useJdkUnsafe) {
            return new ConstructorConstructor$$ExternalSyntheticLambda4(cls);
        }
        String m = a$$ExternalSyntheticOutline0.m("Unable to create instance of ", cls, "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        if (cls.getDeclaredConstructors().length == 0) {
            m = m.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
        }
        return new ThrowingObjectConstructor(m);
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken, boolean z) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        InstanceCreator<?> instanceCreator = this.instanceCreators.get(type);
        if (instanceCreator != null) {
            return new InstanceCreatorConstructor(instanceCreator, type);
        }
        InstanceCreator<?> instanceCreator2 = this.instanceCreators.get(rawType);
        if (instanceCreator2 != null) {
            return new InstanceCreatorConstructor(instanceCreator2, type);
        }
        ObjectConstructor<T> newSpecialCollectionConstructor = newSpecialCollectionConstructor(type, rawType);
        if (newSpecialCollectionConstructor != null) {
            return newSpecialCollectionConstructor;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        ObjectConstructor<T> newDefaultConstructor = newDefaultConstructor(rawType, filterResult);
        if (newDefaultConstructor != null) {
            return newDefaultConstructor;
        }
        ObjectConstructor<T> newDefaultImplementationConstructor = newDefaultImplementationConstructor(rawType);
        if (newDefaultImplementationConstructor != null) {
            return newDefaultImplementationConstructor;
        }
        String checkInstantiable = checkInstantiable(rawType);
        return checkInstantiable != null ? new ThrowingObjectConstructor(checkInstantiable) : !z ? new ThrowingObjectConstructor(a$$ExternalSyntheticOutline0.m("Unable to create instance of ", rawType, "; Register an InstanceCreator or a TypeAdapter for this type.")) : filterResult != ReflectionAccessFilter.FilterResult.ALLOW ? new ThrowingObjectConstructor(a$$ExternalSyntheticOutline0.m("Unable to create instance of ", rawType, "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.")) : newUnsafeAllocator(rawType);
    }

    public String toString() {
        return this.instanceCreators.toString();
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        return get(typeToken, true);
    }
}
