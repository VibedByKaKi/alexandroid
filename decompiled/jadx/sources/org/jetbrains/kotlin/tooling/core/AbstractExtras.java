package org.jetbrains.kotlin.tooling.core;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.tooling.core.Extras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002J\u0015\u0010\u0007\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0096\u0002J\u001a\u0010\r\u001a\u00020\b2\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u000fH\u0016J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0017\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\n0\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/AbstractExtras;", "Lorg/jetbrains/kotlin/tooling/core/Extras;", "()V", "size", "", "getSize", "()I", "contains", "", "element", "Lorg/jetbrains/kotlin/tooling/core/Extras$Entry;", "key", "Lorg/jetbrains/kotlin/tooling/core/Extras$Key;", "containsAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "isEmpty", "iterator", "", "toString", "", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AbstractExtras implements Extras {
    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Extras.Entry<? extends Object> entry) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends Extras.Entry<? extends Object>> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Extras.Entry) {
            return contains((Extras.Entry<?>) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        elements.getClass();
        return getEntries().containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        return (other instanceof Extras) && Intrinsics.areEqual(((Extras) other).getEntries(), getEntries());
    }

    public int getSize() {
        return getKeys().size();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return getEntries().hashCode() * 31;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return getKeys().isEmpty();
    }

    @Override // org.jetbrains.kotlin.tooling.core.Extras, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<Extras.Entry<? extends Object>> iterator() {
        return getEntries().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super Extras.Entry<? extends Object>> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    @NotNull
    public String toString() {
        return "Extras(" + getEntries() + ')';
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public boolean add2(Extras.Entry<? extends Object> entry) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // org.jetbrains.kotlin.tooling.core.Extras
    public boolean contains(@NotNull Extras.Key<?> key) {
        key.getClass();
        return getKeys().contains(key);
    }

    public boolean contains(@NotNull Extras.Entry<?> element) {
        element.getClass();
        return getEntries().contains(element);
    }
}
