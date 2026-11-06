package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0007J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u001bH\u0086\bJ\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\bJ\u0016\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u000fH\u0086\n¢\u0006\u0002\u0010\u0018R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/node/MutableVectorWithMutationTracking;", ExifInterface.GPS_DIRECTION_TRUE, "", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "onVectorMutated", "Lkotlin/Function0;", "", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;Lkotlin/jvm/functions/Function0;)V", "getVector", "()Landroidx/compose/runtime/collection/MutableVector;", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "size", "", "getSize", "()I", MetricsConstants.Method.CACHE_CLEAR, BulkOperationType.add, "index", "element", "(ILjava/lang/Object;)V", "removeAt", "(I)Ljava/lang/Object;", "forEach", "block", "Lkotlin/Function1;", "asList", "", MetricsConstants.Method.CACHE_GET, "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMutableVectorWithMutationTracking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,52:1\n1#2:53\n424#3,8:54\n472#3:62\n*S KotlinDebug\n*F\n+ 1 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n*L\n46#1:54,8\n50#1:62\n*E\n"})
/* loaded from: classes13.dex */
public final class MutableVectorWithMutationTracking<T> {
    public static final int $stable = MutableVector.$stable;

    @NotNull
    private final Function0<Unit> onVectorMutated;

    @NotNull
    private final MutableVector<T> vector;

    public MutableVectorWithMutationTracking(@NotNull MutableVector<T> mutableVector, @NotNull Function0<Unit> function0) {
        this.vector = mutableVector;
        this.onVectorMutated = function0;
    }

    public final void add(int index, T element) {
        this.vector.add(index, element);
        this.onVectorMutated.invoke();
    }

    @NotNull
    public final List<T> asList() {
        return getVector().asMutableList();
    }

    public final void clear() {
        this.vector.clear();
        this.onVectorMutated.invoke();
    }

    public final void forEach(@NotNull Function1<? super T, Unit> block) {
        MutableVector<T> vector = getVector();
        T[] tArr = vector.content;
        int size = vector.getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(tArr[i]);
        }
    }

    public final T get(int index) {
        return getVector().content[index];
    }

    @NotNull
    public final Function0<Unit> getOnVectorMutated() {
        return this.onVectorMutated;
    }

    public final int getSize() {
        return getVector().getSize();
    }

    @NotNull
    public final MutableVector<T> getVector() {
        return this.vector;
    }

    public final T removeAt(int index) {
        T removeAt = this.vector.removeAt(index);
        this.onVectorMutated.invoke();
        return removeAt;
    }
}
