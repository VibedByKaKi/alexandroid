package dagger.android;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import dagger.android.AndroidInjector;
import dagger.internal.DaggerCollections;
import dagger.internal.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Provider;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class DispatchingAndroidInjector<T> implements AndroidInjector<T> {
    private static final String NO_SUPERTYPES_BOUND_FORMAT = "No injector factory bound for Class<%s>";
    private static final String SUPERTYPES_BOUND_FORMAT = "No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?";
    private final Map<String, Provider<AndroidInjector.Factory<?>>> injectorFactories;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InvalidInjectorBindingException extends RuntimeException {
        public InvalidInjectorBindingException(String str, ClassCastException classCastException) {
            super(str, classCastException);
        }
    }

    @Inject
    public DispatchingAndroidInjector(Map<Class<?>, Provider<AndroidInjector.Factory<?>>> map, Map<String, Provider<AndroidInjector.Factory<?>>> map2) {
        this.injectorFactories = merge(map, map2);
    }

    private String errorMessageSuggestions(T t) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = t.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (this.injectorFactories.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        return arrayList.isEmpty() ? a$$ExternalSyntheticOutline0.m("No injector factory bound for Class<", t.getClass().getCanonicalName(), ">") : String.format(SUPERTYPES_BOUND_FORMAT, t.getClass().getCanonicalName(), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <C, V> Map<String, Provider<AndroidInjector.Factory<?>>> merge(Map<Class<? extends C>, V> map, Map<String, V> map2) {
        if (map.isEmpty()) {
            return map2;
        }
        LinkedHashMap newLinkedHashMapWithExpectedSize = DaggerCollections.newLinkedHashMapWithExpectedSize(map2.size() + map.size());
        newLinkedHashMapWithExpectedSize.putAll(map2);
        for (Map.Entry<Class<? extends C>, V> entry : map.entrySet()) {
            newLinkedHashMapWithExpectedSize.put(entry.getKey().getName(), entry.getValue());
        }
        return Collections.unmodifiableMap(newLinkedHashMapWithExpectedSize);
    }

    @Override // dagger.android.AndroidInjector
    public void inject(T t) {
        if (maybeInject(t)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(errorMessageSuggestions(t));
    }

    @CanIgnoreReturnValue
    public boolean maybeInject(T t) {
        Provider<AndroidInjector.Factory<?>> provider = this.injectorFactories.get(t.getClass().getName());
        if (provider == null) {
            return false;
        }
        AndroidInjector.Factory<?> factory = provider.get();
        try {
            ((AndroidInjector) Preconditions.checkNotNull(factory.create(t), "%s.create(I) should not return null.", factory.getClass())).inject(t);
            return true;
        } catch (ClassCastException e) {
            throw new InvalidInjectorBindingException(TableInfo$$ExternalSyntheticOutline0.m$1(factory.getClass().getCanonicalName(), " does not implement AndroidInjector.Factory<", t.getClass().getCanonicalName(), ">"), e);
        }
    }
}
