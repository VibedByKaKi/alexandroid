package com.amazon.coral.shared;

import com.amazon.coral.shared.CoralInternalLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class ExceptionSanitizingWrapper implements CoralInternalLogger {
    private final CoralInternalLogger delegate;
    private final JulLogger fallback;

    public ExceptionSanitizingWrapper(CoralInternalLogger coralInternalLogger, JulLogger julLogger) {
        this.delegate = coralInternalLogger;
        this.fallback = julLogger;
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        try {
            this.delegate.debug(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        } catch (Throwable unused) {
            this.fallback.debug(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        try {
            this.delegate.error(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        } catch (Throwable unused) {
            this.fallback.error(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        try {
            this.delegate.fatal(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        } catch (Throwable unused) {
            this.fallback.fatal(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        try {
            this.delegate.info(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        } catch (Throwable unused) {
            this.fallback.info(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isDebugEnabled() {
        try {
            return this.delegate.isDebugEnabled();
        } catch (Throwable unused) {
            return this.fallback.isDebugEnabled();
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isErrorEnabled() {
        try {
            return this.delegate.isErrorEnabled();
        } catch (Throwable unused) {
            return this.fallback.isErrorEnabled();
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isFatalEnabled() {
        try {
            return this.delegate.isFatalEnabled();
        } catch (Throwable unused) {
            return this.fallback.isFatalEnabled();
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isInfoEnabled() {
        try {
            return this.delegate.isInfoEnabled();
        } catch (Throwable unused) {
            return this.fallback.isInfoEnabled();
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isTraceEnabled() {
        try {
            return this.delegate.isTraceEnabled();
        } catch (Throwable unused) {
            return this.fallback.isTraceEnabled();
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isWarnEnabled() {
        try {
            return this.delegate.isWarnEnabled();
        } catch (Throwable unused) {
            return this.fallback.isWarnEnabled();
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        try {
            this.delegate.log(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        } catch (Throwable unused) {
            this.fallback.log(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        try {
            this.delegate.trace(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        } catch (Throwable unused) {
            this.fallback.trace(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        try {
            this.delegate.warn(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        } catch (Throwable unused) {
            this.fallback.warn(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Throwable th) {
        try {
            this.delegate.debug(str, th);
        } catch (Throwable unused) {
            this.fallback.debug(str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Throwable th) {
        try {
            this.delegate.error(str, th);
        } catch (Throwable unused) {
            this.fallback.error(str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Throwable th) {
        try {
            this.delegate.fatal(str, th);
        } catch (Throwable unused) {
            this.fallback.fatal(str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Throwable th) {
        try {
            this.delegate.info(str, th);
        } catch (Throwable unused) {
            this.fallback.info(str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Throwable th) {
        try {
            this.delegate.trace(str, th);
        } catch (Throwable unused) {
            this.fallback.trace(str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Throwable th) {
        try {
            this.delegate.warn(str, th);
        } catch (Throwable unused) {
            this.fallback.warn(str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj) {
        try {
            this.delegate.debug(str, obj);
        } catch (Throwable unused) {
            this.fallback.debug(str, obj);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj) {
        try {
            this.delegate.error(str, obj);
        } catch (Throwable unused) {
            this.fallback.error(str, obj);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj) {
        try {
            this.delegate.fatal(str, obj);
        } catch (Throwable unused) {
            this.fallback.fatal(str, obj);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj) {
        try {
            this.delegate.info(str, obj);
        } catch (Throwable unused) {
            this.fallback.info(str, obj);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj) {
        try {
            this.delegate.trace(str, obj);
        } catch (Throwable unused) {
            this.fallback.trace(str, obj);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj) {
        try {
            this.delegate.warn(str, obj);
        } catch (Throwable unused) {
            this.fallback.warn(str, obj);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2) {
        try {
            this.delegate.debug(str, obj, obj2);
        } catch (Throwable unused) {
            this.fallback.debug(str, obj, obj2);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2) {
        try {
            this.delegate.error(str, obj, obj2);
        } catch (Throwable unused) {
            this.fallback.error(str, obj, obj2);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2) {
        try {
            this.delegate.fatal(str, obj, obj2);
        } catch (Throwable unused) {
            this.fallback.fatal(str, obj, obj2);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2) {
        try {
            this.delegate.info(str, obj, obj2);
        } catch (Throwable unused) {
            this.fallback.info(str, obj, obj2);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2) {
        try {
            this.delegate.trace(str, obj, obj2);
        } catch (Throwable unused) {
            this.fallback.trace(str, obj, obj2);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2) {
        try {
            this.delegate.warn(str, obj, obj2);
        } catch (Throwable unused) {
            this.fallback.warn(str, obj, obj2);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3) {
        try {
            this.delegate.debug(str, obj, obj2, obj3);
        } catch (Throwable unused) {
            this.fallback.debug(str, obj, obj2, obj3);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3) {
        try {
            this.delegate.error(str, obj, obj2, obj3);
        } catch (Throwable unused) {
            this.fallback.error(str, obj, obj2, obj3);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3) {
        try {
            this.delegate.fatal(str, obj, obj2, obj3);
        } catch (Throwable unused) {
            this.fallback.fatal(str, obj, obj2, obj3);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3) {
        try {
            this.delegate.info(str, obj, obj2, obj3);
        } catch (Throwable unused) {
            this.fallback.info(str, obj, obj2, obj3);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Throwable th) {
        try {
            this.delegate.log(level, str, th);
        } catch (Throwable unused) {
            this.fallback.log(level, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3) {
        try {
            this.delegate.trace(str, obj, obj2, obj3);
        } catch (Throwable unused) {
            this.fallback.trace(str, obj, obj2, obj3);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3) {
        try {
            this.delegate.warn(str, obj, obj2, obj3);
        } catch (Throwable unused) {
            this.fallback.warn(str, obj, obj2, obj3);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            this.delegate.debug(str, obj, obj2, obj3, obj4);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            this.fallback.debug(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            this.delegate.error(str, obj, obj2, obj3, obj4);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            this.fallback.error(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            this.delegate.fatal(str, obj, obj2, obj3, obj4);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            this.fallback.fatal(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            this.delegate.info(str, obj, obj2, obj3, obj4);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            this.fallback.info(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj) {
        try {
            this.delegate.log(level, str, obj);
        } catch (Throwable unused) {
            this.fallback.log(level, str, obj);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            this.delegate.trace(str, obj, obj2, obj3, obj4);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            this.fallback.trace(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            this.delegate.warn(str, obj, obj2, obj3, obj4);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            this.fallback.warn(str, obj, obj2, obj3, obj4);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            this.delegate.debug(str, obj, obj2, obj3, obj4, obj5);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            this.fallback.debug(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            this.delegate.error(str, obj, obj2, obj3, obj4, obj5);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            this.fallback.error(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            this.delegate.fatal(str, obj, obj2, obj3, obj4, obj5);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            this.fallback.fatal(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            this.delegate.info(str, obj, obj2, obj3, obj4, obj5);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            this.fallback.info(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2) {
        try {
            this.delegate.log(level, str, obj, obj2);
        } catch (Throwable unused) {
            this.fallback.log(level, str, obj, obj2);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            this.delegate.trace(str, obj, obj2, obj3, obj4, obj5);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            this.fallback.trace(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            this.delegate.warn(str, obj, obj2, obj3, obj4, obj5);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            this.fallback.warn(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        try {
            this.delegate.debug(str, obj, obj2, obj3, obj4, obj5, obj6);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            obj6 = obj6;
            this.fallback.debug(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        try {
            this.delegate.error(str, obj, obj2, obj3, obj4, obj5, obj6);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            obj6 = obj6;
            this.fallback.error(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        try {
            this.delegate.fatal(str, obj, obj2, obj3, obj4, obj5, obj6);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            obj6 = obj6;
            this.fallback.fatal(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        try {
            this.delegate.info(str, obj, obj2, obj3, obj4, obj5, obj6);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            obj6 = obj6;
            this.fallback.info(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3) {
        try {
            this.delegate.log(level, str, obj, obj2, obj3);
        } catch (Throwable unused) {
            level = level;
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            this.fallback.log(level, str, obj, obj2, obj3);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        try {
            this.delegate.trace(str, obj, obj2, obj3, obj4, obj5, obj6);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            obj6 = obj6;
            this.fallback.trace(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        try {
            this.delegate.warn(str, obj, obj2, obj3, obj4, obj5, obj6);
        } catch (Throwable unused) {
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            obj6 = obj6;
            this.fallback.warn(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            this.delegate.debug(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        } catch (Throwable unused) {
            this.fallback.debug(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            this.delegate.error(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        } catch (Throwable unused) {
            this.fallback.error(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            this.delegate.fatal(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        } catch (Throwable unused) {
            this.fallback.fatal(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            this.delegate.info(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        } catch (Throwable unused) {
            this.fallback.info(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        try {
            this.delegate.log(level, str, obj, obj2, obj3, obj4);
        } catch (Throwable unused) {
            level = level;
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            this.fallback.log(level, str, obj, obj2, obj3, obj4);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            this.delegate.trace(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        } catch (Throwable unused) {
            this.fallback.trace(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            this.delegate.warn(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        } catch (Throwable unused) {
            this.fallback.warn(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        try {
            this.delegate.debug(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        } catch (Throwable unused) {
            this.fallback.debug(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        try {
            this.delegate.error(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        } catch (Throwable unused) {
            this.fallback.error(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        try {
            this.delegate.fatal(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        } catch (Throwable unused) {
            this.fallback.fatal(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        try {
            this.delegate.info(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        } catch (Throwable unused) {
            this.fallback.info(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        try {
            this.delegate.log(level, str, obj, obj2, obj3, obj4, obj5);
        } catch (Throwable unused) {
            level = level;
            str = str;
            obj = obj;
            obj2 = obj2;
            obj3 = obj3;
            obj4 = obj4;
            obj5 = obj5;
            this.fallback.log(level, str, obj, obj2, obj3, obj4, obj5);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        try {
            this.delegate.trace(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        } catch (Throwable unused) {
            this.fallback.trace(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        try {
            this.delegate.warn(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        } catch (Throwable unused) {
            this.fallback.warn(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            this.delegate.debug(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        } catch (Throwable unused) {
            this.fallback.debug(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            this.delegate.error(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        } catch (Throwable unused) {
            this.fallback.error(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            this.delegate.fatal(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        } catch (Throwable unused) {
            this.fallback.fatal(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            this.delegate.info(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        } catch (Throwable unused) {
            this.fallback.info(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        try {
            this.delegate.log(level, str, obj, obj2, obj3, obj4, obj5, obj6);
        } catch (Throwable unused) {
            this.fallback.log(level, str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            this.delegate.trace(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        } catch (Throwable unused) {
            this.fallback.trace(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            this.delegate.warn(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        } catch (Throwable unused) {
            this.fallback.warn(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object... objArr) {
        try {
            this.delegate.debug(str, objArr);
        } catch (Throwable unused) {
            this.fallback.debug(str, objArr);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object... objArr) {
        try {
            this.delegate.error(str, objArr);
        } catch (Throwable unused) {
            this.fallback.error(str, objArr);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object... objArr) {
        try {
            this.delegate.fatal(str, objArr);
        } catch (Throwable unused) {
            this.fallback.fatal(str, objArr);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object... objArr) {
        try {
            this.delegate.info(str, objArr);
        } catch (Throwable unused) {
            this.fallback.info(str, objArr);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        try {
            this.delegate.log(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        } catch (Throwable unused) {
            this.fallback.log(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object... objArr) {
        try {
            this.delegate.trace(str, objArr);
        } catch (Throwable unused) {
            this.fallback.trace(str, objArr);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object... objArr) {
        try {
            this.delegate.warn(str, objArr);
        } catch (Throwable unused) {
            this.fallback.warn(str, objArr);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        try {
            this.delegate.log(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        } catch (Throwable unused) {
            this.fallback.log(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        try {
            this.delegate.log(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        } catch (Throwable unused) {
            this.fallback.log(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object... objArr) {
        try {
            this.delegate.log(level, str, objArr);
        } catch (Throwable unused) {
            this.fallback.log(level, str, objArr);
        }
    }
}
