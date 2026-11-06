package kotlinx.metadata.jvm.impl;

import com.mapbox.common.HttpHeaders;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.metadata.KmAnnotation;
import kotlinx.metadata.KmTypeParameterExtensionVisitor;
import kotlinx.metadata.impl.extensions.KmTypeParameterExtension;
import kotlinx.metadata.jvm.JvmTypeParameterExtensionVisitor;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lkotlinx/metadata/jvm/impl/JvmTypeParameterExtension;", "Lkotlinx/metadata/jvm/JvmTypeParameterExtensionVisitor;", "Lkotlinx/metadata/impl/extensions/KmTypeParameterExtension;", "()V", "annotations", "", "Lkotlinx/metadata/KmAnnotation;", "getAnnotations", "()Ljava/util/List;", HttpHeaders.ACCEPT, "", "visitor", "Lkotlinx/metadata/KmTypeParameterExtensionVisitor;", "visitAnnotation", "annotation", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class JvmTypeParameterExtension extends JvmTypeParameterExtensionVisitor implements KmTypeParameterExtension {

    @NotNull
    private final List<KmAnnotation> annotations;

    public JvmTypeParameterExtension() {
        super(null, 1, null);
        this.annotations = new ArrayList();
    }

    @Override // kotlinx.metadata.impl.extensions.KmExtension
    public void accept(@NotNull KmTypeParameterExtensionVisitor visitor) {
        visitor.getClass();
        if (!(visitor instanceof JvmTypeParameterExtensionVisitor)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        JvmTypeParameterExtensionVisitor jvmTypeParameterExtensionVisitor = (JvmTypeParameterExtensionVisitor) visitor;
        Iterator<T> it2 = this.annotations.iterator();
        while (it2.hasNext()) {
            jvmTypeParameterExtensionVisitor.visitAnnotation((KmAnnotation) it2.next());
        }
        jvmTypeParameterExtensionVisitor.visitEnd();
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.metadata.jvm.JvmTypeParameterExtensionVisitor
    public void visitAnnotation(@NotNull KmAnnotation annotation) {
        annotation.getClass();
        this.annotations.add(annotation);
    }
}
