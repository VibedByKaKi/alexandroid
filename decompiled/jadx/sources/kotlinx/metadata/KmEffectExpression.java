package kotlinx.metadata;

import com.mapbox.common.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0001J#\u0010$\u001a\u00020\"2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0001H\u0016J\u0012\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0014\u0010*\u001a\u00020+2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\b\u0010,\u001a\u00020\u0001H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00060\u000ej\u0002`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lkotlinx/metadata/KmEffectExpression;", "Lkotlinx/metadata/KmEffectExpressionVisitor;", "()V", "andArguments", "", "getAndArguments", "()Ljava/util/List;", "constantValue", "Lkotlinx/metadata/KmConstantValue;", "getConstantValue", "()Lkotlinx/metadata/KmConstantValue;", "setConstantValue", "(Lkotlinx/metadata/KmConstantValue;)V", "flags", "", "Lkotlinx/metadata/Flags;", "getFlags", "()I", "setFlags", "(I)V", "isInstanceType", "Lkotlinx/metadata/KmType;", "()Lkotlinx/metadata/KmType;", "setInstanceType", "(Lkotlinx/metadata/KmType;)V", "orArguments", "getOrArguments", "parameterIndex", "getParameterIndex", "()Ljava/lang/Integer;", "setParameterIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", HttpHeaders.ACCEPT, "", "visitor", "visit", "(ILjava/lang/Integer;)V", "visitAndArgument", "visitConstantValue", "value", "", "visitIsInstanceType", "Lkotlinx/metadata/KmTypeVisitor;", "visitOrArgument", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class KmEffectExpression extends KmEffectExpressionVisitor {

    @NotNull
    private final List<KmEffectExpression> andArguments;

    @Nullable
    private KmConstantValue constantValue;
    private int flags;

    @Nullable
    private KmType isInstanceType;

    @NotNull
    private final List<KmEffectExpression> orArguments;

    @Nullable
    private Integer parameterIndex;

    public KmEffectExpression() {
        super(null, 1, null);
        this.flags = FlagsKt.flagsOf(new Flag[0]);
        this.andArguments = new ArrayList(0);
        this.orArguments = new ArrayList(0);
    }

    public final void accept(@NotNull KmEffectExpressionVisitor visitor) {
        KmTypeVisitor visitIsInstanceType;
        visitor.getClass();
        visitor.visit(this.flags, this.parameterIndex);
        KmConstantValue kmConstantValue = this.constantValue;
        if (kmConstantValue != null) {
            visitor.visitConstantValue(kmConstantValue.getValue());
        }
        KmType kmType = this.isInstanceType;
        if (kmType != null && (visitIsInstanceType = visitor.visitIsInstanceType(kmType.getFlags())) != null) {
            kmType.accept(visitIsInstanceType);
        }
        for (KmEffectExpression kmEffectExpression : this.andArguments) {
            KmEffectExpressionVisitor visitAndArgument = visitor.visitAndArgument();
            if (visitAndArgument != null) {
                kmEffectExpression.accept(visitAndArgument);
            }
        }
        for (KmEffectExpression kmEffectExpression2 : this.orArguments) {
            KmEffectExpressionVisitor visitOrArgument = visitor.visitOrArgument();
            if (visitOrArgument != null) {
                kmEffectExpression2.accept(visitOrArgument);
            }
        }
        visitor.visitEnd();
    }

    @NotNull
    public final List<KmEffectExpression> getAndArguments() {
        return this.andArguments;
    }

    @Nullable
    public final KmConstantValue getConstantValue() {
        return this.constantValue;
    }

    public final int getFlags() {
        return this.flags;
    }

    @NotNull
    public final List<KmEffectExpression> getOrArguments() {
        return this.orArguments;
    }

    @Nullable
    public final Integer getParameterIndex() {
        return this.parameterIndex;
    }

    @Nullable
    /* renamed from: isInstanceType, reason: from getter */
    public final KmType getIsInstanceType() {
        return this.isInstanceType;
    }

    public final void setConstantValue(@Nullable KmConstantValue kmConstantValue) {
        this.constantValue = kmConstantValue;
    }

    public final void setFlags(int i) {
        this.flags = i;
    }

    public final void setInstanceType(@Nullable KmType kmType) {
        this.isInstanceType = kmType;
    }

    public final void setParameterIndex(@Nullable Integer num) {
        this.parameterIndex = num;
    }

    @Override // kotlinx.metadata.KmEffectExpressionVisitor
    public void visit(int flags, @Nullable Integer parameterIndex) {
        this.flags = flags;
        this.parameterIndex = parameterIndex;
    }

    @Override // kotlinx.metadata.KmEffectExpressionVisitor
    @NotNull
    public KmEffectExpressionVisitor visitAndArgument() {
        return (KmEffectExpressionVisitor) NodesKt.addTo(new KmEffectExpression(), this.andArguments);
    }

    @Override // kotlinx.metadata.KmEffectExpressionVisitor
    public void visitConstantValue(@Nullable Object value) {
        this.constantValue = new KmConstantValue(value);
    }

    @Override // kotlinx.metadata.KmEffectExpressionVisitor
    @NotNull
    public KmTypeVisitor visitIsInstanceType(int flags) {
        KmType kmType = new KmType(flags);
        this.isInstanceType = kmType;
        return kmType;
    }

    @Override // kotlinx.metadata.KmEffectExpressionVisitor
    @NotNull
    public KmEffectExpressionVisitor visitOrArgument() {
        return (KmEffectExpressionVisitor) NodesKt.addTo(new KmEffectExpression(), this.orArguments);
    }
}
