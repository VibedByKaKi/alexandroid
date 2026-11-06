package com.amazonaws.logging;

import com.amazonaws.logging.LogFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface Log {
    void debug(Object obj);

    void debug(Object obj, Throwable th);

    void error(Object obj);

    void error(Object obj, Throwable th);

    void info(Object obj);

    void info(Object obj, Throwable th);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void setLevel(LogFactory.Level level);

    void trace(Object obj);

    void trace(Object obj, Throwable th);

    void warn(Object obj);

    void warn(Object obj, Throwable th);
}
