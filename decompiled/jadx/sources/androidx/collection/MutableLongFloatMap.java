package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
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

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0006\u0010\t\u001a\u00020\u0007J\r\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\nJ\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001cH\u0086\nJ\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\nJ\u0011\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001dH\u0086\nJ\u0011\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0001H\u0086\nJ\u0016\u0010 \u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0012J\u001e\u0010 \u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0001J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010$\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0012J&\u0010&\u001a\u00020\u00072\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020%0(H\u0086\bø\u0001\u0000J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0003H\u0001J\u0015\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0003H\u0000¢\u0006\u0002\b-J\u0019\u0010.\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0012H\u0086\u0002J\u0006\u0010/\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00060"}, d2 = {"Landroidx/collection/MutableLongFloatMap;", "Landroidx/collection/LongFloatMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "adjustStorage$collection", MetricsConstants.Method.CACHE_CLEAR, "dropDeletes", "dropDeletes$collection", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "", "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/LongList;", "Landroidx/collection/LongSet;", "", "plusAssign", "from", MetricsConstants.Method.CACHE_PUT, "value", "default", "putAll", BulkOperationType.remove, "", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "resizeStorage$collection", "set", "trim", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongFloatMap.kt\nandroidx/collection/MutableLongFloatMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 LongFloatMap.kt\nandroidx/collection/LongFloatMap\n+ 6 LongSet.kt\nandroidx/collection/LongSet\n+ 7 LongList.kt\nandroidx/collection/LongList\n+ 8 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,1036:1\n59#2,5:1037\n1#3:1042\n1254#4,6:1043\n1399#4:1059\n1270#4:1063\n1399#4:1080\n1270#4:1084\n1399#4:1105\n1270#4:1109\n1230#4:1126\n1254#4,6:1127\n1242#4:1133\n1241#4,4:1134\n1254#4,6:1138\n1175#4:1147\n1179#4:1148\n1372#4,3:1149\n1386#4,3:1152\n1312#4:1155\n1303#4:1156\n1297#4:1157\n1309#4:1158\n1393#4:1159\n1265#4:1160\n1220#4:1161\n1262#4:1162\n1220#4:1163\n1230#4:1164\n1254#4,6:1165\n1242#4:1171\n1241#4,4:1172\n1372#4,3:1176\n1399#4:1179\n1297#4:1180\n1144#4,14:1181\n1220#4:1195\n1175#4:1199\n1179#4:1200\n1254#4,6:1201\n1220#4:1207\n1179#4:1208\n1254#4,6:1209\n1254#4,6:1215\n1179#4:1221\n1254#4,6:1222\n1268#4:1228\n1220#4:1229\n1175#4:1233\n1179#4:1234\n1230#4:1235\n1254#4,6:1236\n1242#4:1242\n1241#4,4:1243\n389#5,4:1049\n361#5,6:1053\n371#5,3:1060\n374#5,9:1064\n393#5:1073\n361#5,6:1074\n371#5,3:1081\n374#5,9:1085\n256#6,4:1094\n226#6,7:1098\n237#6,3:1106\n240#6,9:1110\n260#6:1119\n237#7,6:1120\n881#8,3:1144\n881#8,3:1196\n881#8,3:1230\n*S KotlinDebug\n*F\n+ 1 LongFloatMap.kt\nandroidx/collection/MutableLongFloatMap\n*L\n641#1:1037,5\n669#1:1043,6\n741#1:1059\n741#1:1063\n772#1:1080\n772#1:1084\n793#1:1105\n793#1:1109\n807#1:1126\n807#1:1127,6\n807#1:1133\n807#1:1134,4\n815#1:1138,6\n828#1:1147\n829#1:1148\n836#1:1149,3\n837#1:1152,3\n838#1:1155\n839#1:1156\n839#1:1157\n843#1:1158\n846#1:1159\n855#1:1160\n855#1:1161\n861#1:1162\n861#1:1163\n862#1:1164\n862#1:1165,6\n862#1:1171\n862#1:1172,4\n877#1:1176,3\n878#1:1179\n880#1:1180\n926#1:1181,14\n932#1:1195\n947#1:1199\n958#1:1200\n959#1:1201,6\n969#1:1207\n972#1:1208\n973#1:1209,6\n974#1:1215,6\n984#1:1221\n985#1:1222,6\n1024#1:1228\n1024#1:1229\n1027#1:1233\n1029#1:1234\n1029#1:1235\n1029#1:1236,6\n1029#1:1242\n1029#1:1243,4\n741#1:1049,4\n741#1:1053,6\n741#1:1060,3\n741#1:1064,9\n741#1:1073\n772#1:1074,6\n772#1:1081,3\n772#1:1085,9\n793#1:1094,4\n793#1:1098,7\n793#1:1106,3\n793#1:1110,9\n793#1:1119\n798#1:1120,6\n827#1:1144,3\n946#1:1196,3\n1026#1:1230,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableLongFloatMap extends LongFloatMap {
    private int growthLimit;

    public MutableLongFloatMap(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
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

    private final int findInsertIndex(long key) {
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
                return ~findFirstAvailableSlot;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
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
        this.values = new float[max];
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
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long j;
        long[] jArr = this.metadata;
        int i = this._capacity;
        long[] jArr2 = this.keys;
        float[] fArr = this.values;
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
                        fArr[findFirstAvailableSlot] = fArr[i5];
                        fArr[i5] = 0.0f;
                    } else {
                        j = j3;
                        jArr[i10] = ((r8 & 127) << i11) | (j5 & (~(255 << i11)));
                        long j6 = jArr2[findFirstAvailableSlot];
                        jArr2[findFirstAvailableSlot] = jArr2[i5];
                        jArr2[i5] = j6;
                        float f = fArr[findFirstAvailableSlot];
                        fArr[findFirstAvailableSlot] = fArr[i5];
                        fArr[i5] = f;
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

    public final float getOrPut(long key, @NotNull Function0<Float> defaultValue) {
        defaultValue.getClass();
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        float floatValue = defaultValue.invoke().floatValue();
        put(key, floatValue);
        return floatValue;
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

    public final void plusAssign(@NotNull LongFloatMap from) {
        from.getClass();
        putAll(from);
    }

    public final float put(long key, float value, float r6) {
        int findInsertIndex = findInsertIndex(key);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        } else {
            r6 = this.values[findInsertIndex];
        }
        this.keys[findInsertIndex] = key;
        this.values[findInsertIndex] = value;
        return r6;
    }

    public final void putAll(@NotNull LongFloatMap from) {
        from.getClass();
        long[] jArr = from.keys;
        float[] fArr = from.values;
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
                        set(jArr[i4], fArr[i4]);
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

    public final boolean remove(long key, float value) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != value) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void removeIf(@NotNull Function2<? super Long, ? super Float, Boolean> predicate) {
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
                        if (predicate.invoke(Long.valueOf(this.keys[i4]), Float.valueOf(this.values[i4])).booleanValue()) {
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
    public final void removeValueAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        MutableLongFloatMap mutableLongFloatMap = this;
        long[] jArr2 = mutableLongFloatMap.metadata;
        long[] jArr3 = mutableLongFloatMap.keys;
        float[] fArr = mutableLongFloatMap.values;
        int i = mutableLongFloatMap._capacity;
        initializeStorage(newCapacity);
        long[] jArr4 = mutableLongFloatMap.metadata;
        long[] jArr5 = mutableLongFloatMap.keys;
        float[] fArr2 = mutableLongFloatMap.values;
        int i2 = mutableLongFloatMap._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr3[i3];
                int hashCode = Long.hashCode(j) * ScatterMapKt.MurmurHashC1;
                int i4 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = mutableLongFloatMap.findFirstAvailableSlot(i4 >>> 7);
                long j2 = i4 & 127;
                int i5 = findFirstAvailableSlot >> 3;
                int i6 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr4[i5] & (~(255 << i6))) | (j2 << i6);
                jArr4[i5] = j3;
                jArr4[(((findFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j3;
                jArr5[findFirstAvailableSlot] = j;
                fArr2[findFirstAvailableSlot] = fArr[i3];
            } else {
                jArr = jArr2;
            }
            i3++;
            mutableLongFloatMap = this;
            jArr2 = jArr;
        }
    }

    public final void set(long key, float value) {
        int findInsertIndex = findInsertIndex(key);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = key;
        this.values[findInsertIndex] = value;
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

    public final void put(long key, float value) {
        set(key, value);
    }

    public final void remove(long key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public MutableLongFloatMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableLongFloatMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
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
}
