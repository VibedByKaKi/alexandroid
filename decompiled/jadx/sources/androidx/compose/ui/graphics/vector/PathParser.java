package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import com.dee.app.metrics.MetricsConstants;
import io.branch.referral.BranchError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ8\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u0011\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0082\bJ\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0017R\"\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "<init>", "()V", "nodes", "Ljava/util/ArrayList;", "Landroidx/compose/ui/graphics/vector/PathNode;", "Lkotlin/collections/ArrayList;", "nodeData", "", MetricsConstants.Method.CACHE_CLEAR, "", "parsePathString", "pathData", "", "pathStringToNodes", "resizeNodeData", "dataCount", "", "addPathNodes", "", "toNodes", "toPath", "Landroidx/compose/ui/graphics/Path;", "target", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n+ 2 FastFloatParser.kt\nandroidx/compose/ui/graphics/vector/FastFloatParserKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,546:1\n152#1,6:550\n41#2:547\n43#2:548\n22#3:549\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParser\n*L\n135#1:550,6\n129#1:547\n130#1:548\n130#1:549\n*E\n"})
/* loaded from: classes13.dex */
public final class PathParser {

    @NotNull
    private float[] nodeData = new float[64];

    @Nullable
    private ArrayList<PathNode> nodes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList pathStringToNodes$default(PathParser pathParser, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        return pathParser.pathStringToNodes(str, arrayList);
    }

    private final void resizeNodeData(int dataCount) {
        float[] fArr = this.nodeData;
        if (dataCount >= fArr.length) {
            float[] fArr2 = new float[dataCount * 2];
            this.nodeData = fArr2;
            ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
        }
    }

    public static /* synthetic */ Path toPath$default(PathParser pathParser, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return pathParser.toPath(path);
    }

    @NotNull
    public final PathParser addPathNodes(@NotNull List<? extends PathNode> nodes) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        }
        arrayList.addAll(nodes);
        return this;
    }

    public final void clear() {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @NotNull
    public final PathParser parsePathString(@NotNull String pathData) {
        ArrayList<PathNode> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        } else {
            arrayList.clear();
        }
        pathStringToNodes(pathData, arrayList);
        return this;
    }

    @NotNull
    public final ArrayList<PathNode> pathStringToNodes(@NotNull String pathData, @NotNull ArrayList<PathNode> nodes) {
        int i;
        char charAt;
        int i2;
        int length = pathData.length();
        int i3 = 0;
        while (i3 < length && Intrinsics.compare((int) pathData.charAt(i3), 32) <= 0) {
            i3++;
        }
        while (length > i3 && Intrinsics.compare((int) pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i4 = 0;
        while (i3 < length) {
            while (true) {
                i = i3 + 1;
                charAt = pathData.charAt(i3);
                int i5 = charAt | ' ';
                if ((i5 + BranchError.ERR_OTHER) * (i5 - 97) <= 0 && i5 != 101) {
                    break;
                }
                if (i >= length) {
                    charAt = 0;
                    break;
                }
                i3 = i;
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 122) {
                    i4 = 0;
                    while (true) {
                        if (i >= length || Intrinsics.compare((int) pathData.charAt(i), 32) > 0) {
                            long nextFloat = FastFloatParserKt.nextFloat(pathData, i, length);
                            i2 = (int) (nextFloat >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (nextFloat & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i6 = i4 + 1;
                                fArr[i4] = intBitsToFloat;
                                if (i6 >= fArr.length) {
                                    float[] fArr2 = new float[i6 * 2];
                                    this.nodeData = fArr2;
                                    ArraysKt___ArraysJvmKt.copyInto(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i4 = i6;
                            }
                            while (i2 < length && pathData.charAt(i2) == ',') {
                                i2++;
                            }
                            if (i2 >= length || Float.isNaN(intBitsToFloat)) {
                                break;
                            }
                            i = i2;
                        } else {
                            i++;
                        }
                    }
                    i = i2;
                }
                PathNodeKt.addPathNodes(charAt, nodes, this.nodeData, i4);
            }
            i3 = i;
        }
        return nodes;
    }

    @NotNull
    public final List<PathNode> toNodes() {
        ArrayList<PathNode> arrayList = this.nodes;
        return arrayList != null ? arrayList : CollectionsKt.emptyList();
    }

    @NotNull
    public final Path toPath(@NotNull Path target) {
        Path path;
        ArrayList<PathNode> arrayList = this.nodes;
        return (arrayList == null || (path = PathParserKt.toPath(arrayList, target)) == null) ? AndroidPath_androidKt.Path() : path;
    }
}
