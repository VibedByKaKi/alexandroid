package com.amazon.comms.log;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.log.CommsLogger;
import com.amazon.comms.log.annotation.Log;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.ConstructorSignature;
import org.aspectj.lang.reflect.MethodSignature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Aspect
/* loaded from: classes20.dex */
public class CommsLoggerAspect {
    private final CommsLogger.CommsLoggerFactory mCommsLoggerFactory;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.comms.log.CommsLoggerAspect$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$comms$log$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$com$amazon$comms$log$LogLevel = iArr;
            try {
                iArr[LogLevel.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$comms$log$LogLevel[LogLevel.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$comms$log$LogLevel[LogLevel.Debug.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$comms$log$LogLevel[LogLevel.Verbose.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$comms$log$LogLevel[LogLevel.Info.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public abstract class LogStrategy {
        private final JoinPoint mJoinPoint;
        protected final CommsLogger mLogger;
        private final String mMessage;
        protected Throwable mThrowable;

        public LogStrategy(CommsLogger commsLogger, String str, JoinPoint joinPoint) {
            this.mLogger = commsLogger;
            this.mMessage = str;
            this.mJoinPoint = joinPoint;
        }

        private String getAnnotatedParamsAsAString() {
            Object[] args = this.mJoinPoint.getArgs();
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                if (paramIsAnnotatedAtIndex(i)) {
                    Object obj = args[i];
                    if (obj instanceof Throwable) {
                        this.mThrowable = (Throwable) obj;
                    } else {
                        arrayList.add(obj);
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(arrayList.get(i2));
            }
            return sb.toString();
        }

        private String getMessage() {
            StringBuilder sb = new StringBuilder();
            String annotatedParamsAsAString = getAnnotatedParamsAsAString();
            if (this.mMessage.isEmpty()) {
                Class<?> cls = this.mJoinPoint.getTarget().getClass();
                String simpleName = cls.isAnonymousClass() ? cls.getEnclosingClass().getSimpleName() : cls.getSimpleName();
                String name = this.mJoinPoint.getSignature().getName();
                sb.append(simpleName);
                sb.append(".");
                sb.append(name);
                sb.append(MarkdownConstants.LEFT_PARENTHESIS);
                sb.append(annotatedParamsAsAString);
                sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
            } else {
                sb.append(this.mMessage);
                if (!annotatedParamsAsAString.isEmpty()) {
                    sb.append(": ");
                    sb.append(annotatedParamsAsAString);
                }
            }
            return sb.toString();
        }

        private boolean paramIsAnnotatedAtIndex(int i) {
            boolean z = this.mJoinPoint.getSignature() instanceof ConstructorSignature;
            JoinPoint joinPoint = this.mJoinPoint;
            for (Annotation annotation : z ? ((ConstructorSignature) joinPoint.getSignature()).getConstructor().getParameterAnnotations()[i] : ((MethodSignature) joinPoint.getSignature()).getMethod().getParameterAnnotations()[i]) {
                if (annotation instanceof Log) {
                    return true;
                }
            }
            return false;
        }

        public void apply() {
            String message = getMessage();
            Throwable th = this.mThrowable;
            if (th != null) {
                log(message, th);
            } else {
                log(message);
            }
        }

        public abstract void log(String str);

        public abstract void log(String str, Throwable th);
    }

    public CommsLoggerAspect() {
        this(new CommsLogger.CommsLoggerFactoryImpl());
    }

    private void logMessage(LogStrategy logStrategy) {
        logStrategy.apply();
    }

    @Around("@annotation(log) && (methodsWithinCommsPackage() || constructorsWithinCommsPackage())")
    public Object log(ProceedingJoinPoint proceedingJoinPoint, Log log) throws Throwable {
        CommsLogger logger = this.mCommsLoggerFactory.getLogger(proceedingJoinPoint.getTarget());
        if (logger.isLoggable(log.level())) {
            int i = AnonymousClass1.$SwitchMap$com$amazon$comms$log$LogLevel[log.level().ordinal()];
            if (i == 1) {
                logMessage(new LogErrorStrategy(this, logger, log.message(), proceedingJoinPoint));
            } else if (i == 2) {
                logMessage(new LogWarningStrategy(logger, log.message(), proceedingJoinPoint));
            } else if (i == 3) {
                logMessage(new LogDebugStrategy(logger, log.message(), proceedingJoinPoint));
            } else if (i != 4) {
                logMessage(new LogInfoStrategy(logger, log.message(), proceedingJoinPoint));
            } else {
                logMessage(new LogVerboseStrategy(logger, log.message(), proceedingJoinPoint));
            }
        }
        try {
            return proceedingJoinPoint.proceed();
        } finally {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LogDebugStrategy extends LogStrategy {
        public LogDebugStrategy(CommsLogger commsLogger, String str, JoinPoint joinPoint) {
            super(commsLogger, str, joinPoint);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str) {
            this.mLogger.d(str);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str, Throwable th) {
            this.mLogger.d(str, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LogErrorStrategy extends LogStrategy {
        public LogErrorStrategy(CommsLoggerAspect commsLoggerAspect, CommsLogger commsLogger, String str, JoinPoint joinPoint) {
            this(commsLogger, str, joinPoint, null);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str) {
            this.mLogger.e(str);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str, Throwable th) {
            this.mLogger.e(str, th);
        }

        public LogErrorStrategy(CommsLogger commsLogger, String str, JoinPoint joinPoint, Throwable th) {
            super(commsLogger, str, joinPoint);
            this.mThrowable = th;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LogInfoStrategy extends LogStrategy {
        public LogInfoStrategy(CommsLogger commsLogger, String str, JoinPoint joinPoint) {
            super(commsLogger, str, joinPoint);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str) {
            this.mLogger.i(str);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str, Throwable th) {
            this.mLogger.i(str, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LogVerboseStrategy extends LogStrategy {
        public LogVerboseStrategy(CommsLogger commsLogger, String str, JoinPoint joinPoint) {
            super(commsLogger, str, joinPoint);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str) {
            this.mLogger.v(str);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str, Throwable th) {
            this.mLogger.v(str, th);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LogWarningStrategy extends LogStrategy {
        public LogWarningStrategy(CommsLogger commsLogger, String str, JoinPoint joinPoint) {
            super(commsLogger, str, joinPoint);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str) {
            this.mLogger.w(str);
        }

        @Override // com.amazon.comms.log.CommsLoggerAspect.LogStrategy
        public void log(String str, Throwable th) {
            this.mLogger.w(str, th);
        }
    }

    public CommsLoggerAspect(CommsLogger.CommsLoggerFactory commsLoggerFactory) {
        this.mCommsLoggerFactory = commsLoggerFactory;
    }

    @Pointcut("execution(com.amazon.comms..*.new(..))")
    public void constructorsWithinCommsPackage() {
    }

    @Pointcut("execution(* com.amazon.comms..*.*(..))")
    public void methodsWithinCommsPackage() {
    }
}
