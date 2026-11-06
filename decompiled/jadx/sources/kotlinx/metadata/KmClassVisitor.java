package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\n2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0017J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\u001c\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0016J\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0016J.\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\u0010\b\u001a\u00060\tj\u0002`\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\"H\u0016J\n\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00008TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006%"}, d2 = {"Lkotlinx/metadata/KmClassVisitor;", "Lkotlinx/metadata/KmDeclarationContainerVisitor;", "delegate", "(Lkotlinx/metadata/KmClassVisitor;)V", "getDelegate", "()Lkotlinx/metadata/KmClassVisitor;", "visit", "", "flags", "", "Lkotlinx/metadata/Flags;", "name", "", "Lkotlinx/metadata/ClassName;", "visitCompanionObject", "visitConstructor", "Lkotlinx/metadata/KmConstructorVisitor;", "visitContextReceiverType", "Lkotlinx/metadata/KmTypeVisitor;", "visitEnd", "visitEnumEntry", "visitExtensions", "Lkotlinx/metadata/KmClassExtensionVisitor;", "type", "Lkotlinx/metadata/KmExtensionType;", "visitInlineClassUnderlyingPropertyName", "visitInlineClassUnderlyingType", "visitNestedClass", "visitSealedSubclass", "visitSupertype", "visitTypeParameter", "Lkotlinx/metadata/KmTypeParameterVisitor;", "id", "variance", "Lkotlinx/metadata/KmVariance;", "visitVersionRequirement", "Lkotlinx/metadata/KmVersionRequirementVisitor;", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmClassVisitor extends KmDeclarationContainerVisitor {
    public /* synthetic */ KmClassVisitor(KmClassVisitor kmClassVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmClassVisitor);
    }

    @Override // kotlinx.metadata.KmDeclarationContainerVisitor
    @Nullable
    public KmClassVisitor getDelegate() {
        return (KmClassVisitor) super.getDelegate();
    }

    public void visit(int flags, @NotNull String name) {
        name.getClass();
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            delegate.visit(flags, name);
        }
    }

    public void visitCompanionObject(@NotNull String name) {
        name.getClass();
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            delegate.visitCompanionObject(name);
        }
    }

    @Nullable
    public KmConstructorVisitor visitConstructor(int flags) {
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitConstructor(flags);
        }
        return null;
    }

    @ExperimentalContextReceivers
    @Nullable
    public KmTypeVisitor visitContextReceiverType(int flags) {
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitContextReceiverType(flags);
        }
        return null;
    }

    public void visitEnd() {
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            delegate.visitEnd();
        }
    }

    public void visitEnumEntry(@NotNull String name) {
        name.getClass();
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            delegate.visitEnumEntry(name);
        }
    }

    @Override // kotlinx.metadata.KmDeclarationContainerVisitor
    @Nullable
    public KmClassExtensionVisitor visitExtensions(@NotNull KmExtensionType type) {
        type.getClass();
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitExtensions(type);
        }
        return null;
    }

    public void visitInlineClassUnderlyingPropertyName(@NotNull String name) {
        name.getClass();
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            delegate.visitInlineClassUnderlyingPropertyName(name);
        }
    }

    @Nullable
    public KmTypeVisitor visitInlineClassUnderlyingType(int flags) {
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitInlineClassUnderlyingType(flags);
        }
        return null;
    }

    public void visitNestedClass(@NotNull String name) {
        name.getClass();
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            delegate.visitNestedClass(name);
        }
    }

    public void visitSealedSubclass(@NotNull String name) {
        name.getClass();
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            delegate.visitSealedSubclass(name);
        }
    }

    @Nullable
    public KmTypeVisitor visitSupertype(int flags) {
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitSupertype(flags);
        }
        return null;
    }

    @Nullable
    public KmTypeParameterVisitor visitTypeParameter(int flags, @NotNull String name, int id, @NotNull KmVariance variance) {
        name.getClass();
        variance.getClass();
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitTypeParameter(flags, name, id, variance);
        }
        return null;
    }

    @Nullable
    public KmVersionRequirementVisitor visitVersionRequirement() {
        KmClassVisitor delegate = getDelegate();
        if (delegate != null) {
            return delegate.visitVersionRequirement();
        }
        return null;
    }

    @JvmOverloads
    public KmClassVisitor(@Nullable KmClassVisitor kmClassVisitor) {
        super(kmClassVisitor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmClassVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
