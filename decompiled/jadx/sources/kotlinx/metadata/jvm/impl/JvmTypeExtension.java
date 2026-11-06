package kotlinx.metadata.jvm.impl;

import com.mapbox.common.HttpHeaders;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.metadata.KmAnnotation;
import kotlinx.metadata.KmTypeExtensionVisitor;
import kotlinx.metadata.impl.extensions.KmTypeExtension;
import kotlinx.metadata.jvm.JvmTypeExtensionVisitor;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lkotlinx/metadata/jvm/impl/JvmTypeExtension;", "Lkotlinx/metadata/jvm/JvmTypeExtensionVisitor;", "Lkotlinx/metadata/impl/extensions/KmTypeExtension;", "()V", "annotations", "", "Lkotlinx/metadata/KmAnnotation;", "getAnnotations", "()Ljava/util/List;", "isRaw", "", "()Z", "setRaw", "(Z)V", HttpHeaders.ACCEPT, "", "visitor", "Lkotlinx/metadata/KmTypeExtensionVisitor;", "visit", "visitAnnotation", "annotation", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class JvmTypeExtension extends JvmTypeExtensionVisitor implements KmTypeExtension {

    @NotNull
    private final List<KmAnnotation> annotations;
    private boolean isRaw;

    public JvmTypeExtension() {
        super(null, 1, null);
        this.annotations = new ArrayList();
    }

    @Override // kotlinx.metadata.impl.extensions.KmExtension
    public void accept(@NotNull KmTypeExtensionVisitor visitor) {
        visitor.getClass();
        if (!(visitor instanceof JvmTypeExtensionVisitor)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        JvmTypeExtensionVisitor jvmTypeExtensionVisitor = (JvmTypeExtensionVisitor) visitor;
        jvmTypeExtensionVisitor.visit(this.isRaw);
        Iterator<T> it2 = this.annotations.iterator();
        while (it2.hasNext()) {
            jvmTypeExtensionVisitor.visitAnnotation((KmAnnotation) it2.next());
        }
        jvmTypeExtensionVisitor.visitEnd();
    }

    @NotNull
    public final List<KmAnnotation> getAnnotations() {
        return this.annotations;
    }

    /* renamed from: isRaw, reason: from getter */
    public final boolean getIsRaw() {
        return this.isRaw;
    }

    public final void setRaw(boolean z) {
        this.isRaw = z;
    }

    @Override // kotlinx.metadata.jvm.JvmTypeExtensionVisitor
    public void visit(boolean isRaw) {
        this.isRaw = isRaw;
    }

    @Override // kotlinx.metadata.jvm.JvmTypeExtensionVisitor
    public void visitAnnotation(@NotNull KmAnnotation annotation) {
        annotation.getClass();
        this.annotations.add(annotation);
    }
}
