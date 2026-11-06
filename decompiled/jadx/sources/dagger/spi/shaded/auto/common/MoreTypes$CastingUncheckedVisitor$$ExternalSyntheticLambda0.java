package dagger.spi.shaded.auto.common;

import dagger.spi.shaded.auto.common.MoreTypes;
import java.util.function.Predicate;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MoreTypes$CastingUncheckedVisitor$$ExternalSyntheticLambda0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean uncheckedTypeArgument;
        uncheckedTypeArgument = MoreTypes.CastingUncheckedVisitor.uncheckedTypeArgument((TypeMirror) obj);
        return uncheckedTypeArgument;
    }
}
