package org.apache.commons.collections4.collection;

import dagger.internal.codegen.binding.MapKeys$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.list.PredicatedList;
import org.apache.commons.collections4.multiset.HashMultiSet;
import org.apache.commons.collections4.multiset.PredicatedMultiSet;
import org.apache.commons.collections4.queue.PredicatedQueue;
import org.apache.commons.collections4.set.PredicatedSet;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PredicatedCollection<E> extends AbstractCollectionDecorator<E> {
    private static final long serialVersionUID = -5259182142076705162L;
    protected final Predicate<? super E> predicate;

    public PredicatedCollection(Collection<E> collection, Predicate<? super E> predicate) {
        super(collection);
        if (predicate == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Predicate must not be null.");
            throw null;
        }
        this.predicate = predicate;
        Iterator<E> it2 = collection.iterator();
        while (it2.hasNext()) {
            validate(it2.next());
        }
    }

    public static <E> Builder<E> builder(Predicate<? super E> predicate) {
        return new Builder<>(predicate);
    }

    public static <E> Builder<E> notNullBuilder() {
        return new Builder<>(NotNullPredicate.notNullPredicate());
    }

    public static <T> PredicatedCollection<T> predicatedCollection(Collection<T> collection, Predicate<? super T> predicate) {
        return new PredicatedCollection<>(collection, predicate);
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection, org.apache.commons.collections4.Bag
    public boolean add(E e) {
        validate(e);
        return decorated().add(e);
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        while (it2.hasNext()) {
            validate(it2.next());
        }
        return decorated().addAll(collection);
    }

    public void validate(E e) {
        if (this.predicate.evaluate(e)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot add Object '");
        sb.append(e);
        MapKeys$$ExternalSyntheticBUOutline0.m(sb, "' - Predicate '", this.predicate, "' rejected it");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder<E> {
        private final Predicate<? super E> predicate;
        private final List<E> accepted = new ArrayList();
        private final List<E> rejected = new ArrayList();

        public Builder(Predicate<? super E> predicate) {
            if (predicate != null) {
                this.predicate = predicate;
            } else {
                Single$$ExternalSyntheticBUOutline0.m$1("Predicate must not be null");
                throw null;
            }
        }

        public Builder<E> add(E e) {
            if (this.predicate.evaluate(e)) {
                this.accepted.add(e);
                return this;
            }
            this.rejected.add(e);
            return this;
        }

        public Builder<E> addAll(Collection<? extends E> collection) {
            if (collection != null) {
                Iterator<? extends E> it2 = collection.iterator();
                while (it2.hasNext()) {
                    add(it2.next());
                }
            }
            return this;
        }

        public Bag<E> createPredicatedBag(Bag<E> bag) {
            if (bag == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("Bag must not be null.");
                return null;
            }
            PredicatedBag predicatedBag = PredicatedBag.predicatedBag(bag, this.predicate);
            predicatedBag.addAll(this.accepted);
            return predicatedBag;
        }

        public List<E> createPredicatedList(List<E> list) {
            if (list == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("List must not be null.");
                return null;
            }
            PredicatedList predicatedList = PredicatedList.predicatedList(list, this.predicate);
            predicatedList.addAll(this.accepted);
            return predicatedList;
        }

        public MultiSet<E> createPredicatedMultiSet(MultiSet<E> multiSet) {
            if (multiSet == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("MultiSet must not be null.");
                return null;
            }
            PredicatedMultiSet predicatedMultiSet = PredicatedMultiSet.predicatedMultiSet(multiSet, this.predicate);
            predicatedMultiSet.addAll(this.accepted);
            return predicatedMultiSet;
        }

        public Queue<E> createPredicatedQueue(Queue<E> queue) {
            if (queue == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("queue must not be null");
                return null;
            }
            PredicatedQueue predicatedQueue = PredicatedQueue.predicatedQueue(queue, this.predicate);
            predicatedQueue.addAll(this.accepted);
            return predicatedQueue;
        }

        public Set<E> createPredicatedSet(Set<E> set) {
            if (set == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("Set must not be null.");
                return null;
            }
            PredicatedSet predicatedSet = PredicatedSet.predicatedSet(set, this.predicate);
            predicatedSet.addAll(this.accepted);
            return predicatedSet;
        }

        public Collection<E> rejectedElements() {
            return Collections.unmodifiableCollection(this.rejected);
        }

        public Bag<E> createPredicatedBag() {
            return createPredicatedBag(new HashBag());
        }

        public List<E> createPredicatedList() {
            return createPredicatedList(new ArrayList());
        }

        public MultiSet<E> createPredicatedMultiSet() {
            return createPredicatedMultiSet(new HashMultiSet());
        }

        public Queue<E> createPredicatedQueue() {
            return createPredicatedQueue(new LinkedList());
        }

        public Set<E> createPredicatedSet() {
            return createPredicatedSet(new HashSet());
        }
    }
}
