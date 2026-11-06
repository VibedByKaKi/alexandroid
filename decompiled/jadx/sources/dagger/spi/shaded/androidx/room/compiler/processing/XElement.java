package dagger.spi.shaded.androidx.room.compiler.processing;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0013H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0012\u0010\u000f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotated;", "closestMemberContainer", "Ldagger/spi/shaded/androidx/room/compiler/processing/XMemberContainer;", "getClosestMemberContainer", "()Landroidx/room/compiler/processing/XMemberContainer;", "docComment", "", "getDocComment", "()Ljava/lang/String;", "enclosingElement", "getEnclosingElement", "()Landroidx/room/compiler/processing/XElement;", "fallbackLocationText", "getFallbackLocationText", "name", "getName", "kindName", "validate", "", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XElement extends XAnnotated {
    @NotNull
    XMemberContainer getClosestMemberContainer();

    @Nullable
    String getDocComment();

    @Nullable
    XElement getEnclosingElement();

    @NotNull
    String getFallbackLocationText();

    @NotNull
    String getName();

    @NotNull
    String kindName();

    boolean validate();
}
