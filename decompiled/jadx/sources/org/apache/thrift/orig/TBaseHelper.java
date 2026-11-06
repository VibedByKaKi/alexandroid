package org.apache.thrift.orig;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import okhttp3.HttpUrl;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TBaseHelper {
    private static final Comparator comparator = new NestedStructureComparator();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NestedStructureComparator implements Comparator, Serializable {
        private NestedStructureComparator() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            if (obj == null && obj2 == null) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            return obj instanceof List ? TBaseHelper.compareTo((List) obj, (List) obj2) : obj instanceof Set ? TBaseHelper.compareTo((Set) obj, (Set) obj2) : obj instanceof Map ? TBaseHelper.compareTo((Map) obj, (Map) obj2) : obj instanceof byte[] ? TBaseHelper.compareTo((byte[]) obj, (byte[]) obj2) : TBaseHelper.compareTo((Comparable) obj, (Comparable) obj2);
        }
    }

    private TBaseHelper() {
    }

    public static byte[] byteBufferToByteArray(ByteBuffer byteBuffer) {
        if (wrapsFullArray(byteBuffer)) {
            return byteBuffer.array();
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBufferToByteArray(byteBuffer, bArr, 0);
        return bArr;
    }

    public static int compareTo(Map map, Map map2) {
        int compareTo = compareTo(map.size(), map2.size());
        if (compareTo != 0) {
            return compareTo;
        }
        Comparator comparator2 = comparator;
        TreeMap treeMap = new TreeMap(comparator2);
        treeMap.putAll(map);
        Iterator it2 = treeMap.entrySet().iterator();
        TreeMap treeMap2 = new TreeMap(comparator2);
        treeMap2.putAll(map2);
        Iterator it3 = treeMap2.entrySet().iterator();
        while (it2.hasNext() && it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Map.Entry entry2 = (Map.Entry) it3.next();
            Comparator comparator3 = comparator;
            int compare = comparator3.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            int compare2 = comparator3.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }

    public static ByteBuffer copyBinary(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[byteBuffer.remaining()]);
        if (!byteBuffer.hasArray()) {
            byteBuffer.slice().get(wrap.array());
            return wrap;
        }
        System.arraycopy(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), wrap.array(), 0, byteBuffer.remaining());
        return wrap;
    }

    public static int hashCode(long j) {
        return Long.hashCode(j);
    }

    public static String paddedByteString(byte b) {
        return Integer.toHexString((b | 256) & 511).toUpperCase().substring(1);
    }

    public static ByteBuffer rightSize(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return wrapsFullArray(byteBuffer) ? byteBuffer : ByteBuffer.wrap(byteBufferToByteArray(byteBuffer));
    }

    public static void toString(ByteBuffer byteBuffer, StringBuilder sb) {
        byte[] array = byteBuffer.array();
        int arrayOffset = byteBuffer.arrayOffset();
        int position = byteBuffer.position() + arrayOffset;
        int limit = byteBuffer.limit() + arrayOffset;
        int i = limit - position > 128 ? position + 128 : limit;
        for (int i2 = position; i2 < i; i2++) {
            if (i2 > position) {
                sb.append(" ");
            }
            sb.append(paddedByteString(array[i2]));
        }
        if (limit != i) {
            sb.append("...");
        }
    }

    public static boolean wrapsFullArray(ByteBuffer byteBuffer) {
        return byteBuffer.hasArray() && byteBuffer.position() == 0 && byteBuffer.arrayOffset() == 0 && byteBuffer.remaining() == byteBuffer.capacity();
    }

    public static int hashCode(double d) {
        return Double.hashCode(d);
    }

    public static int byteBufferToByteArray(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        System.arraycopy(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), bArr, i, remaining);
        return remaining;
    }

    public static byte[] copyBinary(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static void toString(Collection<ByteBuffer> collection, StringBuilder sb) {
        Iterator<ByteBuffer> it2 = collection.iterator();
        if (!it2.hasNext()) {
            sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        sb.append(MarkdownConstants.LEFT_BRACKET);
        while (true) {
            toString(it2.next(), sb);
            if (!it2.hasNext()) {
                sb.append(MarkdownConstants.RIGHT_BRACKET);
                return;
            }
            sb.append(", ");
        }
    }

    public static int compareTo(boolean z, boolean z2) {
        return Boolean.compare(z, z2);
    }

    public static int compareTo(byte b, byte b2) {
        return Byte.compare(b, b2);
    }

    public static int compareTo(short s, short s2) {
        return Short.compare(s, s2);
    }

    public static int compareTo(int i, int i2) {
        return Integer.compare(i, i2);
    }

    public static int compareTo(long j, long j2) {
        return Long.compare(j, j2);
    }

    public static int compareTo(double d, double d2) {
        return Double.compare(d, d2);
    }

    public static int compareTo(String str, String str2) {
        return str.compareTo(str2);
    }

    public static int compareTo(byte[] bArr, byte[] bArr2) {
        int compareTo = compareTo(bArr.length, bArr2.length);
        if (compareTo == 0) {
            for (int i = 0; i < bArr.length; i++) {
                compareTo = compareTo(bArr[i], bArr2[i]);
                if (compareTo != 0) {
                    return compareTo;
                }
            }
        }
        return compareTo;
    }

    public static int compareTo(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static int compareTo(List list, List list2) {
        int compareTo = compareTo(list.size(), list2.size());
        if (compareTo == 0) {
            for (int i = 0; i < list.size(); i++) {
                compareTo = comparator.compare(list.get(i), list2.get(i));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
        }
        return compareTo;
    }

    public static int compareTo(Set set, Set set2) {
        int compareTo = compareTo(set.size(), set2.size());
        if (compareTo == 0) {
            ArrayList arrayList = new ArrayList(set);
            ArrayList arrayList2 = new ArrayList(set2);
            Comparator comparator2 = comparator;
            Collections.sort(arrayList, comparator2);
            Collections.sort(arrayList2, comparator2);
            Iterator it2 = arrayList.iterator();
            Iterator it3 = arrayList2.iterator();
            while (it2.hasNext() && it3.hasNext() && (compareTo = comparator.compare(it2.next(), it3.next())) == 0) {
            }
        }
        return compareTo;
    }

    public static int compareTo(Object obj, Object obj2) {
        if (obj instanceof Comparable) {
            return compareTo((Comparable) obj, (Comparable) obj2);
        }
        if (obj instanceof List) {
            return compareTo((List) obj, (List) obj2);
        }
        if (obj instanceof Set) {
            return compareTo((Set) obj, (Set) obj2);
        }
        if (obj instanceof Map) {
            return compareTo((Map) obj, (Map) obj2);
        }
        if (obj instanceof byte[]) {
            return compareTo((byte[]) obj, (byte[]) obj2);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(obj, new StringBuilder("Cannot compare objects of type ")));
        return 0;
    }
}
