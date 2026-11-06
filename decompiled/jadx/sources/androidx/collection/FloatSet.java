package androidx.collection;

import androidx.annotation.IntRange;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.facebook.react.uimanager.ViewProps;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J:\u0010\u0011\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0019\u001a\u00020\u0012J:\u0010\u0019\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0015H\u0086\u0002J\b\u0010\u001b\u001a\u00020\u0004H\u0007J:\u0010\u001b\u001a\u00020\u00042!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u0014H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0015H\u0080\b¢\u0006\u0002\b\u001fJ\t\u0010 \u001a\u00020\u0015H\u0086\bJ:\u0010 \u001a\u00020\u00152!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010!\u001a\u00020\"2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\"0\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010$\u001a\u00020\"2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\"0\u0014H\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010&\u001a\u00020\u0004H\u0016J\u0006\u0010'\u001a\u00020\u0012J\u0006\u0010(\u001a\u00020\u0012J:\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020,H\u0007JT\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020,2\b\b\u0002\u0010.\u001a\u00020,2\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020,2\u0014\b\u0004\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020,0\u0014H\u0087\bø\u0001\u0000J\u0006\u00102\u001a\u00020\u0012J\b\u00103\u001a\u00020*H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0018\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0001\u00014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Landroidx/collection/FloatSet;", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", "getElements$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", Languages.ANY, "contains", "count", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "findElementIndex", "findElementIndex$collection", DefaultPreloadManager.METRIC_PATH_FIRST, "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", ViewProps.TRANSFORM, "none", "toString", "Landroidx/collection/MutableFloatSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,886:1\n257#1,4:887\n227#1,7:891\n238#1,3:899\n241#1,9:903\n261#1:912\n257#1,4:913\n227#1,7:917\n238#1,3:925\n241#1,9:929\n261#1:938\n227#1,7:941\n238#1,3:949\n241#1,9:953\n257#1,4:962\n227#1,7:966\n238#1,3:974\n241#1,9:978\n261#1:987\n257#1,4:988\n227#1,7:992\n238#1,3:1000\n241#1,9:1004\n261#1:1013\n257#1,4:1014\n227#1,7:1018\n238#1,3:1026\n241#1,9:1030\n261#1:1039\n427#1:1040\n428#1:1044\n430#1,2:1046\n432#1,3:1049\n435#1:1055\n436#1:1059\n437#1:1061\n438#1,4:1064\n444#1:1069\n445#1,8:1071\n257#1,4:1079\n227#1,7:1083\n238#1,3:1091\n241#1,9:1095\n261#1:1104\n257#1,4:1105\n227#1,7:1109\n238#1,3:1117\n241#1,9:1121\n261#1:1130\n257#1,4:1131\n227#1,7:1135\n238#1,3:1143\n241#1,9:1147\n261#1:1156\n257#1,4:1157\n227#1,7:1161\n238#1,3:1169\n241#1,9:1173\n261#1:1182\n257#1,4:1183\n227#1,7:1187\n238#1,3:1195\n241#1,9:1199\n261#1:1208\n352#1,11:1225\n257#1,4:1236\n227#1,7:1240\n238#1,3:1248\n241#1,2:1252\n363#1,10:1254\n244#1,6:1264\n261#1:1270\n373#1,2:1271\n352#1,11:1273\n257#1,4:1284\n227#1,7:1288\n238#1,3:1296\n241#1,2:1300\n363#1,10:1302\n244#1,6:1312\n261#1:1318\n373#1,2:1319\n352#1,11:1321\n257#1,4:1332\n227#1,7:1336\n238#1,3:1344\n241#1,2:1348\n363#1,10:1350\n244#1,6:1360\n261#1:1366\n373#1,2:1367\n352#1,11:1369\n257#1,4:1380\n227#1,7:1384\n238#1,3:1392\n241#1,2:1396\n363#1,10:1398\n244#1,6:1408\n261#1:1414\n373#1,2:1415\n352#1,11:1417\n257#1,4:1428\n227#1,7:1432\n238#1,3:1440\n241#1,2:1444\n363#1,10:1446\n244#1,6:1456\n261#1:1462\n373#1,2:1463\n1399#2:898\n1270#2:902\n1399#2:924\n1270#2:928\n1399#2:939\n1270#2:940\n1399#2:948\n1270#2:952\n1399#2:973\n1270#2:977\n1399#2:999\n1270#2:1003\n1399#2:1025\n1270#2:1029\n1179#2:1045\n1175#2:1048\n1372#2,3:1052\n1386#2,3:1056\n1312#2:1060\n1303#2:1062\n1297#2:1063\n1309#2:1068\n1393#2:1070\n1399#2:1090\n1270#2:1094\n1399#2:1116\n1270#2:1120\n1399#2:1142\n1270#2:1146\n1399#2:1168\n1270#2:1172\n1399#2:1194\n1270#2:1198\n1179#2:1212\n1175#2:1213\n1372#2,3:1214\n1386#2,3:1217\n1312#2:1220\n1303#2:1221\n1297#2:1222\n1309#2:1223\n1393#2:1224\n1399#2:1247\n1270#2:1251\n1399#2:1295\n1270#2:1299\n1399#2:1343\n1270#2:1347\n1399#2:1391\n1270#2:1395\n1399#2:1439\n1270#2:1443\n882#3,3:1041\n882#3,3:1209\n*S KotlinDebug\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSet\n*L\n199#1:887,4\n199#1:891,7\n199#1:899,3\n199#1:903,9\n199#1:912\n220#1:913,4\n220#1:917,7\n220#1:925,3\n220#1:929,9\n220#1:938\n260#1:941,7\n260#1:949,3\n260#1:953,9\n271#1:962,4\n271#1:966,7\n271#1:974,3\n271#1:978,9\n271#1:987\n283#1:988,4\n283#1:992,7\n283#1:1000,3\n283#1:1004,9\n283#1:1013\n300#1:1014,4\n300#1:1018,7\n300#1:1026,3\n300#1:1030,9\n300#1:1039\n309#1:1040\n309#1:1044\n309#1:1046,2\n309#1:1049,3\n309#1:1055\n309#1:1059\n309#1:1061\n309#1:1064,4\n309#1:1069\n309#1:1071,8\n329#1:1079,4\n329#1:1083,7\n329#1:1091,3\n329#1:1095,9\n329#1:1104\n362#1:1105,4\n362#1:1109,7\n362#1:1117,3\n362#1:1121,9\n362#1:1130\n362#1:1131,4\n362#1:1135,7\n362#1:1143,3\n362#1:1147,9\n362#1:1156\n383#1:1157,4\n383#1:1161,7\n383#1:1169,3\n383#1:1173,9\n383#1:1182\n407#1:1183,4\n407#1:1187,7\n407#1:1195,3\n407#1:1199,9\n407#1:1208\n-1#1:1225,11\n-1#1:1236,4\n-1#1:1240,7\n-1#1:1248,3\n-1#1:1252,2\n-1#1:1254,10\n-1#1:1264,6\n-1#1:1270\n-1#1:1271,2\n-1#1:1273,11\n-1#1:1284,4\n-1#1:1288,7\n-1#1:1296,3\n-1#1:1300,2\n-1#1:1302,10\n-1#1:1312,6\n-1#1:1318\n-1#1:1319,2\n-1#1:1321,11\n-1#1:1332,4\n-1#1:1336,7\n-1#1:1344,3\n-1#1:1348,2\n-1#1:1350,10\n-1#1:1360,6\n-1#1:1366\n-1#1:1367,2\n-1#1:1369,11\n-1#1:1380,4\n-1#1:1384,7\n-1#1:1392,3\n-1#1:1396,2\n-1#1:1398,10\n-1#1:1408,6\n-1#1:1414\n-1#1:1415,2\n-1#1:1417,11\n-1#1:1428,4\n-1#1:1432,7\n-1#1:1440,3\n-1#1:1444,2\n-1#1:1446,10\n-1#1:1456,6\n-1#1:1462\n-1#1:1463,2\n199#1:898\n199#1:902\n220#1:924\n220#1:928\n233#1:939\n240#1:940\n260#1:948\n260#1:952\n271#1:973\n271#1:977\n283#1:999\n283#1:1003\n300#1:1025\n300#1:1029\n309#1:1045\n309#1:1048\n309#1:1052,3\n309#1:1056,3\n309#1:1060\n309#1:1062\n309#1:1063\n309#1:1068\n309#1:1070\n329#1:1090\n329#1:1094\n362#1:1116\n362#1:1120\n362#1:1142\n362#1:1146\n383#1:1168\n383#1:1172\n407#1:1194\n407#1:1198\n428#1:1212\n431#1:1213\n434#1:1214,3\n435#1:1217,3\n436#1:1220\n437#1:1221\n437#1:1222\n441#1:1223\n444#1:1224\n-1#1:1247\n-1#1:1251\n-1#1:1295\n-1#1:1299\n-1#1:1343\n-1#1:1347\n-1#1:1391\n-1#1:1395\n-1#1:1439\n-1#1:1443\n309#1:1041,3\n427#1:1209,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatSet {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public float[] elements;

    @JvmField
    @NotNull
    public long[] metadata;

    private FloatSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = FloatSetKt.getEmptyFloatArray();
    }

    public static /* synthetic */ String joinToString$default(FloatSet floatSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        charSequence5.getClass();
        charSequence6.getClass();
        charSequence7.getClass();
        charSequence8.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence6);
        float[] fArr = floatSet.elements;
        long[] jArr = floatSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j = jArr[i5];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j & 255) < 128) {
                            float f = fArr[(i5 << 3) + i9];
                            if (i6 == i4) {
                                sb.append(charSequence8);
                                break loop0;
                            }
                            if (i6 != 0) {
                                sb.append(charSequence5);
                            }
                            i3 = i7;
                            sb.append((CharSequence) function1.invoke(Float.valueOf(f)));
                            i6++;
                        } else {
                            i3 = i7;
                        }
                        j >>= i3;
                        i9++;
                        i7 = i3;
                    }
                    if (i8 != i7) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
            return sb.toString();
        }
        sb.append(charSequence7);
        return sb.toString();
    }

    public final boolean all(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.elements;
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
                    if ((255 & j) < 128 && !predicate.invoke(Float.valueOf(fArr[(i << 3) + i3])).booleanValue()) {
                        return false;
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

    public final boolean any(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && predicate.invoke(Float.valueOf(fArr[(i << 3) + i3])).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean contains(float r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Float.hashCode(r17)
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
            float[] r14 = r0.elements
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
            if (r6 == 0) goto L6c
            r10 = -1
        L68:
            if (r10 < 0) goto L6b
            return r11
        L6b:
            return r4
        L6c:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.contains(float):boolean");
    }

    @IntRange(from = 0)
    public final int count(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.elements;
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
                    if ((255 & j) < 128 && predicate.invoke(Float.valueOf(fArr[(i << 3) + i4])).booleanValue()) {
                        i2++;
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
        if (!(other instanceof FloatSet)) {
            return false;
        }
        FloatSet floatSet = (FloatSet) other;
        if (floatSet._size != this._size) {
            return false;
        }
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !floatSet.contains(fArr[(i << 3) + i3])) {
                            return false;
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
        return true;
    }

    public final int findElementIndex$collection(float element) {
        int hashCode = Float.hashCode(element) * ScatterMapKt.MurmurHashC1;
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
                if (this.elements[numberOfTrailingZeros] == element) {
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

    public final float first(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.elements;
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
                            float f = fArr[(i << 3) + i3];
                            if (predicate.invoke(Float.valueOf(f)).booleanValue()) {
                                return f;
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
        PathKt$$ExternalSyntheticBUOutline0.m("Could not find a match");
        return 0.0f;
    }

    public final void forEach(@NotNull Function1<? super Float, Unit> block) {
        block.getClass();
        float[] fArr = this.elements;
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

    @PublishedApi
    public final void forEachIndex(@NotNull Function1<? super Integer, Unit> block) {
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

    @IntRange(from = 0)
    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.elements;
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
                        i2 = Float.hashCode(fArr[(i << 3) + i4]) + i2;
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
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function1<? super Float, ? extends CharSequence> transform) {
        separator.getClass();
        prefix.getClass();
        postfix.getClass();
        truncated.getClass();
        transform.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        float[] fArr = this.elements;
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
                            float f = fArr[(i << 3) + i4];
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(Float.valueOf(f)));
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
        sb.append(postfix);
        return sb.toString();
    }

    public final boolean none() {
        return this._size == 0;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, MarkdownConstants.LEFT_BRACKET, MarkdownConstants.RIGHT_BRACKET, 0, null, 25, null);
    }

    public /* synthetic */ FloatSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @PublishedApi
    public static /* synthetic */ void getElements$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    public final boolean any() {
        return this._size != 0;
    }

    @IntRange(from = 0)
    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final float first() {
        float[] fArr = this.elements;
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
                            return fArr[(i << 3) + i3];
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
        PathKt$$ExternalSyntheticBUOutline0.m("The FloatSet is empty");
        return 0.0f;
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
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(separator, prefix, postfix, truncated, prefix);
        float[] fArr = this.elements;
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
                            float f = fArr[(i << 3) + i4];
                            if (i2 == limit) {
                                m.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                m.append(separator);
                            }
                            m.append(f);
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
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull Function1<? super Float, ? extends CharSequence> function1) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            float f = fArr[(i2 << 3) + i5];
                            if (i3 == i) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(Float.valueOf(f)));
                            i3++;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
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
        sb.append(charSequence3);
        return sb.toString();
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, @NotNull Function1<? super Float, ? extends CharSequence> function1) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.elements;
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
                            float f = fArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(Float.valueOf(f)));
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
        sb.append(charSequence3);
        return sb.toString();
    }

    public static /* synthetic */ String joinToString$default(FloatSet floatSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return floatSet.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull Function1<? super Float, ? extends CharSequence> function1) {
        charSequence.getClass();
        charSequence2.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.elements;
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
                            float f = fArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(Float.valueOf(f)));
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

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull Function1<? super Float, ? extends CharSequence> function1) {
        charSequence.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.elements;
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
                            float f = fArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(Float.valueOf(f)));
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

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function1<? super Float, ? extends CharSequence> function1) {
        function1.getClass();
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.elements;
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
                            float f = fArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(function1.invoke(Float.valueOf(f)));
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
