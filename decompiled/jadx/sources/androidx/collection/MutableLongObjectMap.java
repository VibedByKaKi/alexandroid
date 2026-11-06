package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0006\u0010\n\u001a\u00020\bJ\r\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0002\b\fJ\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J'\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0011\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\nJ\u0011\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001dH\u0086\nJ\u0011\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086\nJ\u0011\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001eH\u0086\nJ\u0017\u0010\u001f\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\nJ\u001d\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0002\u0010#J\u0014\u0010$\u001a\u00020\b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0015\u0010%\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010&J\u001b\u0010%\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0002\u0010(J&\u0010)\u001a\u00020\b2\u0018\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020'0+H\u0086\bø\u0001\u0000J\u0017\u0010,\u001a\u0004\u0018\u00018\u00002\u0006\u0010-\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010.J\u0015\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0000¢\u0006\u0002\b1J\u001e\u00102\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00103J\u0006\u00104\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Landroidx/collection/MutableLongObjectMap;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/LongObjectMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "adjustStorage$collection", MetricsConstants.Method.CACHE_CLEAR, "dropDeletes", "dropDeletes$collection", "findAbsoluteInsertIndex", "key", "", "findFirstAvailableSlot", "hash1", "getOrPut", "defaultValue", "Lkotlin/Function0;", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/LongList;", "Landroidx/collection/LongSet;", "", "plusAssign", "from", MetricsConstants.Method.CACHE_PUT, "value", "(JLjava/lang/Object;)Ljava/lang/Object;", "putAll", BulkOperationType.remove, "(J)Ljava/lang/Object;", "", "(JLjava/lang/Object;)Z", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "(I)Ljava/lang/Object;", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "(JLjava/lang/Object;)V", "trim", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 LongObjectMap.kt\nandroidx/collection/LongObjectMap\n+ 6 LongSet.kt\nandroidx/collection/LongSetKt\n+ 7 LongSet.kt\nandroidx/collection/LongSet\n+ 8 LongList.kt\nandroidx/collection/LongList\n*L\n1#1,1017:1\n757#1,2:1173\n757#1,2:1186\n59#2,5:1018\n1#3:1023\n1254#4,6:1024\n1399#4:1040\n1270#4:1044\n1179#4:1060\n1175#4:1063\n1372#4,3:1068\n1386#4,3:1072\n1312#4:1076\n1303#4:1078\n1297#4:1079\n1309#4:1084\n1393#4:1086\n1179#4:1100\n1175#4:1103\n1372#4,3:1108\n1386#4,3:1112\n1312#4:1116\n1303#4:1118\n1297#4:1119\n1309#4:1124\n1393#4:1126\n1399#4:1141\n1270#4:1145\n1399#4:1166\n1270#4:1170\n1230#4:1189\n1254#4,6:1190\n1242#4:1196\n1241#4,4:1197\n1254#4,6:1201\n1175#4:1210\n1179#4:1211\n1372#4,3:1212\n1386#4,3:1215\n1312#4:1218\n1303#4:1219\n1297#4:1220\n1309#4:1221\n1393#4:1222\n1265#4:1223\n1220#4:1224\n1262#4:1225\n1220#4:1226\n1230#4:1227\n1254#4,6:1228\n1242#4:1234\n1241#4,4:1235\n1372#4,3:1239\n1399#4:1242\n1297#4:1243\n1144#4,14:1244\n1220#4:1258\n1175#4:1262\n1179#4:1263\n1254#4,6:1264\n1220#4:1270\n1179#4:1271\n1254#4,6:1272\n1254#4,6:1278\n1179#4:1284\n1254#4,6:1285\n1268#4:1291\n1220#4:1292\n1175#4:1296\n1179#4:1297\n1230#4:1298\n1254#4,6:1299\n1242#4:1305\n1241#4,4:1306\n382#5,4:1030\n354#5,6:1034\n364#5,3:1041\n367#5,9:1045\n386#5:1054\n577#5:1055\n578#5:1059\n580#5,2:1061\n582#5,4:1064\n586#5:1071\n587#5:1075\n588#5:1077\n589#5,4:1080\n595#5:1085\n596#5,8:1087\n577#5:1095\n578#5:1099\n580#5,2:1101\n582#5,4:1104\n586#5:1111\n587#5:1115\n588#5:1117\n589#5,4:1120\n595#5:1125\n596#5,8:1127\n354#5,6:1135\n364#5,3:1142\n367#5,9:1146\n881#6,3:1056\n881#6,3:1096\n881#6,3:1207\n881#6,3:1259\n881#6,3:1293\n256#7,4:1155\n226#7,7:1159\n237#7,3:1167\n240#7,2:1171\n243#7,6:1175\n260#7:1181\n237#8,4:1182\n242#8:1188\n*S KotlinDebug\n*F\n+ 1 LongObjectMap.kt\nandroidx/collection/MutableLongObjectMap\n*L\n769#1:1173,2\n774#1:1186,2\n637#1:1018,5\n665#1:1024,6\n712#1:1040\n712#1:1044\n723#1:1060\n723#1:1063\n723#1:1068,3\n723#1:1072,3\n723#1:1076\n723#1:1078\n723#1:1079\n723#1:1084\n723#1:1086\n735#1:1100\n735#1:1103\n735#1:1108,3\n735#1:1112,3\n735#1:1116\n735#1:1118\n735#1:1119\n735#1:1124\n735#1:1126\n747#1:1141\n747#1:1145\n769#1:1166\n769#1:1170\n783#1:1189\n783#1:1190,6\n783#1:1196\n783#1:1197,4\n795#1:1201,6\n809#1:1210\n810#1:1211\n817#1:1212,3\n818#1:1215,3\n819#1:1218\n820#1:1219\n820#1:1220\n824#1:1221\n827#1:1222\n836#1:1223\n836#1:1224\n842#1:1225\n842#1:1226\n843#1:1227\n843#1:1228,6\n843#1:1234\n843#1:1235,4\n858#1:1239,3\n859#1:1242\n861#1:1243\n907#1:1244,14\n913#1:1258\n928#1:1262\n939#1:1263\n940#1:1264,6\n950#1:1270\n953#1:1271\n954#1:1272,6\n955#1:1278,6\n965#1:1284\n966#1:1285,6\n1005#1:1291\n1005#1:1292\n1008#1:1296\n1010#1:1297\n1010#1:1298\n1010#1:1299,6\n1010#1:1305\n1010#1:1306,4\n712#1:1030,4\n712#1:1034,6\n712#1:1041,3\n712#1:1045,9\n712#1:1054\n723#1:1055\n723#1:1059\n723#1:1061,2\n723#1:1064,4\n723#1:1071\n723#1:1075\n723#1:1077\n723#1:1080,4\n723#1:1085\n723#1:1087,8\n735#1:1095\n735#1:1099\n735#1:1101,2\n735#1:1104,4\n735#1:1111\n735#1:1115\n735#1:1117\n735#1:1120,4\n735#1:1125\n735#1:1127,8\n747#1:1135,6\n747#1:1142,3\n747#1:1146,9\n723#1:1056,3\n735#1:1096,3\n808#1:1207,3\n927#1:1259,3\n1007#1:1293,3\n769#1:1155,4\n769#1:1159,7\n769#1:1167,3\n769#1:1171,2\n769#1:1175,6\n769#1:1181\n774#1:1182,4\n774#1:1188\n*E\n"})
/* loaded from: classes.dex */
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {
    private int growthLimit;

    public MutableLongObjectMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    private final int findAbsoluteInsertIndex(long key) {
        int hashCode = Long.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i6;
            long j3 = j ^ (j2 * ScatterMapKt.BitmaskLsb);
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (this.keys[numberOfTrailingZeros] == key) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    findFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = findFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return findFirstAvailableSlot;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        int max = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = max;
        initializeMetadata(max);
        this.keys = new long[max];
        this.values = new Object[max];
    }

    public final void adjustStorage$collection() {
        if (this._capacity <= 8 || Long.compareUnsigned(DoubleList$$ExternalSyntheticOutline0.m(this._size, 32L), DoubleList$$ExternalSyntheticOutline0.m(this._capacity, 25L)) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.fill(this.values, (Object) null, 0, this._capacity);
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j;
        long[] jArr = this.metadata;
        int i = this._capacity;
        long[] jArr2 = this.keys;
        Object[] objArr = this.values;
        int i2 = (i + 7) >> 3;
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i4 = lastIndex - 1;
        long j3 = 72057594037927935L;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i5 = 0;
        while (i5 != i) {
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j4 = (jArr[i6] >> i7) & 255;
            if (j4 != 128 && j4 == 254) {
                int hashCode = Long.hashCode(jArr2[i5]) * ScatterMapKt.MurmurHashC1;
                int i8 = (hashCode ^ (hashCode << 16)) >>> 7;
                int findFirstAvailableSlot = findFirstAvailableSlot(i8);
                int i9 = i8 & i;
                boolean z2 = z;
                if (((findFirstAvailableSlot - i9) & i) / 8 == ((i5 - i9) & i) / 8) {
                    jArr[i6] = ((r8 & 127) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[z2 ? 1 : 0] & j3) | Long.MIN_VALUE;
                    i5++;
                    z = z2 ? 1 : 0;
                } else {
                    int i10 = findFirstAvailableSlot >> 3;
                    long j5 = jArr[i10];
                    int i11 = (findFirstAvailableSlot & 7) << 3;
                    if (((j5 >> i11) & 255) == 128) {
                        j = j3;
                        jArr[i10] = ((r8 & 127) << i11) | (j5 & (~(255 << i11)));
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        jArr2[findFirstAvailableSlot] = jArr2[i5];
                        jArr2[i5] = 0;
                        objArr[findFirstAvailableSlot] = objArr[i5];
                        objArr[i5] = null;
                    } else {
                        j = j3;
                        jArr[i10] = ((r8 & 127) << i11) | (j5 & (~(255 << i11)));
                        long j6 = jArr2[findFirstAvailableSlot];
                        jArr2[findFirstAvailableSlot] = jArr2[i5];
                        jArr2[i5] = j6;
                        Object obj = objArr[findFirstAvailableSlot];
                        objArr[findFirstAvailableSlot] = objArr[i5];
                        objArr[i5] = obj;
                        i5--;
                    }
                    jArr[ArraysKt.getLastIndex(jArr)] = (jArr[z2 ? 1 : 0] & j) | Long.MIN_VALUE;
                    i5++;
                    z = z2 ? 1 : 0;
                    j3 = j;
                }
            } else {
                i5++;
            }
        }
        initializeGrowth();
    }

    public final V getOrPut(long key, @NotNull Function0<? extends V> defaultValue) {
        defaultValue.getClass();
        V v = get(key);
        if (v != null) {
            return v;
        }
        V invoke = defaultValue.invoke();
        set(key, invoke);
        return invoke;
    }

    public final void minusAssign(@NotNull LongSet keys) {
        keys.getClass();
        long[] jArr = keys.elements;
        long[] jArr2 = keys.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(jArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void plusAssign(@NotNull LongObjectMap<V> from) {
        from.getClass();
        putAll(from);
    }

    @Nullable
    public final V put(long key, V value) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(key);
        Object[] objArr = this.values;
        V v = (V) objArr[findAbsoluteInsertIndex];
        this.keys[findAbsoluteInsertIndex] = key;
        objArr[findAbsoluteInsertIndex] = value;
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull LongObjectMap<V> from) {
        from.getClass();
        long[] jArr = from.keys;
        Object[] objArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        set(jArr[i4], objArr[i4]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(long r17, V r19) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Long.hashCode(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.metadata
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L41:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5e
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.keys
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L58
            goto L68
        L58:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L41
        L5e:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L7b
            r10 = -1
        L68:
            if (r10 < 0) goto L7a
            java.lang.Object[] r1 = r0.values
            r1 = r1[r10]
            r6 = r19
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r1 == 0) goto L7a
            r0.removeValueAt(r10)
            return r11
        L7a:
            return r4
        L7b:
            r6 = r19
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongObjectMap.remove(long, java.lang.Object):boolean");
    }

    public final void removeIf(@NotNull Function2<? super Long, ? super V, Boolean> predicate) {
        predicate.getClass();
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (predicate.invoke(Long.valueOf(this.keys[i4]), this.values[i4]).booleanValue()) {
                            removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @PublishedApi
    @Nullable
    public final V removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        Object[] objArr = this.values;
        V v = (V) objArr[index];
        objArr[index] = null;
        return v;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableLongObjectMap<V> mutableLongObjectMap = this;
        long[] jArr2 = mutableLongObjectMap.metadata;
        long[] jArr3 = mutableLongObjectMap.keys;
        Object[] objArr = mutableLongObjectMap.values;
        int i = mutableLongObjectMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr4 = mutableLongObjectMap.metadata;
        long[] jArr5 = mutableLongObjectMap.keys;
        Object[] objArr2 = mutableLongObjectMap.values;
        int i2 = mutableLongObjectMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr3[i3];
                int hashCode = Long.hashCode(j) * ScatterMapKt.MurmurHashC1;
                int i4 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = mutableLongObjectMap.findFirstAvailableSlot(i4 >>> 7);
                long j2 = i4 & 127;
                int i5 = findFirstAvailableSlot >> 3;
                int i6 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr4[i5] & (~(255 << i6))) | (j2 << i6);
                jArr4[i5] = j3;
                jArr4[(((findFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j3;
                jArr5[findFirstAvailableSlot] = j;
                objArr2[findFirstAvailableSlot] = objArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableLongObjectMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(long key, V value) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(key);
        this.keys[findAbsoluteInsertIndex] = key;
        this.values[findAbsoluteInsertIndex] = value;
    }

    public final int trim() {
        int i = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i) {
            return 0;
        }
        resizeStorage$collection(normalizeCapacity);
        return i - this._capacity;
    }

    public /* synthetic */ MutableLongObjectMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableLongObjectMap() {
        this(0, 1, null);
    }

    public final void minusAssign(@NotNull long[] keys) {
        keys.getClass();
        for (long j : keys) {
            remove(j);
        }
    }

    public final void minusAssign(long key) {
        remove(key);
    }

    public final void minusAssign(@NotNull LongList keys) {
        keys.getClass();
        long[] jArr = keys.content;
        int i = keys._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(jArr[i2]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        r10 = -1;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13._capacity
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.metadata
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3e:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.keys
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L55
            goto L65
        L55:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3e
        L5b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6e
            r10 = -1
        L65:
            if (r10 < 0) goto L6c
            java.lang.Object r13 = r13.removeValueAt(r10)
            return r13
        L6c:
            r13 = 0
            return r13
        L6e:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongObjectMap.remove(long):java.lang.Object");
    }
}
