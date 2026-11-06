package kotlinx.metadata;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/metadata/KmContractVisitor;", "", "delegate", "(Lkotlinx/metadata/KmContractVisitor;)V", "visitEffect", "Lkotlinx/metadata/KmEffectVisitor;", "type", "Lkotlinx/metadata/KmEffectType;", "invocationKind", "Lkotlinx/metadata/KmEffectInvocationKind;", "visitEnd", "", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public abstract class KmContractVisitor {

    @Nullable
    private final KmContractVisitor delegate;

    public /* synthetic */ KmContractVisitor(KmContractVisitor kmContractVisitor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kmContractVisitor);
    }

    @Nullable
    public KmEffectVisitor visitEffect(@NotNull KmEffectType type, @Nullable KmEffectInvocationKind invocationKind) {
        type.getClass();
        KmContractVisitor kmContractVisitor = this.delegate;
        if (kmContractVisitor != null) {
            return kmContractVisitor.visitEffect(type, invocationKind);
        }
        return null;
    }

    public void visitEnd() {
        KmContractVisitor kmContractVisitor = this.delegate;
        if (kmContractVisitor != null) {
            kmContractVisitor.visitEnd();
        }
    }

    @JvmOverloads
    public KmContractVisitor(@Nullable KmContractVisitor kmContractVisitor) {
        this.delegate = kmContractVisitor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public KmContractVisitor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
