package kotlinx.metadata;

import com.mapbox.common.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lkotlinx/metadata/KmEffect;", "Lkotlinx/metadata/KmEffectVisitor;", "type", "Lkotlinx/metadata/KmEffectType;", "invocationKind", "Lkotlinx/metadata/KmEffectInvocationKind;", "(Lkotlinx/metadata/KmEffectType;Lkotlinx/metadata/KmEffectInvocationKind;)V", "conclusion", "Lkotlinx/metadata/KmEffectExpression;", "getConclusion", "()Lkotlinx/metadata/KmEffectExpression;", "setConclusion", "(Lkotlinx/metadata/KmEffectExpression;)V", "constructorArguments", "", "getConstructorArguments", "()Ljava/util/List;", "getInvocationKind", "()Lkotlinx/metadata/KmEffectInvocationKind;", "setInvocationKind", "(Lkotlinx/metadata/KmEffectInvocationKind;)V", "getType", "()Lkotlinx/metadata/KmEffectType;", "setType", "(Lkotlinx/metadata/KmEffectType;)V", HttpHeaders.ACCEPT, "", "visitor", "visitConclusionOfConditionalEffect", "Lkotlinx/metadata/KmEffectExpressionVisitor;", "visitConstructorArgument", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class KmEffect extends KmEffectVisitor {

    @Nullable
    private KmEffectExpression conclusion;

    @NotNull
    private final List<KmEffectExpression> constructorArguments;

    @Nullable
    private KmEffectInvocationKind invocationKind;

    @NotNull
    private KmEffectType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KmEffect(@NotNull KmEffectType kmEffectType, @Nullable KmEffectInvocationKind kmEffectInvocationKind) {
        super(null, 1, null);
        kmEffectType.getClass();
        this.type = kmEffectType;
        this.invocationKind = kmEffectInvocationKind;
        this.constructorArguments = new ArrayList(1);
    }

    public final void accept(@NotNull KmEffectVisitor visitor) {
        KmEffectExpressionVisitor visitConclusionOfConditionalEffect;
        visitor.getClass();
        for (KmEffectExpression kmEffectExpression : this.constructorArguments) {
            KmEffectExpressionVisitor visitConstructorArgument = visitor.visitConstructorArgument();
            if (visitConstructorArgument != null) {
                kmEffectExpression.accept(visitConstructorArgument);
            }
        }
        KmEffectExpression kmEffectExpression2 = this.conclusion;
        if (kmEffectExpression2 != null && (visitConclusionOfConditionalEffect = visitor.visitConclusionOfConditionalEffect()) != null) {
            kmEffectExpression2.accept(visitConclusionOfConditionalEffect);
        }
        visitor.visitEnd();
    }

    @Nullable
    public final KmEffectExpression getConclusion() {
        return this.conclusion;
    }

    @NotNull
    public final List<KmEffectExpression> getConstructorArguments() {
        return this.constructorArguments;
    }

    @Nullable
    public final KmEffectInvocationKind getInvocationKind() {
        return this.invocationKind;
    }

    @NotNull
    public final KmEffectType getType() {
        return this.type;
    }

    public final void setConclusion(@Nullable KmEffectExpression kmEffectExpression) {
        this.conclusion = kmEffectExpression;
    }

    public final void setInvocationKind(@Nullable KmEffectInvocationKind kmEffectInvocationKind) {
        this.invocationKind = kmEffectInvocationKind;
    }

    public final void setType(@NotNull KmEffectType kmEffectType) {
        kmEffectType.getClass();
        this.type = kmEffectType;
    }

    @Override // kotlinx.metadata.KmEffectVisitor
    @NotNull
    public KmEffectExpressionVisitor visitConclusionOfConditionalEffect() {
        KmEffectExpression kmEffectExpression = new KmEffectExpression();
        this.conclusion = kmEffectExpression;
        return kmEffectExpression;
    }

    @Override // kotlinx.metadata.KmEffectVisitor
    @NotNull
    public KmEffectExpressionVisitor visitConstructorArgument() {
        return (KmEffectExpressionVisitor) NodesKt.addTo(new KmEffectExpression(), this.constructorArguments);
    }
}
