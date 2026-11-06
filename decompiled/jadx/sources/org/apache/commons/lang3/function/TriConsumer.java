package org.apache.commons.lang3.function;

import java.util.Objects;
import kotlinx.coroutines.rx3.RxConvertKt$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes11.dex */
public interface TriConsumer<T, U, V> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void lambda$andThen$0(TriConsumer triConsumer, Object obj, Object obj2, Object obj3) {
        accept(obj, obj2, obj3);
        triConsumer.accept(obj, obj2, obj3);
    }

    void accept(T t, U u, V v);

    default TriConsumer<T, U, V> andThen(TriConsumer<? super T, ? super U, ? super V> triConsumer) {
        Objects.requireNonNull(triConsumer);
        return new RxConvertKt$$ExternalSyntheticLambda0(this, triConsumer, 14);
    }
}
