package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlinx/metadata/KmModuleFragmentVisitor;", "", "delegate", "(Lkotlinx/metadata/KmModuleFragmentVisitor;)V", "visitClass", "Lkotlinx/metadata/KmClassVisitor;", "visitEnd", "", "visitExtensions", "Lkotlinx/metadata/KmModuleFragmentExtensionVisitor;", "type", "Lkotlinx/metadata/KmExtensionType;", "visitPackage", "Lkotlinx/metadata/KmPackageVisitor;", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmModuleFragmentVisitor {

    @Nullable
    private final KmModuleFragmentVisitor delegate;

    public /* synthetic */ KmModuleFragmentVisitor(KmModuleFragmentVisitor kmModuleFragmentVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmModuleFragmentVisitor);
    }

    @Nullable
    public KmClassVisitor visitClass() {
        KmModuleFragmentVisitor kmModuleFragmentVisitor = this.delegate;
        if (kmModuleFragmentVisitor != null) {
            return kmModuleFragmentVisitor.visitClass();
        }
        return null;
    }

    public void visitEnd() {
        KmModuleFragmentVisitor kmModuleFragmentVisitor = this.delegate;
        if (kmModuleFragmentVisitor != null) {
            kmModuleFragmentVisitor.visitEnd();
        }
    }

    @Nullable
    public KmModuleFragmentExtensionVisitor visitExtensions(@NotNull KmExtensionType type) {
        type.getClass();
        KmModuleFragmentVisitor kmModuleFragmentVisitor = this.delegate;
        if (kmModuleFragmentVisitor != null) {
            return kmModuleFragmentVisitor.visitExtensions(type);
        }
        return null;
    }

    @Nullable
    public KmPackageVisitor visitPackage() {
        KmModuleFragmentVisitor kmModuleFragmentVisitor = this.delegate;
        if (kmModuleFragmentVisitor != null) {
            return kmModuleFragmentVisitor.visitPackage();
        }
        return null;
    }

    @JvmOverloads
    public KmModuleFragmentVisitor(@Nullable KmModuleFragmentVisitor kmModuleFragmentVisitor) {
        this.delegate = kmModuleFragmentVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmModuleFragmentVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
