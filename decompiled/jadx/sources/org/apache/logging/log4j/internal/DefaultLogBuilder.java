package org.apache.logging.log4j.internal;

import java.util.Arrays;
import org.apache.logging.log4j.BridgeAware;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogBuilder;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.SimpleMessage;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.status.StatusLogger;
import org.apache.logging.log4j.util.LambdaUtil;
import org.apache.logging.log4j.util.StackLocatorUtil;
import org.apache.logging.log4j.util.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class DefaultLogBuilder implements BridgeAware, LogBuilder {
    private static Message EMPTY_MESSAGE = new SimpleMessage("");
    private static final String FQCN = DefaultLogBuilder.class.getName();
    private static final Logger LOGGER = StatusLogger.getLogger();
    private String fqcn;
    private volatile boolean inUse;
    private Level level;
    private StackTraceElement location;
    private ExtendedLogger logger;
    private Marker marker;
    private long threadId;
    private Throwable throwable;

    public DefaultLogBuilder(ExtendedLogger extendedLogger, Level level) {
        this.fqcn = FQCN;
        this.logger = extendedLogger;
        this.level = level;
        this.threadId = Thread.currentThread().getId();
        this.inUse = level != null;
    }

    private boolean isValid() {
        if (!this.inUse) {
            LOGGER.warn("Attempt to reuse LogBuilder was ignored. {}", StackLocatorUtil.getCallerClass(2));
            return false;
        }
        if (this.threadId == Thread.currentThread().getId()) {
            return true;
        }
        LOGGER.warn("LogBuilder can only be used on the owning thread. {}", StackLocatorUtil.getCallerClass(2));
        return false;
    }

    private void logMessage(Message message) {
        try {
            this.logger.logMessage(this.level, this.marker, this.fqcn, this.location, message, this.throwable);
        } finally {
            this.inUse = false;
        }
    }

    public boolean isEnabled(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        return th != null ? extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, th) : extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public boolean isInUse() {
        return this.inUse;
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Supplier<?>... supplierArr) {
        if (isValid()) {
            Object[] all = LambdaUtil.getAll(supplierArr);
            if (isEnabled(str, all)) {
                logMessage(this.logger.getMessageFactory().newMessage(str, all));
            }
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public Message logAndGet(Supplier<Message> supplier) {
        if (!isValid()) {
            return null;
        }
        Message message = supplier.get();
        if (isEnabled(message)) {
            logMessage(message);
        }
        return message;
    }

    public LogBuilder reset(ExtendedLogger extendedLogger, Level level) {
        this.logger = extendedLogger;
        this.level = level;
        this.marker = null;
        this.throwable = null;
        this.location = null;
        this.inUse = true;
        return this;
    }

    @Override // org.apache.logging.log4j.BridgeAware
    public void setEntryPoint(String str) {
        this.fqcn = str;
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public LogBuilder withLocation() {
        this.location = StackLocatorUtil.getStackTraceElement(2);
        return this;
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public LogBuilder withMarker(Marker marker) {
        this.marker = marker;
        return this;
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public LogBuilder withThrowable(Throwable th) {
        this.throwable = th;
        return this;
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public LogBuilder withLocation(StackTraceElement stackTraceElement) {
        this.location = stackTraceElement;
        return this;
    }

    public DefaultLogBuilder() {
        this(null, null);
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(CharSequence charSequence) {
        if (isValid() && isEnabled(charSequence)) {
            logMessage(this.logger.getMessageFactory().newMessage(charSequence));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str) {
        if (isValid() && isEnabled(str)) {
            logMessage(this.logger.getMessageFactory().newMessage(str));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object... objArr) {
        if (isValid() && isEnabled(str, objArr)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, objArr));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(Message message) {
        if (isValid() && isEnabled(message)) {
            logMessage(message);
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(Supplier<Message> supplier) {
        logAndGet(supplier);
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(Object obj) {
        if (isValid() && isEnabled(obj)) {
            logMessage(this.logger.getMessageFactory().newMessage(obj));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj) {
        if (isValid() && isEnabled(str, obj)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj, Object obj2) {
        if (isValid() && isEnabled(str, obj, obj2)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj, obj2));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj, Object obj2, Object obj3) {
        if (isValid() && isEnabled(str, obj, obj2, obj3)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj, obj2, obj3));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (isValid() && isEnabled(str, obj, obj2, obj3, obj4)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj, obj2, obj3, obj4));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (isValid() && isEnabled(str, obj, obj2, obj3, obj4, obj5)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj, obj2, obj3, obj4, obj5));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (isValid() && isEnabled(str, obj, obj2, obj3, obj4, obj5, obj6)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj, obj2, obj3, obj4, obj5, obj6));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (isValid() && isEnabled(str, obj, obj2, obj3, obj4, obj5, obj6, obj7)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj, obj2, obj3, obj4, obj5, obj6, obj7));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (isValid() && isEnabled(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (isValid() && isEnabled(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (isValid() && isEnabled(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10)) {
            logMessage(this.logger.getMessageFactory().newMessage(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10));
        }
    }

    @Override // org.apache.logging.log4j.LogBuilder
    public void log() {
        if (isValid() && isEnabled(EMPTY_MESSAGE)) {
            logMessage(EMPTY_MESSAGE);
        }
    }

    public boolean isEnabled(CharSequence charSequence) {
        return this.logger.isEnabled(this.level, this.marker, charSequence, this.throwable);
    }

    public boolean isEnabled(String str) {
        return this.logger.isEnabled(this.level, this.marker, str, this.throwable);
    }

    public boolean isEnabled(String str, Object... objArr) {
        if (this.throwable != null) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = this.throwable;
            objArr = copyOf;
        }
        return this.logger.isEnabled(this.level, this.marker, str, objArr);
    }

    public boolean isEnabled(Object obj) {
        return this.logger.isEnabled(this.level, this.marker, obj, this.throwable);
    }

    public boolean isEnabled(String str, Object obj) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        if (th != null) {
            return extendedLogger.isEnabled(this.level, this.marker, str, obj, th);
        }
        return extendedLogger.isEnabled(this.level, this.marker, str, obj);
    }

    public boolean isEnabled(String str, Object obj, Object obj2) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        if (th != null) {
            return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, th);
        }
        return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2);
    }

    public boolean isEnabled(String str, Object obj, Object obj2, Object obj3) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        if (th != null) {
            return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, th);
        }
        return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3);
    }

    public boolean isEnabled(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        if (th != null) {
            return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, th);
        }
        return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4);
    }

    public boolean isEnabled(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        if (th != null) {
            return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, th);
        }
        return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5);
    }

    public boolean isEnabled(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        if (th != null) {
            return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6, th);
        }
        return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public boolean isEnabled(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        if (th != null) {
            return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, th);
        }
        return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public boolean isEnabled(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        if (th != null) {
            return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, th);
        }
        return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public boolean isEnabled(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Throwable th = this.throwable;
        ExtendedLogger extendedLogger = this.logger;
        if (th != null) {
            return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, th);
        }
        return extendedLogger.isEnabled(this.level, this.marker, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public boolean isEnabled(Message message) {
        return this.logger.isEnabled(this.level, this.marker, message, this.throwable);
    }
}
