package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.metrics.MetricsConstants;
import com.facebook.react.uimanager.ViewProps;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0014\u001a\u00020\u0015H\u0086\bJ:\u0010\u0014\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J$\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u0003H\u0007J\u0011\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0018H\u0086\u0002J\u000e\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0000J\t\u0010\"\u001a\u00020\u0003H\u0086\bJ:\u0010\"\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0010\u0010#\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020\u0003J9\u0010%\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020\u00032!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00180\u0017H\u0086\bø\u0001\u0000J\u0013\u0010'\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010)\u001a\u00020\u0018J:\u0010)\u001a\u00020\u00182!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001Jb\u0010*\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+26\u0010-\u001a2\u0012\u0013\u0012\u0011H+¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H+0.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00100Jw\u00101\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+2K\u0010-\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0013\u0012\u0011H+¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(/\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H+02H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00103Jb\u00104\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+26\u0010-\u001a2\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u0011H+¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(/\u0012\u0004\u0012\u0002H+0.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00100Jw\u00105\u001a\u0002H+\"\u0004\b\u0000\u0010+2\u0006\u0010,\u001a\u0002H+2K\u0010-\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u0011H+¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(/\u0012\u0004\u0012\u0002H+02H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00103J:\u00106\u001a\u0002072!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002070\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u00109\u001a\u00020726\u00108\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002070.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010:\u001a\u0002072!\u00108\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002070\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010;\u001a\u00020726\u00108\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002070.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010<\u001a\u00020\u00182\b\b\u0001\u0010$\u001a\u00020\u0003H\u0086\u0002J\b\u0010=\u001a\u00020\u0003H\u0016J\u000e\u0010>\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0018J:\u0010?\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010@\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\t\u0010A\u001a\u00020\u0015H\u0086\bJ\t\u0010B\u001a\u00020\u0015H\u0086\bJ:\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020F2\b\b\u0002\u0010H\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020FH\u0007JT\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020F2\b\b\u0002\u0010G\u001a\u00020F2\b\b\u0002\u0010H\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020F2\u0014\b\u0004\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020F0\u0017H\u0087\bø\u0001\u0000J\u0006\u0010L\u001a\u00020\u0018J:\u0010L\u001a\u00020\u00182!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010M\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0018J\t\u0010N\u001a\u00020\u0015H\u0086\bJ:\u0010O\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010P\u001a\u00020DH\u0016R\u0018\u0010\u0005\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0082\u0001\u0001Q\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006R"}, d2 = {"Landroidx/collection/FloatList;", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", Languages.ANY, "", "predicate", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "element", "binarySearch", "fromIndex", "toIndex", "contains", "containsAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "count", "elementAt", "index", "elementAtOrElse", "defaultValue", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, DefaultPreloadManager.METRIC_PATH_FIRST, "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", MetricsConstants.Method.CACHE_GET, "hashCode", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", ViewProps.TRANSFORM, "last", "lastIndexOf", "none", "reversedAny", "toString", "Landroidx/collection/MutableFloatList;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,976:1\n365#1:977\n368#1:978\n237#1,6:979\n265#1,6:985\n237#1,6:991\n74#1:997\n237#1,6:998\n365#1:1004\n237#1,6:1005\n237#1,6:1011\n251#1,6:1017\n265#1,6:1023\n279#1,6:1029\n251#1,6:1035\n251#1,6:1041\n279#1,6:1047\n365#1:1053\n70#1:1054\n265#1,6:1055\n279#1,6:1061\n65#1:1067\n251#1,6:1068\n251#1,6:1074\n237#1,6:1080\n74#1:1086\n486#1,10:1087\n251#1,4:1097\n496#1,9:1101\n256#1:1110\n505#1,2:1111\n486#1,10:1113\n251#1,4:1123\n496#1,9:1127\n256#1:1136\n505#1,2:1137\n486#1,10:1139\n251#1,4:1149\n496#1,9:1153\n256#1:1162\n505#1,2:1163\n486#1,10:1165\n251#1,4:1175\n496#1,9:1179\n256#1:1188\n505#1,2:1189\n486#1,10:1191\n251#1,4:1201\n496#1,9:1205\n256#1:1214\n505#1,2:1215\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatList\n*L\n78#1:977\n83#1:978\n89#1:979,6\n103#1:985,6\n113#1:991,6\n126#1:997\n143#1:998,6\n152#1:1004\n166#1:1005,6\n182#1:1011,6\n196#1:1017,6\n212#1:1023,6\n226#1:1029,6\n328#1:1035,6\n342#1:1041,6\n356#1:1047,6\n375#1:1053\n378#1:1054\n389#1:1055,6\n402#1:1061,6\n424#1:1067\n464#1:1068,6\n495#1:1074,6\n511#1:1080,6\n524#1:1086\n-1#1:1087,10\n-1#1:1097,4\n-1#1:1101,9\n-1#1:1110\n-1#1:1111,2\n-1#1:1113,10\n-1#1:1123,4\n-1#1:1127,9\n-1#1:1136\n-1#1:1137,2\n-1#1:1139,10\n-1#1:1149,4\n-1#1:1153,9\n-1#1:1162\n-1#1:1163,2\n-1#1:1165,10\n-1#1:1175,4\n-1#1:1179,9\n-1#1:1188\n-1#1:1189,2\n-1#1:1191,10\n-1#1:1201,4\n-1#1:1205,9\n-1#1:1214\n-1#1:1215,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class FloatList {

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public float[] content;

    private FloatList(int i) {
        this.content = i == 0 ? FloatSetKt.getEmptyFloatArray() : new float[i];
    }

    public static /* synthetic */ int binarySearch$default(FloatList floatList, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: binarySearch");
            return 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = floatList._size;
        }
        return floatList.binarySearch(i, i2, i3);
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = floatList.content;
        int i3 = floatList._size;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                sb.append(charSequence3);
                break;
            }
            float f = fArr[i4];
            if (i4 == i) {
                sb.append(charSequence4);
                break;
            }
            if (i4 != 0) {
                sb.append(charSequence);
            }
            sb.append((CharSequence) function1.invoke(Float.valueOf(f)));
            i4++;
        }
        return sb.toString();
    }

    public final boolean any(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (predicate.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @JvmOverloads
    public final int binarySearch(int element, int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= toIndex || toIndex > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i = toIndex - 1;
        while (fromIndex <= i) {
            int i2 = (fromIndex + i) >>> 1;
            float f = this.content[i2];
            float f2 = element;
            if (f < f2) {
                fromIndex = i2 + 1;
            } else {
                if (f <= f2) {
                    return i2;
                }
                i = i2 - 1;
            }
        }
        return -(fromIndex + 1);
    }

    public final boolean contains(float element) {
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] == element) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(@NotNull FloatList elements) {
        elements.getClass();
        IntRange until = RangesKt.until(0, elements._size);
        int first = until.getFirst();
        int last = until.getLast();
        if (first > last) {
            return true;
        }
        while (contains(elements.get(first))) {
            if (first == last) {
                return true;
            }
            first++;
        }
        return false;
    }

    public final int count(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (predicate.invoke(Float.valueOf(fArr[i3])).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    public final float elementAt(@androidx.annotation.IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    public final float elementAtOrElse(@androidx.annotation.IntRange(from = 0) int index, @NotNull Function1<? super Integer, Float> defaultValue) {
        defaultValue.getClass();
        return (index < 0 || index >= this._size) ? defaultValue.invoke(Integer.valueOf(index)).floatValue() : this.content[index];
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof FloatList) {
            FloatList floatList = (FloatList) other;
            int i = floatList._size;
            int i2 = this._size;
            if (i == i2) {
                float[] fArr = this.content;
                float[] fArr2 = floatList.content;
                IntRange until = RangesKt.until(0, i2);
                int first = until.getFirst();
                int last = until.getLast();
                if (first > last) {
                    return true;
                }
                while (fArr[first] == fArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final float first(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            float f = fArr[i2];
            if (predicate.invoke(Float.valueOf(f)).booleanValue()) {
                return f;
            }
        }
        PathKt$$ExternalSyntheticBUOutline0.m("FloatList contains no element matching the predicate.");
        return 0.0f;
    }

    public final <R> R fold(R initial, @NotNull Function2<? super R, ? super Float, ? extends R> operation) {
        operation.getClass();
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            initial = operation.invoke(initial, Float.valueOf(fArr[i2]));
        }
        return initial;
    }

    public final <R> R foldIndexed(R initial, @NotNull Function3<? super Integer, ? super R, ? super Float, ? extends R> operation) {
        operation.getClass();
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            R r = initial;
            initial = operation.invoke(Integer.valueOf(i2), r, Float.valueOf(fArr[i2]));
        }
        return initial;
    }

    public final <R> R foldRight(R initial, @NotNull Function2<? super Float, ? super R, ? extends R> operation) {
        operation.getClass();
        float[] fArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = operation.invoke(Float.valueOf(fArr[i]), initial);
        }
    }

    public final <R> R foldRightIndexed(R initial, @NotNull Function3<? super Integer, ? super Float, ? super R, ? extends R> operation) {
        operation.getClass();
        float[] fArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return initial;
            }
            initial = operation.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]), initial);
        }
    }

    public final void forEach(@NotNull Function1<? super Float, Unit> block) {
        block.getClass();
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(Float.valueOf(fArr[i2]));
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super Float, Unit> block) {
        block.getClass();
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            block.invoke(Integer.valueOf(i2), Float.valueOf(fArr[i2]));
        }
    }

    public final void forEachReversed(@NotNull Function1<? super Float, Unit> block) {
        block.getClass();
        float[] fArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Float.valueOf(fArr[i]));
            }
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super Float, Unit> block) {
        block.getClass();
        float[] fArr = this.content;
        int i = this._size;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            } else {
                block.invoke(Integer.valueOf(i), Float.valueOf(fArr[i]));
            }
        }
    }

    public final float get(@androidx.annotation.IntRange(from = 0) int index) {
        if (index < 0 || index >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.content[index];
    }

    @NotNull
    public final IntRange getIndices() {
        return RangesKt.until(0, this._size);
    }

    @androidx.annotation.IntRange(from = -1)
    public final int getLastIndex() {
        return this._size - 1;
    }

    @androidx.annotation.IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.content;
        int i = this._size;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.hashCode(fArr[i3]) * 31;
        }
        return i2;
    }

    public final int indexOf(float element) {
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (element == fArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.content;
        int i = this._size;
        for (int i2 = 0; i2 < i; i2++) {
            if (predicate.invoke(Float.valueOf(fArr[i2])).booleanValue()) {
                return i2;
            }
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!predicate.invoke(Float.valueOf(fArr[i])).booleanValue());
        return i;
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
        float[] fArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append(postfix);
                break;
            }
            float f = fArr[i2];
            if (i2 == limit) {
                sb.append(truncated);
                break;
            }
            if (i2 != 0) {
                sb.append(separator);
            }
            sb.append(transform.invoke(Float.valueOf(f)));
            i2++;
        }
        return sb.toString();
    }

    public final float last(@NotNull Function1<? super Float, Boolean> predicate) {
        float f;
        predicate.getClass();
        float[] fArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                PathKt$$ExternalSyntheticBUOutline0.m("FloatList contains no element matching the predicate.");
                return 0.0f;
            }
            f = fArr[i];
        } while (!predicate.invoke(Float.valueOf(f)).booleanValue());
        return f;
    }

    public final int lastIndexOf(float element) {
        float[] fArr = this.content;
        int i = this._size;
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (fArr[i] != element);
        return i;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean reversedAny(@NotNull Function1<? super Float, Boolean> predicate) {
        predicate.getClass();
        float[] fArr = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (predicate.invoke(Float.valueOf(fArr[i])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, MarkdownConstants.LEFT_BRACKET, MarkdownConstants.RIGHT_BRACKET, 0, null, 25, null);
    }

    public /* synthetic */ FloatList(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void get_size$annotations() {
    }

    public final boolean any() {
        return this._size != 0;
    }

    /* renamed from: count, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final float first() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("FloatList is empty.");
        }
        return this.content[0];
    }

    public final float last() {
        if (this._size == 0) {
            RuntimeHelpersKt.throwNoSuchElementException("FloatList is empty.");
        }
        return this.content[this._size - 1];
    }

    @JvmOverloads
    public final int binarySearch(int i, int i2) {
        return binarySearch$default(this, i, i2, 0, 4, null);
    }

    @JvmOverloads
    public final int binarySearch(int i) {
        return binarySearch$default(this, i, 0, 0, 6, null);
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
        float[] fArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == limit) {
                    m.append(truncated);
                    break;
                }
                if (i2 != 0) {
                    m.append(separator);
                }
                m.append(f);
                i2++;
            } else {
                m.append(postfix);
                break;
            }
        }
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
        float[] fArr = this.content;
        int i2 = this._size;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                float f = fArr[i3];
                if (i3 == i) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i3 != 0) {
                    sb.append(charSequence);
                }
                sb.append(function1.invoke(Float.valueOf(f)));
                i3++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
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
        float[] fArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(function1.invoke(Float.valueOf(f)));
                i2++;
            } else {
                sb.append(charSequence3);
                break;
            }
        }
        return sb.toString();
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull Function1<? super Float, ? extends CharSequence> function1) {
        charSequence.getClass();
        charSequence2.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence2);
        float[] fArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(function1.invoke(Float.valueOf(f)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ String joinToString$default(FloatList floatList, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
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
        return floatList.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence charSequence, @NotNull Function1<? super Float, ? extends CharSequence> function1) {
        charSequence.getClass();
        function1.getClass();
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append(charSequence);
                }
                sb.append(function1.invoke(Float.valueOf(f)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        return sb.toString();
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function1<? super Float, ? extends CharSequence> function1) {
        function1.getClass();
        StringBuilder sb = new StringBuilder("");
        float[] fArr = this.content;
        int i = this._size;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                float f = fArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(function1.invoke(Float.valueOf(f)));
                i2++;
            } else {
                sb.append((CharSequence) "");
                break;
            }
        }
        return sb.toString();
    }
}
