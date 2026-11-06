package org.apache.commons.lang3.builder;

import java.lang.Throwable;
import org.apache.commons.lang3.builder.AbstractSupplier;
import org.apache.commons.lang3.function.FailableSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class AbstractSupplier<T, B extends AbstractSupplier<T, B, E>, E extends Throwable> implements FailableSupplier<T, E> {
    public B asThis() {
        return this;
    }
}
