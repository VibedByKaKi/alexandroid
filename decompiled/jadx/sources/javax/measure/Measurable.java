package javax.measure;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public interface Measurable<Q extends Quantity> extends Comparable<Measurable<Q>> {
    double doubleValue(Unit<Q> unit);

    long longValue(Unit<Q> unit) throws ArithmeticException;
}
