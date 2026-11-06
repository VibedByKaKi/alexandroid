package androidx.graphics.path;

import android.graphics.PointF;
import androidx.graphics.path.PathSegment;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"CloseSegment", "Landroidx/graphics/path/PathSegment;", "getCloseSegment", "()Landroidx/graphics/path/PathSegment;", "DoneSegment", "getDoneSegment", "graphics-path_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "PathSegmentUtilities")
@SourceDebugExtension({"SMAP\nPathSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,138:1\n26#2:139\n26#2:140\n*S KotlinDebug\n*F\n+ 1 PathSegment.kt\nandroidx/graphics/path/PathSegmentUtilities\n*L\n130#1:139\n137#1:140\n*E\n"})
/* loaded from: classes14.dex */
public final class PathSegmentUtilities {

    @NotNull
    private static final PathSegment DoneSegment = new PathSegment(PathSegment.Type.Done, new PointF[0], 0.0f);

    @NotNull
    private static final PathSegment CloseSegment = new PathSegment(PathSegment.Type.Close, new PointF[0], 0.0f);

    @NotNull
    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }

    @NotNull
    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }
}
