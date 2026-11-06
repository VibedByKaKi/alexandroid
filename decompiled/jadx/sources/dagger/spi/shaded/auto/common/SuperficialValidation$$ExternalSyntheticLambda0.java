package dagger.spi.shaded.auto.common;

import java.util.function.Predicate;
import javax.lang.model.element.Element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class SuperficialValidation$$ExternalSyntheticLambda0 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return SuperficialValidation.validateElement((Element) obj);
    }
}
