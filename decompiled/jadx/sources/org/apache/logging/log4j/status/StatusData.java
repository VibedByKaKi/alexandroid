package org.apache.logging.log4j.status;

import com.amazon.alexa.accessorykit.ModelTransformer;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.internal.annotation.SuppressFBWarnings;
import org.apache.logging.log4j.message.Message;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StatusData implements Serializable {
    private static final long serialVersionUID = -4341916115118014017L;
    private final StackTraceElement caller;
    private final Instant instant;
    private final DateTimeFormatter instantFormatter;
    private final Level level;
    private final Message message;
    private final String threadName;
    private final Throwable throwable;

    public StatusData(StackTraceElement stackTraceElement, Level level, Message message, Throwable th, String str, DateTimeFormatter dateTimeFormatter, Instant instant) {
        this.instantFormatter = dateTimeFormatter == null ? DateTimeFormatter.ISO_INSTANT : dateTimeFormatter;
        this.instant = instant;
        this.caller = stackTraceElement;
        Objects.requireNonNull(level, ModelTransformer.KEY_BATTERY_LEVEL);
        this.level = level;
        Objects.requireNonNull(message, "message");
        this.message = message;
        this.throwable = th;
        this.threadName = str == null ? Thread.currentThread().getName() : str;
    }

    @SuppressFBWarnings(justification = "Log4j prints stacktraces only to logs, which should be private.", value = {"INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE"})
    public String getFormattedStatus() {
        StringBuilder sb = new StringBuilder();
        this.instantFormatter.formatTo(this.instant, sb);
        sb.append(' ');
        sb.append(getThreadName());
        sb.append(' ');
        sb.append(this.level.toString());
        sb.append(' ');
        sb.append(this.message.getFormattedMessage());
        Object[] parameters = this.message.getParameters();
        Throwable th = this.throwable;
        if (th == null && parameters != null && parameters.length > 0 && (parameters[parameters.length - 1] instanceof Throwable)) {
            th = (Throwable) parameters[parameters.length - 1];
        }
        if (th != null) {
            sb.append(System.lineSeparator());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            sb.append(byteArrayOutputStream);
        }
        return sb.toString();
    }

    public Instant getInstant() {
        return this.instant;
    }

    public Level getLevel() {
        return this.level;
    }

    public Message getMessage() {
        return this.message;
    }

    public StackTraceElement getStackTraceElement() {
        return this.caller;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    @Deprecated
    public long getTimestamp() {
        return this.instant.toEpochMilli();
    }

    public String toString() {
        return getMessage().getFormattedMessage();
    }

    public StatusData(StackTraceElement stackTraceElement, Level level, Message message, Throwable th, String str) {
        this(stackTraceElement, level, message, th, str, null, Instant.now());
    }
}
