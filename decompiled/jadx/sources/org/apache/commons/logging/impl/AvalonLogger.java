package org.apache.commons.logging.impl;

import org.apache.avalon.framework.logger.Logger;
import org.apache.commons.logging.Log;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AvalonLogger implements Log {
    private static volatile Logger defaultLogger;
    private final transient Logger logger;

    public AvalonLogger(String str) {
        if (defaultLogger != null) {
            this.logger = defaultLogger.getChildLogger(str);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("default logger has to be specified if this constructor is used!");
            throw null;
        }
    }

    public static void setDefaultLogger(Logger logger) {
        defaultLogger = logger;
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th) {
        if (getLogger().isErrorEnabled()) {
            getLogger().error(String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th) {
        if (getLogger().isFatalErrorEnabled()) {
            getLogger().fatalError(String.valueOf(obj), th);
        }
    }

    public Logger getLogger() {
        return this.logger;
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th) {
        if (getLogger().isInfoEnabled()) {
            getLogger().info(String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isFatalErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isWarnEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th) {
        if (getLogger().isWarnEnabled()) {
            getLogger().warn(String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        if (getLogger().isErrorEnabled()) {
            getLogger().error(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        if (getLogger().isFatalErrorEnabled()) {
            getLogger().fatalError(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        if (getLogger().isInfoEnabled()) {
            getLogger().info(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        if (getLogger().isWarnEnabled()) {
            getLogger().warn(String.valueOf(obj));
        }
    }

    public AvalonLogger(Logger logger) {
        this.logger = logger;
    }
}
