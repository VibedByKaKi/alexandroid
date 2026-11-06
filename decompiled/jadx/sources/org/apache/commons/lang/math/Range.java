package org.apache.commons.lang.math;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang.text.StrBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class Range {
    public boolean containsDouble(double d) {
        return NumberUtils.compare(getMinimumDouble(), d) <= 0 && NumberUtils.compare(getMaximumDouble(), d) >= 0;
    }

    public boolean containsFloat(float f) {
        return NumberUtils.compare(getMinimumFloat(), f) <= 0 && NumberUtils.compare(getMaximumFloat(), f) >= 0;
    }

    public boolean containsInteger(int i) {
        return i >= getMinimumInteger() && i <= getMaximumInteger();
    }

    public boolean containsLong(long j) {
        return j >= getMinimumLong() && j <= getMaximumLong();
    }

    public abstract boolean containsNumber(Number number);

    public boolean containsRange(Range range) {
        return range != null && containsNumber(range.getMinimumNumber()) && containsNumber(range.getMaximumNumber());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Range range = (Range) obj;
            if (getMinimumNumber().equals(range.getMinimumNumber()) && getMaximumNumber().equals(range.getMaximumNumber())) {
                return true;
            }
        }
        return false;
    }

    public double getMaximumDouble() {
        return getMaximumNumber().doubleValue();
    }

    public float getMaximumFloat() {
        return getMaximumNumber().floatValue();
    }

    public int getMaximumInteger() {
        return getMaximumNumber().intValue();
    }

    public long getMaximumLong() {
        return getMaximumNumber().longValue();
    }

    public abstract Number getMaximumNumber();

    public double getMinimumDouble() {
        return getMinimumNumber().doubleValue();
    }

    public float getMinimumFloat() {
        return getMinimumNumber().floatValue();
    }

    public int getMinimumInteger() {
        return getMinimumNumber().intValue();
    }

    public long getMinimumLong() {
        return getMinimumNumber().longValue();
    }

    public abstract Number getMinimumNumber();

    public int hashCode() {
        return getMaximumNumber().hashCode() + ((getMinimumNumber().hashCode() + ((getClass().hashCode() + 629) * 37)) * 37);
    }

    public boolean overlapsRange(Range range) {
        if (range == null) {
            return false;
        }
        return range.containsNumber(getMinimumNumber()) || range.containsNumber(getMaximumNumber()) || containsNumber(range.getMinimumNumber());
    }

    public String toString() {
        StrBuilder strBuilder = new StrBuilder(32);
        strBuilder.append("Range[");
        strBuilder.append(getMinimumNumber());
        strBuilder.append(AbstractJsonLexerKt.COMMA);
        strBuilder.append(getMaximumNumber());
        strBuilder.append(AbstractJsonLexerKt.END_LIST);
        return strBuilder.toString();
    }

    public boolean containsInteger(Number number) {
        if (number == null) {
            return false;
        }
        return containsInteger(number.intValue());
    }

    public boolean containsLong(Number number) {
        if (number == null) {
            return false;
        }
        return containsLong(number.longValue());
    }

    public boolean containsDouble(Number number) {
        if (number == null) {
            return false;
        }
        return containsDouble(number.doubleValue());
    }

    public boolean containsFloat(Number number) {
        if (number == null) {
            return false;
        }
        return containsFloat(number.floatValue());
    }
}
