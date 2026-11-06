package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.util.Map;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class SwitchTransformer<I, O> implements Transformer<I, O>, Serializable {
    private static final long serialVersionUID = -6404460890903469332L;
    private final Transformer<? super I, ? extends O> iDefault;
    private final Predicate<? super I>[] iPredicates;
    private final Transformer<? super I, ? extends O>[] iTransformers;

    private SwitchTransformer(boolean z, Predicate<? super I>[] predicateArr, Transformer<? super I, ? extends O>[] transformerArr, Transformer<? super I, ? extends O> transformer) {
        this.iPredicates = z ? FunctorUtils.copy(predicateArr) : predicateArr;
        this.iTransformers = z ? FunctorUtils.copy(transformerArr) : transformerArr;
        this.iDefault = transformer == null ? ConstantTransformer.nullTransformer() : transformer;
    }

    public static <I, O> Transformer<I, O> switchTransformer(Map<? extends Predicate<? super I>, ? extends Transformer<? super I, ? extends O>> map) {
        if (map == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("The predicate and transformer map must not be null");
            return null;
        }
        if (map.size() == 0) {
            return ConstantTransformer.nullTransformer();
        }
        Transformer<? super I, ? extends O> remove = map.remove(null);
        int size = map.size();
        if (size == 0) {
            return remove == null ? ConstantTransformer.nullTransformer() : remove;
        }
        Transformer[] transformerArr = new Transformer[size];
        Predicate[] predicateArr = new Predicate[size];
        int i = 0;
        for (Map.Entry<? extends Predicate<? super I>, ? extends Transformer<? super I, ? extends O>> entry : map.entrySet()) {
            predicateArr[i] = entry.getKey();
            transformerArr[i] = entry.getValue();
            i++;
        }
        return new SwitchTransformer(false, predicateArr, transformerArr, remove);
    }

    public Transformer<? super I, ? extends O> getDefaultTransformer() {
        return this.iDefault;
    }

    public Predicate<? super I>[] getPredicates() {
        return FunctorUtils.copy(this.iPredicates);
    }

    public Transformer<? super I, ? extends O>[] getTransformers() {
        return FunctorUtils.copy(this.iTransformers);
    }

    @Override // org.apache.commons.collections4.Transformer
    public O transform(I i) {
        int i2 = 0;
        while (true) {
            Predicate<? super I>[] predicateArr = this.iPredicates;
            if (i2 >= predicateArr.length) {
                return this.iDefault.transform(i);
            }
            if (predicateArr[i2].evaluate(i)) {
                return this.iTransformers[i2].transform(i);
            }
            i2++;
        }
    }

    public SwitchTransformer(Predicate<? super I>[] predicateArr, Transformer<? super I, ? extends O>[] transformerArr, Transformer<? super I, ? extends O> transformer) {
        this(true, predicateArr, transformerArr, transformer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <I, O> Transformer<I, O> switchTransformer(Predicate<? super I>[] predicateArr, Transformer<? super I, ? extends O>[] transformerArr, Transformer<? super I, ? extends O> transformer) {
        FunctorUtils.validate(predicateArr);
        FunctorUtils.validate(transformerArr);
        if (predicateArr.length == transformerArr.length) {
            if (predicateArr.length == 0) {
                return transformer == 0 ? ConstantTransformer.nullTransformer() : transformer;
            }
            return new SwitchTransformer(predicateArr, transformerArr, transformer);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The predicate and transformer arrays must be the same size");
        return null;
    }
}
