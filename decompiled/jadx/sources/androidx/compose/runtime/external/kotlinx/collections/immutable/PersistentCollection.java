package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import com.dee.app.metrics.MetricsConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0012J\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&J\u001b\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0005J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH&J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", BulkOperationType.add, "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "addAll", AlexaMetricsConstants.MetricsComponents.ELEMENTS, "", BulkOperationType.remove, "removeAll", "predicate", "Lkotlin/Function1;", "", "retainAll", MetricsConstants.Method.CACHE_CLEAR, "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "Builder", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PersistentCollection<E> extends ImmutableCollection<E> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", ExifInterface.LONGITUDE_EAST, "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Builder<E> extends Collection<E>, KMutableCollection {
        @NotNull
        PersistentCollection<E> build();
    }

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> add(E element);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> addAll(@NotNull Collection<? extends E> elements);

    @NotNull
    Builder<E> builder();

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> clear();

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> remove(E element);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> removeAll(@NotNull Collection<? extends E> elements);

    @NotNull
    PersistentCollection<E> removeAll(@NotNull Function1<? super E, Boolean> predicate);

    @Override // java.util.Collection
    @NotNull
    PersistentCollection<E> retainAll(@NotNull Collection<? extends E> elements);
}
