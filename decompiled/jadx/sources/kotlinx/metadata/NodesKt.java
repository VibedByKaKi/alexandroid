package kotlinx.metadata;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u0002H\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0000¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"addTo", ExifInterface.GPS_DIRECTION_TRUE, "collection", "", "(Ljava/lang/Object;Ljava/util/Collection;)Ljava/lang/Object;", "kotlinx-metadata"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class NodesKt {
    public static final <T> T addTo(T t, @NotNull Collection<T> collection) {
        collection.getClass();
        collection.add(t);
        return t;
    }
}
