package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0000H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/metadata/KmEffectExpressionVisitor;", "", "delegate", "(Lkotlinx/metadata/KmEffectExpressionVisitor;)V", "visit", "", "flags", "", "Lkotlinx/metadata/Flags;", "parameterIndex", "(ILjava/lang/Integer;)V", "visitAndArgument", "visitConstantValue", "value", "visitEnd", "visitIsInstanceType", "Lkotlinx/metadata/KmTypeVisitor;", "visitOrArgument", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmEffectExpressionVisitor {

    @Nullable
    private final KmEffectExpressionVisitor delegate;

    public /* synthetic */ KmEffectExpressionVisitor(KmEffectExpressionVisitor kmEffectExpressionVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmEffectExpressionVisitor);
    }

    public void visit(int flags, @Nullable Integer parameterIndex) {
        KmEffectExpressionVisitor kmEffectExpressionVisitor = this.delegate;
        if (kmEffectExpressionVisitor != null) {
            kmEffectExpressionVisitor.visit(flags, parameterIndex);
        }
    }

    @Nullable
    public KmEffectExpressionVisitor visitAndArgument() {
        KmEffectExpressionVisitor kmEffectExpressionVisitor = this.delegate;
        if (kmEffectExpressionVisitor != null) {
            return kmEffectExpressionVisitor.visitAndArgument();
        }
        return null;
    }

    public void visitConstantValue(@Nullable Object value) {
        KmEffectExpressionVisitor kmEffectExpressionVisitor = this.delegate;
        if (kmEffectExpressionVisitor != null) {
            kmEffectExpressionVisitor.visitConstantValue(value);
        }
    }

    public void visitEnd() {
        KmEffectExpressionVisitor kmEffectExpressionVisitor = this.delegate;
        if (kmEffectExpressionVisitor != null) {
            kmEffectExpressionVisitor.visitEnd();
        }
    }

    @Nullable
    public KmTypeVisitor visitIsInstanceType(int flags) {
        KmEffectExpressionVisitor kmEffectExpressionVisitor = this.delegate;
        if (kmEffectExpressionVisitor != null) {
            return kmEffectExpressionVisitor.visitIsInstanceType(flags);
        }
        return null;
    }

    @Nullable
    public KmEffectExpressionVisitor visitOrArgument() {
        KmEffectExpressionVisitor kmEffectExpressionVisitor = this.delegate;
        if (kmEffectExpressionVisitor != null) {
            return kmEffectExpressionVisitor.visitOrArgument();
        }
        return null;
    }

    @JvmOverloads
    public KmEffectExpressionVisitor(@Nullable KmEffectExpressionVisitor kmEffectExpressionVisitor) {
        this.delegate = kmEffectExpressionVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmEffectExpressionVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
