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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J:\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0018\u001a\u00020\u0011J:\u0010\u0018\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0014H\u0086\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0007J:\u0010\u001a\u001a\u00020\u00042!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0014H\u0080\b¢\u0006\u0002\b\u001eJ\t\u0010\u001f\u001a\u00020\u0014H\u0086\bJ:\u0010\u001f\u001a\u00020\u00142!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010 \u001a\u00020!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020!0\u0013H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010#\u001a\u00020!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b($\u0012\u0004\u0012\u00020!0\u0013H\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010%\u001a\u00020\u0004H\u0016J\u0006\u0010&\u001a\u00020\u0011J\u0006\u0010'\u001a\u00020\u0011J:\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020+H\u0007JT\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020+2\u0014\b\u0004\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020+0\u0013H\u0087\bø\u0001\u0000J\u0006\u00101\u001a\u00020\u0011J\b\u00102\u001a\u00020)H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0018\u0010\f\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b\u0082\u0001\u00013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Landroidx/collection/LongSet;", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", "getElements$annotations", "metadata", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", Languages.ANY, "contains", "count", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "findElementIndex", "findElementIndex$collection", DefaultPreloadManager.METRIC_PATH_FIRST, "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", ViewProps.TRANSFORM, "none", "toString", "Landroidx/collection/MutableLongSet;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,885:1\n256#1,4:886\n226#1,7:890\n237#1,3:898\n240#1,9:902\n260#1:911\n256#1,4:912\n226#1,7:916\n237#1,3:924\n240#1,9:928\n260#1:937\n226#1,7:940\n237#1,3:948\n240#1,9:952\n256#1,4:961\n226#1,7:965\n237#1,3:973\n240#1,9:977\n260#1:986\n256#1,4:987\n226#1,7:991\n237#1,3:999\n240#1,9:1003\n260#1:1012\n256#1,4:1013\n226#1,7:1017\n237#1,3:1025\n240#1,9:1029\n260#1:1038\n426#1:1039\n427#1:1043\n429#1,2:1045\n431#1,3:1048\n434#1:1054\n435#1:1058\n436#1:1060\n437#1,4:1063\n443#1:1068\n444#1,8:1070\n256#1,4:1078\n226#1,7:1082\n237#1,3:1090\n240#1,9:1094\n260#1:1103\n256#1,4:1104\n226#1,7:1108\n237#1,3:1116\n240#1,9:1120\n260#1:1129\n256#1,4:1130\n226#1,7:1134\n237#1,3:1142\n240#1,9:1146\n260#1:1155\n256#1,4:1156\n226#1,7:1160\n237#1,3:1168\n240#1,9:1172\n260#1:1181\n256#1,4:1182\n226#1,7:1186\n237#1,3:1194\n240#1,9:1198\n260#1:1207\n351#1,11:1224\n256#1,4:1235\n226#1,7:1239\n237#1,3:1247\n240#1,2:1251\n362#1,10:1253\n243#1,6:1263\n260#1:1269\n372#1,2:1270\n351#1,11:1272\n256#1,4:1283\n226#1,7:1287\n237#1,3:1295\n240#1,2:1299\n362#1,10:1301\n243#1,6:1311\n260#1:1317\n372#1,2:1318\n351#1,11:1320\n256#1,4:1331\n226#1,7:1335\n237#1,3:1343\n240#1,2:1347\n362#1,10:1349\n243#1,6:1359\n260#1:1365\n372#1,2:1366\n351#1,11:1368\n256#1,4:1379\n226#1,7:1383\n237#1,3:1391\n240#1,2:1395\n362#1,10:1397\n243#1,6:1407\n260#1:1413\n372#1,2:1414\n351#1,11:1416\n256#1,4:1427\n226#1,7:1431\n237#1,3:1439\n240#1,2:1443\n362#1,10:1445\n243#1,6:1455\n260#1:1461\n372#1,2:1462\n1399#2:897\n1270#2:901\n1399#2:923\n1270#2:927\n1399#2:938\n1270#2:939\n1399#2:947\n1270#2:951\n1399#2:972\n1270#2:976\n1399#2:998\n1270#2:1002\n1399#2:1024\n1270#2:1028\n1179#2:1044\n1175#2:1047\n1372#2,3:1051\n1386#2,3:1055\n1312#2:1059\n1303#2:1061\n1297#2:1062\n1309#2:1067\n1393#2:1069\n1399#2:1089\n1270#2:1093\n1399#2:1115\n1270#2:1119\n1399#2:1141\n1270#2:1145\n1399#2:1167\n1270#2:1171\n1399#2:1193\n1270#2:1197\n1179#2:1211\n1175#2:1212\n1372#2,3:1213\n1386#2,3:1216\n1312#2:1219\n1303#2:1220\n1297#2:1221\n1309#2:1222\n1393#2:1223\n1399#2:1246\n1270#2:1250\n1399#2:1294\n1270#2:1298\n1399#2:1342\n1270#2:1346\n1399#2:1390\n1270#2:1394\n1399#2:1438\n1270#2:1442\n881#3,3:1040\n881#3,3:1208\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSet\n*L\n198#1:886,4\n198#1:890,7\n198#1:898,3\n198#1:902,9\n198#1:911\n219#1:912,4\n219#1:916,7\n219#1:924,3\n219#1:928,9\n219#1:937\n259#1:940,7\n259#1:948,3\n259#1:952,9\n270#1:961,4\n270#1:965,7\n270#1:973,3\n270#1:977,9\n270#1:986\n282#1:987,4\n282#1:991,7\n282#1:999,3\n282#1:1003,9\n282#1:1012\n299#1:1013,4\n299#1:1017,7\n299#1:1025,3\n299#1:1029,9\n299#1:1038\n308#1:1039\n308#1:1043\n308#1:1045,2\n308#1:1048,3\n308#1:1054\n308#1:1058\n308#1:1060\n308#1:1063,4\n308#1:1068\n308#1:1070,8\n328#1:1078,4\n328#1:1082,7\n328#1:1090,3\n328#1:1094,9\n328#1:1103\n361#1:1104,4\n361#1:1108,7\n361#1:1116,3\n361#1:1120,9\n361#1:1129\n361#1:1130,4\n361#1:1134,7\n361#1:1142,3\n361#1:1146,9\n361#1:1155\n382#1:1156,4\n382#1:1160,7\n382#1:1168,3\n382#1:1172,9\n382#1:1181\n406#1:1182,4\n406#1:1186,7\n406#1:1194,3\n406#1:1198,9\n406#1:1207\n-1#1:1224,11\n-1#1:1235,4\n-1#1:1239,7\n-1#1:1247,3\n-1#1:1251,2\n-1#1:1253,10\n-1#1:1263,6\n-1#1:1269\n-1#1:1270,2\n-1#1:1272,11\n-1#1:1283,4\n-1#1:1287,7\n-1#1:1295,3\n-1#1:1299,2\n-1#1:1301,10\n-1#1:1311,6\n-1#1:1317\n-1#1:1318,2\n-1#1:1320,11\n-1#1:1331,4\n-1#1:1335,7\n-1#1:1343,3\n-1#1:1347,2\n-1#1:1349,10\n-1#1:1359,6\n-1#1:1365\n-1#1:1366,2\n-1#1:1368,11\n-1#1:1379,4\n-1#1:1383,7\n-1#1:1391,3\n-1#1:1395,2\n-1#1:1397,10\n-1#1:1407,6\n-1#1:1413\n-1#1:1414,2\n-1#1:1416,11\n-1#1:1427,4\n-1#1:1431,7\n-1#1:1439,3\n-1#1:1443,2\n-1#1:1445,10\n-1#1:1455,6\n-1#1:1461\n-1#1:1462,2\n198#1:897\n198#1:901\n219#1:923\n219#1:927\n232#1:938\n239#1:939\n259#1:947\n259#1:951\n270#1:972\n270#1:976\n282#1:998\n282#1:1002\n299#1:1024\n299#1:1028\n308#1:1044\n308#1:1047\n308#1:1051,3\n308#1:1055,3\n308#1:1059\n308#1:1061\n308#1:1062\n308#1:1067\n308#1:1069\n328#1:1089\n328#1:1093\n361#1:1115\n361#1:1119\n361#1:1141\n361#1:1145\n382#1:1167\n382#1:1171\n406#1:1193\n406#1:1197\n427#1:1211\n430#1:1212\n433#1:1213,3\n434#1:1216,3\n435#1:1219\n436#1:1220\n436#1:1221\n440#1:1222\n443#1:1223\n-1#1:1246\n-1#1:1250\n-1#1:1294\n-1#1:1298\n-1#1:1342\n-1#1:1346\n-1#1:1390\n-1#1:1394\n-1#1:1438\n-1#1:1442\n308#1:1040,3\n426#1:1208,3\n*E\n"})
/* loaded from: classes.dex */
public abstract class LongSet {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public long[] elements;

    @JvmField
    @NotNull
    public long[] metadata;

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        long[] jArr = longSet.elements;
        long[] jArr2 = longSet.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j = jArr2[i5];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j & 255) < 128) {
                            long j2 = jArr[(i5 << 3) + i9];
                            if (i6 == i4) {
                                sb.append(charSequence8);
                                break loop0;
                            }
                            if (i6 != 0) {
                                sb.append(charSequence5);
                            }
                            i3 = i7;
                            sb.append((CharSequence) function1.invoke(Long.valueOf(j2)));
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

    public final boolean all(@NotNull Function1<? super Long, Boolean> predicate) {
        predicate.getClass();
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && !predicate.invoke(Long.valueOf(jArr[(i << 3) + i3])).booleanValue()) {
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

    public final boolean any(@NotNull Function1<? super Long, Boolean> predicate) {
        predicate.getClass();
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && predicate.invoke(Long.valueOf(jArr[(i << 3) + i3])).booleanValue()) {
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
    public final boolean contains(long r17) {
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
            long[] r14 = r0.elements
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.contains(long):boolean");
    }

    @IntRange(from = 0)
    public final int count(@NotNull Function1<? super Long, Boolean> predicate) {
        predicate.getClass();
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128 && predicate.invoke(Long.valueOf(jArr[(i << 3) + i4])).booleanValue()) {
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
        if (!(other instanceof LongSet)) {
            return false;
        }
        LongSet longSet = (LongSet) other;
        if (longSet._size != this._size) {
            return false;
        }
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !longSet.contains(jArr[(i << 3) + i3])) {
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

    public final int findElementIndex$collection(long element) {
        int hashCode = Long.hashCode(element) * ScatterMapKt.MurmurHashC1;
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

    public final long first(@NotNull Function1<? super Long, Boolean> predicate) {
        predicate.getClass();
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i3];
                            if (predicate.invoke(Long.valueOf(j2)).booleanValue()) {
                                return j2;
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
        return 0L;
    }

    public final void forEach(@NotNull Function1<? super Long, Unit> block) {
        block.getClass();
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
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
                        block.invoke(Long.valueOf(jArr[(i << 3) + i3]));
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
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr2[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        i2 = Long.hashCode(jArr[(i << 3) + i4]) + i2;
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
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function1<? super Long, ? extends CharSequence> transform) {
        separator.getClass();
        prefix.getClass();
        postfix.getClass();
        truncated.getClass();
        transform.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(Long.valueOf(j2)));
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

    public /* synthetic */ LongSet(DefaultConstructorMarker defaultConstructorMarker) {
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

    public final long first() {
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            return jArr[(i << 3) + i3];
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
        PathKt$$ExternalSyntheticBUOutline0.m("The LongSet is empty");
        return 0L;
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
        int i;
        int i2;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m(separator, prefix, postfix, truncated, prefix);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0: while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            i2 = i3;
                            long j2 = jArr[(i3 << 3) + i6];
                            if (i4 == limit) {
                                m.append(truncated);
                                break loop0;
                            }
                            if (i4 != 0) {
                                m.append(separator);
                            }
                            m.append(j2);
                            i4++;
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i7 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i7;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
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
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull Function1<? super Long, ? extends CharSequence> function1) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i2 << 3) + i5];
                            if (i3 == i) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(Long.valueOf(j2)));
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
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, @NotNull Function1<? super Long, ? extends CharSequence> function1) {
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(Long.valueOf(j2)));
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

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return longSet.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull Function1<? super Long, ? extends CharSequence> function1) {
        charSequence.getClass();
        charSequence2.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(Long.valueOf(j2)));
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
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull Function1<? super Long, ? extends CharSequence> function1) {
        charSequence.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(charSequence);
                            }
                            sb.append(function1.invoke(Long.valueOf(j2)));
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
    public final String joinToString(@NotNull Function1<? super Long, ? extends CharSequence> function1) {
        function1.getClass();
        StringBuilder sb = new StringBuilder("");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(function1.invoke(Long.valueOf(j2)));
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
