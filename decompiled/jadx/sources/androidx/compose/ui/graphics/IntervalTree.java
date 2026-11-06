package androidx.compose.ui.graphics;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import com.dee.app.metrics.MetricsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011J6\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u0015J:\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u0015J6\u0010\u0017\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\f0\u0019H\u0080\b¢\u0006\u0002\b\u001aJ:\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\f0\u0019H\u0080\b¢\u0006\u0002\b\u001aJ\u0011\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0086\u0002J\u0017\u0010\u001b\u001a\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086\u0002J\u0015\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001fH\u0086\u0002J\u0017\u0010 \u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002J%\u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010#J\u001a\u0010$\u001a\u00020\f2\u0010\u0010%\u001a\f0\u0006R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u001a\u0010&\u001a\u00020\f2\u0010\u0010'\u001a\f0\u0006R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u001a\u0010(\u001a\u00020\f2\u0010\u0010'\u001a\f0\u0006R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u001a\u0010)\u001a\u00020\f2\u0010\u0010'\u001a\f0\u0006R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002R\u001a\u0010\u0005\u001a\f0\u0006R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\f0\u0006R\b\u0012\u0004\u0012\u00028\u00000\u00008\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R4\u0010\b\u001a&\u0012\u000e\u0012\f0\u0006R\b\u0012\u0004\u0012\u00028\u00000\u00000\tj\u0012\u0012\u000e\u0012\f0\u0006R\b\u0012\u0004\u0012\u00028\u00000\u0000`\n8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree;", ExifInterface.GPS_DIRECTION_TRUE, "", "<init>", "()V", "terminator", "Landroidx/compose/ui/graphics/IntervalTree$Node;", "root", "stack", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", MetricsConstants.Method.CACHE_CLEAR, "", "findFirstOverlap", "Landroidx/compose/ui/graphics/Interval;", "interval", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "end", "findOverlaps", "", "results", "forEach", "block", "Lkotlin/Function1;", "forEach$ui_graphics_release", "contains", "", "value", "iterator", "", "plusAssign", "addInterval", "data", "(FFLjava/lang/Object;)V", "rebalance", "target", "rotateLeft", "node", "rotateRight", "updateNodeData", "Node", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nIntervalTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,381:1\n153#1,16:382\n153#1,16:398\n153#1,16:414\n*S KotlinDebug\n*F\n+ 1 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n111#1:382,16\n138#1:398,16\n146#1:414,16\n*E\n"})
/* loaded from: classes13.dex */
public final class IntervalTree<T> {

    @JvmField
    @NotNull
    public IntervalTree<T>.Node root;

    @JvmField
    @NotNull
    public final ArrayList<IntervalTree<T>.Node> stack;

    @JvmField
    @NotNull
    public final IntervalTree<T>.Node terminator;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010#\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0010\u0010$\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u0018R\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u0017\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010 \u001a\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/IntervalTree$Node;", "Landroidx/compose/ui/graphics/Interval;", "start", "", "end", "data", "color", "", "Landroidx/compose/ui/graphics/TreeColor;", "<init>", "(Landroidx/compose/ui/graphics/IntervalTree;FFLjava/lang/Object;I)V", "getColor", "()I", "setColor", "(I)V", ReactProperties.GEOFENCE_MINIMUM_RANGE, "getMin", "()F", "setMin", "(F)V", ReactProperties.GEOFENCE_MAXIMUM_RANGE, "getMax", "setMax", "left", "Landroidx/compose/ui/graphics/IntervalTree;", "getLeft", "()Landroidx/compose/ui/graphics/IntervalTree$Node;", "setLeft", "(Landroidx/compose/ui/graphics/IntervalTree$Node;)V", "right", "getRight", "setRight", RouteParameter.PARENT, "getParent", "setParent", "lowestNode", "next", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Node extends Interval<T> {
        private int color;

        @NotNull
        private IntervalTree<T>.Node left;
        private float max;
        private float min;

        @NotNull
        private IntervalTree<T>.Node parent;

        @NotNull
        private IntervalTree<T>.Node right;

        public Node(float f, float f2, @Nullable T t, int i) {
            super(f, f2, t);
            this.color = i;
            this.min = f;
            this.max = f2;
            IntervalTree<T>.Node node = IntervalTree.this.terminator;
            this.left = node;
            this.right = node;
            this.parent = node;
        }

        public final int getColor() {
            return this.color;
        }

        @NotNull
        public final IntervalTree<T>.Node getLeft() {
            return this.left;
        }

        public final float getMax() {
            return this.max;
        }

        public final float getMin() {
            return this.min;
        }

        @NotNull
        public final IntervalTree<T>.Node getParent() {
            return this.parent;
        }

        @NotNull
        public final IntervalTree<T>.Node getRight() {
            return this.right;
        }

        @NotNull
        public final IntervalTree<T>.Node lowestNode() {
            Node node = this;
            while (true) {
                IntervalTree<T>.Node node2 = node.left;
                if (node2 == IntervalTree.this.terminator) {
                    return node;
                }
                node = node2;
            }
        }

        @NotNull
        public final IntervalTree<T>.Node next() {
            IntervalTree<T>.Node node = this.right;
            if (node != IntervalTree.this.terminator) {
                return node.lowestNode();
            }
            IntervalTree<T>.Node node2 = this.parent;
            Node node3 = this;
            while (node2 != IntervalTree.this.terminator && node3 == node2.right) {
                node3 = node2;
                node2 = node2.parent;
            }
            return node2;
        }

        public final void setColor(int i) {
            this.color = i;
        }

        public final void setLeft(@NotNull IntervalTree<T>.Node node) {
            this.left = node;
        }

        public final void setMax(float f) {
            this.max = f;
        }

        public final void setMin(float f) {
            this.min = f;
        }

        public final void setParent(@NotNull IntervalTree<T>.Node node) {
            this.parent = node;
        }

        public final void setRight(@NotNull IntervalTree<T>.Node node) {
            this.right = node;
        }
    }

    public IntervalTree() {
        IntervalTree<T>.Node node = new Node(Float.MAX_VALUE, Float.MIN_VALUE, null, 1);
        this.terminator = node;
        this.root = node;
        this.stack = new ArrayList<>();
    }

    public static /* synthetic */ Interval findFirstOverlap$default(IntervalTree intervalTree, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return intervalTree.findFirstOverlap(f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, float f, float f2, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        if ((i & 4) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(f, f2, list);
    }

    public static /* synthetic */ void forEach$ui_graphics_release$default(IntervalTree intervalTree, float f, float f2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        IntervalTree<T>.Node node = intervalTree.root;
        if (node != intervalTree.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = intervalTree.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(f, f2)) {
                    function1.invoke(remove);
                }
                if (remove.getLeft() != intervalTree.terminator && remove.getLeft().getMax() >= f) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != intervalTree.terminator && remove.getRight().getMin() <= f2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    private final void rebalance(IntervalTree<T>.Node target) {
        while (target != this.root && target.getParent().getColor() == 0) {
            IntervalTree<T>.Node parent = target.getParent().getParent();
            if (target.getParent() == parent.getLeft()) {
                IntervalTree<T>.Node right = parent.getRight();
                if (right.getColor() == 0) {
                    right.setColor(1);
                    target.getParent().setColor(1);
                    parent.setColor(0);
                    target = parent;
                } else {
                    if (target == target.getParent().getRight()) {
                        target = target.getParent();
                        rotateLeft(target);
                    }
                    target.getParent().setColor(1);
                    parent.setColor(0);
                    rotateRight(parent);
                }
            } else {
                IntervalTree<T>.Node left = parent.getLeft();
                if (left.getColor() == 0) {
                    left.setColor(1);
                    target.getParent().setColor(1);
                    parent.setColor(0);
                    target = parent;
                } else {
                    if (target == target.getParent().getLeft()) {
                        target = target.getParent();
                        rotateRight(target);
                    }
                    target.getParent().setColor(1);
                    parent.setColor(0);
                    rotateLeft(parent);
                }
            }
        }
        this.root.setColor(1);
    }

    private final void rotateLeft(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node right = node.getRight();
        node.setRight(right.getLeft());
        if (right.getLeft() != this.terminator) {
            right.getLeft().setParent(node);
        }
        right.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = right;
        } else if (node.getParent().getLeft() == node) {
            node.getParent().setLeft(right);
        } else {
            node.getParent().setRight(right);
        }
        right.setLeft(node);
        node.setParent(right);
        updateNodeData(node);
    }

    private final void rotateRight(IntervalTree<T>.Node node) {
        IntervalTree<T>.Node left = node.getLeft();
        node.setLeft(left.getRight());
        if (left.getRight() != this.terminator) {
            left.getRight().setParent(node);
        }
        left.setParent(node.getParent());
        if (node.getParent() == this.terminator) {
            this.root = left;
        } else if (node.getParent().getRight() == node) {
            node.getParent().setRight(left);
        } else {
            node.getParent().setLeft(left);
        }
        left.setRight(node);
        node.setParent(left);
        updateNodeData(node);
    }

    private final void updateNodeData(IntervalTree<T>.Node node) {
        while (node != this.terminator) {
            node.setMin(Math.min(node.getStart(), Math.min(node.getLeft().getMin(), node.getRight().getMin())));
            node.setMax(Math.max(node.getEnd(), Math.max(node.getLeft().getMax(), node.getRight().getMax())));
            node = node.getParent();
        }
    }

    public final void addInterval(float start, float end, @Nullable T data) {
        IntervalTree<T>.Node node = new Node(start, end, data, 0);
        IntervalTree<T>.Node node2 = this.terminator;
        for (IntervalTree<T>.Node node3 = this.root; node3 != this.terminator; node3 = node.getStart() <= node3.getStart() ? node3.getLeft() : node3.getRight()) {
            node2 = node3;
        }
        node.setParent(node2);
        if (node2 == this.terminator) {
            this.root = node;
        } else if (node.getStart() <= node2.getStart()) {
            node2.setLeft(node);
        } else {
            node2.setRight(node);
        }
        updateNodeData(node);
        rebalance(node);
    }

    public final void clear() {
        this.root = this.terminator;
    }

    public final boolean contains(@NotNull ClosedFloatingPointRange<Float> interval) {
        return findFirstOverlap(interval.getStart().floatValue(), interval.getEndInclusive().floatValue()) != IntervalTreeKt.getEmptyInterval();
    }

    @NotNull
    public final Interval<T> findFirstOverlap(float start, float end) {
        IntervalTree<T>.Node node = this.root;
        IntervalTree<T>.Node node2 = this.terminator;
        if (node != node2 && node != node2) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(start, end)) {
                    return remove;
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= start) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= end) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
        Interval<T> interval = (Interval<T>) IntervalTreeKt.getEmptyInterval();
        interval.getClass();
        return interval;
    }

    @NotNull
    public final List<Interval<T>> findOverlaps(float start, float end, @NotNull List<Interval<T>> results) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(start, end)) {
                    results.add(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= start) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= end) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
        return results;
    }

    public final void forEach$ui_graphics_release(@NotNull ClosedFloatingPointRange<Float> interval, @NotNull Function1<? super Interval<T>, Unit> block) {
        float floatValue = interval.getStart().floatValue();
        float floatValue2 = interval.getEndInclusive().floatValue();
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(floatValue, floatValue2)) {
                    block.invoke(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= floatValue) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= floatValue2) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }

    @NotNull
    public final Iterator<Interval<T>> iterator() {
        return new IntervalTree$iterator$1(this);
    }

    public final void plusAssign(@NotNull Interval<T> interval) {
        addInterval(interval.getStart(), interval.getEnd(), interval.getData());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List findOverlaps$default(IntervalTree intervalTree, ClosedFloatingPointRange closedFloatingPointRange, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = new ArrayList();
        }
        return intervalTree.findOverlaps(closedFloatingPointRange, list);
    }

    public final boolean contains(float value) {
        return findFirstOverlap(value, value) != IntervalTreeKt.getEmptyInterval();
    }

    @NotNull
    public final List<Interval<T>> findOverlaps(@NotNull ClosedFloatingPointRange<Float> interval, @NotNull List<Interval<T>> results) {
        return findOverlaps(interval.getStart().floatValue(), interval.getEndInclusive().floatValue(), results);
    }

    @NotNull
    public final Interval<T> findFirstOverlap(@NotNull ClosedFloatingPointRange<Float> interval) {
        return findFirstOverlap(interval.getStart().floatValue(), interval.getEndInclusive().floatValue());
    }

    public final void forEach$ui_graphics_release(float start, float end, @NotNull Function1<? super Interval<T>, Unit> block) {
        IntervalTree<T>.Node node = this.root;
        if (node != this.terminator) {
            ArrayList<IntervalTree<T>.Node> arrayList = this.stack;
            arrayList.add(node);
            while (arrayList.size() > 0) {
                IntervalTree<T>.Node remove = arrayList.remove(arrayList.size() - 1);
                if (remove.overlaps(start, end)) {
                    block.invoke(remove);
                }
                if (remove.getLeft() != this.terminator && remove.getLeft().getMax() >= start) {
                    arrayList.add(remove.getLeft());
                }
                if (remove.getRight() != this.terminator && remove.getRight().getMin() <= end) {
                    arrayList.add(remove.getRight());
                }
            }
            arrayList.clear();
        }
    }
}
