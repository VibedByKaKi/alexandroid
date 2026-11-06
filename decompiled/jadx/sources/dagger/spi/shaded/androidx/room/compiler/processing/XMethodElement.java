package dagger.spi.shaded.androidx.room.compiler.processing;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import dagger.spi.shaded.androidx.room.compiler.processing.util.NamingUtilsKt;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H&J\b\u0010\u0016\u001a\u00020\u0013H&J\b\u0010\u0017\u001a\u00020\u0013H&J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H&J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XMethodElement;", "Ldagger/spi/shaded/androidx/room/compiler/processing/XExecutableElement;", "executableType", "Ldagger/spi/shaded/androidx/room/compiler/processing/XMethodType;", "getExecutableType", "()Landroidx/room/compiler/processing/XMethodType;", "fallbackLocationText", "", "getFallbackLocationText", "()Ljava/lang/String;", "jvmName", "getJvmName", "returnType", "Ldagger/spi/shaded/androidx/room/compiler/processing/XType;", "getReturnType", "()Landroidx/room/compiler/processing/XType;", "asMemberOf", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hasKotlinDefaultImpl", "", "hasValidJvmSourceName", "isExtensionFunction", "isJavaDefault", "isKotlinPropertyMethod", "isOverrideableIgnoringContainer", "isSuspendFunction", "overrides", MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER, "Ldagger/spi/shaded/androidx/room/compiler/processing/XTypeElement;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface XMethodElement extends XExecutableElement {
    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XExecutableElement
    @NotNull
    XMethodType asMemberOf(@NotNull XType other);

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XExecutableElement
    @NotNull
    XMethodType getExecutableType();

    @Override // dagger.spi.shaded.androidx.room.compiler.processing.XElement
    @NotNull
    default String getFallbackLocationText() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnclosingElement().getFallbackLocationText());
        sb.append(".");
        sb.append(getJvmName());
        sb.append(MarkdownConstants.LEFT_PARENTHESIS);
        return a$$ExternalSyntheticOutline0.m(sb, CollectionsKt.joinToString$default(CollectionsKt.dropLast(getParameters(), isSuspendFunction() ? 1 : 0), ", ", null, null, new Function1<XExecutableParameterElement, CharSequence>() { // from class: dagger.spi.shaded.androidx.room.compiler.processing.XMethodElement$fallbackLocationText$1$1
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

    @NotNull
    String getJvmName();

    @NotNull
    XType getReturnType();

    boolean hasKotlinDefaultImpl();

    default boolean hasValidJvmSourceName() {
        return NamingUtilsKt.isValidJavaSourceName(getJvmName());
    }

    boolean isExtensionFunction();

    boolean isJavaDefault();

    boolean isKotlinPropertyMethod();

    default boolean isOverrideableIgnoringContainer() {
        return (isFinal() || isPrivate() || isStatic()) ? false : true;
    }

    boolean isSuspendFunction();

    boolean overrides(@NotNull XMethodElement other, @NotNull XTypeElement owner);
}
