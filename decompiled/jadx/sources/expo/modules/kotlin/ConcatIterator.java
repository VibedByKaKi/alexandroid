package expo.modules.kotlin;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.appmanager.lib.DefaultPreloadManager;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0007\u001a\u00020\bH\u0096\u0002J\u000e\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/ConcatIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", DefaultPreloadManager.METRIC_PATH_FIRST, "second", "<init>", "(Ljava/util/Iterator;Ljava/util/Iterator;)V", "hasNext", "", "next", "()Ljava/lang/Object;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConcatIterator<T> implements Iterator<T>, KMappedMarker {

    @NotNull
    private final Iterator<T> first;

    @NotNull
    private final Iterator<T> second;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcatIterator(@NotNull Iterator<? extends T> it2, @NotNull Iterator<? extends T> it3) {
        it2.getClass();
        it3.getClass();
        this.first = it2;
        this.second = it3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.first.hasNext() || this.second.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        return this.first.hasNext() ? this.first.next() : this.second.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
