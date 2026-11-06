package org.openjdk.tools.javac.util;

import com.google.common.math.Stats$$ExternalSyntheticLambda2;
import com.google.common.math.Stats$$ExternalSyntheticLambda6;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collector;
import kotlin.text.Regex$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.openjdk.tools.sjavac.Util$$ExternalSyntheticLambda0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class List<A> extends AbstractCollection<A> implements java.util.List<A> {
    private static final Iterator<?> EMPTYITERATOR = new Iterator<Object>() { // from class: org.openjdk.tools.javac.util.List.2
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    };
    private static final List<?> EMPTY_LIST;
    public A head;
    public List<A> tail;

    static {
        List list = null;
        EMPTY_LIST = new List<Object>(list, list) { // from class: org.openjdk.tools.javac.util.List.1
            @Override // org.openjdk.tools.javac.util.List, java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean isEmpty() {
                return true;
            }

            @Override // org.openjdk.tools.javac.util.List
            public List<Object> setTail(List<Object> list2) {
                throw new UnsupportedOperationException();
            }
        };
    }

    public List(A a2, List<A> list) {
        this.tail = list;
        this.head = a2;
    }

    public static <Z> Collector<Z, ListBuffer<Z>, List<Z>> collector() {
        return Collector.of(new List$$ExternalSyntheticLambda0(0), new Stats$$ExternalSyntheticLambda2(7), new Stats$$ExternalSyntheticLambda6(7), new Util$$ExternalSyntheticLambda0(1), new Collector.Characteristics[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> convert(Class<T> cls, List<?> list) {
        if (list == 0) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            cls.cast(it2.next());
        }
        return list;
    }

    private static <A> Iterator<A> emptyIterator() {
        return (Iterator<A>) EMPTYITERATOR;
    }

    @Deprecated
    public static <A> List<A> fill(int i, A a2) {
        List<A> nil = nil();
        int i2 = 0;
        while (i2 < i) {
            i2++;
            nil = new List<>(a2, nil);
        }
        return nil;
    }

    public static <A> List<A> filter(List<A> list, A a2) {
        Assert.checkNonNull(a2);
        List nil = nil();
        Iterator<A> it2 = list.iterator();
        while (it2.hasNext()) {
            A next = it2.next();
            if (next != null && !next.equals(a2)) {
                nil = nil.prepend(next);
            }
        }
        return nil.reverse();
    }

    public static <A> List<A> from(Iterable<? extends A> iterable) {
        ListBuffer listBuffer = new ListBuffer();
        Iterator<? extends A> it2 = iterable.iterator();
        while (it2.hasNext()) {
            listBuffer.append(it2.next());
        }
        return listBuffer.toList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ListBuffer lambda$collector$0(ListBuffer listBuffer, ListBuffer listBuffer2) {
        listBuffer.addAll(listBuffer2);
        return listBuffer;
    }

    public static <A> List<A> nil() {
        return (List<A>) EMPTY_LIST;
    }

    public static <A> List<A> of(A a2, A a3, A a4, A... aArr) {
        return new List<>(a2, new List(a3, new List(a4, from(aArr))));
    }

    @Override // java.util.List
    public void add(int i, A a2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends A> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Duration$$ExternalSyntheticBUOutline0.m();
        return false;
    }

    public List<A> append(A a2) {
        return of((Object) a2).prependList(this);
    }

    public List<A> appendList(ListBuffer<A> listBuffer) {
        return appendList(listBuffer.toList());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        while (this.tail != null) {
            A a2 = this.head;
            if (obj == null) {
                if (a2 == null) {
                    return true;
                }
            } else if (a2.equals(obj)) {
                return true;
            }
            this = this.tail;
        }
        return false;
    }

    public List<A> diff(List<A> list) {
        ListBuffer listBuffer = new ListBuffer();
        Iterator<A> it2 = iterator();
        while (it2.hasNext()) {
            A next = it2.next();
            if (!list.contains(next)) {
                listBuffer.append(next);
            }
        }
        return listBuffer.toList();
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj instanceof List) {
            return equals(this, (List) obj);
        }
        if (obj instanceof java.util.List) {
            Iterator it2 = ((java.util.List) obj).iterator();
            while (this.tail != null && it2.hasNext()) {
                Object next = it2.next();
                A a2 = this.head;
                if (a2 == null) {
                    if (next != null) {
                        return false;
                    }
                    this = this.tail;
                } else {
                    if (!a2.equals(next)) {
                        return false;
                    }
                    this = this.tail;
                }
            }
            if (this.isEmpty() && !it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public A get(int i) {
        if (i < 0) {
            XML$$ExternalSyntheticBUOutline0.m(String.valueOf(i));
            return null;
        }
        List<A> list = this;
        int i2 = i;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0 || list.isEmpty()) {
                break;
            }
            list = list.tail;
            i2 = i3;
        }
        if (!list.isEmpty()) {
            return list.head;
        }
        Regex$$ExternalSyntheticBUOutline0.m(size(), a$$ExternalSyntheticOutline0.m0m(i, "Index: ", ", Size: "));
        return null;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        while (this.tail != null) {
            int i2 = i * 31;
            A a2 = this.head;
            i = i2 + (a2 == null ? 0 : a2.hashCode());
            this = this.tail;
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i = 0;
        while (this.tail != null) {
            A a2 = this.head;
            if (a2 == null) {
                if (obj == null) {
                    return i;
                }
                this = this.tail;
                i++;
            } else {
                if (a2.equals(obj)) {
                    return i;
                }
                this = this.tail;
                i++;
            }
        }
        return -1;
    }

    public List<A> intersect(List<A> list) {
        ListBuffer listBuffer = new ListBuffer();
        Iterator<A> it2 = iterator();
        while (it2.hasNext()) {
            A next = it2.next();
            if (list.contains(next)) {
                listBuffer.append(next);
            }
        }
        return listBuffer.toList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.tail == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<A> iterator() {
        return this.tail == null ? emptyIterator() : new Iterator<A>() { // from class: org.openjdk.tools.javac.util.List.3
            List<A> elems;

            {
                this.elems = List.this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.elems.tail != null;
            }

            @Override // java.util.Iterator
            public A next() {
                List<A> list = this.elems;
                List<A> list2 = list.tail;
                if (list2 == null) {
                    Single$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                A a2 = list.head;
                this.elems = list2;
                return a2;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public A last() {
        A a2 = null;
        while (true) {
            List<A> list = this.tail;
            if (list == null) {
                return a2;
            }
            a2 = this.head;
            this = list;
        }
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int i = -1;
        int i2 = 0;
        while (this.tail != null) {
            A a2 = this.head;
            if (a2 == null) {
                if (obj != null) {
                    this = this.tail;
                    i2++;
                }
                i = i2;
                this = this.tail;
                i2++;
            } else {
                if (!a2.equals(obj)) {
                    this = this.tail;
                    i2++;
                }
                i = i2;
                this = this.tail;
                i2++;
            }
        }
        return i;
    }

    public int length() {
        int i = 0;
        while (true) {
            this = this.tail;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    @Override // java.util.List
    public ListIterator<A> listIterator() {
        return Collections.unmodifiableList(new ArrayList(this)).listIterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <Z> List<Z> map(Function<A, Z> function) {
        ListBuffer listBuffer = new ListBuffer();
        Iterator it2 = iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Object next = it2.next();
            Object apply = function.apply(next);
            listBuffer.append(apply);
            z |= apply != next;
        }
        return z ? listBuffer.toList() : this;
    }

    public boolean nonEmpty() {
        return this.tail != null;
    }

    public List<A> prepend(A a2) {
        return new List<>(a2, this);
    }

    public List<A> prependList(List<A> list) {
        if (isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return this;
        }
        if (list.tail.isEmpty()) {
            return prepend(list.head);
        }
        List<A> reverse = list.reverse();
        Assert.check(reverse != list);
        while (true) {
            List<A> list2 = this;
            this = reverse;
            if (!this.nonEmpty()) {
                return list2;
            }
            reverse = this.tail;
            this.setTail(list2);
        }
    }

    @Override // java.util.List
    public A remove(int i) {
        throw new UnsupportedOperationException();
    }

    public List<A> reverse() {
        if (isEmpty() || this.tail.isEmpty()) {
            return this;
        }
        List<A> nil = nil();
        while (this.nonEmpty()) {
            List<A> list = new List<>(this.head, nil);
            this = this.tail;
            nil = list;
        }
        return nil;
    }

    @Override // java.util.List
    public A set(int i, A a2) {
        throw new UnsupportedOperationException();
    }

    public List<A> setTail(List<A> list) {
        this.tail = list;
        return list;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return length();
    }

    @Override // java.util.List
    public java.util.List<A> subList(int i, int i2) {
        if (i < 0 || i2 > size() || i > i2) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        ArrayList arrayList = new ArrayList(i2 - i);
        for (int i3 = 0; this.tail != null && i3 != i2; i3++) {
            if (i3 >= i) {
                arrayList.add(this.head);
            }
            this = this.tail;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<A> take(int i) {
        ListBuffer listBuffer = new ListBuffer();
        Iterator<A> it2 = iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            A next = it2.next();
            int i3 = i2 + 1;
            if (i2 == i) {
                break;
            }
            listBuffer.append(next);
            i2 = i3;
        }
        return listBuffer.toList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        int i = 0;
        List<A> list = this;
        while (list.nonEmpty() && i < tArr.length) {
            tArr[i] = list.head;
            list = list.tail;
            i++;
        }
        if (!list.isEmpty()) {
            return (T[]) toArray((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size()));
        }
        if (i < tArr.length) {
            tArr[i] = 0;
        }
        return tArr;
    }

    public String toString(String str) {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.head);
        while (true) {
            this = this.tail;
            if (!this.nonEmpty()) {
                return sb.toString();
            }
            sb.append(str);
            sb.append(this.head);
        }
    }

    public List<A> appendList(List<A> list) {
        return list.prependList(this);
    }

    @Override // java.util.List
    public ListIterator<A> listIterator(int i) {
        return Collections.unmodifiableList(new ArrayList(this)).listIterator(i);
    }

    public static <A> List<A> of(A a2, A a3) {
        return new List<>(a2, of((Object) a3));
    }

    public static <A> List<A> of(A a2, A a3, A a4) {
        return new List<>(a2, of((Object) a3, (Object) a4));
    }

    public static <A> List<A> of(A a2) {
        return new List<>(a2, nil());
    }

    public static <A> List<A> from(A[] aArr) {
        List<A> nil = nil();
        if (aArr != null) {
            int length = aArr.length - 1;
            while (length >= 0) {
                List<A> list = new List<>(aArr[length], nil);
                length--;
                nil = list;
            }
        }
        return nil;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return toString(",");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x001e, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0022, code lost:
    
        if (r4.tail != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0024, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean equals(org.openjdk.tools.javac.util.List<?> r3, org.openjdk.tools.javac.util.List<?> r4) {
        /*
        L0:
            org.openjdk.tools.javac.util.List<A> r0 = r3.tail
            r1 = 0
            if (r0 == 0) goto L1e
            org.openjdk.tools.javac.util.List<A> r2 = r4.tail
            if (r2 == 0) goto L1e
            A r0 = r3.head
            A r2 = r4.head
            if (r0 != 0) goto L12
            if (r2 == 0) goto L19
            return r1
        L12:
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L19
            return r1
        L19:
            org.openjdk.tools.javac.util.List<A> r3 = r3.tail
            org.openjdk.tools.javac.util.List<A> r4 = r4.tail
            goto L0
        L1e:
            if (r0 != 0) goto L26
            org.openjdk.tools.javac.util.List<A> r3 = r4.tail
            if (r3 != 0) goto L26
            r3 = 1
            return r3
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.openjdk.tools.javac.util.List.equals(org.openjdk.tools.javac.util.List, org.openjdk.tools.javac.util.List):boolean");
    }
}
