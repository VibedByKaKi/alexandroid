package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0016\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J.\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\u0010\u000b\u001a\u00060\fj\u0002`\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\u0004\u0018\u00010\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/metadata/KmTypeAliasVisitor;", "", "delegate", "(Lkotlinx/metadata/KmTypeAliasVisitor;)V", "visitAnnotation", "", "annotation", "Lkotlinx/metadata/KmAnnotation;", "visitEnd", "visitExpandedType", "Lkotlinx/metadata/KmTypeVisitor;", "flags", "", "Lkotlinx/metadata/Flags;", "visitExtensions", "Lkotlinx/metadata/KmTypeAliasExtensionVisitor;", "type", "Lkotlinx/metadata/KmExtensionType;", "visitTypeParameter", "Lkotlinx/metadata/KmTypeParameterVisitor;", "name", "", "id", "variance", "Lkotlinx/metadata/KmVariance;", "visitUnderlyingType", "visitVersionRequirement", "Lkotlinx/metadata/KmVersionRequirementVisitor;", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmTypeAliasVisitor {

    @Nullable
    private final KmTypeAliasVisitor delegate;

    public /* synthetic */ KmTypeAliasVisitor(KmTypeAliasVisitor kmTypeAliasVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmTypeAliasVisitor);
    }

    public void visitAnnotation(@NotNull KmAnnotation annotation) {
        annotation.getClass();
        KmTypeAliasVisitor kmTypeAliasVisitor = this.delegate;
        if (kmTypeAliasVisitor != null) {
            kmTypeAliasVisitor.visitAnnotation(annotation);
        }
    }

    public void visitEnd() {
        KmTypeAliasVisitor kmTypeAliasVisitor = this.delegate;
        if (kmTypeAliasVisitor != null) {
            kmTypeAliasVisitor.visitEnd();
        }
    }

    @Nullable
    public KmTypeVisitor visitExpandedType(int flags) {
        KmTypeAliasVisitor kmTypeAliasVisitor = this.delegate;
        if (kmTypeAliasVisitor != null) {
            return kmTypeAliasVisitor.visitExpandedType(flags);
        }
        return null;
    }

    @Nullable
    public KmTypeAliasExtensionVisitor visitExtensions(@NotNull KmExtensionType type) {
        type.getClass();
        KmTypeAliasVisitor kmTypeAliasVisitor = this.delegate;
        if (kmTypeAliasVisitor != null) {
            return kmTypeAliasVisitor.visitExtensions(type);
        }
        return null;
    }

    @Nullable
    public KmTypeParameterVisitor visitTypeParameter(int flags, @NotNull String name, int id, @NotNull KmVariance variance) {
        name.getClass();
        variance.getClass();
        KmTypeAliasVisitor kmTypeAliasVisitor = this.delegate;
        if (kmTypeAliasVisitor != null) {
            return kmTypeAliasVisitor.visitTypeParameter(flags, name, id, variance);
        }
        return null;
    }

    @Nullable
    public KmTypeVisitor visitUnderlyingType(int flags) {
        KmTypeAliasVisitor kmTypeAliasVisitor = this.delegate;
        if (kmTypeAliasVisitor != null) {
            return kmTypeAliasVisitor.visitUnderlyingType(flags);
        }
        return null;
    }

    @Nullable
    public KmVersionRequirementVisitor visitVersionRequirement() {
        KmTypeAliasVisitor kmTypeAliasVisitor = this.delegate;
        if (kmTypeAliasVisitor != null) {
            return kmTypeAliasVisitor.visitVersionRequirement();
        }
        return null;
    }

    @JvmOverloads
    public KmTypeAliasVisitor(@Nullable KmTypeAliasVisitor kmTypeAliasVisitor) {
        this.delegate = kmTypeAliasVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmTypeAliasVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
