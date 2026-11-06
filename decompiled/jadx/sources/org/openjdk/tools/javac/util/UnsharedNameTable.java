package org.openjdk.tools.javac.util;

import java.lang.ref.WeakReference;
import org.openjdk.tools.javac.util.Name;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class UnsharedNameTable extends Name.Table {
    private int hashMask;
    private HashEntry[] hashes;
    public int index;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class HashEntry extends WeakReference<NameImpl> {
        HashEntry next;

        public HashEntry(NameImpl nameImpl) {
            super(nameImpl);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NameImpl extends Name {
        final byte[] bytes;
        final int index;

        public NameImpl(UnsharedNameTable unsharedNameTable, byte[] bArr, int i) {
            super(unsharedNameTable);
            this.bytes = bArr;
            this.index = i;
        }

        @Override // org.openjdk.tools.javac.util.Name
        public byte[] getByteArray() {
            return this.bytes;
        }

        @Override // org.openjdk.tools.javac.util.Name
        public byte getByteAt(int i) {
            return this.bytes[i];
        }

        @Override // org.openjdk.tools.javac.util.Name
        public int getByteLength() {
            return this.bytes.length;
        }

        @Override // org.openjdk.tools.javac.util.Name
        public int getByteOffset() {
            return 0;
        }

        @Override // org.openjdk.tools.javac.util.Name
        public int getIndex() {
            return this.index;
        }
    }

    public UnsharedNameTable(Names names, int i) {
        super(names);
        this.hashes = null;
        this.hashMask = i - 1;
        this.hashes = new HashEntry[i];
    }

    public static Name.Table create(Names names) {
        return new UnsharedNameTable(names);
    }

    @Override // org.openjdk.tools.javac.util.Name.Table
    public void dispose() {
        this.hashes = null;
    }

    @Override // org.openjdk.tools.javac.util.Name.Table
    public Name fromChars(char[] cArr, int i, int i2) {
        byte[] bArr = new byte[i2 * 3];
        return fromUtf(bArr, 0, Convert.chars2utf(cArr, i, bArr, 0, i2));
    }

    @Override // org.openjdk.tools.javac.util.Name.Table
    public Name fromUtf(byte[] bArr, int i, int i2) {
        int hashValue = Name.Table.hashValue(bArr, i, i2) & this.hashMask;
        HashEntry hashEntry = this.hashes[hashValue];
        HashEntry hashEntry2 = null;
        HashEntry hashEntry3 = hashEntry;
        while (hashEntry != null) {
            NameImpl nameImpl = hashEntry.get();
            if (nameImpl == null) {
                if (hashEntry3 == hashEntry) {
                    HashEntry[] hashEntryArr = this.hashes;
                    HashEntry hashEntry4 = hashEntry.next;
                    hashEntryArr[hashValue] = hashEntry4;
                    hashEntry3 = hashEntry4;
                } else {
                    Assert.checkNonNull(hashEntry2, "previousNonNullTableEntry cannot be null here.");
                    hashEntry2.next = hashEntry.next;
                }
            } else {
                if (nameImpl.getByteLength() == i2 && Name.Table.equals(nameImpl.bytes, 0, bArr, i, i2)) {
                    return nameImpl;
                }
                hashEntry2 = hashEntry;
            }
            hashEntry = hashEntry.next;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        int i3 = this.index;
        this.index = i3 + 1;
        NameImpl nameImpl2 = new NameImpl(this, bArr2, i3);
        HashEntry hashEntry5 = new HashEntry(nameImpl2);
        if (hashEntry2 == null) {
            this.hashes[hashValue] = hashEntry5;
            return nameImpl2;
        }
        Assert.checkNull((Object) hashEntry2.next, "previousNonNullTableEntry.next must be null.");
        hashEntry2.next = hashEntry5;
        return nameImpl2;
    }

    public UnsharedNameTable(Names names) {
        this(names, 32768);
    }
}
