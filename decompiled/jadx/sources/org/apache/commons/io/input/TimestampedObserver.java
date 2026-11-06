package org.apache.commons.io.input;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.io.input.ObservableInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class TimestampedObserver extends ObservableInputStream.Observer {
    private volatile Instant closeInstant;
    private final Instant openInstant = Instant.now();

    @Override // org.apache.commons.io.input.ObservableInputStream.Observer
    public void closed() throws IOException {
        this.closeInstant = Instant.now();
    }

    public Instant getCloseInstant() {
        return this.closeInstant;
    }

    public Instant getOpenInstant() {
        return this.openInstant;
    }

    public Duration getOpenToCloseDuration() {
        return Duration.between(this.openInstant, this.closeInstant);
    }

    public Duration getOpenToNowDuration() {
        return Duration.between(this.openInstant, Instant.now());
    }

    public String toString() {
        return "TimestampedObserver [openInstant=" + this.openInstant + ", closeInstant=" + this.closeInstant + MarkdownConstants.RIGHT_BRACKET;
    }
}
