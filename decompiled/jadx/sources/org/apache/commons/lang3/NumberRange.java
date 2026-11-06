package org.apache.commons.lang3;

import java.lang.Number;
import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class NumberRange<N extends Number> extends Range<N> {
    private static final long serialVersionUID = 1;

    public NumberRange(N n, N n2, Comparator<N> comparator) {
        super(n, n2, comparator);
    }
}
