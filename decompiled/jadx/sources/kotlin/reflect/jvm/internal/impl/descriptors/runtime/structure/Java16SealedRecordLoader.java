package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
final class Java16SealedRecordLoader {

    @NotNull
    public static final Java16SealedRecordLoader INSTANCE = new Java16SealedRecordLoader();

    @Nullable
    private static Cache _cache;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Cache {

        @Nullable
        private final Method getPermittedSubclasses;

        @Nullable
        private final Method getRecordComponents;

        @Nullable
        private final Method isRecord;

        @Nullable
        private final Method isSealed;

        public Cache(@Nullable Method method, @Nullable Method method2, @Nullable Method method3, @Nullable Method method4) {
            this.isSealed = method;
            this.getPermittedSubclasses = method2;
            this.isRecord = method3;
            this.getRecordComponents = method4;
        }

        @Nullable
        public final Method getGetPermittedSubclasses() {
            return this.getPermittedSubclasses;
        }

        @Nullable
        public final Method getGetRecordComponents() {
            return this.getRecordComponents;
        }

        @Nullable
        public final Method isRecord() {
            return this.isRecord;
        }

        @Nullable
        public final Method isSealed() {
            return this.isSealed;
        }
    }

    private Java16SealedRecordLoader() {
    }

    private final Cache buildCache() {
        try {
            return new Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null, null, null);
        }
    }

    private final Cache initCache() {
        Cache cache = _cache;
        if (cache != null) {
            return cache;
        }
        Cache buildCache = buildCache();
        _cache = buildCache;
        return buildCache;
    }

    @Nullable
    public final Class<?>[] loadGetPermittedSubclasses(@NotNull Class<?> cls) {
        cls.getClass();
        Method getPermittedSubclasses = initCache().getGetPermittedSubclasses();
        if (getPermittedSubclasses == null) {
            return null;
        }
        Object invoke = getPermittedSubclasses.invoke(cls, null);
        invoke.getClass();
        return (Class[]) invoke;
    }

    @Nullable
    public final Object[] loadGetRecordComponents(@NotNull Class<?> cls) {
        cls.getClass();
        Method getRecordComponents = initCache().getGetRecordComponents();
        if (getRecordComponents == null) {
            return null;
        }
        return (Object[]) getRecordComponents.invoke(cls, null);
    }

    @Nullable
    public final Boolean loadIsRecord(@NotNull Class<?> cls) {
        cls.getClass();
        Method isRecord = initCache().isRecord();
        if (isRecord == null) {
            return null;
        }
        Object invoke = isRecord.invoke(cls, null);
        invoke.getClass();
        return (Boolean) invoke;
    }

    @Nullable
    public final Boolean loadIsSealed(@NotNull Class<?> cls) {
        cls.getClass();
        Method isSealed = initCache().isSealed();
        if (isSealed == null) {
            return null;
        }
        Object invoke = isSealed.invoke(cls, null);
        invoke.getClass();
        return (Boolean) invoke;
    }
}
