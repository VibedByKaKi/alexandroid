package org.apache.commons.lang3.tuple;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.function.FailableBiConsumer;
import org.apache.commons.lang3.function.FailableBiFunction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class Pair<L, R> implements Map.Entry<L, R>, Comparable<Pair<L, R>>, Serializable {
    public static final Pair<?, ?>[] EMPTY_ARRAY = new Pair[0];
    private static final long serialVersionUID = 4954918890077093841L;

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> Pair<L, R>[] emptyArray() {
        return (Pair<L, R>[]) EMPTY_ARRAY;
    }

    public static <L, R> Pair<L, R> of(L l, R r) {
        return ImmutablePair.of((Object) l, (Object) r);
    }

    public static <L, R> Pair<L, R> ofNonNull(L l, R r) {
        return ImmutablePair.ofNonNull((Object) l, (Object) r);
    }

    public <E extends Throwable> void accept(FailableBiConsumer<L, R, E> failableBiConsumer) throws Throwable {
        failableBiConsumer.accept(getKey(), getValue());
    }

    public <V, E extends Throwable> V apply(FailableBiFunction<L, R, V, E> failableBiFunction) throws Throwable {
        return failableBiFunction.apply(getKey(), getValue());
    }

    @Override // java.lang.Comparable
    public int compareTo(Pair<L, R> pair) {
        return new CompareToBuilder().append(getLeft(), pair.getLeft()).append(getRight(), pair.getRight()).toComparison();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(getKey(), entry.getKey()) && Objects.equals(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
        return getLeft();
    }

    public abstract L getLeft();

    public abstract R getRight();

    @Override // java.util.Map.Entry
    public R getValue() {
        return getRight();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hashCode(getValue()) ^ Objects.hashCode(getKey());
    }

    public String toString() {
        return MarkdownConstants.LEFT_PARENTHESIS + getLeft() + AbstractJsonLexerKt.COMMA + getRight() + ')';
    }

    public static <L, R> Pair<L, R> of(Map.Entry<L, R> entry) {
        return ImmutablePair.of((Map.Entry) entry);
    }

    public String toString(String str) {
        return String.format(str, getLeft(), getRight());
    }
}
