package kotlinx.metadata.jvm;

import com.amazon.alexa.app.notification.util.PayloadUtils;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlinx.metadata.KmExtensionType;
import kotlinx.metadata.KmPropertyExtensionVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J2\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lkotlinx/metadata/jvm/JvmPropertyExtensionVisitor;", "Lkotlinx/metadata/KmPropertyExtensionVisitor;", "delegate", "(Lkotlinx/metadata/jvm/JvmPropertyExtensionVisitor;)V", "type", "Lkotlinx/metadata/KmExtensionType;", "getType", "()Lkotlinx/metadata/KmExtensionType;", "visit", "", "jvmFlags", "", "Lkotlinx/metadata/Flags;", "fieldSignature", "Lkotlinx/metadata/jvm/JvmFieldSignature;", "getterSignature", "Lkotlinx/metadata/jvm/JvmMethodSignature;", "setterSignature", "visitEnd", "visitSyntheticMethodForAnnotations", PayloadUtils.PayloadKeys.SIGNATURE, "visitSyntheticMethodForDelegate", "Companion", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public class JvmPropertyExtensionVisitor implements KmPropertyExtensionVisitor {

    @JvmField
    @NotNull
    public static final KmExtensionType TYPE = new KmExtensionType(Reflection.getOrCreateKotlinClass(JvmPropertyExtensionVisitor.class));

    @Nullable
    private final JvmPropertyExtensionVisitor delegate;

    public /* synthetic */ JvmPropertyExtensionVisitor(JvmPropertyExtensionVisitor jvmPropertyExtensionVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jvmPropertyExtensionVisitor);
    }

    @Override // kotlinx.metadata.KmExtensionVisitor
    @NotNull
    public final KmExtensionType getType() {
        return TYPE;
    }

    public void visit(int jvmFlags, @Nullable JvmFieldSignature fieldSignature, @Nullable JvmMethodSignature getterSignature, @Nullable JvmMethodSignature setterSignature) {
        JvmPropertyExtensionVisitor jvmPropertyExtensionVisitor = this.delegate;
        if (jvmPropertyExtensionVisitor != null) {
            jvmPropertyExtensionVisitor.visit(jvmFlags, fieldSignature, getterSignature, setterSignature);
        }
        visit(fieldSignature, getterSignature, setterSignature);
    }

    public void visitEnd() {
        JvmPropertyExtensionVisitor jvmPropertyExtensionVisitor = this.delegate;
        if (jvmPropertyExtensionVisitor != null) {
            jvmPropertyExtensionVisitor.visitEnd();
        }
    }

    public void visitSyntheticMethodForAnnotations(@Nullable JvmMethodSignature signature) {
        JvmPropertyExtensionVisitor jvmPropertyExtensionVisitor = this.delegate;
        if (jvmPropertyExtensionVisitor != null) {
            jvmPropertyExtensionVisitor.visitSyntheticMethodForAnnotations(signature);
        }
    }

    public void visitSyntheticMethodForDelegate(@Nullable JvmMethodSignature signature) {
        JvmPropertyExtensionVisitor jvmPropertyExtensionVisitor = this.delegate;
        if (jvmPropertyExtensionVisitor != null) {
            jvmPropertyExtensionVisitor.visitSyntheticMethodForDelegate(signature);
        }
    }

    @JvmOverloads
    public JvmPropertyExtensionVisitor(@Nullable JvmPropertyExtensionVisitor jvmPropertyExtensionVisitor) {
        this.delegate = jvmPropertyExtensionVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public JvmPropertyExtensionVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use visit(Flags, JvmFieldSignature?, JvmMethodSignature?, JvmMethodSignature?) instead.", replaceWith = @ReplaceWith(expression = "visit(flagsOf(), fieldSignature, getterSignature, setterSignature)", imports = {"kotlinx.metadata.flagsOf"}))
    public void visit(@Nullable JvmFieldSignature fieldSignature, @Nullable JvmMethodSignature getterSignature, @Nullable JvmMethodSignature setterSignature) {
        JvmPropertyExtensionVisitor jvmPropertyExtensionVisitor = this.delegate;
        if (jvmPropertyExtensionVisitor != null) {
            jvmPropertyExtensionVisitor.visit(fieldSignature, getterSignature, setterSignature);
        }
    }
}
