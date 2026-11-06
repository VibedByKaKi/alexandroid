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
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J&\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0006\u0010\u001a\u001a\u00020\u0016J&\u0010\u001a\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0011\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0019H\u0086\nJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0004J&\u0010 \u001a\u00020\u00042\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00160\u0018H\u0086\bø\u0001\u0000J\u0013\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0019H\u0001JD\u0010$\u001a\u00020%26\u0010&\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020%0\u0018H\u0086\bø\u0001\u0000J/\u0010)\u001a\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020%0*H\u0081\bø\u0001\u0000J/\u0010,\u001a\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020%0*H\u0086\bø\u0001\u0000J/\u0010-\u001a\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020%0*H\u0086\bø\u0001\u0000J\u0011\u0010.\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0086\u0002J\u0016\u0010/\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u0019J\"\u00101\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001902H\u0086\bø\u0001\u0000J\b\u00103\u001a\u00020\u0004H\u0016J\u0006\u00104\u001a\u00020\u0016J\u0006\u00105\u001a\u00020\u0016J:\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u000209H\u0007Jx\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u00020\u00042\b\b\u0002\u0010=\u001a\u00020928\b\u0004\u0010>\u001a2\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u0002090\u0018H\u0087\bø\u0001\u0000J\u0006\u0010?\u001a\u00020\u0016J\b\u0010@\u001a\u000207H\u0016R\u0018\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0018\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002R\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0018\u0010\u0013\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u0082\u0001\u0001A\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006B"}, d2 = {"Landroidx/collection/FloatFloatMap;", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "getValues$annotations", "all", "", "predicate", "Lkotlin/Function2;", "", Languages.ANY, "contains", "key", "containsKey", "containsValue", "value", "count", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "findKeyIndex", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", MetricsConstants.Method.CACHE_GET, "getOrDefault", "defaultValue", "getOrElse", "Lkotlin/Function0;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", ViewProps.TRANSFORM, "none", "toString", "Landroidx/collection/MutableFloatFloatMap;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1036:1\n361#1,6:1039\n371#1,3:1046\n374#1,9:1050\n361#1,6:1059\n371#1,3:1066\n374#1,9:1070\n361#1,6:1079\n371#1,3:1086\n374#1,9:1090\n389#1,4:1099\n361#1,6:1103\n371#1,3:1110\n374#1,9:1114\n393#1:1123\n389#1,4:1124\n361#1,6:1128\n371#1,3:1135\n374#1,9:1139\n393#1:1148\n389#1,4:1149\n361#1,6:1153\n371#1,3:1160\n374#1,9:1164\n393#1:1173\n404#1,3:1174\n361#1,6:1177\n371#1,3:1184\n374#1,9:1188\n407#1:1197\n389#1,4:1198\n361#1,6:1202\n371#1,3:1209\n374#1,9:1213\n393#1:1222\n389#1,4:1223\n361#1,6:1227\n371#1,3:1234\n374#1,9:1238\n393#1:1247\n389#1,4:1248\n361#1,6:1252\n371#1,3:1259\n374#1,9:1263\n393#1:1272\n389#1,4:1273\n361#1,6:1277\n371#1,3:1284\n374#1,9:1288\n393#1:1297\n389#1,4:1298\n361#1,6:1302\n371#1,3:1309\n374#1,9:1313\n393#1:1322\n389#1,4:1323\n361#1,6:1327\n371#1,3:1334\n374#1,9:1338\n393#1:1347\n486#1,11:1364\n389#1,4:1375\n361#1,6:1379\n371#1,3:1386\n374#1,2:1390\n497#1,10:1392\n377#1,6:1402\n393#1:1408\n507#1,2:1409\n486#1,11:1411\n389#1,4:1422\n361#1,6:1426\n371#1,3:1433\n374#1,2:1437\n497#1,10:1439\n377#1,6:1449\n393#1:1455\n507#1,2:1456\n486#1,11:1458\n389#1,4:1469\n361#1,6:1473\n371#1,3:1480\n374#1,2:1484\n497#1,10:1486\n377#1,6:1496\n393#1:1502\n507#1,2:1503\n486#1,11:1505\n389#1,4:1516\n361#1,6:1520\n371#1,3:1527\n374#1,2:1531\n497#1,10:1533\n377#1,6:1543\n393#1:1549\n507#1,2:1550\n486#1,11:1552\n389#1,4:1563\n361#1,6:1567\n371#1,3:1574\n374#1,2:1578\n497#1,10:1580\n377#1,6:1590\n393#1:1596\n507#1,2:1597\n1399#2:1037\n1270#2:1038\n1399#2:1045\n1270#2:1049\n1399#2:1065\n1270#2:1069\n1399#2:1085\n1270#2:1089\n1399#2:1109\n1270#2:1113\n1399#2:1134\n1270#2:1138\n1399#2:1159\n1270#2:1163\n1399#2:1183\n1270#2:1187\n1399#2:1208\n1270#2:1212\n1399#2:1233\n1270#2:1237\n1399#2:1258\n1270#2:1262\n1399#2:1283\n1270#2:1287\n1399#2:1308\n1270#2:1312\n1399#2:1333\n1270#2:1337\n1179#2:1351\n1175#2:1352\n1372#2,3:1353\n1386#2,3:1356\n1312#2:1359\n1303#2:1360\n1297#2:1361\n1309#2:1362\n1393#2:1363\n1399#2:1385\n1270#2:1389\n1399#2:1432\n1270#2:1436\n1399#2:1479\n1270#2:1483\n1399#2:1526\n1270#2:1530\n1399#2:1573\n1270#2:1577\n882#3,3:1348\n*S KotlinDebug\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n*L\n392#1:1039,6\n392#1:1046,3\n392#1:1050,9\n399#1:1059,6\n399#1:1066,3\n399#1:1070,9\n406#1:1079,6\n406#1:1086,3\n406#1:1090,9\n411#1:1099,4\n411#1:1103,6\n411#1:1110,3\n411#1:1114,9\n411#1:1123\n417#1:1124,4\n417#1:1128,6\n417#1:1135,3\n417#1:1139,9\n417#1:1148\n427#1:1149,4\n427#1:1153,6\n427#1:1160,3\n427#1:1164,9\n427#1:1173\n439#1:1174,3\n439#1:1177,6\n439#1:1184,3\n439#1:1188,9\n439#1:1197\n461#1:1198,4\n461#1:1202,6\n461#1:1209,3\n461#1:1213,9\n461#1:1222\n496#1:1223,4\n496#1:1227,6\n496#1:1234,3\n496#1:1238,9\n496#1:1247\n496#1:1248,4\n496#1:1252,6\n496#1:1259,3\n496#1:1263,9\n496#1:1272\n517#1:1273,4\n517#1:1277,6\n517#1:1284,3\n517#1:1288,9\n517#1:1297\n541#1:1298,4\n541#1:1302,6\n541#1:1309,3\n541#1:1313,9\n541#1:1322\n563#1:1323,4\n563#1:1327,6\n563#1:1334,3\n563#1:1338,9\n563#1:1347\n-1#1:1364,11\n-1#1:1375,4\n-1#1:1379,6\n-1#1:1386,3\n-1#1:1390,2\n-1#1:1392,10\n-1#1:1402,6\n-1#1:1408\n-1#1:1409,2\n-1#1:1411,11\n-1#1:1422,4\n-1#1:1426,6\n-1#1:1433,3\n-1#1:1437,2\n-1#1:1439,10\n-1#1:1449,6\n-1#1:1455\n-1#1:1456,2\n-1#1:1458,11\n-1#1:1469,4\n-1#1:1473,6\n-1#1:1480,3\n-1#1:1484,2\n-1#1:1486,10\n-1#1:1496,6\n-1#1:1502\n-1#1:1503,2\n-1#1:1505,11\n-1#1:1516,4\n-1#1:1520,6\n-1#1:1527,3\n-1#1:1531,2\n-1#1:1533,10\n-1#1:1543,6\n-1#1:1549\n-1#1:1550,2\n-1#1:1552,11\n-1#1:1563,4\n-1#1:1567,6\n-1#1:1574,3\n-1#1:1578,2\n-1#1:1580,10\n-1#1:1590,6\n-1#1:1596\n-1#1:1597,2\n366#1:1037\n373#1:1038\n392#1:1045\n392#1:1049\n399#1:1065\n399#1:1069\n406#1:1085\n406#1:1089\n411#1:1109\n411#1:1113\n417#1:1134\n417#1:1138\n427#1:1159\n427#1:1163\n439#1:1183\n439#1:1187\n461#1:1208\n461#1:1212\n496#1:1233\n496#1:1237\n496#1:1258\n496#1:1262\n517#1:1283\n517#1:1287\n541#1:1308\n541#1:1312\n563#1:1333\n563#1:1337\n583#1:1351\n586#1:1352\n590#1:1353,3\n591#1:1356,3\n592#1:1359\n593#1:1360\n593#1:1361\n597#1:1362\n600#1:1363\n-1#1:1385\n-1#1:1389\n-1#1:1432\n-1#1:1436\n-1#1:1479\n-1#1:1483\n-1#1:1526\n-1#1:1530\n-1#1:1573\n-1#1:1577\n582#1:1348,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatFloatMap {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public float[] keys;

    @JvmField
    @NotNull
    public long[] metadata;

    @JvmField
    @NotNull
    public float[] values;

    private FloatFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = FloatSetKt.getEmptyFloatArray();
    }

    public static /* synthetic */ String joinToString$default(FloatFloatMap floatFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 function2, int i2, Object obj) {
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
        float[] fArr = floatFloatMap.keys;
        float[] fArr2 = floatFloatMap.values;
        long[] jArr3 = floatFloatMap.metadata;
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
                            float f = fArr[i11];
                            float f2 = fArr2[i11];
                            if (i6 == i4) {
                                m.append(charSequence8);
                                break loop0;
                            }
                            if (i6 != 0) {
                                m.append(charSequence5);
                            }
                            i3 = i8;
                            Float valueOf = Float.valueOf(f);
                            jArr2 = jArr3;
                            m.append((CharSequence) function2.invoke(valueOf, Float.valueOf(f2)));
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

    public final boolean all(@NotNull Function2<? super Float, ? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        if (!predicate.invoke(Float.valueOf(fArr[i4]), Float.valueOf(fArr2[i4])).booleanValue()) {
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

    public final boolean any(@NotNull Function2<? super Float, ? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            if (predicate.invoke(Float.valueOf(fArr[i4]), Float.valueOf(fArr2[i4])).booleanValue()) {
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

    public final boolean contains(float key) {
        return containsKey(key);
    }

    public final boolean containsKey(float key) {
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

    public final int count(@NotNull Function2<? super Float, ? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        if (predicate.invoke(Float.valueOf(fArr[i5]), Float.valueOf(fArr2[i5])).booleanValue()) {
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
        if (!(other instanceof FloatFloatMap)) {
            return false;
        }
        FloatFloatMap floatFloatMap = (FloatFloatMap) other;
        if (floatFloatMap.get_size() != get_size()) {
            return false;
        }
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f = fArr[i4];
                            float f2 = fArr2[i4];
                            int findKeyIndex = floatFloatMap.findKeyIndex(f);
                            if (findKeyIndex < 0 || f2 != floatFloatMap.values[findKeyIndex]) {
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
    public final int findKeyIndex(float key) {
        int hashCode = Float.hashCode(key) * ScatterMapKt.MurmurHashC1;
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

    public final void forEach(@NotNull Function2<? super Float, ? super Float, Unit> block) {
        block.getClass();
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        block.invoke(Float.valueOf(fArr[i4]), Float.valueOf(fArr2[i4]));
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

    public final void forEachKey(@NotNull Function1<? super Float, Unit> block) {
        block.getClass();
        float[] fArr = this.keys;
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

    public final float get(float key) {
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

    public final float getOrDefault(float key, float defaultValue) {
        int findKeyIndex = findKeyIndex(key);
        return findKeyIndex >= 0 ? this.values[findKeyIndex] : defaultValue;
    }

    public final float getOrElse(float key, @NotNull Function0<Float> defaultValue) {
        defaultValue.getClass();
        int findKeyIndex = findKeyIndex(key);
        return findKeyIndex < 0 ? defaultValue.invoke().floatValue() : this.values[findKeyIndex];
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        float f = fArr[i5];
                        i2 += Float.hashCode(fArr2[i5]) ^ Float.hashCode(f);
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
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function2<? super Float, ? super Float, ? extends CharSequence> transform) {
        long[] jArr;
        long[] jArr2;
        int i;
        CharSequence charSequence = separator;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(charSequence, prefix, postfix, truncated, transform);
        m.append(prefix);
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f = fArr[i7];
                            float f2 = fArr2[i7];
                            i = i4;
                            if (i3 == limit) {
                                m.append(truncated);
                                break loop0;
                            }
                            if (i3 != 0) {
                                m.append(charSequence);
                            }
                            jArr2 = jArr3;
                            m.append(transform.invoke(Float.valueOf(f), Float.valueOf(f2)));
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
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f = fArr[i5];
                            float f2 = fArr2[i5];
                            sb.append(f);
                            sb.append("=");
                            sb.append(f2);
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

    public /* synthetic */ FloatFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
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
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f = fArr[i7];
                            i = i4;
                            float f2 = fArr2[i7];
                            jArr2 = jArr3;
                            if (i3 == limit) {
                                m.append(truncated);
                                break loop0;
                            }
                            if (i3 != 0) {
                                m.append(separator);
                            }
                            m.append(f);
                            m.append('=');
                            m.append(f2);
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
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull Function2<? super Float, ? super Float, ? extends CharSequence> function2) {
        long[] jArr;
        long[] jArr2;
        int i2;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(charSequence, charSequence2, charSequence3, function2, charSequence2);
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f = fArr[i8];
                            float f2 = fArr2[i8];
                            if (i4 == i) {
                                m.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                m.append(charSequence);
                            }
                            i2 = i5;
                            Float valueOf = Float.valueOf(f);
                            jArr2 = jArr3;
                            m.append(function2.invoke(valueOf, Float.valueOf(f2)));
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
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, @NotNull Function2<? super Float, ? super Float, ? extends CharSequence> function2) {
        int i;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(charSequence, charSequence2, charSequence3, function2, charSequence2);
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f = fArr[i7];
                            float f2 = fArr2[i7];
                            if (i3 == -1) {
                                m.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                m.append(charSequence);
                            }
                            i = i4;
                            m.append(function2.invoke(Float.valueOf(f), Float.valueOf(f2)));
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

    public static /* synthetic */ String joinToString$default(FloatFloatMap floatFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return floatFloatMap.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull Function2<? super Float, ? super Float, ? extends CharSequence> function2) {
        charSequence.getClass();
        charSequence2.getClass();
        function2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f = fArr[i5];
                            float f2 = fArr2[i5];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function2.invoke(Float.valueOf(f), Float.valueOf(f2)));
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
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull Function2<? super Float, ? super Float, ? extends CharSequence> function2) {
        int i;
        charSequence.getClass();
        function2.getClass();
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f = fArr[i7];
                            float f2 = fArr2[i7];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            i = i4;
                            sb.append(function2.invoke(Float.valueOf(f), Float.valueOf(f2)));
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
    public final String joinToString(@NotNull Function2<? super Float, ? super Float, ? extends CharSequence> function2) {
        function2.getClass();
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                            float f = fArr[i5];
                            float f2 = fArr2[i5];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(function2.invoke(Float.valueOf(f), Float.valueOf(f2)));
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
