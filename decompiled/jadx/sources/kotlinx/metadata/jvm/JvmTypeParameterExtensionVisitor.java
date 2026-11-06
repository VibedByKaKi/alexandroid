package kotlinx.metadata.jvm;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.metadata.KmAnnotation;
import kotlinx.metadata.KmExtensionType;
import kotlinx.metadata.KmTypeParameterExtensionVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlinx/metadata/jvm/JvmTypeParameterExtensionVisitor;", "Lkotlinx/metadata/KmTypeParameterExtensionVisitor;", "delegate", "(Lkotlinx/metadata/jvm/JvmTypeParameterExtensionVisitor;)V", "type", "Lkotlinx/metadata/KmExtensionType;", "getType", "()Lkotlinx/metadata/KmExtensionType;", "visitAnnotation", "", "annotation", "Lkotlinx/metadata/KmAnnotation;", "visitEnd", "Companion", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public class JvmTypeParameterExtensionVisitor implements KmTypeParameterExtensionVisitor {

    @JvmField
    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.getOrCreateKotlinClass(JvmTypeParameterExtensionVisitor.class));

    @Nullable
    private final JvmTypeParameterExtensionVisitor delegate;

    public /* synthetic */ JvmTypeParameterExtensionVisitor(JvmTypeParameterExtensionVisitor jvmTypeParameterExtensionVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jvmTypeParameterExtensionVisitor);
    }

    @Override // kotlinx.metadata.KmExtensionVisitor
    @NotNull
    public final KmExtensionType getType() {
        return TYPE;
    }

    public void visitAnnotation(@NotNull KmAnnotation annotation) {
        annotation.getClass();
        JvmTypeParameterExtensionVisitor jvmTypeParameterExtensionVisitor = this.delegate;
        if (jvmTypeParameterExtensionVisitor != null) {
            jvmTypeParameterExtensionVisitor.visitAnnotation(annotation);
        }
    }

    public void visitEnd() {
        JvmTypeParameterExtensionVisitor jvmTypeParameterExtensionVisitor = this.delegate;
        if (jvmTypeParameterExtensionVisitor != null) {
            jvmTypeParameterExtensionVisitor.visitEnd();
        }
    }

    @JvmOverloads
    public JvmTypeParameterExtensionVisitor(@Nullable JvmTypeParameterExtensionVisitor jvmTypeParameterExtensionVisitor) {
        this.delegate = jvmTypeParameterExtensionVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public JvmTypeParameterExtensionVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
