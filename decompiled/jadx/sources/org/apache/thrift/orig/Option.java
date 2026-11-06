package org.apache.thrift.orig;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class Option<T> {
    private static final Option NONE = new None();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class None<T> extends Option<T> {
        @Override // org.apache.thrift.orig.Option
        public T get() {
            throw new IllegalStateException("Cannot call get() on None");
        }

        @Override // org.apache.thrift.orig.Option
        public boolean isDefined() {
            return false;
        }

        public String toString() {
            return "None";
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Some<T> extends Option<T> {
        private final T value;

        public Some(T t) {
            this.value = t;
        }

        @Override // org.apache.thrift.orig.Option
        public T get() {
            return this.value;
        }

        @Override // org.apache.thrift.orig.Option
        public boolean isDefined() {
            return true;
        }

        public String toString() {
            return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("Some("), MarkdownConstants.RIGHT_PARENTHESIS, this.value);
        }
    }

    public static <T> Option<T> fromNullable(T t) {
        return t != null ? some(t) : none();
    }

    public static <T> None<T> none() {
        return (None) NONE;
    }

    public static <T> Some<T> some(T t) {
        return new Some<>(t);
    }

    public abstract T get();

    public abstract boolean isDefined();

    public T or(T t) {
        return isDefined() ? get() : t;
    }

    public Optional<T> toOptional() {
        return isDefined() ? Optional.of(get()) : Optional.empty();
    }
}
