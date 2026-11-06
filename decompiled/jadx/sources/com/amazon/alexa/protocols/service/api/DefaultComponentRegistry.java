package com.amazon.alexa.protocols.service.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.DefaultComponentRegistry;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(21)
/* loaded from: classes18.dex */
final class DefaultComponentRegistry extends ComponentRegistry {
    private static final long CREATION_TIME_WARNING_NANOS = 100000000;
    private static final String TAG = "ComponentRegistry";
    private final Context applicationContext;
    private final ComponentGetter getter;
    private final Map<Class<?>, ProviderOfConstructionResult<?>> bindings = new ConcurrentHashMap();
    private final Map<Class<?>, ConstructionResult<?>> implementations = new ConcurrentHashMap();
    private final Map<Class<?>, Object> constructionLocks = new ConcurrentHashMap();
    private final Set<Class<?>> underConstruction = new HashSet();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ConstructionResult<T> {
        protected final T reference;
        protected final Throwable throwable;

        public ConstructionResult(T t, Throwable th) {
            Preconditions.checkArgument((th != null) ^ (t != null));
            this.reference = t;
            this.throwable = th;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> ConstructionResult<T> fromThrowable(Throwable th) {
            return new ConstructionResult<>(null, th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> ConstructionResult<T> fromType(T t) {
            return new ConstructionResult<>(t, null);
        }

        public boolean isPresent() {
            return this.reference != null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ConstructionResultList<T> extends ConstructionResult<ImmutableList<T>> {
        public ConstructionResultList(ImmutableList<T> immutableList, Throwable th) {
            super(immutableList, th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> ConstructionResultList<T> fromList(ImmutableList<T> immutableList) {
            return new ConstructionResultList<>(immutableList, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> ConstructionResultList<T> fromListThrowable(Throwable th) {
            return new ConstructionResultList<>(null, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ProviderOfConstructionResult<T> {
        @NonNull
        ConstructionResult<T> provide();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ProviderOfList<T> extends ProviderOfConstructionResult<ImmutableList<T>> {
        @Override // com.amazon.alexa.protocols.service.api.DefaultComponentRegistry.ProviderOfConstructionResult
        @NonNull
        ConstructionResultList<T> provide();
    }

    public DefaultComponentRegistry(Context context) {
        Preconditions.checkNotNull(context);
        this.applicationContext = context.getApplicationContext();
        this.getter = new DefaultComponentGetter(this);
    }

    private <T> void checkInterfaceArgument(@NonNull Class<T> cls) {
        Preconditions.checkNotNull(cls, "interface was null");
        Preconditions.checkArgument(cls.isInterface(), cls + " is not an interface");
        Preconditions.checkState(this.bindings.containsKey(cls) ^ true, cls + " was already bound");
        Preconditions.checkState(this.constructionLocks.containsKey(cls) ^ true, cls + " is already in constructionLocks");
    }

    @NonNull
    private static ComponentRegistry.ComponentFactory<?> createFactory(String str) throws ReflectiveOperationException {
        return (ComponentRegistry.ComponentFactory) nonNullCast(ComponentRegistry.ComponentFactory.class, findClass(ComponentRegistry.ComponentFactory.class, str).getConstructor(null).newInstance(null));
    }

    @NonNull
    private <T> T createImplementation(Class<T> cls, String str) throws ReflectiveOperationException {
        Class<?> findClass = findClass(cls, str);
        try {
            try {
                return (T) nonNullCast(cls, findClass.getConstructor(Context.class).newInstance(this.applicationContext));
            } catch (NoSuchMethodException unused) {
                try {
                    return (T) nonNullCast(cls, findClass.getConstructor(null).newInstance(null));
                } catch (NoSuchMethodException unused2) {
                    throw new NoSuchMethodException("No constructor with allowed argument list found for " + cls.getCanonicalName());
                }
            }
        } catch (NoSuchMethodException unused3) {
            return (T) nonNullCast(cls, findClass.getConstructor(ComponentGetter.class, Context.class).newInstance(this.getter, this.applicationContext));
        }
    }

    @NonNull
    private static <T> Class<?> findClass(Class<T> cls, String str) throws ClassNotFoundException {
        if (str != null) {
            return Class.forName(str);
        }
        throw new ClassNotFoundException("No binding for " + cls.getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    /* renamed from: getOrThrow, reason: merged with bridge method [inline-methods] */
    public <T> T lambda$getLazy$4(@NonNull Class<T> cls) {
        if (isNotBoundAsSingle(cls)) {
            Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Unbound api:", cls));
            return null;
        }
        ConstructionResult<?> constructionResult = this.implementations.get(cls);
        if (constructionResult == null) {
            constructionResult = instantiate(cls);
        }
        if (constructionResult.isPresent()) {
            return (T) nonNullCast(cls, constructionResult.reference);
        }
        Single$$ExternalSyntheticBUOutline0.m$1(a$$ExternalSyntheticOutline0.m("Unconstructable api:", cls), constructionResult.throwable);
        return null;
    }

    private <T> boolean isBoundAsList(Class<T> cls) {
        return cls != null && (this.bindings.get(cls) instanceof ProviderOfList);
    }

    private <T> boolean isNotBoundAsSingle(Class<T> cls) {
        ProviderOfConstructionResult<?> providerOfConstructionResult;
        return cls == null || (providerOfConstructionResult = this.bindings.get(cls)) == null || (providerOfConstructionResult instanceof ProviderOfList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ConstructionResult lambda$bind$0(Class cls, String str) {
        try {
            return ConstructionResult.fromType(createImplementation(cls, str));
        } catch (ClassCastException | ReflectiveOperationException e) {
            a$$ExternalSyntheticOutline0.m("Unable to create instance of:", str, TAG, e);
            return ConstructionResult.fromThrowable(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ConstructionResult lambda$bindConcreteFactory$3(ComponentRegistry.ConcreteComponentFactory concreteComponentFactory) {
        return ConstructionResult.fromType(concreteComponentFactory.create(this.applicationContext));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ConstructionResult lambda$bindFactory$2(String str) {
        try {
            ComponentRegistry.ComponentFactory<?> createFactory = createFactory(str);
            Object create = createFactory.create(this.getter, this.applicationContext);
            if (create == null) {
                create = createFactory.create(this.applicationContext);
            }
            return ConstructionResult.fromType(create);
        } catch (ClassCastException | ReflectiveOperationException e) {
            Log.e(TAG, "Unable to create instance", e);
            return ConstructionResult.fromThrowable(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ConstructionResultList lambda$bindList$1(String[] strArr, Class cls) {
        r0 = "";
        try {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (String str : strArr) {
                builder.add((ImmutableList.Builder) createImplementation(cls, str));
            }
            return ConstructionResultList.fromList(builder.build());
        } catch (ClassCastException | ReflectiveOperationException e) {
            a$$ExternalSyntheticOutline0.m("Unable to create instance of:", str, TAG, e);
            return ConstructionResultList.fromListThrowable(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ List lambda$getLazyList$5(Class cls) {
        ConstructionResult<?> constructionResult = this.implementations.get(cls);
        if (constructionResult == null) {
            constructionResult = instantiate(cls);
        }
        if (!(constructionResult instanceof ConstructionResultList)) {
            Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Expected to get a List of implementations of:", cls));
            return null;
        }
        if (constructionResult.isPresent()) {
            return (ImmutableList) constructionResult.reference;
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Construction Failed", constructionResult.throwable);
        return null;
    }

    @NonNull
    private static <T> T nonNullCast(@NonNull Class<T> cls, @NonNull Object obj) {
        return cls.cast(obj);
    }

    private <T> void provideInstance(@NonNull Class<T> cls) {
        ProviderOfConstructionResult<?> providerOfConstructionResult = this.bindings.get(cls);
        if (providerOfConstructionResult == null) {
            Log.e(TAG, "No provider was registered for " + cls.getCanonicalName(), new Throwable());
            return;
        }
        long nanoTime = System.nanoTime();
        ConstructionResult<?> provide = providerOfConstructionResult.provide();
        Preconditions.checkState(provide != null);
        if (provide != null && provide.isPresent()) {
            UnmodifiableIterator it2 = (provide instanceof ConstructionResultList ? (ImmutableList) ((ConstructionResultList) provide).reference : ImmutableList.of(provide.reference)).iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                cls.cast(next);
                if (next instanceof InitializableComponent) {
                    ((InitializableComponent) next).initializeComponent(this.getter, this.applicationContext);
                }
            }
        }
        this.implementations.put(cls, provide);
        long nanoTime2 = System.nanoTime() - nanoTime;
        long j = CREATION_TIME_WARNING_NANOS;
        if (nanoTime2 > j) {
            String str = TAG;
            StringBuilder m = a$$ExternalSyntheticOutline0.m("Exceeded nanos: ", j, " creating:");
            m.append(cls.getCanonicalName());
            Log.w(str, m.toString());
        }
    }

    @Override // com.amazon.alexa.protocols.service.api.ComponentRegistry
    @NonNull
    public synchronized <T> ComponentRegistry bind(@NonNull final Class<T> cls, @NonNull final String str) throws IllegalArgumentException, IllegalStateException {
        checkInterfaceArgument(cls);
        Preconditions.checkNotNull(str, "class name was null");
        Preconditions.checkArgument(!str.isEmpty(), "class name was empty");
        this.constructionLocks.put(cls, new Object());
        this.bindings.put(cls, new ProviderOfConstructionResult() { // from class: com.amazon.alexa.protocols.service.api.DefaultComponentRegistry$$ExternalSyntheticLambda4
            @Override // com.amazon.alexa.protocols.service.api.DefaultComponentRegistry.ProviderOfConstructionResult
            public final DefaultComponentRegistry.ConstructionResult provide() {
                DefaultComponentRegistry.ConstructionResult lambda$bind$0;
                lambda$bind$0 = DefaultComponentRegistry.this.lambda$bind$0(cls, str);
                return lambda$bind$0;
            }
        });
        return this;
    }

    @Override // com.amazon.alexa.protocols.service.api.ComponentRegistry
    @NonNull
    public synchronized <T> ComponentRegistry bindConcreteFactory(@NonNull Class<T> cls, @NonNull ComponentRegistry.ConcreteComponentFactory<? extends T> concreteComponentFactory) {
        checkInterfaceArgument(cls);
        Preconditions.checkNotNull(concreteComponentFactory, cls + " was attempted to be bound with a null factory");
        this.constructionLocks.put(cls, new Object());
        this.bindings.put(cls, new DefaultComponentRegistry$$ExternalSyntheticLambda2(this, concreteComponentFactory, 0));
        return this;
    }

    @Override // com.amazon.alexa.protocols.service.api.ComponentRegistry
    @NonNull
    public synchronized <T> ComponentRegistry bindFactory(@NonNull Class<T> cls, @NonNull String str) {
        checkInterfaceArgument(cls);
        Preconditions.checkNotNull(str, "factory class name was null");
        Preconditions.checkArgument(!str.isEmpty(), "factory class name was empty");
        this.constructionLocks.put(cls, new Object());
        this.bindings.put(cls, new DefaultComponentRegistry$$ExternalSyntheticLambda2(this, str, 1));
        return this;
    }

    @Override // com.amazon.alexa.protocols.service.api.ComponentRegistry
    @NonNull
    public synchronized <T> ComponentRegistry bindList(@NonNull final Class<T> cls, @NonNull String... strArr) throws IllegalArgumentException, IllegalStateException {
        try {
            checkInterfaceArgument(cls);
            Preconditions.checkArgument(strArr.length > 0);
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                Preconditions.checkArgument(!TextUtils.isEmpty(str));
                hashSet.add(str);
            }
            Preconditions.checkArgument(hashSet.size() == strArr.length);
            final String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.constructionLocks.put(cls, new Object());
            this.bindings.put(cls, new ProviderOfList() { // from class: com.amazon.alexa.protocols.service.api.DefaultComponentRegistry$$ExternalSyntheticLambda1
                @Override // com.amazon.alexa.protocols.service.api.DefaultComponentRegistry.ProviderOfList, com.amazon.alexa.protocols.service.api.DefaultComponentRegistry.ProviderOfConstructionResult
                public final DefaultComponentRegistry.ConstructionResultList provide() {
                    DefaultComponentRegistry.ConstructionResultList lambda$bindList$1;
                    lambda$bindList$1 = DefaultComponentRegistry.this.lambda$bindList$1(strArr2, cls);
                    return lambda$bindList$1;
                }
            });
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // com.amazon.alexa.protocols.service.api.ComponentRegistry
    @NonNull
    public <T> Optional<T> get(@NonNull Class<T> cls) {
        try {
            return Optional.of(lambda$getLazy$4(cls));
        } catch (IllegalStateException e) {
            Log.e(TAG, "Optional will be absent", e);
            return Optional.absent();
        }
    }

    @Override // com.amazon.alexa.protocols.service.api.ComponentRegistry
    @NonNull
    public <T> LazyComponent<T> getLazy(@NonNull Class<T> cls) {
        if (!isNotBoundAsSingle(cls)) {
            return new DefaultComponentRegistry$$ExternalSyntheticLambda0(this, cls, 0);
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Unbound api:", cls));
        return null;
    }

    @Override // com.amazon.alexa.protocols.service.api.ComponentRegistry
    @NonNull
    public <T> LazyComponent<List<T>> getLazyList(@NonNull Class<T> cls) {
        if (isBoundAsList(cls)) {
            return new DefaultComponentRegistry$$ExternalSyntheticLambda0(this, cls, 1);
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Unbound as List api:", cls));
        return null;
    }

    @NonNull
    public <T> ConstructionResult<?> instantiate(@NonNull Class<T> cls) {
        ConstructionResult<?> constructionResult;
        Object obj = this.constructionLocks.get(cls);
        if (!this.bindings.containsKey(cls) || obj == null) {
            String m = a$$ExternalSyntheticOutline0.m("No binding for ", cls);
            Log.e(TAG, m);
            return ConstructionResult.fromThrowable(new IllegalStateException(m));
        }
        synchronized (obj) {
            try {
                try {
                    if (!this.implementations.containsKey(cls)) {
                        if (!this.underConstruction.add(cls)) {
                            throw new IllegalStateException("Circularity error constructing " + cls);
                        }
                        try {
                            provideInstance(cls);
                            this.underConstruction.remove(cls);
                        } catch (Throwable th) {
                            this.underConstruction.remove(cls);
                            throw th;
                        }
                    }
                    constructionResult = this.implementations.get(cls);
                } catch (ClassCastException e) {
                    Log.e(TAG, "Unable to create instance", e);
                    return ConstructionResult.fromThrowable(e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return constructionResult;
    }
}
