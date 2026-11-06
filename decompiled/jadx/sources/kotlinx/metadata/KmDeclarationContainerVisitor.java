package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J6\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0013\u001a\u00060\rj\u0002`\u000e2\n\u0010\u0014\u001a\u00060\rj\u0002`\u000eH\u0016J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0017"}, d2 = {"Lkotlinx/metadata/KmDeclarationContainerVisitor;", "", "delegate", "(Lkotlinx/metadata/KmDeclarationContainerVisitor;)V", "getDelegate", "()Lkotlinx/metadata/KmDeclarationContainerVisitor;", "visitExtensions", "Lkotlinx/metadata/KmDeclarationContainerExtensionVisitor;", "type", "Lkotlinx/metadata/KmExtensionType;", "visitFunction", "Lkotlinx/metadata/KmFunctionVisitor;", "flags", "", "Lkotlinx/metadata/Flags;", "name", "", "visitProperty", "Lkotlinx/metadata/KmPropertyVisitor;", "getterFlags", "setterFlags", "visitTypeAlias", "Lkotlinx/metadata/KmTypeAliasVisitor;", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmDeclarationContainerVisitor {

    @Nullable
    private final KmDeclarationContainerVisitor delegate;

    public /* synthetic */ KmDeclarationContainerVisitor(KmDeclarationContainerVisitor kmDeclarationContainerVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmDeclarationContainerVisitor);
    }

    @Nullable
    public KmDeclarationContainerVisitor getDelegate() {
        return this.delegate;
    }

    @Nullable
    public abstract KmDeclarationContainerExtensionVisitor visitExtensions(@NotNull KmExtensionType type);

    @Nullable
    public KmFunctionVisitor visitFunction(int flags, @NotNull String name) {
        name.getClass();
        KmDeclarationContainerVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitFunction(flags, name);
        }
        return null;
    }

    @Nullable
    public KmPropertyVisitor visitProperty(int flags, @NotNull String name, int getterFlags, int setterFlags) {
        name.getClass();
        KmDeclarationContainerVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitProperty(flags, name, getterFlags, setterFlags);
        }
        return null;
    }

    @Nullable
    public KmTypeAliasVisitor visitTypeAlias(int flags, @NotNull String name) {
        name.getClass();
        KmDeclarationContainerVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitTypeAlias(flags, name);
        }
        return null;
    }

    @JvmOverloads
    public KmDeclarationContainerVisitor(@Nullable KmDeclarationContainerVisitor kmDeclarationContainerVisitor) {
        this.delegate = kmDeclarationContainerVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmDeclarationContainerVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
