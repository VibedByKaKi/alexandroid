package dagger.spi.shaded.androidx.room.compiler.processing;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XConstructorElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XExecutableElement;", "enclosingElement", "Ldagger/spi/shaded/androidx/room/compiler/processing/XTypeElement;", "getEnclosingElement", "()Landroidx/room/compiler/processing/XTypeElement;", "executableType", "Ldagger/spi/shaded/androidx/room/compiler/processing/XConstructorType;", "getExecutableType", "()Landroidx/room/compiler/processing/XConstructorType;", "fallbackLocationText", "", "getFallbackLocationText", "()Ljava/lang/String;", "asMemberOf", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "Ldagger/spi/shaded/androidx/room/compiler/processing/XType;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XConstructorElement extends XExecutableElement {
    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XExecutableElement
    @NotNull
    XConstructorType asMemberOf(@NotNull XType other);

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XExecutableElement, dagger.spi.shaded.androidx.room.compiler.processing.XElement
    @NotNull
    XTypeElement getEnclosingElement();

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XExecutableElement
    @NotNull
    XConstructorType getExecutableType();

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XElement
    @NotNull
    default String getFallbackLocationText() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnclosingElement().getQualifiedName());
        sb.append(".<init>(");
        return a$$ExternalSyntheticOutline0.m(sb, CollectionsKt.joinToString$default(getParameters(), ", ", null, null, new Function1<XExecutableParameterElement, CharSequence>() { // from class: dagger.spi.shaded.androidx.room.compiler.processing.XConstructorElement$fallbackLocationText$1$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull XExecutableParameterElement xExecutableParameterElement) {
                xExecutableParameterElement.getClass();
                String typeName = xExecutableParameterElement.getType().asTypeName().getJava().toString();
                typeName.getClass();
                return typeName;
            }
        }, 30), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
