package androidx.compose.ui.spatial;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.alexa.sharing.api.models.Message;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\f\u001a\u00020\bH\u0082\bJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002JL\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\bJ.\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bJ\u001e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ.\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bJ\u001e\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bJ \u0010 \u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0002J\u000e\u0010&\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\bJ4\u0010'\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\b2$\u0010(\u001a \u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0)J(\u0010*\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\b2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0+J\u0011\u0010,\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\bH\u0086\u0002J\u000e\u0010-\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010.\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\bJ=\u0010/\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e00H\u0086\bJ=\u00101\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e00H\u0086\bJ5\u00102\u001a\u00020\u000e2*\u0010(\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e03H\u0086\bJ-\u0010/\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e00H\u0086\bJ=\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\b2*\u0010(\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e03H\u0086\bJ5\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0000¢\u0006\u0002\b;JÇ\u0001\u0010<\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\b2\u0006\u0010=\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u008b\u0001\u0010(\u001a\u0086\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110\b¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\b¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\b¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\b¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0>H\u0086\bJ1\u0010B\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0086\bJ\u0006\u0010C\u001a\u00020\u000eJ\u0006\u0010D\u001a\u00020\u000eJ)\u0010E\u001a\u00020\u000e2\u001e\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000e0FH\u0086\bJ\u0006\u0010G\u001a\u00020HR\u0012\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006I"}, d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "<init>", "()V", "items", "", "stack", "itemsSize", "", "size", "getSize", "()I", "allocateItemsIndex", "resizeStorage", "", "actualSize", "currentSize", "currentItems", "insert", "value", CmcdData.Factory.STREAM_TYPE_LIVE, "t", "r", "b", Message.SERIALIZED_NAME_PARENT_ID, "focusable", "", "gesturable", BulkOperationType.remove, "update", "updateFlagsFor", "move", "updateSubhierarchy", "id", "deltaX", "deltaY", "stackMeta", "", "markUpdated", "withRect", "block", "Lkotlin/Function4;", "withTopLeftBottomRight", "Lkotlin/Function2;", "contains", "indexOf", "metaFor", "forEachIntersection", "Lkotlin/Function1;", "forEachGesturableIntersection", "forEachRect", "Lkotlin/Function5;", "x", "y", "forEachIntersectingRectWithValueAt", "index", "neighborsScoredByDistance", "", "searchAxis", "neighborsScoredByDistance$ui_release", "findKNearestNeighbors", "k", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "name", "score", "findNearestNeighbor", "defragment", "clearUpdated", "forEachUpdatedRect", "Lkotlin/Function3;", "debugString", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 3 RectManager.kt\nandroidx/compose/ui/spatial/RectManagerKt\n*L\n1#1,1024:1\n102#1,8:1025\n837#2:1033\n837#2:1034\n853#2:1035\n926#2:1036\n854#2:1037\n926#2:1038\n855#2:1039\n926#2:1040\n856#2,3:1041\n860#2:1044\n884#2,2:1045\n860#2:1047\n860#2:1048\n837#2:1049\n837#2:1050\n873#2:1051\n860#2:1052\n878#2,2:1053\n880#2:1056\n860#2:1057\n837#2:1058\n837#2:1059\n873#2:1060\n893#2:1061\n895#2:1062\n868#2:1063\n853#2:1064\n926#2:1065\n854#2:1066\n926#2:1067\n855#2:1068\n926#2:1069\n856#2,3:1070\n860#2:1073\n862#2:1074\n865#2:1075\n862#2:1076\n893#2,3:1077\n837#2:1080\n893#2,3:1081\n837#2:1084\n873#2:1085\n865#2:1086\n868#2:1087\n860#2:1088\n873#2:1089\n860#2:1090\n893#2:1091\n895#2:1092\n893#2:1093\n895#2:1094\n860#2:1095\n860#2:1096\n860#2:1097\n860#2:1098\n837#2:1099\n837#2:1100\n916#2,2:1101\n860#2:1103\n837#2:1104\n837#2:1105\n889#2:1106\n916#2,2:1107\n860#2:1109\n860#2:1110\n893#2:1111\n895#2:1112\n893#2:1113\n895#2:1114\n837#2:1115\n916#2,2:1116\n860#2:1118\n916#2,2:1119\n893#2:1121\n895#2:1122\n893#2:1123\n895#2:1124\n860#2:1125\n893#2:1126\n895#2:1127\n893#2:1128\n895#2:1129\n860#2:1130\n893#2:1131\n895#2:1132\n893#2:1133\n895#2:1134\n893#2:1135\n895#2:1136\n893#2:1137\n895#2:1138\n860#2:1139\n875#2:1140\n891#2:1141\n860#2:1142\n860#2:1143\n862#2:1144\n893#2:1145\n895#2:1146\n893#2:1147\n895#2:1148\n526#3:1055\n*S KotlinDebug\n*F\n+ 1 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n148#1:1025,8\n151#1:1033\n152#1:1034\n154#1:1035\n154#1:1036\n154#1:1037\n154#1:1038\n154#1:1039\n154#1:1040\n154#1:1041,3\n176#1:1044\n183#1:1045,2\n205#1:1047\n234#1:1048\n235#1:1049\n236#1:1050\n237#1:1051\n260#1:1052\n261#1:1053,2\n261#1:1056\n284#1:1057\n286#1:1058\n287#1:1059\n288#1:1060\n289#1:1061\n290#1:1062\n292#1:1063\n305#1:1064\n305#1:1065\n305#1:1066\n305#1:1067\n305#1:1068\n305#1:1069\n305#1:1070,3\n344#1:1073\n345#1:1074\n346#1:1075\n352#1:1076\n355#1:1077,3\n355#1:1080\n357#1:1081,3\n357#1:1084\n358#1:1085\n359#1:1086\n363#1:1087\n379#1:1088\n380#1:1089\n396#1:1090\n400#1:1091\n401#1:1092\n402#1:1093\n403#1:1094\n421#1:1095\n440#1:1096\n462#1:1097\n479#1:1098\n492#1:1099\n493#1:1100\n501#1:1101,2\n505#1:1103\n517#1:1104\n518#1:1105\n525#1:1106\n529#1:1107,2\n533#1:1109\n550#1:1110\n551#1:1111\n552#1:1112\n553#1:1113\n554#1:1114\n566#1:1115\n574#1:1116,2\n576#1:1118\n605#1:1119,2\n607#1:1121\n608#1:1122\n609#1:1123\n610#1:1124\n611#1:1125\n643#1:1126\n644#1:1127\n645#1:1128\n646#1:1129\n688#1:1130\n689#1:1131\n690#1:1132\n691#1:1133\n692#1:1134\n723#1:1135\n724#1:1136\n725#1:1137\n726#1:1138\n736#1:1139\n773#1:1140\n785#1:1141\n788#1:1142\n803#1:1143\n804#1:1144\n805#1:1145\n806#1:1146\n807#1:1147\n808#1:1148\n261#1:1055\n*E\n"})
/* loaded from: classes13.dex */
public final class RectList {
    public static final int $stable = 8;

    @JvmField
    public int itemsSize;

    @JvmField
    @NotNull
    public long[] items = new long[192];

    @JvmField
    @NotNull
    public long[] stack = new long[192];

    private final int allocateItemsIndex() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = i + 3;
        this.itemsSize = i2;
        int length = jArr.length;
        if (length <= i2) {
            resizeStorage(length, i, jArr);
        }
        return i;
    }

    public static /* synthetic */ void insert$default(RectList rectList, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, int i7, Object obj) {
        boolean z3;
        RectList rectList2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = (i7 & 32) != 0 ? -1 : i6;
        boolean z4 = (i7 & 64) != 0 ? false : z;
        if ((i7 & 128) != 0) {
            z3 = false;
            i8 = i;
            i9 = i2;
            i10 = i3;
            i11 = i4;
            i12 = i5;
            rectList2 = rectList;
        } else {
            z3 = z2;
            rectList2 = rectList;
            i8 = i;
            i9 = i2;
            i10 = i3;
            i11 = i4;
            i12 = i5;
        }
        rectList2.insert(i8, i9, i10, i11, i12, i13, z4, z3);
    }

    private final void resizeStorage(int actualSize, int currentSize, long[] currentItems) {
        int max = Math.max(actualSize * 2, currentSize + 3);
        this.items = Arrays.copyOf(currentItems, max);
        this.stack = Arrays.copyOf(this.stack, max);
    }

    private final void updateSubhierarchy(long stackMeta, int deltaX, int deltaY) {
        int i;
        char c;
        char c2;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        int size = getSize();
        jArr2[0] = stackMeta;
        int i2 = 1;
        while (i2 > 0) {
            i2--;
            long j = jArr2[i2];
            int i3 = RectListKt.Lower26Bits;
            int i4 = ((int) j) & RectListKt.Lower26Bits;
            char c3 = 26;
            int i5 = ((int) (j >> 26)) & RectListKt.Lower26Bits;
            char c4 = '4';
            int i6 = ((int) (j >> 52)) & 511;
            int i7 = i6 == 511 ? size : i6 + i5;
            if (i5 < 0) {
                return;
            }
            while (i5 < jArr.length - 2 && i5 < i7) {
                int i8 = i5 + 2;
                long j2 = jArr[i8];
                if ((((int) (j2 >> c3)) & i3) == i4) {
                    long j3 = jArr[i5];
                    int i9 = i5 + 1;
                    i = i3;
                    c = c3;
                    long j4 = jArr[i9];
                    c2 = c4;
                    jArr[i5] = ((((int) j3) + deltaY) & 4294967295L) | ((((int) (j3 >> 32)) + deltaX) << 32);
                    jArr[i9] = ((((int) j4) + deltaY) & 4294967295L) | ((((int) (j4 >> 32)) + deltaX) << 32);
                    jArr[i8] = LockFreeTaskQueueCore.CLOSED_MASK | j2;
                    if ((((int) (j2 >> c2)) & 511) > 0) {
                        jArr2[i2] = (RectListKt.EverythingButParentId & j2) | (((i5 + 3) & i) << c);
                        i2++;
                    }
                } else {
                    i = i3;
                    c = c3;
                    c2 = c4;
                }
                i5 += 3;
                i3 = i;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            jArr[i3] = jArr[i3] & (-2305843009213693953L);
        }
    }

    public final boolean contains(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & RectListKt.Lower26Bits) == i) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String debugString() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            sb.append("id=" + (((int) j3) & RectListKt.Lower26Bits) + ", rect=[" + ((int) (j >> 32)) + AbstractJsonLexerKt.COMMA + ((int) j) + AbstractJsonLexerKt.COMMA + ((int) (j2 >> 32)) + AbstractJsonLexerKt.COMMA + ((int) j2) + "], parent=" + (((int) (j3 >> 26)) & RectListKt.Lower26Bits));
            sb.append('\n');
        }
        return sb.toString();
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        long[] jArr2 = this.stack;
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length - 2 && i2 < jArr2.length - 2 && i3 < i; i3 += 3) {
            int i4 = i3 + 2;
            if (jArr[i4] != RectListKt.TombStone) {
                jArr2[i2] = jArr[i3];
                jArr2[i2 + 1] = jArr[i3 + 1];
                jArr2[i2 + 2] = jArr[i4];
                i2 += 3;
            }
        }
        this.itemsSize = i2;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void findKNearestNeighbors(int searchAxis, int k, int l, int t, int r, int b, @NotNull Function6<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        int i;
        int[] neighborsScoredByDistance$ui_release = neighborsScoredByDistance$ui_release(searchAxis, l, t, r, b);
        long[] jArr = this.items;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 <= k) {
            int i5 = Integer.MAX_VALUE;
            int i6 = 0;
            while (i6 < neighborsScoredByDistance$ui_release.length) {
                int i7 = neighborsScoredByDistance$ui_release[i6];
                if (i7 > i2) {
                    i5 = Math.min(i5, i7);
                }
                if (i7 == i2) {
                    int i8 = i6 * 3;
                    long j = jArr[i8];
                    long j2 = jArr[i8 + 1];
                    i = i2;
                    block.invoke(Integer.valueOf(i7), Integer.valueOf(((int) jArr[i8 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                    i4++;
                    if (i4 == k) {
                        return;
                    }
                } else {
                    i = i2;
                }
                i6++;
                i2 = i;
            }
            i3++;
            i2 = i5;
        }
    }

    public final int findNearestNeighbor(int searchAxis, int l, int t, int r, int b) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i; i4 += 3) {
            long j = jArr[i4];
            int i5 = i4 + 1;
            long j2 = jArr[i5];
            int distanceScore = RectListKt.distanceScore(searchAxis, l, t, r, b, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
            boolean z = (distanceScore < i2) & (distanceScore > 0);
            if (z) {
                i2 = distanceScore;
            }
            if (z) {
                i3 = i5;
            }
        }
        if (i3 < 0 || i3 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i3]) & RectListKt.Lower26Bits;
    }

    public final void forEachGesturableIntersection(int l, int t, int r, int b, @NotNull Function1<? super Integer, Unit> block) {
        long j = (l << 32) | (t & 4294967295L);
        long j2 = (r << 32) | (b & 4294967295L);
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j3 = jArr[i2 + 2];
            if ((((int) (j3 >> 63)) & 1) != 0) {
                if (((((j2 - jArr[i2]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    block.invoke(Integer.valueOf(((int) j3) & RectListKt.Lower26Bits));
                }
            }
        }
    }

    public final void forEachIntersectingRectWithValueAt(int index, @NotNull Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        long j = jArr[index];
        long j2 = jArr[index + 1];
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if (i2 != index) {
                long j3 = jArr[i2];
                long j4 = jArr[i2 + 1];
                if (((((j2 - j3) - InlineClassHelperKt.Uint64Low32) | ((j4 - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    block.invoke(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3), Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) j4), Integer.valueOf(((int) jArr[i2 + 2]) & RectListKt.Lower26Bits));
                }
            }
        }
    }

    public final void forEachIntersection(int l, int t, int r, int b, @NotNull Function1<? super Integer, Unit> block) {
        long j = (l << 32) | (t & 4294967295L);
        long j2 = (r << 32) | (b & 4294967295L);
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if (((((j2 - jArr[i2]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(Integer.valueOf(((int) jArr[i2 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }

    public final void forEachRect(@NotNull Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            block.invoke(Integer.valueOf(((int) jArr[i2 + 2]) & RectListKt.Lower26Bits), Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
        }
    }

    public final void forEachUpdatedRect(@NotNull Function3<? super Integer, ? super Long, ? super Long, Unit> block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2 + 2];
            if ((((int) (j >> 61)) & 1) != 0) {
                block.invoke(Integer.valueOf(((int) j) & RectListKt.Lower26Bits), Long.valueOf(jArr[i2]), Long.valueOf(jArr[i2 + 1]));
            }
        }
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final int indexOf(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & RectListKt.Lower26Bits) == i) {
                return i3;
            }
        }
        return -1;
    }

    public final void insert(int value, int l, int t, int r, int b, int parentId, boolean focusable, boolean gesturable) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = i + 3;
        this.itemsSize = i2;
        int length = jArr.length;
        if (length <= i2) {
            resizeStorage(length, i, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i] = (l << 32) | (t & 4294967295L);
        jArr2[i + 1] = (r << 32) | (b & 4294967295L);
        long j = ((gesturable ? 1L : 0L) << 63) | ((focusable ? 1L : 0L) << 62) | (1 << 61) | (0 << 52);
        int i3 = parentId & RectListKt.Lower26Bits;
        jArr2[i + 2] = j | (i3 << 26) | (value & RectListKt.Lower26Bits);
        if (parentId < 0) {
            return;
        }
        for (int i4 = i - 3; i4 >= 0; i4 -= 3) {
            int i5 = i4 + 2;
            long j2 = jArr2[i5];
            if ((((int) j2) & RectListKt.Lower26Bits) == i3) {
                jArr2[i5] = (j2 & RectListKt.EverythingButLastChildOffset) | (((i - i4) & 511) << 52);
                return;
            }
        }
    }

    public final void markUpdated(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & RectListKt.Lower26Bits) == i) {
                jArr[i4] = LockFreeTaskQueueCore.CLOSED_MASK | j;
                return;
            }
        }
    }

    public final long metaFor(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            long j = jArr[i3 + 2];
            if ((((int) j) & RectListKt.Lower26Bits) == i) {
                return j;
            }
        }
        return RectListKt.TombStone;
    }

    public final boolean move(int value, int l, int t, int r, int b) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & RectListKt.Lower26Bits) == i) {
                long j2 = jArr[i3];
                jArr[i3] = (t & 4294967295L) | (l << 32);
                int i5 = i3;
                jArr[i3 + 1] = (b & 4294967295L) | (r << 32);
                jArr[i4] = LockFreeTaskQueueCore.CLOSED_MASK | j;
                int i6 = l - ((int) (j2 >> 32));
                int i7 = t - ((int) j2);
                if ((i6 != 0) | (i7 != 0)) {
                    updateSubhierarchy((RectListKt.EverythingButParentId & j) | (((i5 + 3) & RectListKt.Lower26Bits) << 26), i6, i7);
                }
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final int[] neighborsScoredByDistance$ui_release(int searchAxis, int l, int t, int r, int b) {
        long[] jArr = this.items;
        int i = this.itemsSize / 3;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 3;
            if (i3 < 0 || i3 >= jArr.length - 1) {
                break;
            }
            long j = jArr[i3];
            long j2 = jArr[i3 + 1];
            iArr[i2] = RectListKt.distanceScore(searchAxis, l, t, r, b, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        }
        return iArr;
    }

    public final boolean remove(int value) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & RectListKt.Lower26Bits) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                return true;
            }
        }
        return false;
    }

    public final boolean update(int value, int l, int t, int r, int b) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & RectListKt.Lower26Bits) == i) {
                jArr[i3] = (l << 32) | (t & 4294967295L);
                jArr[i3 + 1] = (r << 32) | (4294967295L & b);
                jArr[i4] = LockFreeTaskQueueCore.CLOSED_MASK | j;
                return true;
            }
        }
        return false;
    }

    public final boolean updateFlagsFor(int value, boolean focusable, boolean gesturable) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & RectListKt.Lower26Bits) == i) {
                jArr[i4] = (4611686018427387903L & j) | ((focusable ? 1L : 0L) * 4611686018427387904L) | ((gesturable ? 1L : 0L) * Long.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    public final boolean withRect(int value, @NotNull Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> block) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & RectListKt.Lower26Bits) == i) {
                long j = jArr[i3];
                long j2 = jArr[i3 + 1];
                block.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return true;
            }
        }
        return false;
    }

    public final boolean withTopLeftBottomRight(int value, @NotNull Function2<? super Long, ? super Long, Unit> block) {
        int i = value & RectListKt.Lower26Bits;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & RectListKt.Lower26Bits) == i) {
                block.invoke(Long.valueOf(jArr[i3]), Long.valueOf(jArr[i3 + 1]));
                return true;
            }
        }
        return false;
    }

    public final void forEachIntersection(int x, int y, @NotNull Function1<? super Integer, Unit> block) {
        long j = (y & 4294967295L) | (x << 32);
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if (((((j - jArr[i2]) - InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - j) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(Integer.valueOf(((int) jArr[i2 + 2]) & RectListKt.Lower26Bits));
            }
        }
    }

    public final void updateSubhierarchy(int id, int deltaX, int deltaY) {
        updateSubhierarchy(((this.itemsSize & 511) << 52) | (0 << 26) | (id & RectListKt.Lower26Bits), deltaX, deltaY);
    }
}
