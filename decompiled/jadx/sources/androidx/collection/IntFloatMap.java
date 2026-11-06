package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.dee.app.metrics.MetricsConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J&\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000J\u0006\u0010\u001b\u001a\u00020\u0017J&\u0010\u001b\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000J\u0011\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\nJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u0004J&\u0010!\u001a\u00020\u00042\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000J\u0013\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004H\u0001JD\u0010%\u001a\u00020&26\u0010'\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b( \u0012\u0004\u0012\u00020&0\u0019H\u0086\bø\u0001\u0000J/\u0010*\u001a\u00020&2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020&0+H\u0081\bø\u0001\u0000J/\u0010-\u001a\u00020&2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020&0+H\u0086\bø\u0001\u0000J/\u0010.\u001a\u00020&2!\u0010'\u001a\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b( \u0012\u0004\u0012\u00020&0+H\u0086\bø\u0001\u0000J\u0011\u0010/\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0004H\u0086\u0002J\u0016\u00100\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u001aJ\"\u00102\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a03H\u0086\bø\u0001\u0000J\b\u00104\u001a\u00020\u0004H\u0016J\u0006\u00105\u001a\u00020\u0017J\u0006\u00106\u001a\u00020\u0017J:\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020:H\u0007Jx\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020:2\b\b\u0002\u0010=\u001a\u00020\u00042\b\b\u0002\u0010>\u001a\u00020:28\b\u0004\u0010?\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b( \u0012\u0004\u0012\u00020:0\u0019H\u0087\bø\u0001\u0000J\u0006\u0010@\u001a\u00020\u0017J\b\u0010A\u001a\u000208H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0018\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0018\u0010\u0013\u001a\u00020\u00148\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u0082\u0001\u0001B\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"Landroidx/collection/IntFloatMap;", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "", Languages.ANY, "contains", "key", "containsKey", "containsValue", "value", "count", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "findKeyIndex", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", MetricsConstants.Method.CACHE_GET, "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", ViewProps.TRANSFORM, "none", "toString", "Landroidx/collection/MutableIntFloatMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntFloatMap.kt\nandroidx/collection/IntFloatMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 IntSet.kt\nandroidx/collection/IntSetKt\n*L\n1#1,1034:1\n359#1,6:1037\n369#1,3:1044\n372#1,9:1048\n359#1,6:1057\n369#1,3:1064\n372#1,9:1068\n359#1,6:1077\n369#1,3:1084\n372#1,9:1088\n387#1,4:1097\n359#1,6:1101\n369#1,3:1108\n372#1,9:1112\n391#1:1121\n387#1,4:1122\n359#1,6:1126\n369#1,3:1133\n372#1,9:1137\n391#1:1146\n387#1,4:1147\n359#1,6:1151\n369#1,3:1158\n372#1,9:1162\n391#1:1171\n402#1,3:1172\n359#1,6:1175\n369#1,3:1182\n372#1,9:1186\n405#1:1195\n387#1,4:1196\n359#1,6:1200\n369#1,3:1207\n372#1,9:1211\n391#1:1220\n387#1,4:1221\n359#1,6:1225\n369#1,3:1232\n372#1,9:1236\n391#1:1245\n387#1,4:1246\n359#1,6:1250\n369#1,3:1257\n372#1,9:1261\n391#1:1270\n387#1,4:1271\n359#1,6:1275\n369#1,3:1282\n372#1,9:1286\n391#1:1295\n387#1,4:1296\n359#1,6:1300\n369#1,3:1307\n372#1,9:1311\n391#1:1320\n387#1,4:1321\n359#1,6:1325\n369#1,3:1332\n372#1,9:1336\n391#1:1345\n484#1,11:1362\n387#1,4:1373\n359#1,6:1377\n369#1,3:1384\n372#1,2:1388\n495#1,10:1390\n375#1,6:1400\n391#1:1406\n505#1,2:1407\n484#1,11:1409\n387#1,4:1420\n359#1,6:1424\n369#1,3:1431\n372#1,2:1435\n495#1,10:1437\n375#1,6:1447\n391#1:1453\n505#1,2:1454\n484#1,11:1456\n387#1,4:1467\n359#1,6:1471\n369#1,3:1478\n372#1,2:1482\n495#1,10:1484\n375#1,6:1494\n391#1:1500\n505#1,2:1501\n484#1,11:1503\n387#1,4:1514\n359#1,6:1518\n369#1,3:1525\n372#1,2:1529\n495#1,10:1531\n375#1,6:1541\n391#1:1547\n505#1,2:1548\n484#1,11:1550\n387#1,4:1561\n359#1,6:1565\n369#1,3:1572\n372#1,2:1576\n495#1,10:1578\n375#1,6:1588\n391#1:1594\n505#1,2:1595\n1399#2:1035\n1270#2:1036\n1399#2:1043\n1270#2:1047\n1399#2:1063\n1270#2:1067\n1399#2:1083\n1270#2:1087\n1399#2:1107\n1270#2:1111\n1399#2:1132\n1270#2:1136\n1399#2:1157\n1270#2:1161\n1399#2:1181\n1270#2:1185\n1399#2:1206\n1270#2:1210\n1399#2:1231\n1270#2:1235\n1399#2:1256\n1270#2:1260\n1399#2:1281\n1270#2:1285\n1399#2:1306\n1270#2:1310\n1399#2:1331\n1270#2:1335\n1179#2:1349\n1175#2:1350\n1372#2,3:1351\n1386#2,3:1354\n1312#2:1357\n1303#2:1358\n1297#2:1359\n1309#2:1360\n1393#2:1361\n1399#2:1383\n1270#2:1387\n1399#2:1430\n1270#2:1434\n1399#2:1477\n1270#2:1481\n1399#2:1524\n1270#2:1528\n1399#2:1571\n1270#2:1575\n880#3,3:1346\n*S KotlinDebug\n*F\n+ 1 IntFloatMap.kt\nandroidx/collection/IntFloatMap\n*L\n390#1:1037,6\n390#1:1044,3\n390#1:1048,9\n397#1:1057,6\n397#1:1064,3\n397#1:1068,9\n404#1:1077,6\n404#1:1084,3\n404#1:1088,9\n409#1:1097,4\n409#1:1101,6\n409#1:1108,3\n409#1:1112,9\n409#1:1121\n415#1:1122,4\n415#1:1126,6\n415#1:1133,3\n415#1:1137,9\n415#1:1146\n425#1:1147,4\n425#1:1151,6\n425#1:1158,3\n425#1:1162,9\n425#1:1171\n437#1:1172,3\n437#1:1175,6\n437#1:1182,3\n437#1:1186,9\n437#1:1195\n459#1:1196,4\n459#1:1200,6\n459#1:1207,3\n459#1:1211,9\n459#1:1220\n494#1:1221,4\n494#1:1225,6\n494#1:1232,3\n494#1:1236,9\n494#1:1245\n494#1:1246,4\n494#1:1250,6\n494#1:1257,3\n494#1:1261,9\n494#1:1270\n515#1:1271,4\n515#1:1275,6\n515#1:1282,3\n515#1:1286,9\n515#1:1295\n539#1:1296,4\n539#1:1300,6\n539#1:1307,3\n539#1:1311,9\n539#1:1320\n561#1:1321,4\n561#1:1325,6\n561#1:1332,3\n561#1:1336,9\n561#1:1345\n-1#1:1362,11\n-1#1:1373,4\n-1#1:1377,6\n-1#1:1384,3\n-1#1:1388,2\n-1#1:1390,10\n-1#1:1400,6\n-1#1:1406\n-1#1:1407,2\n-1#1:1409,11\n-1#1:1420,4\n-1#1:1424,6\n-1#1:1431,3\n-1#1:1435,2\n-1#1:1437,10\n-1#1:1447,6\n-1#1:1453\n-1#1:1454,2\n-1#1:1456,11\n-1#1:1467,4\n-1#1:1471,6\n-1#1:1478,3\n-1#1:1482,2\n-1#1:1484,10\n-1#1:1494,6\n-1#1:1500\n-1#1:1501,2\n-1#1:1503,11\n-1#1:1514,4\n-1#1:1518,6\n-1#1:1525,3\n-1#1:1529,2\n-1#1:1531,10\n-1#1:1541,6\n-1#1:1547\n-1#1:1548,2\n-1#1:1550,11\n-1#1:1561,4\n-1#1:1565,6\n-1#1:1572,3\n-1#1:1576,2\n-1#1:1578,10\n-1#1:1588,6\n-1#1:1594\n-1#1:1595,2\n364#1:1035\n371#1:1036\n390#1:1043\n390#1:1047\n397#1:1063\n397#1:1067\n404#1:1083\n404#1:1087\n409#1:1107\n409#1:1111\n415#1:1132\n415#1:1136\n425#1:1157\n425#1:1161\n437#1:1181\n437#1:1185\n459#1:1206\n459#1:1210\n494#1:1231\n494#1:1235\n494#1:1256\n494#1:1260\n515#1:1281\n515#1:1285\n539#1:1306\n539#1:1310\n561#1:1331\n561#1:1335\n581#1:1349\n584#1:1350\n588#1:1351,3\n589#1:1354,3\n590#1:1357\n591#1:1358\n591#1:1359\n595#1:1360\n598#1:1361\n-1#1:1383\n-1#1:1387\n-1#1:1430\n-1#1:1434\n-1#1:1477\n-1#1:1481\n-1#1:1524\n-1#1:1528\n-1#1:1571\n-1#1:1575\n580#1:1346,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class IntFloatMap {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public int[] keys;

    @JvmField
    @NotNull
    public long[] metadata;

    @JvmField
    @NotNull
    public float[] values;

    private IntFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
        this.values = FloatSetKt.getEmptyFloatArray();
    }

    public static /* synthetic */ String joinToString$default(IntFloatMap intFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i3;
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: joinToString");
            return null;
        }
        CharSequence charSequence5 = (i2 & 1) != 0 ? ", " : charSequence;
        CharSequence charSequence6 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence7 = (i2 & 4) == 0 ? charSequence3 : "";
        int i4 = (i2 & 8) != 0 ? -1 : i;
        CharSequence charSequence8 = (i2 & 16) != 0 ? "..." : charSequence4;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(charSequence5, charSequence6, charSequence7, charSequence8, function2);
        m.append(charSequence6);
        int[] iArr = intFloatMap.keys;
        float[] fArr = intFloatMap.values;
        long[] jArr3 = intFloatMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j = jArr3[i5];
                int i7 = i5;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j & 255) < 128) {
                            int i11 = (i7 << 3) + i10;
                            int i12 = iArr[i11];
                            float f = fArr[i11];
                            if (i6 == i4) {
                                m.append(charSequence8);
                                break loop0;
                            }
                            if (i6 != 0) {
                                m.append(charSequence5);
                            }
                            i3 = i8;
                            Integer valueOf = Integer.valueOf(i12);
                            jArr2 = jArr3;
                            m.append((CharSequence) function2.invoke(valueOf, Float.valueOf(f)));
                            i6++;
                        } else {
                            jArr2 = jArr3;
                            i3 = i8;
                        }
                        j >>= i3;
                        i10++;
                        i8 = i3;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i9 != i8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i7 == length) {
                    break;
                }
                i5 = i7 + 1;
                jArr3 = jArr;
            }
            return m.toString();
        }
        m.append(charSequence7);
        return m.toString();
    }

    public final boolean all(@NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
        predicate.getClass();
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!predicate.invoke(Integer.valueOf(iArr[i4]), Float.valueOf(fArr[i4])).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any(@NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
        predicate.getClass();
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (predicate.invoke(Integer.valueOf(iArr[i4]), Float.valueOf(fArr[i4])).booleanValue()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean contains(int key) {
        return containsKey(key);
    }

    public final boolean containsKey(int key) {
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsValue(float value) {
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && value == fArr[(i << 3) + i3]) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final int count(@NotNull Function2<? super Integer, ? super Float, Boolean> predicate) {
        predicate.getClass();
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        if (predicate.invoke(Integer.valueOf(iArr[i5]), Float.valueOf(fArr[i5])).booleanValue()) {
                            i2++;
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IntFloatMap)) {
            return false;
        }
        IntFloatMap intFloatMap = (IntFloatMap) other;
        if (intFloatMap.get_size() != get_size()) {
            return false;
        }
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            int i5 = iArr[i4];
                            float f = fArr[i4];
                            int findKeyIndex = intFloatMap.findKeyIndex(i5);
                            if (findKeyIndex < 0 || f != intFloatMap.values[findKeyIndex]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return false;
        }
        return true;
    }

    @PublishedApi
    public final int findKeyIndex(int key) {
        int hashCode = Integer.hashCode(key) * ScatterMapKt.MurmurHashC1;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i & 127;
        int i3 = this._capacity;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (i2 * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (this.keys[numberOfTrailingZeros] == key) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void forEach(@NotNull Function2<? super Integer, ? super Float, Unit> block) {
        block.getClass();
        int[] iArr = this.keys;
        float[] fArr = this.values;
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
                        block.invoke(Integer.valueOf(iArr[i4]), Float.valueOf(fArr[i4]));
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
    public final void forEachIndexed(@NotNull Function1<? super Integer, Unit> block) {
        block.getClass();
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
                        DoubleList$$ExternalSyntheticOutline0.m191m(i << 3, i3, (Function1) block);
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

    public final void forEachKey(@NotNull Function1<? super Integer, Unit> block) {
        block.getClass();
        int[] iArr = this.keys;
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
                        block.invoke(Integer.valueOf(iArr[(i << 3) + i3]));
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

    public final void forEachValue(@NotNull Function1<? super Float, Unit> block) {
        block.getClass();
        float[] fArr = this.values;
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
                        block.invoke(Float.valueOf(fArr[(i << 3) + i3]));
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

    public final float get(int key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            RuntimeHelpersKt.throwNoSuchElementException("Cannot find value for key " + key);
        }
        return this.values[findKeyIndex];
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final float getOrDefault(int key, float defaultValue) {
        int findKeyIndex = findKeyIndex(key);
        return findKeyIndex >= 0 ? this.values[findKeyIndex] : defaultValue;
    }

    public final float getOrElse(int key, @NotNull Function0<Float> defaultValue) {
        defaultValue.getClass();
        int findKeyIndex = findKeyIndex(key);
        return findKeyIndex < 0 ? defaultValue.invoke().floatValue() : this.values[findKeyIndex];
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        i2 += Float.hashCode(fArr[i5]) ^ Integer.hashCode(i6);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function2<? super Integer, ? super Float, ? extends CharSequence> transform) {
        long[] jArr;
        long[] jArr2;
        int i;
        CharSequence charSequence = separator;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(charSequence, prefix, postfix, truncated, transform);
        m.append(prefix);
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            int i8 = iArr[i7];
                            float f = fArr[i7];
                            i = i4;
                            if (i3 == limit) {
                                m.append(truncated);
                                break loop0;
                            }
                            if (i3 != 0) {
                                m.append(charSequence);
                            }
                            jArr2 = jArr3;
                            m.append(transform.invoke(Integer.valueOf(i8), Float.valueOf(f)));
                            i3++;
                        } else {
                            jArr2 = jArr3;
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        charSequence = separator;
                        i4 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                charSequence = separator;
                jArr3 = jArr;
            }
            return m.toString();
        }
        m.append(postfix);
        return m.toString();
    }

    public final boolean none() {
        return this._size == 0;
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            float f = fArr[i5];
                            sb.append(i6);
                            sb.append("=");
                            sb.append(f);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public /* synthetic */ IntFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @PublishedApi
    public static /* synthetic */ void getKeys$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final int count() {
        return get_size();
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        return joinToString$default(this, charSequence, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        return joinToString$default(this, charSequence, charSequence2, null, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3) {
        DoubleList$$ExternalSyntheticOutline0.m(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i) {
        DoubleList$$ExternalSyntheticOutline0.m(charSequence, charSequence2, charSequence3);
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        long[] jArr;
        long[] jArr2;
        int i;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(separator, prefix, postfix, truncated, prefix);
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            int i8 = iArr[i7];
                            i = i4;
                            float f = fArr[i7];
                            jArr2 = jArr3;
                            if (i3 == limit) {
                                m.append(truncated);
                                break loop0;
                            }
                            if (i3 != 0) {
                                m.append(separator);
                            }
                            m.append(i8);
                            m.append('=');
                            m.append(f);
                            i3++;
                        } else {
                            jArr2 = jArr3;
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                jArr3 = jArr;
            }
        }
        m.append(postfix);
        return m.toString();
    }

    @JvmOverloads
    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        long[] jArr;
        long[] jArr2;
        int i2;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(charSequence, charSequence2, charSequence3, function2, charSequence2);
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr3[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i3 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i3 << 3) + i7;
                            int i9 = iArr[i8];
                            float f = fArr[i8];
                            if (i4 == i) {
                                m.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                m.append(charSequence);
                            }
                            i2 = i5;
                            Integer valueOf = Integer.valueOf(i9);
                            jArr2 = jArr3;
                            m.append(function2.invoke(valueOf, Float.valueOf(f)));
                            i4++;
                        } else {
                            jArr2 = jArr3;
                            i2 = i5;
                        }
                        j >>= i2;
                        i7++;
                        i5 = i2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                jArr3 = jArr;
            }
            return m.toString();
        }
        m.append(charSequence3);
        return m.toString();
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, @NotNull Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        int i;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(charSequence, charSequence2, charSequence3, function2, charSequence2);
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            int i8 = iArr[i7];
                            float f = fArr[i7];
                            if (i3 == -1) {
                                m.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                m.append(charSequence);
                            }
                            i = i4;
                            m.append(function2.invoke(Integer.valueOf(i8), Float.valueOf(f)));
                            i3++;
                        } else {
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        m.append(charSequence3);
        return m.toString();
    }

    public static /* synthetic */ String joinToString$default(IntFloatMap intFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: joinToString");
            return null;
        }
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return intFloatMap.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        charSequence.getClass();
        charSequence2.getClass();
        function2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            float f = fArr[i5];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function2.invoke(Integer.valueOf(i6), Float.valueOf(f)));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
            return sb.toString();
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        int i;
        charSequence.getClass();
        function2.getClass();
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i2 << 3) + i6;
                            int i8 = iArr[i7];
                            float f = fArr[i7];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            i = i4;
                            sb.append(function2.invoke(Integer.valueOf(i8), Float.valueOf(f)));
                            i3++;
                        } else {
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        i4 = i;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
            return sb.toString();
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function2<? super Integer, ? super Float, ? extends CharSequence> function2) {
        function2.getClass();
        StringBuilder sb = new StringBuilder("");
        int[] iArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            float f = fArr[i5];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(function2.invoke(Integer.valueOf(i6), Float.valueOf(f)));
                            i2++;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
