package dagger.producers;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@CheckReturnValue
/* loaded from: classes9.dex */
public abstract class Produced<T> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Failed<T> extends Produced<T> {
        private final Throwable throwable;

        private Failed(Throwable th) {
            super();
            this.throwable = (Throwable) Preconditions.checkNotNull(th);
        }

        @Override // dagger.producers.Produced
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Failed) {
                return this.throwable.equals(((Failed) obj).throwable);
            }
            return false;
        }

        @Override // dagger.producers.Produced
        public T get() throws ExecutionException {
            throw new ExecutionException(this.throwable);
        }

        @Override // dagger.producers.Produced
        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Produced[failed with " + this.throwable.getClass().getCanonicalName() + MarkdownConstants.RIGHT_BRACKET;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Successful<T> extends Produced<T> {

        @NullableDecl
        private final T value;

        private Successful(@NullableDecl T t) {
            super();
            this.value = t;
        }

        @Override // dagger.producers.Produced
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Successful) {
                return Objects.equal(this.value, ((Successful) obj).value);
            }
            return false;
        }

        @Override // dagger.producers.Produced
        @NullableDecl
        public T get() {
            return this.value;
        }

        @Override // dagger.producers.Produced
        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("Produced["), MarkdownConstants.RIGHT_BRACKET, this.value);
        }
    }

    public static <T> Produced<T> failed(Throwable th) {
        return new Failed((Throwable) Preconditions.checkNotNull(th));
    }

    public static <T> Produced<T> successful(@NullableDecl T t) {
        return new Successful(t);
    }

    public abstract boolean equals(Object obj);

    public abstract T get() throws ExecutionException;

    public abstract int hashCode();

    private Produced() {
    }
}
