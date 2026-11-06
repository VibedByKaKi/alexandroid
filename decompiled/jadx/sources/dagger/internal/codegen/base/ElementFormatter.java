package dagger.internal.codegen.base;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.imagepicker.Options$$ExternalSyntheticLambda0;
import dagger.internal.codegen.xprocessing.XElements;
import dagger.internal.codegen.xprocessing.XTypes;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XElementKt;
import dagger.spi.shaded.androidx.room.compiler.processing.XExecutableElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XExecutableParameterElement;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.stream.Collectors;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class ElementFormatter extends Formatter<XElement> {
    @Inject
    public ElementFormatter() {
    }

    public static String elementToString(XElement xElement) {
        if (XElements.isExecutable(xElement)) {
            StringBuilder enclosingTypeAndMemberName = enclosingTypeAndMemberName(xElement);
            enclosingTypeAndMemberName.append((String) XElements.asExecutable(xElement).getParameters().stream().map(new Options$$ExternalSyntheticLambda0(22)).collect(Collectors.joining(", ", MarkdownConstants.LEFT_PARENTHESIS, MarkdownConstants.RIGHT_PARENTHESIS)));
            return enclosingTypeAndMemberName.toString();
        }
        if (XElementKt.isMethodParameter(xElement)) {
            XExecutableElement enclosingElement = XElements.asMethodParameter(xElement).getEnclosingElement();
            StringBuilder enclosingTypeAndMemberName2 = enclosingTypeAndMemberName(enclosingElement);
            enclosingTypeAndMemberName2.append('(');
            enclosingTypeAndMemberName2.append(Formatter.formatArgumentInList(enclosingElement.getParameters().indexOf(xElement), enclosingElement.getParameters().size(), XElements.getSimpleName(xElement)));
            enclosingTypeAndMemberName2.append(')');
            return enclosingTypeAndMemberName2.toString();
        }
        if (XElementKt.isField(xElement)) {
            return enclosingTypeAndMemberName(xElement).toString();
        }
        if (XElementKt.isTypeElement(xElement)) {
            return XElements.asTypeElement(xElement).getQualifiedName();
        }
        PathKt$$ExternalSyntheticBUOutline0.m(xElement, "Can't determine string for element ");
        return null;
    }

    private static StringBuilder enclosingTypeAndMemberName(XElement xElement) {
        StringBuilder sb = new StringBuilder(elementToString(xElement.getEnclosingElement()));
        if (!XElements.getSimpleName(xElement).contentEquals("<init>")) {
            sb.append('.');
            sb.append(XElements.getSimpleName(xElement));
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$elementToString$0(XExecutableParameterElement xExecutableParameterElement) {
        return XTypes.toStableString(xExecutableParameterElement.getType());
    }

    @Override // dagger.internal.codegen.base.Formatter
    public String format(XElement xElement) {
        return elementToString(xElement);
    }
}
