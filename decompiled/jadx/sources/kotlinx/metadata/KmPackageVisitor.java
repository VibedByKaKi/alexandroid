package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00008TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lkotlinx/metadata/KmPackageVisitor;", "Lkotlinx/metadata/KmDeclarationContainerVisitor;", "delegate", "(Lkotlinx/metadata/KmPackageVisitor;)V", "getDelegate", "()Lkotlinx/metadata/KmPackageVisitor;", "visitEnd", "", "visitExtensions", "Lkotlinx/metadata/KmPackageExtensionVisitor;", "type", "Lkotlinx/metadata/KmExtensionType;", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmPackageVisitor extends KmDeclarationContainerVisitor {
    public /* synthetic */ KmPackageVisitor(KmPackageVisitor kmPackageVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmPackageVisitor);
    }

    @Override // kotlinx.metadata.KmDeclarationContainerVisitor
    @Nullable
    public KmPackageVisitor getDelegate() {
        return (KmPackageVisitor) super.getDelegate();
    }

    public void visitEnd() {
        KmPackageVisitor delegate = getDelegate();
        if (delegate != null) {
            delegate.visitEnd();
        }
    }

    @Override // kotlinx.metadata.KmDeclarationContainerVisitor
    @Nullable
    public KmPackageExtensionVisitor visitExtensions(@NotNull KmExtensionType type) {
        type.getClass();
        KmPackageVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitExtensions(type);
        }
        return null;
    }

    @JvmOverloads
    public KmPackageVisitor(@Nullable KmPackageVisitor kmPackageVisitor) {
        super(kmPackageVisitor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmPackageVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
