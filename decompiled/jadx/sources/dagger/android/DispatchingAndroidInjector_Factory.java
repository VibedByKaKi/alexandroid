package dagger.android;

import dagger.android.AndroidInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes9.dex */
public final class DispatchingAndroidInjector_Factory<T> implements Factory<DispatchingAndroidInjector<T>> {
    private final Provider<Map<Class<?>, Provider<AndroidInjector.Factory<?>>>> injectorFactoriesWithClassKeysProvider;
    private final Provider<Map<String, Provider<AndroidInjector.Factory<?>>>> injectorFactoriesWithStringKeysProvider;

    public DispatchingAndroidInjector_Factory(Provider<Map<Class<?>, Provider<AndroidInjector.Factory<?>>>> provider, Provider<Map<String, Provider<AndroidInjector.Factory<?>>>> provider2) {
        this.injectorFactoriesWithClassKeysProvider = provider;
        this.injectorFactoriesWithStringKeysProvider = provider2;
    }

    public static <T> DispatchingAndroidInjector_Factory<T> create(Provider<Map<Class<?>, Provider<AndroidInjector.Factory<?>>>> provider, Provider<Map<String, Provider<AndroidInjector.Factory<?>>>> provider2) {
        return new DispatchingAndroidInjector_Factory<>(provider, provider2);
    }

    public static <T> DispatchingAndroidInjector<T> newInstance(Map<Class<?>, Provider<AndroidInjector.Factory<?>>> map, Map<String, Provider<AndroidInjector.Factory<?>>> map2) {
        return new DispatchingAndroidInjector<>(map, map2);
    }

    @Override // javax.inject.Provider
    public DispatchingAndroidInjector<T> get() {
        return newInstance(this.injectorFactoriesWithClassKeysProvider.get(), this.injectorFactoriesWithStringKeysProvider.get());
    }
}
