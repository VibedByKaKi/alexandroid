package kotlinx.metadata.internal.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class LazyStringArrayList extends AbstractList<String> implements LazyStringList, RandomAccess {
    public static final LazyStringList EMPTY = new LazyStringArrayList().getUnmodifiableView();
    private final List<Object> list;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        private final List<Object> list;

        public ByteArrayListView(List<Object> list) {
            this.list = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, byte[] bArr) {
            this.list.add(i, bArr);
            ((AbstractList) this).modCount++;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int i) {
            Object obj = this.list.get(i);
            byte[] asByteArray = LazyStringArrayList.asByteArray(obj);
            if (asByteArray != obj) {
                this.list.set(i, asByteArray);
            }
            return asByteArray;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int i) {
            Object remove = this.list.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int i, byte[] bArr) {
            Object obj = this.list.set(i, bArr);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        private final List<Object> list;

        public ByteStringListView(List<Object> list) {
            this.list = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, ByteString byteString) {
            this.list.add(i, byteString);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString get(int i) {
            Object obj = this.list.get(i);
            ByteString asByteString = LazyStringArrayList.asByteString(obj);
            if (asByteString != obj) {
                this.list.set(i, asByteString);
            }
            return asByteString;
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString remove(int i) {
            Object remove = this.list.remove(i);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString set(int i, ByteString byteString) {
            Object obj = this.list.set(i, byteString);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.list = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? Internal.toByteArray((String) obj) : ((ByteString) obj).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString asByteString(Object obj) {
        return obj instanceof ByteString ? (ByteString) obj : obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : Internal.toStringUtf8((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        this.list.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        boolean addAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return new ByteArrayListView(this.list);
    }

    @Override // kotlinx.metadata.internal.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return new ByteStringListView(this.list);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public byte[] getByteArray(int i) {
        Object obj = this.list.get(i);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(i, asByteArray);
        }
        return asByteArray;
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public ByteString getByteString(int i) {
        Object obj = this.list.get(i);
        ByteString asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(i, asByteString);
        }
        return asByteString;
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        for (Object obj : lazyStringList.getUnderlyingElements()) {
            boolean z = obj instanceof byte[];
            List<Object> list = this.list;
            if (z) {
                byte[] bArr = (byte[]) obj;
                list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                list.add(obj);
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i) {
        Object remove = this.list.remove(i);
        ((AbstractList) this).modCount++;
        return asString(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        return asString(this.list.set(i, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public void set(int i, ByteString byteString) {
        this.list.set(i, byteString);
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public void add(ByteString byteString) {
        this.list.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public void set(int i, byte[] bArr) {
        this.list.set(i, bArr);
    }

    @Override // kotlinx.metadata.internal.protobuf.LazyStringList
    public void add(byte[] bArr) {
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }

    public LazyStringArrayList() {
        this.list = new ArrayList();
    }

    public LazyStringArrayList(List<String> list) {
        this.list = new ArrayList(list);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
