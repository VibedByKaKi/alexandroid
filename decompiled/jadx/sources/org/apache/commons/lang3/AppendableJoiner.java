package org.apache.commons.lang3;

import java.io.IOException;
import java.util.Iterator;
import java.util.function.Supplier;
import org.apache.commons.lang3.exception.UncheckedException;
import org.apache.commons.lang3.function.FailableBiConsumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class AppendableJoiner<T> {
    private final FailableBiConsumer<Appendable, T, IOException> appender;
    private final CharSequence delimiter;
    private final CharSequence prefix;
    private final CharSequence suffix;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder<T> implements Supplier<AppendableJoiner<T>> {
        private FailableBiConsumer<Appendable, T, IOException> appender;
        private CharSequence delimiter;
        private CharSequence prefix;
        private CharSequence suffix;

        @Override // java.util.function.Supplier
        public AppendableJoiner<T> get() {
            return new AppendableJoiner<>(this.prefix, this.suffix, this.delimiter, this.appender);
        }

        public Builder<T> setDelimiter(CharSequence charSequence) {
            this.delimiter = charSequence;
            return this;
        }

        public Builder<T> setElementAppender(FailableBiConsumer<Appendable, T, IOException> failableBiConsumer) {
            this.appender = failableBiConsumer;
            return this;
        }

        public Builder<T> setPrefix(CharSequence charSequence) {
            this.prefix = charSequence;
            return this;
        }

        public Builder<T> setSuffix(CharSequence charSequence) {
            this.suffix = charSequence;
            return this;
        }
    }

    private AppendableJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, FailableBiConsumer<Appendable, T, IOException> failableBiConsumer) {
        this.prefix = nonNull(charSequence);
        this.suffix = nonNull(charSequence2);
        this.delimiter = nonNull(charSequence3);
        this.appender = failableBiConsumer == null ? new ThreadUtils$$ExternalSyntheticLambda1(1) : failableBiConsumer;
    }

    public static <T> Builder<T> builder() {
        return new Builder<>();
    }

    private static <A extends Appendable, T> A joinArray(A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, FailableBiConsumer<Appendable, T, IOException> failableBiConsumer, T[] tArr) throws IOException {
        a2.append(charSequence);
        if (tArr != null) {
            if (tArr.length > 0) {
                failableBiConsumer.accept(a2, tArr[0]);
            }
            for (int i = 1; i < tArr.length; i++) {
                a2.append(charSequence3);
                failableBiConsumer.accept(a2, tArr[i]);
            }
        }
        a2.append(charSequence2);
        return a2;
    }

    public static <T> StringBuilder joinI(StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, FailableBiConsumer<Appendable, T, IOException> failableBiConsumer, Iterable<T> iterable) {
        try {
            return (StringBuilder) joinIterable(sb, charSequence, charSequence2, charSequence3, failableBiConsumer, iterable);
        } catch (IOException e) {
            throw new UncheckedException(e);
        }
    }

    private static <A extends Appendable, T> A joinIterable(A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, FailableBiConsumer<Appendable, T, IOException> failableBiConsumer, Iterable<T> iterable) throws IOException {
        a2.append(charSequence);
        if (iterable != null) {
            Iterator<T> it2 = iterable.iterator();
            if (it2.hasNext()) {
                failableBiConsumer.accept(a2, it2.next());
            }
            while (it2.hasNext()) {
                a2.append(charSequence3);
                failableBiConsumer.accept(a2, it2.next());
            }
        }
        a2.append(charSequence2);
        return a2;
    }

    @SafeVarargs
    public static <T> StringBuilder joinSB(StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, FailableBiConsumer<Appendable, T, IOException> failableBiConsumer, T... tArr) {
        try {
            return (StringBuilder) joinArray(sb, charSequence, charSequence2, charSequence3, failableBiConsumer, tArr);
        } catch (IOException e) {
            throw new UncheckedException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Appendable appendable, Object obj) throws IOException {
        appendable.append(String.valueOf(obj));
    }

    private static CharSequence nonNull(CharSequence charSequence) {
        return charSequence != null ? charSequence : "";
    }

    public StringBuilder join(StringBuilder sb, Iterable<T> iterable) {
        return joinI(sb, this.prefix, this.suffix, this.delimiter, this.appender, iterable);
    }

    public <A extends Appendable> A joinA(A a2, Iterable<T> iterable) throws IOException {
        return (A) joinIterable(a2, this.prefix, this.suffix, this.delimiter, this.appender, iterable);
    }

    @SafeVarargs
    public static <A extends Appendable, T> A joinA(A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, FailableBiConsumer<Appendable, T, IOException> failableBiConsumer, T... tArr) throws IOException {
        return (A) joinArray(a2, charSequence, charSequence2, charSequence3, failableBiConsumer, tArr);
    }

    public StringBuilder join(StringBuilder sb, T... tArr) {
        return joinSB(sb, this.prefix, this.suffix, this.delimiter, this.appender, tArr);
    }

    public <A extends Appendable> A joinA(A a2, T... tArr) throws IOException {
        return (A) joinA(a2, this.prefix, this.suffix, this.delimiter, this.appender, tArr);
    }
}
