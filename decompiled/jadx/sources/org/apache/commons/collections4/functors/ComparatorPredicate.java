package org.apache.commons.collections4.functors;

import androidx.room.Room$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.collections4.Predicate;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ComparatorPredicate<T> implements Predicate<T>, Serializable {
    private static final long serialVersionUID = -1863209236504077399L;
    private final Comparator<T> comparator;
    private final Criterion criterion;
    private final T object;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.apache.commons.collections4.functors.ComparatorPredicate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion;

        static {
            int[] iArr = new int[Criterion.values().length];
            $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion = iArr;
            try {
                iArr[Criterion.EQUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[Criterion.GREATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[Criterion.LESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[Criterion.GREATER_OR_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[Criterion.LESS_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Criterion {
        EQUAL,
        GREATER,
        LESS,
        GREATER_OR_EQUAL,
        LESS_OR_EQUAL
    }

    public ComparatorPredicate(T t, Comparator<T> comparator, Criterion criterion) {
        this.object = t;
        this.comparator = comparator;
        this.criterion = criterion;
    }

    public static <T> Predicate<T> comparatorPredicate(T t, Comparator<T> comparator, Criterion criterion) {
        if (comparator == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Comparator must not be null.");
            return null;
        }
        if (criterion != null) {
            return new ComparatorPredicate(t, comparator, criterion);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("Criterion must not be null.");
        return null;
    }

    @Override // org.apache.commons.collections4.Predicate
    public boolean evaluate(T t) {
        int compare = this.comparator.compare(this.object, t);
        int i = AnonymousClass1.$SwitchMap$org$apache$commons$collections4$functors$ComparatorPredicate$Criterion[this.criterion.ordinal()];
        if (i == 1) {
            return compare == 0;
        }
        if (i == 2) {
            return compare > 0;
        }
        if (i == 3) {
            return compare < 0;
        }
        if (i == 4) {
            return compare >= 0;
        }
        if (i == 5) {
            return compare <= 0;
        }
        Room$$ExternalSyntheticBUOutline0.m$2("The current criterion '", this.criterion, "' is invalid.");
        return false;
    }

    public static <T> Predicate<T> comparatorPredicate(T t, Comparator<T> comparator) {
        return comparatorPredicate(t, comparator, Criterion.EQUAL);
    }
}
