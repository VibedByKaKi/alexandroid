package io.reactivex.rxjava3.core;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class Notification<T> {
    static final Notification<Object> COMPLETE = new Notification<>(null);
    final Object value;

    private Notification(@Nullable Object obj) {
        this.value = obj;
    }

    @NonNull
    public static <T> Notification<T> createOnComplete() {
        return (Notification<T>) COMPLETE;
    }

    @NonNull
    public static <T> Notification<T> createOnError(@NonNull Throwable th) {
        Objects.requireNonNull(th, "error is null");
        return new Notification<>(NotificationLite.error(th));
    }

    @NonNull
    public static <T> Notification<T> createOnNext(T t) {
        Objects.requireNonNull(t, "value is null");
        return new Notification<>(t);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Notification) {
            return Objects.equals(this.value, ((Notification) obj).value);
        }
        return false;
    }

    @Nullable
    public Throwable getError() {
        Object obj = this.value;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        Object obj = this.value;
        if (obj == null || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.value;
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean isOnComplete() {
        return this.value == null;
    }

    public boolean isOnError() {
        return NotificationLite.isError(this.value);
    }

    public boolean isOnNext() {
        Object obj = this.value;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public String toString() {
        Object obj = this.value;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (!NotificationLite.isError(obj)) {
            return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("OnNextNotification["), MarkdownConstants.RIGHT_BRACKET, this.value);
        }
        return "OnErrorNotification[" + NotificationLite.getError(obj) + MarkdownConstants.RIGHT_BRACKET;
    }
}
