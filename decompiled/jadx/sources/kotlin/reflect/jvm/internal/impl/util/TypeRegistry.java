package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public abstract class TypeRegistry<K, V> {

    @NotNull
    private final ConcurrentHashMap<String, Integer> idPerType = new ConcurrentHashMap<>();

    @NotNull
    private final AtomicInteger idCounter = new AtomicInteger(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getId$lambda$0(TypeRegistry typeRegistry, String str) {
        str.getClass();
        return typeRegistry.idCounter.getAndIncrement();
    }

    @NotNull
    public final Map<String, Integer> allValuesThreadUnsafeForRendering() {
        return this.idPerType;
    }

    public abstract int customComputeIfAbsent(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String str, @NotNull Function1<? super String, Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> generateNullableAccessor(@NotNull KClass<KK> kClass) {
        kClass.getClass();
        return new NullableArrayMapAccessor<>(getId(kClass));
    }

    public final <T extends K> int getId(@NotNull KClass<T> kClass) {
        kClass.getClass();
        String qualifiedName = kClass.getQualifiedName();
        qualifiedName.getClass();
        return getId(qualifiedName);
    }

    @NotNull
    public final Collection<Integer> getIndices() {
        Collection<Integer> values = this.idPerType.values();
        values.getClass();
        return values;
    }

    public final int getId(@NotNull String str) {
        str.getClass();
        return customComputeIfAbsent(this.idPerType, str, new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.util.TypeRegistry$$Lambda$0
            private final TypeRegistry arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                int id$lambda$0;
                id$lambda$0 = TypeRegistry.getId$lambda$0(this.arg$0, (String) obj);
                return Integer.valueOf(id$lambda$0);
            }
        });
    }
}
