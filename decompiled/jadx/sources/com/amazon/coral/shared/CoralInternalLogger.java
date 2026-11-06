package com.amazon.coral.shared;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface CoralInternalLogger {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Level {
        TRACE,
        DEBUG,
        INFO,
        WARN,
        ERROR,
        FATAL
    }

    void debug(String str, Object obj);

    void debug(String str, Object obj, Object obj2);

    void debug(String str, Object obj, Object obj2, Object obj3);

    void debug(String str, Object obj, Object obj2, Object obj3, Object obj4);

    void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    void debug(String str, Throwable th);

    void debug(String str, Object... objArr);

    void error(String str, Object obj);

    void error(String str, Object obj, Object obj2);

    void error(String str, Object obj, Object obj2, Object obj3);

    void error(String str, Object obj, Object obj2, Object obj3, Object obj4);

    void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    void error(String str, Throwable th);

    void error(String str, Object... objArr);

    void fatal(String str, Object obj);

    void fatal(String str, Object obj, Object obj2);

    void fatal(String str, Object obj, Object obj2, Object obj3);

    void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4);

    void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    void fatal(String str, Throwable th);

    void fatal(String str, Object... objArr);

    void info(String str, Object obj);

    void info(String str, Object obj, Object obj2);

    void info(String str, Object obj, Object obj2, Object obj3);

    void info(String str, Object obj, Object obj2, Object obj3, Object obj4);

    void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    void info(String str, Throwable th);

    void info(String str, Object... objArr);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isFatalEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void log(Level level, String str, Object obj);

    void log(Level level, String str, Object obj, Object obj2);

    void log(Level level, String str, Object obj, Object obj2, Object obj3);

    void log(Level level, String str, Object obj, Object obj2, Object obj3, Object obj4);

    void log(Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    void log(Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    void log(Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    void log(Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    void log(Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    void log(Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    void log(Level level, String str, Throwable th);

    void log(Level level, String str, Object... objArr);

    void trace(String str, Object obj);

    void trace(String str, Object obj, Object obj2);

    void trace(String str, Object obj, Object obj2, Object obj3);

    void trace(String str, Object obj, Object obj2, Object obj3, Object obj4);

    void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    void trace(String str, Throwable th);

    void trace(String str, Object... objArr);

    void warn(String str, Object obj);

    void warn(String str, Object obj, Object obj2);

    void warn(String str, Object obj, Object obj2, Object obj3);

    void warn(String str, Object obj, Object obj2, Object obj3, Object obj4);

    void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    void warn(String str, Throwable th);

    void warn(String str, Object... objArr);
}
