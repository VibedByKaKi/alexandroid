package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.Closure;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ChainedClosure<E> implements Closure<E>, Serializable {
    private static final long serialVersionUID = -3520677225766901240L;
    private final Closure<? super E>[] iClosures;

    private ChainedClosure(boolean z, Closure<? super E>... closureArr) {
        this.iClosures = z ? FunctorUtils.copy(closureArr) : closureArr;
    }

    public static <E> Closure<E> chainedClosure(Collection<? extends Closure<? super E>> collection) {
        if (collection == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Closure collection must not be null");
            return null;
        }
        if (collection.size() == 0) {
            return NOPClosure.nopClosure();
        }
        Closure[] closureArr = new Closure[collection.size()];
        Iterator<? extends Closure<? super E>> it2 = collection.iterator();
        int i = 0;
        while (it2.hasNext()) {
            closureArr[i] = it2.next();
            i++;
        }
        FunctorUtils.validate((Closure<?>[]) closureArr);
        return new ChainedClosure(false, closureArr);
    }

    @Override // org.apache.commons.collections4.Closure
    public void execute(E e) {
        for (Closure<? super E> closure : this.iClosures) {
            closure.execute(e);
        }
    }

    public Closure<? super E>[] getClosures() {
        return FunctorUtils.copy(this.iClosures);
    }

    public ChainedClosure(Closure<? super E>... closureArr) {
        this(true, closureArr);
    }

    public static <E> Closure<E> chainedClosure(Closure<? super E>... closureArr) {
        FunctorUtils.validate(closureArr);
        if (closureArr.length == 0) {
            return NOPClosure.nopClosure();
        }
        return new ChainedClosure(closureArr);
    }
}
