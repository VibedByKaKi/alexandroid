package io.reactivex.rxjava3.schedulers;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import io.reactivex.rxjava3.annotations.NonNull;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class Timed<T> {
    final long time;
    final TimeUnit unit;
    final T value;

    public Timed(@NonNull T t, long j, @NonNull TimeUnit timeUnit) {
        Objects.requireNonNull(t, "value is null");
        this.value = t;
        this.time = j;
        Objects.requireNonNull(timeUnit, "unit is null");
        this.unit = timeUnit;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Timed) {
            Timed timed = (Timed) obj;
            if (Objects.equals(this.value, timed.value) && this.time == timed.time && Objects.equals(this.unit, timed.unit)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        long j = this.time;
        return this.unit.hashCode() + ((hashCode + ((int) (j ^ (j >>> 31)))) * 31);
    }

    public long time(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.time, this.unit);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Timed[time=");
        sb.append(this.time);
        sb.append(", unit=");
        sb.append(this.unit);
        sb.append(", value=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, MarkdownConstants.RIGHT_BRACKET, this.value);
    }

    @NonNull
    public TimeUnit unit() {
        return this.unit;
    }

    @NonNull
    public T value() {
        return this.value;
    }

    public long time() {
        return this.time;
    }
}
