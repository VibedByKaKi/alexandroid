package dagger.spi.shaded.androidx.room.compiler.processing;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XEnumEntry;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XElement;", "enclosingElement", "Ldagger/spi/shaded/androidx/room/compiler/processing/XEnumTypeElement;", "getEnclosingElement", "()Landroidx/room/compiler/processing/XEnumTypeElement;", "enumTypeElement", "getEnumTypeElement$annotations", "()V", "getEnumTypeElement", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XEnumEntry extends XElement {
    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XElement
    @NotNull
    XEnumTypeElement getEnclosingElement();

    @NotNull
    default XEnumTypeElement getEnumTypeElement() {
        return getEnclosingElement();
    }

    @Deprecated(message = "use XEnumEntry#enclosingElement() instead.", replaceWith = @ReplaceWith(expression = "enclosingElement", imports = {}))
    static /* synthetic */ void getEnumTypeElement$annotations() {
    }
}
