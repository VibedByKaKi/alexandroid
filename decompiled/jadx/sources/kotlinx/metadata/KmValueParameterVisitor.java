package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0016J\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\u0010\f\u001a\u00060\rj\u0002`\u000eH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/metadata/KmValueParameterVisitor;", "", "delegate", "(Lkotlinx/metadata/KmValueParameterVisitor;)V", "visitEnd", "", "visitExtensions", "Lkotlinx/metadata/KmValueParameterExtensionVisitor;", "type", "Lkotlinx/metadata/KmExtensionType;", "visitType", "Lkotlinx/metadata/KmTypeVisitor;", "flags", "", "Lkotlinx/metadata/Flags;", "visitVarargElementType", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmValueParameterVisitor {

    @Nullable
    private final KmValueParameterVisitor delegate;

    public /* synthetic */ KmValueParameterVisitor(KmValueParameterVisitor kmValueParameterVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmValueParameterVisitor);
    }

    public void visitEnd() {
        KmValueParameterVisitor kmValueParameterVisitor = this.delegate;
        if (kmValueParameterVisitor != null) {
            kmValueParameterVisitor.visitEnd();
        }
    }

    @Nullable
    public KmValueParameterExtensionVisitor visitExtensions(@NotNull KmExtensionType type) {
        type.getClass();
        KmValueParameterVisitor kmValueParameterVisitor = this.delegate;
        if (kmValueParameterVisitor != null) {
            return kmValueParameterVisitor.visitExtensions(type);
        }
        return null;
    }

    @Nullable
    public KmTypeVisitor visitType(int flags) {
        KmValueParameterVisitor kmValueParameterVisitor = this.delegate;
        if (kmValueParameterVisitor != null) {
            return kmValueParameterVisitor.visitType(flags);
        }
        return null;
    }

    @Nullable
    public KmTypeVisitor visitVarargElementType(int flags) {
        KmValueParameterVisitor kmValueParameterVisitor = this.delegate;
        if (kmValueParameterVisitor != null) {
            return kmValueParameterVisitor.visitVarargElementType(flags);
        }
        return null;
    }

    @JvmOverloads
    public KmValueParameterVisitor(@Nullable KmValueParameterVisitor kmValueParameterVisitor) {
        this.delegate = kmValueParameterVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmValueParameterVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
