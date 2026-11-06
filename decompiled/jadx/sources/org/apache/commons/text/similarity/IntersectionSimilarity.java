package org.apache.commons.text.similarity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IntersectionSimilarity<T> implements SimilarityScore<IntersectionResult> {
    private final Function<CharSequence, Collection<T>> converter;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class BagCount {
        private static final BagCount ZERO = new BagCount();
        private int count;

        private BagCount() {
            this.count = 0;
        }

        public static /* synthetic */ int access$008(BagCount bagCount) {
            int i = bagCount.count;
            bagCount.count = i + 1;
            return i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class TinyBag {
        private final Map<T, BagCount> map;

        private TinyBag(int i) {
            this.map = new HashMap(i);
        }

        public static /* synthetic */ void access$700(TinyBag tinyBag, Object obj) {
            tinyBag.add(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void add(T t) {
            BagCount.access$008(this.map.computeIfAbsent(t, new IntersectionSimilarity$TinyBag$$ExternalSyntheticLambda0()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Set<Map.Entry<T, BagCount>> entrySet() {
            return this.map.entrySet();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getCount(Object obj) {
            return this.map.getOrDefault(obj, BagCount.ZERO).count;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ BagCount lambda$add$0(Object obj) {
            return new BagCount();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int uniqueElementSize() {
            return this.map.size();
        }
    }

    public IntersectionSimilarity(Function<CharSequence, Collection<T>> function) {
        if (function != null) {
            this.converter = function;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Converter must not be null");
            throw null;
        }
    }

    private int getIntersection(IntersectionSimilarity<T>.TinyBag tinyBag, IntersectionSimilarity<T>.TinyBag tinyBag2) {
        int i = 0;
        for (Map.Entry entry : tinyBag.entrySet()) {
            i += Math.min(((BagCount) entry.getValue()).count, tinyBag2.getCount(entry.getKey()));
        }
        return i;
    }

    private IntersectionSimilarity<T>.TinyBag toBag(Collection<T> collection) {
        IntersectionSimilarity<T>.TinyBag tinyBag = new TinyBag(collection.size());
        collection.forEach(new Counter$$ExternalSyntheticLambda1(tinyBag, 1));
        return tinyBag;
    }

    @Override // org.apache.commons.text.similarity.SimilarityScore, org.apache.commons.text.similarity.ObjectSimilarityScore, java.util.function.BiFunction
    public IntersectionResult apply(CharSequence charSequence, CharSequence charSequence2) {
        int intersection;
        if (charSequence == null || charSequence2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Input cannot be null");
            return null;
        }
        Collection<T> apply = this.converter.apply(charSequence);
        Collection<T> apply2 = this.converter.apply(charSequence2);
        int size = apply.size();
        int size2 = apply2.size();
        if (Math.min(size, size2) == 0) {
            return new IntersectionResult(size, size2, 0);
        }
        if ((apply instanceof Set) && (apply2 instanceof Set)) {
            intersection = size < size2 ? getIntersection((Set) apply, (Set) apply2) : getIntersection((Set) apply2, (Set) apply);
        } else {
            IntersectionSimilarity<T>.TinyBag bag = toBag(apply);
            IntersectionSimilarity<T>.TinyBag bag2 = toBag(apply2);
            intersection = bag.uniqueElementSize() < bag2.uniqueElementSize() ? getIntersection(bag, bag2) : getIntersection(bag2, bag);
        }
        return new IntersectionResult(size, size2, intersection);
    }

    private static <T> int getIntersection(Set<T> set, Set<T> set2) {
        Iterator<T> it2 = set.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (set2.contains(it2.next())) {
                i++;
            }
        }
        return i;
    }
}
