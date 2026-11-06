package org.apache.commons.lang.math;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang.text.StrBuilder;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class LongRange extends Range implements Serializable {
    private static final long serialVersionUID = 71849363892720L;
    private transient int hashCode;
    private final long max;
    private transient Long maxObject;
    private final long min;
    private transient Long minObject;
    private transient String toString;

    public LongRange(Number number, Number number2) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (number == null || number2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The numbers must not be null");
            throw null;
        }
        long longValue = number.longValue();
        long longValue2 = number2.longValue();
        if (longValue2 < longValue) {
            this.min = longValue2;
            this.max = longValue;
            if (number2 instanceof Long) {
                this.minObject = (Long) number2;
            }
            if (number instanceof Long) {
                this.maxObject = (Long) number;
                return;
            }
            return;
        }
        this.min = longValue;
        this.max = longValue2;
        if (number instanceof Long) {
            this.minObject = (Long) number;
        }
        if (number2 instanceof Long) {
            this.maxObject = (Long) number2;
        }
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsLong(long j) {
        return j >= this.min && j <= this.max;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsNumber(Number number) {
        if (number == null) {
            return false;
        }
        return containsLong(number.longValue());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean containsRange(Range range) {
        return range != null && containsLong(range.getMinimumLong()) && containsLong(range.getMaximumLong());
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongRange)) {
            return false;
        }
        LongRange longRange = (LongRange) obj;
        return this.min == longRange.min && this.max == longRange.max;
    }

    @Override // org.apache.commons.lang.math.Range
    public double getMaximumDouble() {
        return this.max;
    }

    @Override // org.apache.commons.lang.math.Range
    public float getMaximumFloat() {
        return this.max;
    }

    @Override // org.apache.commons.lang.math.Range
    public int getMaximumInteger() {
        return (int) this.max;
    }

    @Override // org.apache.commons.lang.math.Range
    public long getMaximumLong() {
        return this.max;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMaximumNumber() {
        if (this.maxObject == null) {
            this.maxObject = new Long(this.max);
        }
        return this.maxObject;
    }

    @Override // org.apache.commons.lang.math.Range
    public double getMinimumDouble() {
        return this.min;
    }

    @Override // org.apache.commons.lang.math.Range
    public float getMinimumFloat() {
        return this.min;
    }

    @Override // org.apache.commons.lang.math.Range
    public int getMinimumInteger() {
        return (int) this.min;
    }

    @Override // org.apache.commons.lang.math.Range
    public long getMinimumLong() {
        return this.min;
    }

    @Override // org.apache.commons.lang.math.Range
    public Number getMinimumNumber() {
        if (this.minObject == null) {
            this.minObject = new Long(this.min);
        }
        return this.minObject;
    }

    @Override // org.apache.commons.lang.math.Range
    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 17;
            int hashCode = LongRange.class.hashCode();
            long j = this.min;
            int i = (((hashCode + (17 * 37)) * 37) + ((int) (j ^ (j >> 32)))) * 37;
            long j2 = this.max;
            this.hashCode = i + ((int) (j2 ^ (j2 >> 32)));
        }
        return this.hashCode;
    }

    @Override // org.apache.commons.lang.math.Range
    public boolean overlapsRange(Range range) {
        if (range == null) {
            return false;
        }
        return range.containsLong(this.min) || range.containsLong(this.max) || containsLong(range.getMinimumLong());
    }

    public long[] toArray() {
        int i = (int) ((this.max - this.min) + 1);
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = this.min + i2;
        }
        return jArr;
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

    public LongRange(Number number) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (number != null) {
            this.min = number.longValue();
            this.max = number.longValue();
            if (number instanceof Long) {
                Long l = (Long) number;
                this.minObject = l;
                this.maxObject = l;
                return;
            }
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("The number must not be null");
        throw null;
    }

    public LongRange(long j, long j2) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        if (j2 < j) {
            this.min = j2;
            this.max = j;
        } else {
            this.min = j;
            this.max = j2;
        }
    }

    public LongRange(long j) {
        this.minObject = null;
        this.maxObject = null;
        this.hashCode = 0;
        this.toString = null;
        this.min = j;
        this.max = j;
    }
}
