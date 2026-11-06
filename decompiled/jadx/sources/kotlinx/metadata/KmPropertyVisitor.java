package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0017J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J.\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/metadata/KmPropertyVisitor;", "", "delegate", "(Lkotlinx/metadata/KmPropertyVisitor;)V", "visitContextReceiverType", "Lkotlinx/metadata/KmTypeVisitor;", "flags", "", "Lkotlinx/metadata/Flags;", "visitEnd", "", "visitExtensions", "Lkotlinx/metadata/KmPropertyExtensionVisitor;", "type", "Lkotlinx/metadata/KmExtensionType;", "visitReceiverParameterType", "visitReturnType", "visitSetterParameter", "Lkotlinx/metadata/KmValueParameterVisitor;", "name", "", "visitTypeParameter", "Lkotlinx/metadata/KmTypeParameterVisitor;", "id", "variance", "Lkotlinx/metadata/KmVariance;", "visitVersionRequirement", "Lkotlinx/metadata/KmVersionRequirementVisitor;", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmPropertyVisitor {

    @Nullable
    private final KmPropertyVisitor delegate;

    public /* synthetic */ KmPropertyVisitor(KmPropertyVisitor kmPropertyVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmPropertyVisitor);
    }

    @ExperimentalContextReceivers
    @Nullable
    public KmTypeVisitor visitContextReceiverType(int flags) {
        KmPropertyVisitor kmPropertyVisitor = this.delegate;
        if (kmPropertyVisitor != null) {
            return kmPropertyVisitor.visitContextReceiverType(flags);
        }
        return null;
    }

    public void visitEnd() {
        KmPropertyVisitor kmPropertyVisitor = this.delegate;
        if (kmPropertyVisitor != null) {
            kmPropertyVisitor.visitEnd();
        }
    }

    @Nullable
    public KmPropertyExtensionVisitor visitExtensions(@NotNull KmExtensionType type) {
        type.getClass();
        KmPropertyVisitor kmPropertyVisitor = this.delegate;
        if (kmPropertyVisitor != null) {
            return kmPropertyVisitor.visitExtensions(type);
        }
        return null;
    }

    @Nullable
    public KmTypeVisitor visitReceiverParameterType(int flags) {
        KmPropertyVisitor kmPropertyVisitor = this.delegate;
        if (kmPropertyVisitor != null) {
            return kmPropertyVisitor.visitReceiverParameterType(flags);
        }
        return null;
    }

    @Nullable
    public KmTypeVisitor visitReturnType(int flags) {
        KmPropertyVisitor kmPropertyVisitor = this.delegate;
        if (kmPropertyVisitor != null) {
            return kmPropertyVisitor.visitReturnType(flags);
        }
        return null;
    }

    @Nullable
    public KmValueParameterVisitor visitSetterParameter(int flags, @NotNull String name) {
        name.getClass();
        KmPropertyVisitor kmPropertyVisitor = this.delegate;
        if (kmPropertyVisitor != null) {
            return kmPropertyVisitor.visitSetterParameter(flags, name);
        }
        return null;
    }

    @Nullable
    public KmTypeParameterVisitor visitTypeParameter(int flags, @NotNull String name, int id, @NotNull KmVariance variance) {
        name.getClass();
        variance.getClass();
        KmPropertyVisitor kmPropertyVisitor = this.delegate;
        if (kmPropertyVisitor != null) {
            return kmPropertyVisitor.visitTypeParameter(flags, name, id, variance);
        }
        return null;
    }

    @Nullable
    public KmVersionRequirementVisitor visitVersionRequirement() {
        KmPropertyVisitor kmPropertyVisitor = this.delegate;
        if (kmPropertyVisitor != null) {
            return kmPropertyVisitor.visitVersionRequirement();
        }
        return null;
    }

    @JvmOverloads
    public KmPropertyVisitor(@Nullable KmPropertyVisitor kmPropertyVisitor) {
        this.delegate = kmPropertyVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmPropertyVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
