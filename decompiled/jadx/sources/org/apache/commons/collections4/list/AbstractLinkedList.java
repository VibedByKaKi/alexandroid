package org.apache.commons.collections4.list;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import org.apache.commons.collections4.OrderedIterator;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractLinkedList<E> implements List<E> {
    transient Node<E> header;
    transient int modCount;
    transient int size;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LinkedListIterator<E> implements ListIterator<E>, OrderedIterator<E> {
        protected Node<E> current;
        protected int expectedModCount;
        protected Node<E> next;
        protected int nextIndex;
        protected final AbstractLinkedList<E> parent;

        public LinkedListIterator(AbstractLinkedList<E> abstractLinkedList, int i) throws IndexOutOfBoundsException {
            this.parent = abstractLinkedList;
            this.expectedModCount = abstractLinkedList.modCount;
            this.next = abstractLinkedList.getNode(i, true);
            this.nextIndex = i;
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            checkModCount();
            this.parent.addNodeBefore(this.next, e);
            this.current = null;
            this.nextIndex++;
            this.expectedModCount++;
        }

        public void checkModCount() {
            if (this.parent.modCount == this.expectedModCount) {
                return;
            }
            OnnxMap$$ExternalSyntheticBUOutline0.m9m();
        }

        public Node<E> getLastNodeReturned() throws IllegalStateException {
            Node<E> node = this.current;
            if (node != null) {
                return node;
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.next != this.parent.header;
        }

        @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
        public boolean hasPrevious() {
            return this.next.previous != this.parent.header;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            checkModCount();
            if (!hasNext()) {
                PathKt$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(new StringBuilder("No element at index "), this.nextIndex, "."));
                return null;
            }
            E value = this.next.getValue();
            Node<E> node = this.next;
            this.current = node;
            this.next = node.next;
            this.nextIndex++;
            return value;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.nextIndex;
        }

        @Override // java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
        public E previous() {
            checkModCount();
            if (!hasPrevious()) {
                PathKt$$ExternalSyntheticBUOutline0.m("Already at start of list.");
                return null;
            }
            Node<E> node = this.next.previous;
            this.next = node;
            E value = node.getValue();
            this.current = this.next;
            this.nextIndex--;
            return value;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return nextIndex() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            checkModCount();
            Node<E> node = this.current;
            Node<E> node2 = this.next;
            if (node == node2) {
                this.next = node2.next;
                this.parent.removeNode(getLastNodeReturned());
            } else {
                this.parent.removeNode(getLastNodeReturned());
                this.nextIndex--;
            }
            this.current = null;
            this.expectedModCount++;
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            checkModCount();
            getLastNodeReturned().setValue(e);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LinkedSubListIterator<E> extends LinkedListIterator<E> {
        protected final LinkedSubList<E> sub;

        public LinkedSubListIterator(LinkedSubList<E> linkedSubList, int i) {
            super(linkedSubList.parent, i + linkedSubList.offset);
            this.sub = linkedSubList;
        }

        @Override // org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator, java.util.ListIterator
        public void add(E e) {
            super.add(e);
            LinkedSubList<E> linkedSubList = this.sub;
            linkedSubList.expectedModCount = this.parent.modCount;
            linkedSubList.size++;
        }

        @Override // org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator, java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return nextIndex() < this.sub.size;
        }

        @Override // org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator, java.util.ListIterator, org.apache.commons.collections4.OrderedIterator
        public boolean hasPrevious() {
            return previousIndex() >= 0;
        }

        @Override // org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator, java.util.ListIterator
        public int nextIndex() {
            return super.nextIndex() - this.sub.offset;
        }

        @Override // org.apache.commons.collections4.list.AbstractLinkedList.LinkedListIterator, java.util.ListIterator, java.util.Iterator
        public void remove() {
            super.remove();
            this.sub.expectedModCount = this.parent.modCount;
            r0.size--;
        }
    }

    public AbstractLinkedList(Collection<? extends E> collection) {
        init();
        addAll(collection);
    }

    @Override // java.util.List
    public void add(int i, E e) {
        addNodeBefore(getNode(i, true), e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        Node<E> node = getNode(i, true);
        Iterator<? extends E> it2 = collection.iterator();
        while (it2.hasNext()) {
            addNodeBefore(node, it2.next());
        }
        return true;
    }

    public boolean addFirst(E e) {
        addNodeAfter(this.header, e);
        return true;
    }

    public boolean addLast(E e) {
        addNodeBefore(this.header, e);
        return true;
    }

    public void addNode(Node<E> node, Node<E> node2) {
        node.next = node2;
        node.previous = node2.previous;
        node2.previous.next = node;
        node2.previous = node;
        this.size++;
        this.modCount++;
    }

    public void addNodeAfter(Node<E> node, E e) {
        addNode(createNode(e), node.next);
    }

    public void addNodeBefore(Node<E> node, E e) {
        addNode(createNode(e), node);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        removeAllNodes();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public Node<E> createHeaderNode() {
        return new Node<>();
    }

    public Node<E> createNode(E e) {
        return new Node<>(e);
    }

    public Iterator<E> createSubListIterator(LinkedSubList<E> linkedSubList) {
        return createSubListListIterator(linkedSubList, 0);
    }

    public ListIterator<E> createSubListListIterator(LinkedSubList<E> linkedSubList, int i) {
        return new LinkedSubListIterator(linkedSubList, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void doReadObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        init();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    public void doWriteObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(size());
        Iterator<E> it2 = iterator();
        while (it2.hasNext()) {
            objectOutputStream.writeObject(it2.next());
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != size()) {
            return false;
        }
        ListIterator<E> listIterator = listIterator();
        ListIterator<E> listIterator2 = list.listIterator();
        while (listIterator.hasNext() && listIterator2.hasNext()) {
            E next = listIterator.next();
            E next2 = listIterator2.next();
            if (next == null) {
                if (next2 != null) {
                    return false;
                }
            } else if (!next.equals(next2)) {
                return false;
            }
        }
        return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
    }

    @Override // java.util.List
    public E get(int i) {
        return getNode(i, false).getValue();
    }

    public E getFirst() {
        Node<E> node = this.header;
        Node<E> node2 = node.next;
        if (node2 != node) {
            return node2.getValue();
        }
        Single$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public E getLast() {
        Node<E> node = this.header;
        Node<E> node2 = node.previous;
        if (node2 != node) {
            return node2.getValue();
        }
        Single$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public Node<E> getNode(int i, boolean z) throws IndexOutOfBoundsException {
        if (i < 0) {
            XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(i, "Couldn't get the node: index (", ") less than zero."));
            return null;
        }
        if (!z && i == this.size) {
            XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(i, "Couldn't get the node: index (", ") is the size of the list."));
            return null;
        }
        int i2 = this.size;
        if (i > i2) {
            XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m0m(i, "Couldn't get the node: index (", ") greater than the size of the list ("), this.size, ")."));
            return null;
        }
        int i3 = i2 / 2;
        Node<E> node = this.header;
        if (i >= i3) {
            while (i2 > i) {
                node = node.previous;
                i2--;
            }
            return node;
        }
        Node<E> node2 = node.next;
        for (int i4 = 0; i4 < i; i4++) {
            node2 = node2.next;
        }
        return node2;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        Iterator<E> it2 = iterator();
        int i = 1;
        while (it2.hasNext()) {
            E next = it2.next();
            i = (i * 31) + (next == null ? 0 : next.hashCode());
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i = 0;
        for (Node<E> node = this.header.next; node != this.header; node = node.next) {
            if (isEqualValue(node.getValue(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void init() {
        this.header = createHeaderNode();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isEqualValue(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int i = this.size - 1;
        Node<E> node = this.header;
        while (true) {
            node = node.previous;
            if (node == this.header) {
                return -1;
            }
            if (isEqualValue(node.getValue(), obj)) {
                return i;
            }
            i--;
        }
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new LinkedListIterator(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Node<E> node = this.header;
        do {
            node = node.next;
            if (node == this.header) {
                return false;
            }
        } while (!isEqualValue(node.getValue(), obj));
        removeNode(node);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<E> it2 = iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    public void removeAllNodes() {
        Node<E> node = this.header;
        node.next = node;
        node.previous = node;
        this.size = 0;
        this.modCount++;
    }

    public E removeFirst() {
        Node<E> node = this.header;
        Node<E> node2 = node.next;
        if (node2 == node) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        E value = node2.getValue();
        removeNode(node2);
        return value;
    }

    public E removeLast() {
        Node<E> node = this.header;
        Node<E> node2 = node.previous;
        if (node2 == node) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        E value = node2.getValue();
        removeNode(node2);
        return value;
    }

    public void removeNode(Node<E> node) {
        Node<E> node2 = node.previous;
        node2.next = node.next;
        node.next.previous = node2;
        this.size--;
        this.modCount++;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        Iterator<E> it2 = iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (!collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.List
    public E set(int i, E e) {
        Node<E> node = getNode(i, false);
        E value = node.getValue();
        updateNode(node, e);
        return value;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new LinkedSubList(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.size));
        }
        Node<E> node = this.header.next;
        int i = 0;
        while (node != this.header) {
            tArr[i] = node.getValue();
            node = node.next;
            i++;
        }
        int length = tArr.length;
        int i2 = this.size;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (size() == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(size() * 16);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        Iterator<E> it2 = iterator();
        boolean hasNext = it2.hasNext();
        while (hasNext) {
            Object next = it2.next();
            if (next == this) {
                next = "(this Collection)";
            }
            sb.append(next);
            hasNext = it2.hasNext();
            if (hasNext) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public void updateNode(Node<E> node, E e) {
        node.setValue(e);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new LinkedListIterator(this, i);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Node<E> {
        protected Node<E> next;
        protected Node<E> previous;
        protected E value;

        public Node(Node<E> node, Node<E> node2, E e) {
            this.previous = node;
            this.next = node2;
            this.value = e;
        }

        public Node<E> getNextNode() {
            return this.next;
        }

        public Node<E> getPreviousNode() {
            return this.previous;
        }

        public E getValue() {
            return this.value;
        }

        public void setNextNode(Node<E> node) {
            this.next = node;
        }

        public void setPreviousNode(Node<E> node) {
            this.previous = node;
        }

        public void setValue(E e) {
            this.value = e;
        }

        public Node(E e) {
            this.value = e;
        }

        public Node() {
            this.previous = this;
            this.next = this;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public AbstractLinkedList() {
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return addAll(this.size, collection);
    }

    @Override // java.util.List
    public E remove(int i) {
        Node<E> node = getNode(i, false);
        E value = node.getValue();
        removeNode(node);
        return value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LinkedSubList<E> extends AbstractList<E> {
        int expectedModCount;
        int offset;
        AbstractLinkedList<E> parent;
        int size;

        public LinkedSubList(AbstractLinkedList<E> abstractLinkedList, int i, int i2) {
            if (i < 0) {
                XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(i, "fromIndex = "));
                throw null;
            }
            if (i2 > abstractLinkedList.size()) {
                XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(i2, "toIndex = "));
                throw null;
            }
            if (i > i2) {
                Single$$ExternalSyntheticBUOutline0.m$3(ErrorUtils$$ExternalSyntheticOutline0.m(i, i2, "fromIndex(", ") > toIndex(", MarkdownConstants.RIGHT_PARENTHESIS));
                throw null;
            }
            this.parent = abstractLinkedList;
            this.offset = i;
            this.size = i2 - i;
            this.expectedModCount = abstractLinkedList.modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, E e) {
            rangeCheck(i, this.size + 1);
            checkModCount();
            this.parent.add(i + this.offset, e);
            this.expectedModCount = this.parent.modCount;
            this.size++;
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            rangeCheck(i, this.size + 1);
            int size = collection.size();
            if (size == 0) {
                return false;
            }
            checkModCount();
            this.parent.addAll(this.offset + i, collection);
            this.expectedModCount = this.parent.modCount;
            this.size += size;
            ((AbstractList) this).modCount++;
            return true;
        }

        public void checkModCount() {
            if (this.parent.modCount == this.expectedModCount) {
                return;
            }
            OnnxMap$$ExternalSyntheticBUOutline0.m9m();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            checkModCount();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                it2.next();
                it2.remove();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            rangeCheck(i, this.size);
            checkModCount();
            return this.parent.get(i + this.offset);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            checkModCount();
            return this.parent.createSubListIterator(this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
            rangeCheck(i, this.size + 1);
            checkModCount();
            return this.parent.createSubListListIterator(this, i);
        }

        public void rangeCheck(int i, int i2) {
            if (i < 0 || i >= i2) {
                XML$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m(a$$ExternalSyntheticOutline0.m0m(i, "Index '", "' out of bounds for size '"), this.size, "'"));
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public E remove(int i) {
            rangeCheck(i, this.size);
            checkModCount();
            E remove = this.parent.remove(i + this.offset);
            this.expectedModCount = this.parent.modCount;
            this.size--;
            ((AbstractList) this).modCount++;
            return remove;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i, E e) {
            rangeCheck(i, this.size);
            checkModCount();
            return this.parent.set(i + this.offset, e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            checkModCount();
            return this.size;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int i, int i2) {
            AbstractLinkedList<E> abstractLinkedList = this.parent;
            int i3 = this.offset;
            return new LinkedSubList(abstractLinkedList, i + i3, i2 + i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> collection) {
            return addAll(this.size, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[this.size]);
    }
}
