package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0096\u0002¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\rJ\u001e\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\f\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lkotlin/collections/ReversedList;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/collections/AbstractMutableList;", "delegate", "", "<init>", "(Ljava/util/List;)V", "size", "", "getSize", "()I", MetricsConstants.Method.CACHE_GET, "index", "(I)Ljava/lang/Object;", MetricsConstants.Method.CACHE_CLEAR, "", "removeAt", "set", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", BulkOperationType.add, "(ILjava/lang/Object;)V", "iterator", "", "listIterator", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ReversedList<T> extends AbstractMutableList<T> {

    @NotNull
    private final List<T> delegate;

    public ReversedList(@NotNull List<T> list) {
        list.getClass();
        this.delegate = list;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, T element) {
        int reversePositionIndex$CollectionsKt__ReversedViewsKt;
        List<T> list = this.delegate;
        reversePositionIndex$CollectionsKt__ReversedViewsKt = CollectionsKt__ReversedViewsKt.reversePositionIndex$CollectionsKt__ReversedViewsKt(this, index);
        list.add(reversePositionIndex$CollectionsKt__ReversedViewsKt, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        int reverseElementIndex$CollectionsKt__ReversedViewsKt;
        List<T> list = this.delegate;
        reverseElementIndex$CollectionsKt__ReversedViewsKt = CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, index);
        return list.get(reverseElementIndex$CollectionsKt__ReversedViewsKt);
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractMutableList
    public T removeAt(int index) {
        int reverseElementIndex$CollectionsKt__ReversedViewsKt;
        List<T> list = this.delegate;
        reverseElementIndex$CollectionsKt__ReversedViewsKt = CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, index);
        return list.remove(reverseElementIndex$CollectionsKt__ReversedViewsKt);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int index, T element) {
        int reverseElementIndex$CollectionsKt__ReversedViewsKt;
        List<T> list = this.delegate;
        reverseElementIndex$CollectionsKt__ReversedViewsKt = CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, index);
        return list.set(reverseElementIndex$CollectionsKt__ReversedViewsKt, element);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return new ReversedList$listIterator$1(this, index);
    }
}
