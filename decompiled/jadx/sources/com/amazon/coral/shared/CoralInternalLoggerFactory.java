package com.amazon.coral.shared;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class CoralInternalLoggerFactory {
    private static final LoggerImplFactory LOGGER_IMPL_FACTORY = findLoggingFactory();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class FallbackLoggerImplFactory implements LoggerImplFactory {
        private final LoggerImplFactory primary;

        private FallbackLoggerImplFactory(LoggerImplFactory loggerImplFactory) {
            this.primary = loggerImplFactory;
        }

        @Override // com.amazon.coral.shared.CoralInternalLoggerFactory.LoggerImplFactory
        public CoralInternalLogger create(String str) {
            return new ExceptionSanitizingWrapper(this.primary.create(str), new JulLogger(str));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LoggerImplFactory {
        CoralInternalLogger create(String str);
    }

    private CoralInternalLoggerFactory() {
    }

    private static LoggerImplFactory findLoggingFactory() {
        LoggerImplFactory log4J2Factory = getLog4J2Factory();
        if (log4J2Factory == null) {
            log4J2Factory = getJclFactory();
        }
        return log4J2Factory != null ? log4J2Factory : new CoralInternalLoggerFactory$$ExternalSyntheticLambda0(1);
    }

    private static LoggerImplFactory getJclFactory() {
        try {
            CoralInternalLoggerFactory$$ExternalSyntheticLambda0 coralInternalLoggerFactory$$ExternalSyntheticLambda0 = new CoralInternalLoggerFactory$$ExternalSyntheticLambda0(0);
            coralInternalLoggerFactory$$ExternalSyntheticLambda0.create(CoralInternalLoggerFactory.class.getName());
            return new FallbackLoggerImplFactory(coralInternalLoggerFactory$$ExternalSyntheticLambda0);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static LoggerImplFactory getLog4J2Factory() {
        try {
            CoralInternalLoggerFactory$$ExternalSyntheticLambda0 coralInternalLoggerFactory$$ExternalSyntheticLambda0 = new CoralInternalLoggerFactory$$ExternalSyntheticLambda0(2);
            coralInternalLoggerFactory$$ExternalSyntheticLambda0.create(CoralInternalLoggerFactory.class.getName());
            return new FallbackLoggerImplFactory(coralInternalLoggerFactory$$ExternalSyntheticLambda0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static CoralInternalLogger getLogger(Class<?> cls) {
        return getLogger(cls.getName());
    }

    public static CoralInternalLogger getLogger(String str) {
        return LOGGER_IMPL_FACTORY.create(str);
    }
}
