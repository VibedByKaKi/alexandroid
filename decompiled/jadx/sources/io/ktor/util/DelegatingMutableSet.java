package io.ktor.util;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.metrics.MetricsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\b\u0007\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\tJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0013\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001fH\u0096\u0002J\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u0016\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\"\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014*\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016R\u001f\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\b\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006%"}, d2 = {"Lio/ktor/util/DelegatingMutableSet;", "From", "To", "", "delegate", "convertTo", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "convert", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "size", "", "getSize", "()I", BulkOperationType.add, "", "element", "(Ljava/lang/Object;)Z", "addAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", MetricsConstants.Method.CACHE_CLEAR, "", "contains", "containsAll", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "isEmpty", "iterator", "", BulkOperationType.remove, "removeAll", "retainAll", "toString", "", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public class DelegatingMutableSet<From, To> implements Set<To>, KMutableSet {
    private final Function1<To, From> convert;
    private final Function1<From, To> convertTo;
    private final Set<From> delegate;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public DelegatingMutableSet(@NotNull Set<From> set, @NotNull Function1<? super From, ? extends To> function1, @NotNull Function1<? super To, ? extends From> function12) {
        set.getClass();
        function1.getClass();
        function12.getClass();
        this.delegate = set;
        this.convertTo = function1;
        this.convert = function12;
        this.size = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(To element) {
        return this.delegate.add(this.convert.invoke(element));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@NotNull Collection<? extends To> elements) {
        elements.getClass();
        return this.delegate.addAll(convert(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return this.delegate.contains(this.convert.invoke(element));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        elements.getClass();
        return this.delegate.containsAll(convert(elements));
    }

    @NotNull
    public Collection<From> convert(@NotNull Collection<? extends To> collection) {
        collection.getClass();
        Collection<? extends To> collection2 = collection;
        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.convert.invoke(it2.next()));
        }
        return arrayList;
    }

    @NotNull
    public Collection<To> convertTo(@NotNull Collection<? extends From> collection) {
        collection.getClass();
        Collection<? extends From> collection2 = collection;
        ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.convertTo.invoke(it2.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@Nullable Object other) {
        if (other != null && (other instanceof Set)) {
            Collection<To> convertTo = convertTo(this.delegate);
            if (((Set) other).containsAll(convertTo) && convertTo.containsAll((Collection) other)) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<To> iterator() {
        return new DelegatingMutableSet$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return this.delegate.remove(this.convert.invoke(element));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        elements.getClass();
        return this.delegate.removeAll(convert(elements));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        elements.getClass();
        return this.delegate.retainAll(convert(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @NotNull
    public String toString() {
        return convertTo(this.delegate).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
