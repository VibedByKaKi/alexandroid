package dagger.spi.shaded.androidx.room.compiler.processing;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XFieldElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XVariableElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XHasModifiers;", "enclosingElement", "Ldagger/spi/shaded/androidx/room/compiler/processing/XMemberContainer;", "getEnclosingElement", "()Landroidx/room/compiler/processing/XMemberContainer;", "fallbackLocationText", "", "getFallbackLocationText", "()Ljava/lang/String;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XFieldElement extends XVariableElement, XHasModifiers {
    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XElement
    @NotNull
    XMemberContainer getEnclosingElement();

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XElement
    @NotNull
    default String getFallbackLocationText() {
        return getName() + " in " + getEnclosingElement().getFallbackLocationText();
    }
}
