package org.apache.commons.lang.math;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang.text.StrBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class NumberRange extends Range implements Serializable {
    private static final long serialVersionUID = 71849363892710L;
    private final Number max;
    private final Number min;
    private transient int hashCode = 0;
    private transient String toString = null;

    /* JADX WARN: Multi-variable type inference failed */
    public NumberRange(Number number, Number number2) {
        if (number == 0 || number2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The numbers must not be null");
            throw null;
        }
        if (number.getClass() != number2.getClass()) {
            Single$$ExternalSyntheticBUOutline0.m$3("The numbers must be of the same type");
            throw null;
        }
        if (!(number instanceof Comparable)) {
            Single$$ExternalSyntheticBUOutline0.m$3("The numbers must implement Comparable");
            throw null;
        }
        if (number instanceof Double) {
            if (((Double) number).isNaN() || ((Double) number2).isNaN()) {
                Single$$ExternalSyntheticBUOutline0.m$3("The number must not be NaN");
                throw null;
            }
        } else if ((number instanceof Float) && (((Float) number).isNaN() || ((Float) number2).isNaN())) {
            Single$$ExternalSyntheticBUOutline0.m$3("The number must not be NaN");
            throw null;
        }
        int compareTo = ((Comparable) number).compareTo(number2);
        if (compareTo == 0) {
            this.min = number;
            this.max = number;
        } else if (compareTo > 0) {
            this.min = number2;
            this.max = number;
        } else {
            this.min = number;
            this.max = number2;
        }
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        if (number.getClass() == this.min.getClass()) {
            return ((Comparable) this.min).compareTo(number) <= 0 && ((Comparable) this.max).compareTo(number) >= 0;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The number must be of the same type as the range numbers");
        return false;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NumberRange)) {
            return false;
        }
        NumberRange numberRange = (NumberRange) obj;
        return this.min.equals(numberRange.min) && this.max.equals(numberRange.max);
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMaximumNumber() {
        return this.max;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMinimumNumber() {
        return this.min;
    }

    @Override // org.apache.commons.lang.math.Range
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 17;
            int hashCode = NumberRange.class.hashCode() + (17 * 37);
            this.hashCode = hashCode;
            int hashCode2 = this.min.hashCode() + (hashCode * 37);
            this.hashCode = hashCode2;
            this.hashCode = this.max.hashCode() + (hashCode2 * 37);
        }
        return this.hashCode;
    }

    @Override // org.apache.commons.lang.math.Range
    public String toString() {
        if (this.toString == null) {
            StrBuilder strBuilder = new StrBuilder(32);
            strBuilder.append("Range[");
            strBuilder.append(this.min);
            strBuilder.append(AbstractJsonLexerKt.COMMA);
            strBuilder.append(this.max);
            strBuilder.append(AbstractJsonLexerKt.END_LIST);
            this.toString = strBuilder.toString();
        }
        return this.toString;
    }

    public NumberRange(Number number) {
        if (number != null) {
            if (number instanceof Comparable) {
                if ((number instanceof Double) && ((Double) number).isNaN()) {
                    Single$$ExternalSyntheticBUOutline0.m$3("The number must not be NaN");
                    throw null;
                }
                if ((number instanceof Float) && ((Float) number).isNaN()) {
                    Single$$ExternalSyntheticBUOutline0.m$3("The number must not be NaN");
                    throw null;
                }
                this.min = number;
                this.max = number;
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("The number must implement Comparable");
            throw null;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The number must not be null");
        throw null;
    }
}
