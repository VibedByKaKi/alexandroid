package com.amazon.coral.google.common.escape;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.common.base.Function;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@DoNotMock("Use Escapers.nullEscaper() or another methods from the *Escapers classes")
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public abstract class Escaper {
    private final Function<String, String> asFunction = new Function() { // from class: com.amazon.coral.google.common.escape.Escaper$$ExternalSyntheticLambda0
        @Override // com.amazon.coral.google.common.base.Function, java.util.function.Function
        public final Object apply(Object obj) {
            return Escaper.this.escape((String) obj);
        }
    };

    public final Function<String, String> asFunction() {
        return this.asFunction;
    }

    public abstract String escape(String str);
}
