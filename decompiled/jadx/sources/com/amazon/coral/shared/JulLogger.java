package com.amazon.coral.shared;

import com.amazon.coral.shared.CoralInternalLogger;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class JulLogger implements CoralInternalLogger {
    public static final String FATAL_PREFIX = "[FATAL] ";
    private final Logger delegate;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.coral.shared.JulLogger$1, reason: invalid class name */
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

    public JulLogger(String str) {
        this.delegate = Logger.getLogger(str);
    }

    private static String format(CoralInternalLogger.Level level, String str, Object... objArr) {
        if (level != CoralInternalLogger.Level.FATAL) {
            return ParameterFormatter.format(str, objArr);
        }
        return FATAL_PREFIX + ParameterFormatter.format(str, objArr);
    }

    private static Level map(CoralInternalLogger.Level level) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$coral$shared$CoralInternalLogger$Level[level.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? (i == 4 || i == 5) ? Level.SEVERE : Level.INFO : Level.WARNING : Level.FINE : Level.FINEST;
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), obj9);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), obj9);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), (Throwable) obj9);
                return;
            }
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), obj9);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isDebugEnabled() {
        return this.delegate.isLoggable(Level.FINE);
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isErrorEnabled() {
        return this.delegate.isLoggable(Level.SEVERE);
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isFatalEnabled() {
        return this.delegate.isLoggable(Level.SEVERE);
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isInfoEnabled() {
        return this.delegate.isLoggable(Level.INFO);
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isTraceEnabled() {
        return this.delegate.isLoggable(Level.FINEST);
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public boolean isWarnEnabled() {
        return this.delegate.isLoggable(Level.WARNING);
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8), (Throwable) obj9);
            } else {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), obj9);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 8 && (obj9 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}), obj9);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Throwable th) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Throwable th) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Throwable th) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Throwable th) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Throwable th) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}), obj2);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}), obj2);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}), obj2);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Throwable th) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            Logger logger = this.delegate;
            if (level == CoralInternalLogger.Level.FATAL) {
                str = a$$ExternalSyntheticOutline0.m(FATAL_PREFIX, str);
            }
            logger.log(map, str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}), obj2);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj}), obj2);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}), obj3);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}), obj3);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}), obj3);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}), obj3);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2}), obj3);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            this.delegate.log(map, format(level, str, obj));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), obj4);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), obj4);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), obj4);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                this.delegate.log(map, format(level, str, obj), (Throwable) obj2);
            } else {
                this.delegate.log(map, format(level, str, obj, obj2));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), obj4);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), obj4);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                this.delegate.log(map, format(level, str, obj, obj2), (Throwable) obj3);
            } else {
                this.delegate.log(map, format(level, str, obj, obj2, obj3));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), obj5);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), obj5);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), obj5);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), obj5);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                this.delegate.log(map, format(level, str, obj, obj2, obj3), (Throwable) obj4);
            } else {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), obj5);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4), (Throwable) obj5);
            } else {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), obj6);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), obj6);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Throwable th) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, FATAL_PREFIX + str, th);
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), obj6);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), obj6);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5), (Throwable) obj6);
            } else {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5, obj6));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), obj6);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 1 && (obj2 instanceof Throwable)) {
                this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj}), (Throwable) obj2);
                return;
            }
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), obj7);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), obj7);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), obj7);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), obj7);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5, obj6), (Throwable) obj7);
            } else {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), obj7);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 2 && (obj3 instanceof Throwable)) {
                this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2}), (Throwable) obj3);
                return;
            }
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7), (Throwable) obj8);
            } else {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), obj8);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), obj8);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), obj8);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), obj8);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object... objArr) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            this.delegate.log(map, format(level, str, objArr));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), obj8);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 3 && (obj4 instanceof Throwable)) {
                this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3}), (Throwable) obj4);
                return;
            }
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void log(CoralInternalLogger.Level level, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Level map = map(level);
        if (this.delegate.isLoggable(map)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9), (Throwable) obj10);
            } else {
                this.delegate.log(map, format(level, str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object... objArr) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, objArr));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object... objArr) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, objArr));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object... objArr) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, objArr));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object... objArr) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, objArr));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void debug(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Logger logger = this.delegate;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), obj10);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void error(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), obj10);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void info(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Logger logger = this.delegate;
        Level level = Level.INFO;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), obj10);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void trace(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Logger logger = this.delegate;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), obj10);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object... objArr) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, ParameterFormatter.format(str, objArr));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 4 && (obj5 instanceof Throwable)) {
                this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4}), (Throwable) obj5);
                return;
            }
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void warn(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Logger logger = this.delegate;
        Level level = Level.WARNING;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), obj10);
            } else {
                this.delegate.log(level, ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
            }
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 5 && (obj6 instanceof Throwable)) {
                this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5}), (Throwable) obj6);
                return;
            }
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 6 && (obj7 instanceof Throwable)) {
                this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}), (Throwable) obj7);
                return;
            }
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 7 && (obj8 instanceof Throwable)) {
                this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7}), (Throwable) obj8);
                return;
            }
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object... objArr) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, objArr));
        }
    }

    @Override // com.amazon.coral.shared.CoralInternalLogger
    public void fatal(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Logger logger = this.delegate;
        Level level = Level.SEVERE;
        if (logger.isLoggable(level)) {
            if (ParameterFormatter.countArgumentPlaceholders(str) == 9 && (obj10 instanceof Throwable)) {
                this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9}), (Throwable) obj10);
                return;
            }
            this.delegate.log(level, FATAL_PREFIX + ParameterFormatter.format(str, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}));
        }
    }
}
