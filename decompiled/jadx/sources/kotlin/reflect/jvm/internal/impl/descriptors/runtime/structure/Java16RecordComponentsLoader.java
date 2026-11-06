package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
final class Java16RecordComponentsLoader {

    @NotNull
    public static final Java16RecordComponentsLoader INSTANCE = new Java16RecordComponentsLoader();

    @Nullable
    private static Cache _cache;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Cache {

        @Nullable
        private final Method getAccessor;

        @Nullable
        private final Method getType;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.getType = method;
            this.getAccessor = method2;
        }

        @Nullable
        public final Method getGetAccessor() {
            return this.getAccessor;
        }

        @Nullable
        public final Method getGetType() {
            return this.getType;
        }
    }

    private Java16RecordComponentsLoader() {
    }

    private final Cache buildCache(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    private final Cache initCache(Object obj) {
        Cache cache = _cache;
        if (cache != null) {
            return cache;
        }
        Cache buildCache = buildCache(obj);
        _cache = buildCache;
        return buildCache;
    }

    @Nullable
    public final Method loadGetAccessor(@NotNull Object obj) {
        obj.getClass();
        Method getAccessor = initCache(obj).getGetAccessor();
        if (getAccessor == null) {
            return null;
        }
        Object invoke = getAccessor.invoke(obj, null);
        invoke.getClass();
        return (Method) invoke;
    }

    @Nullable
    public final Class<?> loadGetType(@NotNull Object obj) {
        obj.getClass();
        Method getType = initCache(obj).getGetType();
        if (getType == null) {
            return null;
        }
        Object invoke = getType.invoke(obj, null);
        invoke.getClass();
        return (Class) invoke;
    }
}
