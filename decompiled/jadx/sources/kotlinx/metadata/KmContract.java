package kotlinx.metadata;

import com.mapbox.common.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lkotlinx/metadata/KmContract;", "Lkotlinx/metadata/KmContractVisitor;", "()V", "effects", "", "Lkotlinx/metadata/KmEffect;", "getEffects", "()Ljava/util/List;", HttpHeaders.ACCEPT, "", "visitor", "visitEffect", "Lkotlinx/metadata/KmEffectVisitor;", "type", "Lkotlinx/metadata/KmEffectType;", "invocationKind", "Lkotlinx/metadata/KmEffectInvocationKind;", "kotlinx-metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class KmContract extends KmContractVisitor {

    @NotNull
    private final List<KmEffect> effects;

    public KmContract() {
        super(null, 1, null);
        this.effects = new ArrayList(1);
    }

    public final void accept(@NotNull KmContractVisitor visitor) {
        visitor.getClass();
        for (KmEffect kmEffect : this.effects) {
            KmEffectVisitor visitEffect = visitor.visitEffect(kmEffect.getType(), kmEffect.getInvocationKind());
            if (visitEffect != null) {
                kmEffect.accept(visitEffect);
            }
        }
        visitor.visitEnd();
    }

    @NotNull
    public final List<KmEffect> getEffects() {
        return this.effects;
    }

    @Override // kotlinx.metadata.KmContractVisitor
    @NotNull
    public KmEffectVisitor visitEffect(@NotNull KmEffectType type, @Nullable KmEffectInvocationKind invocationKind) {
        type.getClass();
        return (KmEffectVisitor) NodesKt.addTo(new KmEffect(type, invocationKind), this.effects);
    }
}
