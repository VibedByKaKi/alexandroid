package com.amazon.coral.shared;

import com.amazon.coral.shared.CoralInternalLogger;
import java.lang.invoke.MethodType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class JclLogger implements CoralInternalLogger {
    private final Log logger;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.coral.shared.JclLogger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level;

        static {
            int[] iArr = new int[CoralInternalLogger.Level.values().length];
            $SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level = iArr;
            try {
                iArr[CoralInternalLogger.Level.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level[CoralInternalLogger.Level.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level[CoralInternalLogger.Level.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level[CoralInternalLogger.Level.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level[CoralInternalLogger.Level.FATAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level[CoralInternalLogger.Level.INFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public JclLogger(String str) {
        MethodType.methodType(Void.TYPE, Object.class, Throwable.class);
        this.logger = LogFactory.getLog(str);
    }

    private void doCall(CoralInternalLogger.Level level, String str) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level[level.ordinal()];
        if (i == 1) {
            this.logger.trace(str);
            return;
        }
        if (i == 2) {
            this.logger.debug(str);
            return;
        }
        if (i == 3) {
            this.logger.warn(str);
            return;
        }
        if (i == 4) {
            this.logger.error(str);
            return;
        }
        Log log = this.logger;
        if (i != 5) {
            log.info(str);
        } else {
            log.fatal(str);
        }
    }

    private boolean isLevelEnabled(CoralInternalLogger.Level level) {
        switch (AnonymousClass1.$SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level[level.ordinal()]) {
            case 1:
                return isTraceEnabled();
            case 2:
                return isDebugEnabled();
            case 3:
                return isWarnEnabled();
            case 4:
                return isErrorEnabled();
            case 5:
                return isFatalEnabled();
            case 6:
                return isInfoEnabled();
            default:
                return false;
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object... objArr) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == objArr.length - 1 && (objArr[objArr.length - 1] instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, objArr), (Throwable) objArr[objArr.length - 1]);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, objArr));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object... objArr) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == objArr.length - 1 && (objArr[objArr.length - 1] instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, objArr), (Throwable) objArr[objArr.length - 1]);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, objArr));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object... objArr) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == objArr.length - 1 && (objArr[objArr.length - 1] instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, objArr), (Throwable) objArr[objArr.length - 1]);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, objArr));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object... objArr) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == objArr.length - 1 && (objArr[objArr.length - 1] instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, objArr), (Throwable) objArr[objArr.length - 1]);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, objArr));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isErrorEnabled() {
        return this.logger.isErrorEnabled();
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isFatalEnabled() {
        return this.logger.isFatalEnabled();
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isTraceEnabled() {
        return this.logger.isTraceEnabled();
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isWarnEnabled() {
        return this.logger.isWarnEnabled();
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), (Throwable) obj6);
            } else {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object... objArr) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == objArr.length - 1 && (objArr[objArr.length - 1] instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, objArr), (Throwable) objArr[objArr.length - 1]);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, objArr));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object... objArr) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == objArr.length - 1 && (objArr[objArr.length - 1] instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, objArr), (Throwable) objArr[objArr.length - 1]);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, objArr));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Throwable th) {
        if (isLevelEnabled(level)) {
            doCall(level, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Throwable th) {
        if (isDebugEnabled()) {
            doCall(CoralInternalLogger.Level.DEBUG, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Throwable th) {
        if (isErrorEnabled()) {
            doCall(CoralInternalLogger.Level.ERROR, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Throwable th) {
        if (isFatalEnabled()) {
            doCall(CoralInternalLogger.Level.FATAL, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Throwable th) {
        if (isInfoEnabled()) {
            doCall(CoralInternalLogger.Level.INFO, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj) {
        if (isLevelEnabled(level)) {
            doCall(level, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Throwable th) {
        if (isDebugEnabled()) {
            doCall(CoralInternalLogger.Level.TRACE, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Throwable th) {
        if (isWarnEnabled()) {
            doCall(CoralInternalLogger.Level.WARN, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj) {
        if (isDebugEnabled()) {
            doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj) {
        if (isErrorEnabled()) {
            doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj) {
        if (isFatalEnabled()) {
            doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj) {
        if (isInfoEnabled()) {
            doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj}), (Throwable) obj2);
            } else {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj) {
        if (isDebugEnabled()) {
            doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj) {
        if (isWarnEnabled()) {
            doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj}), (Throwable) obj2);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj}), (Throwable) obj2);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj}), (Throwable) obj2);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj}), (Throwable) obj2);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj}), (Throwable) obj2);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj}), (Throwable) obj2);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    private void doCall(CoralInternalLogger.Level level, String str, Throwable th) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level[level.ordinal()];
        if (i == 1) {
            this.logger.trace(str, th);
            return;
        }
        if (i == 2) {
            this.logger.debug(str, th);
            return;
        }
        if (i == 3) {
            this.logger.warn(str, th);
            return;
        }
        if (i != 4) {
            Log log = this.logger;
            if (i != 5) {
                log.info(str, th);
                return;
            } else {
                log.fatal(str, th);
                return;
            }
        }
        this.logger.error(str, th);
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2}), (Throwable) obj3);
            } else {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2}), (Throwable) obj3);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2}), (Throwable) obj3);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2}), (Throwable) obj3);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2}), (Throwable) obj3);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2}), (Throwable) obj3);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2}), (Throwable) obj3);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), (Throwable) obj4);
            } else {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), (Throwable) obj4);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), (Throwable) obj4);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), (Throwable) obj4);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), (Throwable) obj4);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), (Throwable) obj4);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), (Throwable) obj4);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), (Throwable) obj5);
            } else {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), (Throwable) obj5);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), (Throwable) obj5);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), (Throwable) obj5);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), (Throwable) obj5);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), (Throwable) obj5);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), (Throwable) obj5);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object... objArr) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == objArr.length - 1 && (objArr[objArr.length - 1] instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, objArr), (Throwable) objArr[objArr.length - 1]);
            } else {
                doCall(level, ParameterFormatter.format(str, objArr));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), (Throwable) obj6);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), (Throwable) obj6);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), (Throwable) obj6);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), (Throwable) obj6);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), (Throwable) obj6);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), (Throwable) obj6);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), (Throwable) obj7);
            } else {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), (Throwable) obj7);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), (Throwable) obj7);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), (Throwable) obj7);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), (Throwable) obj7);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), (Throwable) obj7);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), (Throwable) obj7);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), (Throwable) obj8);
            } else {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), (Throwable) obj8);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), (Throwable) obj8);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), (Throwable) obj8);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), (Throwable) obj8);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), (Throwable) obj8);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), (Throwable) obj8);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), (Throwable) obj9);
            } else {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), (Throwable) obj9);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), (Throwable) obj9);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), (Throwable) obj9);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), (Throwable) obj9);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (isLevelEnabled(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), (Throwable) obj10);
            } else {
                doCall(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), (Throwable) obj9);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), (Throwable) obj9);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), (Throwable) obj10);
            } else {
                doCall(CoralInternalLogger.Level.DEBUG, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (isErrorEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), (Throwable) obj10);
            } else {
                doCall(CoralInternalLogger.Level.ERROR, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (isFatalEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), (Throwable) obj10);
            } else {
                doCall(CoralInternalLogger.Level.FATAL, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (isInfoEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), (Throwable) obj10);
            } else {
                doCall(CoralInternalLogger.Level.INFO, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (isDebugEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), (Throwable) obj10);
            } else {
                doCall(CoralInternalLogger.Level.TRACE, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (isWarnEnabled()) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), (Throwable) obj10);
            } else {
                doCall(CoralInternalLogger.Level.WARN, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }
}
