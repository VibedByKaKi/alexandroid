package com.amazon.regulator;

import android.util.ArrayMap;
import com.amazon.regulator.internal.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Component {
    private final ArrayMap<String, Object> registry = new ArrayMap<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Provider<T> {
        T get();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class ProviderBuilder<T> {
        private final String key;
        private final Provider<T> provider;
        private boolean singleInstance;

        public ProviderBuilder(String str, Provider<T> provider) {
            this.provider = provider;
            this.key = str;
        }

        public void register() {
            ArrayMap arrayMap = Component.this.registry;
            String str = this.key;
            boolean z = this.singleInstance;
            SingletonProvider singletonProvider = this.provider;
            if (z) {
                singletonProvider = SingletonProvider.of(singletonProvider);
            }
            arrayMap.put(str, singletonProvider);
        }

        public ProviderBuilder<T> singleInstance() {
            this.singleInstance = true;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SimpleProvider<T> implements Provider<T> {
        private final T value;

        private SimpleProvider(T t) {
            Preconditions.nonNull(t, "value == null");
            this.value = t;
        }

        public static <T> SimpleProvider<T> of(T t) {
            Preconditions.nonNull(t, "value == null");
            return new SimpleProvider<>(t);
        }

        @Override // com.amazon.regulator.Component.Provider
        public T get() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class SingletonProvider<T> implements Provider<T> {
        private volatile boolean provided;
        private final Provider<T> provider;
        private volatile T value;

        private SingletonProvider(Provider<T> provider) {
            Preconditions.nonNull(provider, "provider == null");
            this.provider = provider;
        }

        public static <T> SingletonProvider<T> of(Provider<T> provider) {
            Preconditions.nonNull(provider, "provider == null");
            return new SingletonProvider<>(provider);
        }

        @Override // com.amazon.regulator.Component.Provider
        public T get() {
            if (!this.provided) {
                synchronized (this) {
                    try {
                        if (!this.provided) {
                            this.value = this.provider.get();
                            if (this.value == null) {
                                throw new IllegalStateException("A provider returned null");
                            }
                            this.provided = true;
                        }
                    } finally {
                    }
                }
            }
            return this.value;
        }
    }

    private <T> T get(String str) {
        Provider provider = (Provider) this.registry.get(str);
        if (provider != null) {
            return (T) provider.get();
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("There is no provider registered with the key ", str));
        return null;
    }

    private String getKey(Class<?> cls, String str) {
        StringBuilder sb = new StringBuilder(cls.getCanonicalName());
        if (str != null) {
            sb.append('-');
            sb.append(str);
        }
        return sb.toString();
    }

    private <T> ProviderBuilder<T> prepareProvider(String str, Provider<T> provider) {
        if (!this.registry.containsKey(str)) {
            return new ProviderBuilder<>(str, provider);
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("A provider is already registered with the same key ", str));
        return null;
    }

    public <T> boolean isRegistered(String str, Class<? extends T> cls) {
        if (cls == null || str == null) {
            return false;
        }
        return isRegistered(getKey(cls, str));
    }

    public <T> ProviderBuilder<? super T> provide(String str, T t) {
        Preconditions.nonNull(str, "name == null");
        Preconditions.nonNull(t, "dependency == null");
        return prepareProvider(getKey(t.getClass(), str), SimpleProvider.of(t));
    }

    public <T> void remove(String str, T t) {
        Preconditions.nonNull(str, "name == null");
        Preconditions.nonNull(t, "dependency == null");
        this.registry.remove(getKey(t.getClass(), str));
    }

    public <T> boolean isRegistered(Class<? extends T> cls) {
        if (cls == null) {
            return false;
        }
        return isRegistered(getKey(cls, null));
    }

    private boolean isRegistered(String str) {
        return this.registry.get(str) != null;
    }

    public <T> void remove(T t) {
        Preconditions.nonNull(t, "dependency == null");
        this.registry.remove(getKey(t.getClass(), null));
    }

    public <T> T get(String str, Class<? extends T> cls) {
        Preconditions.nonNull(str, "name == null");
        Preconditions.nonNull(cls, "aClass == null");
        return (T) get(getKey(cls, str));
    }

    public <T> void remove(Class<? extends T> cls) {
        Preconditions.nonNull(cls, "aClass == null");
        this.registry.remove(getKey(cls, null));
    }

    public <T> ProviderBuilder<? super T> provide(T t) {
        Preconditions.nonNull(t, "dependency == null");
        return prepareProvider(getKey(t.getClass(), null), SimpleProvider.of(t));
    }

    public <T> T get(Class<? extends T> cls) {
        Preconditions.nonNull(cls, "aClass == null");
        return (T) get(getKey(cls, null));
    }

    public <T> void remove(String str, Class<? extends T> cls) {
        Preconditions.nonNull(str, "name == null");
        Preconditions.nonNull(cls, "aClass == null");
        this.registry.remove(getKey(cls, str));
    }

    public <T> ProviderBuilder<? super T> provide(Class<? extends T> cls, Provider<T> provider) {
        Preconditions.nonNull(cls, "aClass == null");
        Preconditions.nonNull(provider, "provider == null");
        return prepareProvider(getKey(cls, null), provider);
    }

    public <T> ProviderBuilder<? super T> provide(Class<? extends T> cls, T t) {
        Preconditions.nonNull(cls, "aClass == null");
        Preconditions.nonNull(t, "dependency == null");
        return prepareProvider(getKey(cls, null), SimpleProvider.of(t));
    }

    public <T> ProviderBuilder<? super T> provide(String str, Class<? extends T> cls, Provider<T> provider) {
        Preconditions.nonNull(str, "name == null");
        Preconditions.nonNull(cls, "aClass == null");
        Preconditions.nonNull(provider, "provider == null");
        return prepareProvider(getKey(cls, str), provider);
    }
}
