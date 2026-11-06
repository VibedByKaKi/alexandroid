package dagger.spi.shaded.androidx.room.compiler.processing;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XEnumTypeElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XTypeElement;", "entries", "", "Ldagger/spi/shaded/androidx/room/compiler/processing/XEnumEntry;", "getEntries", "()Ljava/util/Set;", "getEnclosedElements", "", "Ldagger/spi/shaded/androidx/room/compiler/processing/XElement;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XEnumTypeElement extends XTypeElement {
    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement
    @NotNull
    default List<XElement> getEnclosedElements() {
        return CollectionsKt.plus((Collection) super.getEnclosedElements(), (Iterable) getEntries());
    }

    @NotNull
    Set<XEnumEntry> getEntries();
}
