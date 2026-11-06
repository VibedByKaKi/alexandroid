package org.jetbrains.kotlin.tooling.core;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.tooling.core.Extras;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J'\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH&¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u00020\u00032\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\fH&J'\u0010\r\u001a\u0004\u0018\u0001H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH&¢\u0006\u0002\u0010\u0010J0\u0010\u0011\u001a\u0004\u0018\u0001H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000f2\u0006\u0010\u0012\u001a\u0002H\u0005H¦\u0002¢\u0006\u0002\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lorg/jetbrains/kotlin/tooling/core/MutableExtras;", "Lorg/jetbrains/kotlin/tooling/core/Extras;", MetricsConstants.Method.CACHE_CLEAR, "", MetricsConstants.Method.CACHE_PUT, ExifInterface.GPS_DIRECTION_TRUE, "", "entry", "Lorg/jetbrains/kotlin/tooling/core/Extras$Entry;", "(Lorg/jetbrains/kotlin/tooling/core/Extras$Entry;)Ljava/lang/Object;", "putAll", "from", "", BulkOperationType.remove, "key", "Lorg/jetbrains/kotlin/tooling/core/Extras$Key;", "(Lorg/jetbrains/kotlin/tooling/core/Extras$Key;)Ljava/lang/Object;", "set", "value", "(Lorg/jetbrains/kotlin/tooling/core/Extras$Key;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-tooling-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface MutableExtras extends Extras {
    @Override // java.util.Collection
    void clear();

    @Nullable
    <T> T put(@NotNull Extras.Entry<T> entry);

    void putAll(@NotNull Iterable<? extends Extras.Entry<?>> from);

    @Nullable
    <T> T remove(@NotNull Extras.Key<T> key);

    @Nullable
    <T> T set(@NotNull Extras.Key<T> key, @NotNull T value);
}
