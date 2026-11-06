package androidx.compose.ui.draganddrop;

import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0002\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"toAndroidDragEvent", "Landroid/view/DragEvent;", "Landroidx/compose/ui/draganddrop/DragAndDropEvent;", "mimeTypes", "", "", "positionInRoot", "Landroidx/compose/ui/geometry/Offset;", "getPositionInRoot", "(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)J", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDragAndDrop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDrop.android.kt\nandroidx/compose/ui/draganddrop/DragAndDrop_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,64:1\n30#2:65\n53#3,3:66\n*S KotlinDebug\n*F\n+ 1 DragAndDrop.android.kt\nandroidx/compose/ui/draganddrop/DragAndDrop_androidKt\n*L\n63#1:65\n63#1:66,3\n*E\n"})
/* loaded from: classes13.dex */
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(@NotNull DragAndDropEvent dragAndDropEvent) {
        float x = dragAndDropEvent.getDragEvent().getX();
        float y = dragAndDropEvent.getDragEvent().getY();
        return Offset.m4392constructorimpl((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L));
    }

    @NotNull
    public static final Set<String> mimeTypes(@NotNull DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent().getClipDescription();
        if (clipDescription == null) {
            return SetsKt.emptySet();
        }
        Set createSetBuilder = SetsKt.createSetBuilder(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i = 0; i < mimeTypeCount; i++) {
            createSetBuilder.add(clipDescription.getMimeType(i));
        }
        return SetsKt.build(createSetBuilder);
    }

    @NotNull
    public static final DragEvent toAndroidDragEvent(@NotNull DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent();
    }
}
