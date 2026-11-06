package kotlinx.metadata.jvm;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.metadata.KmDeclarationContainerExtensionVisitor;
import kotlinx.metadata.KmPropertyVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J6\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\tj\u0002`\n2\n\u0010\u000e\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"Lkotlinx/metadata/jvm/JvmDeclarationContainerExtensionVisitor;", "Lkotlinx/metadata/KmDeclarationContainerExtensionVisitor;", "delegate", "(Lkotlinx/metadata/jvm/JvmDeclarationContainerExtensionVisitor;)V", "getDelegate", "()Lkotlinx/metadata/jvm/JvmDeclarationContainerExtensionVisitor;", "visitLocalDelegatedProperty", "Lkotlinx/metadata/KmPropertyVisitor;", "flags", "", "Lkotlinx/metadata/Flags;", "name", "", "getterFlags", "setterFlags", "visitModuleName", "", "kotlinx-metadata-jvm"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class JvmDeclarationContainerExtensionVisitor implements KmDeclarationContainerExtensionVisitor {

    @Nullable
    private final JvmDeclarationContainerExtensionVisitor delegate;

    public /* synthetic */ JvmDeclarationContainerExtensionVisitor(JvmDeclarationContainerExtensionVisitor jvmDeclarationContainerExtensionVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jvmDeclarationContainerExtensionVisitor);
    }

    @Nullable
    public JvmDeclarationContainerExtensionVisitor getDelegate() {
        return this.delegate;
    }

    @Nullable
    public KmPropertyVisitor visitLocalDelegatedProperty(int flags, @NotNull String name, int getterFlags, int setterFlags) {
        name.getClass();
        JvmDeclarationContainerExtensionVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitLocalDelegatedProperty(flags, name, getterFlags, setterFlags);
        }
        return null;
    }

    public void visitModuleName(@NotNull String name) {
        name.getClass();
        JvmDeclarationContainerExtensionVisitor delegate = getDelegate();
        if (delegate != null) {
            delegate.visitModuleName(name);
        }
    }

    @JvmOverloads
    public JvmDeclarationContainerExtensionVisitor(@Nullable JvmDeclarationContainerExtensionVisitor jvmDeclarationContainerExtensionVisitor) {
        this.delegate = jvmDeclarationContainerExtensionVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public JvmDeclarationContainerExtensionVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
