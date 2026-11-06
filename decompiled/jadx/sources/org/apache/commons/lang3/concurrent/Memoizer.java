package org.apache.commons.lang3.concurrent;

import com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Function;
import org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda0;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11;
import org.apache.commons.lang3.exception.ExceptionUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Memoizer<I, O> implements Computable<I, O> {
    private final ConcurrentMap<I, Future<O>> cache;
    private final Function<? super I, ? extends Future<O>> mappingFunction;
    private final boolean recalculate;

    public Memoizer(Computable<I, O> computable, boolean z) {
        this.cache = new ConcurrentHashMap();
        this.recalculate = z;
        this.mappingFunction = new Functions$$ExternalSyntheticLambda11(computable, 22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Future lambda$new$0(Computable computable, Object obj) {
        return FutureTasks.run(new ReactHostImpl$$ExternalSyntheticLambda0(computable, obj, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Future lambda$new$2(Function function, Object obj) {
        return FutureTasks.run(new ReactHostImpl$$ExternalSyntheticLambda0(function, obj, 15));
    }

    private RuntimeException launderException(Throwable th) {
        throw new IllegalStateException("Unchecked exception", ExceptionUtils.throwUnchecked(th));
    }

    @Override // org.apache.commons.lang3.concurrent.Computable
    public O compute(I i) throws InterruptedException {
        while (true) {
            Future<O> computeIfAbsent = this.cache.computeIfAbsent(i, this.mappingFunction);
            try {
                return computeIfAbsent.get();
            } catch (CancellationException unused) {
                this.cache.remove(i, computeIfAbsent);
            } catch (ExecutionException e) {
                if (this.recalculate) {
                    this.cache.remove(i, computeIfAbsent);
                }
                throw this.launderException(e.getCause());
            }
        }
    }

    public Memoizer(Computable<I, O> computable) {
        this((Computable) computable, false);
    }

    public Memoizer(Function<I, O> function) {
        this((Function) function, false);
    }

    public Memoizer(Function<I, O> function, boolean z) {
        this.cache = new ConcurrentHashMap();
        this.recalculate = z;
        this.mappingFunction = new EnumUtils$$ExternalSyntheticLambda0(function, 1);
    }
}
