package org.apache.commons.lang3;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Range<T> implements Serializable {
    private static final long serialVersionUID = 1;
    private final Comparator<T> comparator;
    private transient int hashCode;
    private final T maximum;
    private final T minimum;
    private transient String toString;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ComparableComparator implements Comparator {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    public Range(T t, T t2, Comparator<T> comparator) {
        Objects.requireNonNull(t, "element1");
        Objects.requireNonNull(t2, "element2");
        if (comparator == null) {
            this.comparator = ComparableComparator.INSTANCE;
        } else {
            this.comparator = comparator;
        }
        if (this.comparator.compare(t, t2) < 1) {
            this.minimum = t;
            this.maximum = t2;
        } else {
            this.minimum = t2;
            this.maximum = t;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<-TT;>;>(TT;TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    @Deprecated
    public static Range between(Comparable comparable, Comparable comparable2) {
        return of(comparable, comparable2, null);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<-TT;>;>(TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    public static Range is(Comparable comparable) {
        return of(comparable, comparable, null);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/lang/Comparable<-TT;>;>(TT;TT;)Lorg/apache/commons/lang3/Range<TT;>; */
    public static Range of(Comparable comparable, Comparable comparable2) {
        return of(comparable, comparable2, null);
    }

    public boolean contains(T t) {
        return t != null && this.comparator.compare(t, this.minimum) > -1 && this.comparator.compare(t, this.maximum) < 1;
    }

    public boolean containsRange(Range<T> range) {
        return range != null && contains(range.minimum) && contains(range.maximum);
    }

    public int elementCompareTo(T t) {
        Objects.requireNonNull(t, "element");
        if (isAfter(t)) {
            return -1;
        }
        return isBefore(t) ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Range range = (Range) obj;
            if (this.minimum.equals(range.minimum) && this.maximum.equals(range.maximum)) {
                return true;
            }
        }
        return false;
    }

    public T fit(T t) {
        Objects.requireNonNull(t, "element");
        return isAfter(t) ? this.minimum : isBefore(t) ? this.maximum : t;
    }

    public Comparator<T> getComparator() {
        return this.comparator;
    }

    public T getMaximum() {
        return this.maximum;
    }

    public T getMinimum() {
        return this.minimum;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.maximum.hashCode() + ((this.minimum.hashCode() + ((getClass().hashCode() + 629) * 37)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    public Range<T> intersectionWith(Range<T> range) {
        if (!isOverlappedBy(range)) {
            Buffer$$ExternalSyntheticBUOutline0.m("Cannot calculate intersection with non-overlapping range %s", new Object[]{range});
            return null;
        }
        if (equals(range)) {
            return this;
        }
        T t = getComparator().compare(this.minimum, range.minimum) < 0 ? range.minimum : this.minimum;
        if (getComparator().compare(this.maximum, range.maximum) < 0) {
            range = this;
        }
        return of(t, range.maximum, getComparator());
    }

    public boolean isAfter(T t) {
        return t != null && this.comparator.compare(t, this.minimum) < 0;
    }

    public boolean isAfterRange(Range<T> range) {
        if (range == null) {
            return false;
        }
        return isAfter(range.maximum);
    }

    public boolean isBefore(T t) {
        return t != null && this.comparator.compare(t, this.maximum) > 0;
    }

    public boolean isBeforeRange(Range<T> range) {
        if (range == null) {
            return false;
        }
        return isBefore(range.minimum);
    }

    public boolean isEndedBy(T t) {
        return t != null && this.comparator.compare(t, this.maximum) == 0;
    }

    public boolean isNaturalOrdering() {
        return this.comparator == ComparableComparator.INSTANCE;
    }

    public boolean isOverlappedBy(Range<T> range) {
        if (range == null) {
            return false;
        }
        return range.contains(this.minimum) || range.contains(this.maximum) || contains(range.minimum);
    }

    public boolean isStartedBy(T t) {
        return t != null && this.comparator.compare(t, this.minimum) == 0;
    }

    public String toString() {
        if (this.toString == null) {
            StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
            sb.append(this.minimum);
            sb.append("..");
            this.toString = ErrorUtils$$ExternalSyntheticOutline0.m(sb, MarkdownConstants.RIGHT_BRACKET, this.maximum);
        }
        return this.toString;
    }

    @Deprecated
    public static <T> Range<T> between(T t, T t2, Comparator<T> comparator) {
        return new Range<>(t, t2, comparator);
    }

    public static <T> Range<T> is(T t, Comparator<T> comparator) {
        return of(t, t, comparator);
    }

    public static <T> Range<T> of(T t, T t2, Comparator<T> comparator) {
        return new Range<>(t, t2, comparator);
    }

    public String toString(String str) {
        return String.format(str, this.minimum, this.maximum, this.comparator);
    }
}
