package autovalue.shaded.com.google.common.hash;

import autovalue.shaded.com.google.common.annotations.Beta;
import autovalue.shaded.com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Beta
@ElementTypesAreNonnullByDefault
@DoNotMock("Implement with a lambda")
/* loaded from: classes15.dex */
public interface Funnel<T> extends Serializable {
    void funnel(@ParametricNullness T t, PrimitiveSink primitiveSink);
}
