package rx.schedulers;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class TimeInterval<T> {
    private final long intervalInMilliseconds;
    private final T value;

    public TimeInterval(long j, T t) {
        this.value = t;
        this.intervalInMilliseconds = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeInterval timeInterval = (TimeInterval) obj;
        if (this.intervalInMilliseconds != timeInterval.intervalInMilliseconds) {
            return false;
        }
        T t = this.value;
        T t2 = timeInterval.value;
        if (t == null) {
            if (t2 != null) {
                return false;
            }
        } else if (!t.equals(t2)) {
            return false;
        }
        return true;
    }

    public long getIntervalInMilliseconds() {
        return this.intervalInMilliseconds;
    }

    public T getValue() {
        return this.value;
    }

    public int hashCode() {
        long j = this.intervalInMilliseconds;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        T t = this.value;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TimeInterval [intervalInMilliseconds=");
        sb.append(this.intervalInMilliseconds);
        sb.append(", value=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, MarkdownConstants.RIGHT_BRACKET, this.value);
    }
}
