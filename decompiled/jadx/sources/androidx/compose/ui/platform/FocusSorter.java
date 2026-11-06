package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%¢\u0006\u0002\u0010&R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0018j\b\u0012\u0004\u0012\u00020\u0014`\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0018j\b\u0012\u0004\u0012\u00020\u0014`\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001b¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/FocusSorter;", "", "<init>", "()V", "rectPool", "Landroidx/collection/MutableObjectList;", "Landroid/graphics/Rect;", "getRectPool", "()Landroidx/collection/MutableObjectList;", "lastPoolIndex", "", "getLastPoolIndex", "()I", "setLastPoolIndex", "(I)V", "rtlMult", "getRtlMult", "setRtlMult", "rectByView", "Landroidx/collection/MutableScatterMap;", "Landroid/view/View;", "getRectByView", "()Landroidx/collection/MutableScatterMap;", "topsComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getTopsComparator", "()Ljava/util/Comparator;", "sidesComparator", "getSidesComparator", "sort", "", "views", "", "root", "Landroid/view/ViewGroup;", "isRtl", "", "([Landroid/view/View;Landroid/view/ViewGroup;Z)V", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFocusFinderCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusSorter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1#1,688:1\n1#2:689\n919#3,2:690\n13409#4,2:692\n1516#5:694\n*S KotlinDebug\n*F\n+ 1 FocusFinderCompat.android.kt\nandroidx/compose/ui/platform/FocusSorter\n*L\n650#1:690,2\n652#1:692,2\n609#1:694\n*E\n"})
/* loaded from: classes13.dex */
final class FocusSorter {
    private static int lastPoolIndex;

    @NotNull
    private static final Comparator<View> sidesComparator;

    @NotNull
    private static final Comparator<View> topsComparator;

    @NotNull
    public static final FocusSorter INSTANCE = new FocusSorter();

    @NotNull
    private static final MutableObjectList<Rect> rectPool = new MutableObjectList<>(0, 1, null);
    private static int rtlMult = 1;

    @NotNull
    private static final MutableScatterMap<View, Rect> rectByView = ScatterMapKt.mutableScatterMapOf();

    static {
        final int i = 0;
        topsComparator = new Comparator() { // from class: androidx.compose.ui.platform.FocusSorter$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i2;
                int sidesComparator$lambda$1;
                View view = (View) obj;
                View view2 = (View) obj2;
                switch (i) {
                    case 0:
                        i2 = FocusSorter.topsComparator$lambda$0(view, view2);
                        return i2;
                    default:
                        sidesComparator$lambda$1 = FocusSorter.sidesComparator$lambda$1(view, view2);
                        return sidesComparator$lambda$1;
                }
            }
        };
        final int i2 = 1;
        sidesComparator = new Comparator() { // from class: androidx.compose.ui.platform.FocusSorter$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i22;
                int sidesComparator$lambda$1;
                View view = (View) obj;
                View view2 = (View) obj2;
                switch (i2) {
                    case 0:
                        i22 = FocusSorter.topsComparator$lambda$0(view, view2);
                        return i22;
                    default:
                        sidesComparator$lambda$1 = FocusSorter.sidesComparator$lambda$1(view, view2);
                        return sidesComparator$lambda$1;
                }
            }
        };
    }

    private FocusSorter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sidesComparator$lambda$1(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        MutableScatterMap<View, Rect> mutableScatterMap = rectByView;
        Rect rect = mutableScatterMap.get(view);
        rect.getClass();
        Rect rect2 = rect;
        Rect rect3 = mutableScatterMap.get(view2);
        rect3.getClass();
        Rect rect4 = rect3;
        int i = rect2.left - rect4.left;
        return i == 0 ? (rect2.right - rect4.right) * rtlMult : i * rtlMult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int topsComparator$lambda$0(View view, View view2) {
        if (view == view2) {
            return 0;
        }
        MutableScatterMap<View, Rect> mutableScatterMap = rectByView;
        Rect rect = mutableScatterMap.get(view);
        rect.getClass();
        Rect rect2 = rect;
        Rect rect3 = mutableScatterMap.get(view2);
        rect3.getClass();
        Rect rect4 = rect3;
        int i = rect2.top - rect4.top;
        return i == 0 ? rect2.bottom - rect4.bottom : i;
    }

    public final int getLastPoolIndex() {
        return lastPoolIndex;
    }

    @NotNull
    public final MutableScatterMap<View, Rect> getRectByView() {
        return rectByView;
    }

    @NotNull
    public final MutableObjectList<Rect> getRectPool() {
        return rectPool;
    }

    public final int getRtlMult() {
        return rtlMult;
    }

    @NotNull
    public final Comparator<View> getSidesComparator() {
        return sidesComparator;
    }

    @NotNull
    public final Comparator<View> getTopsComparator() {
        return topsComparator;
    }

    public final void setLastPoolIndex(int i) {
        lastPoolIndex = i;
    }

    public final void setRtlMult(int i) {
        rtlMult = i;
    }

    public final void sort(@NotNull View[] views, @NotNull ViewGroup root, boolean isRtl) {
        int length = views.length;
        if (length < 2) {
            return;
        }
        int size = length - rectPool.getSize();
        for (int i = 0; i < size; i++) {
            rectPool.add(new Rect());
        }
        for (View view : views) {
            MutableObjectList<Rect> mutableObjectList = rectPool;
            int i2 = lastPoolIndex;
            lastPoolIndex = i2 + 1;
            Rect rect = mutableObjectList.get(i2);
            view.getDrawingRect(rect);
            root.offsetDescendantRectToMyCoords(view, rect);
            rectByView.set(view, rect);
        }
        ArraysKt.sortWith(views, topsComparator);
        Rect rect2 = rectByView.get(views[0]);
        rect2.getClass();
        int i3 = rect2.bottom;
        rtlMult = isRtl ? -1 : 1;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            Rect rect3 = rectByView.get(views[i5]);
            rect3.getClass();
            Rect rect4 = rect3;
            if (rect4.top >= i3) {
                if (i5 - i4 > 1) {
                    ArraysKt.sortWith(views, sidesComparator, i4, i5);
                }
                i3 = rect4.bottom;
                i4 = i5;
            } else {
                i3 = Math.max(i3, rect4.bottom);
            }
        }
        if (length - i4 > 1) {
            ArraysKt.sortWith(views, sidesComparator, i4, length);
        }
        lastPoolIndex = 0;
        rectByView.clear();
    }
}
