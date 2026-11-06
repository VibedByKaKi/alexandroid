package org.apache.logging.log4j;

import java.net.URI;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.logging.log4j.internal.LogManagerStatus;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.StringFormatterMessageFactory;
import org.apache.logging.log4j.simple.SimpleLoggerContextFactory;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.apache.logging.log4j.spi.Terminable;
import org.apache.logging.log4j.status.StatusLogger;
import org.apache.logging.log4j.util.ProviderUtil;
import org.apache.logging.log4j.util.StackLocatorUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LogManager {

    @Deprecated
    public static final String FACTORY_PROPERTY_NAME = "log4j2.loggerContextFactory";
    public static final String ROOT_LOGGER_NAME = "";
    private static final Logger LOGGER = StatusLogger.getLogger();
    private static final String FQCN = LogManager.class.getName();
    private static volatile LoggerContextFactory factory = ProviderUtil.getProvider().getLoggerContextFactory();

    static {
        LogManagerStatus.setInitialized(true);
    }

    private static Class<?> callerClass(Class<?> cls) {
        if (cls != null) {
            return cls;
        }
        Class<?> callerClass = StackLocatorUtil.getCallerClass(3);
        if (callerClass != null) {
            return callerClass;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("No class provided, and an appropriate one cannot be found.");
        return null;
    }

    public static boolean exists(String str) {
        return getContext().hasLogger(str);
    }

    public static LoggerContext getContext(boolean z) {
        boolean z2;
        try {
            z2 = z;
            try {
                return factory.getContext(FQCN, null, null, z2, null, null);
            } catch (IllegalStateException e) {
                e = e;
                LOGGER.warn("{} Using SimpleLogger", e.getMessage());
                return SimpleLoggerContextFactory.INSTANCE.getContext(FQCN, null, null, z2, null, null);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            z2 = z;
        }
    }

    public static LoggerContextFactory getFactory() {
        return factory;
    }

    public static Logger getFormatterLogger(Object obj) {
        return getLogger(obj != null ? obj.getClass() : StackLocatorUtil.getCallerClass(2), (MessageFactory) StringFormatterMessageFactory.INSTANCE);
    }

    public static Logger getLogger(String str) {
        return str != null ? getContext(false).getLogger(str) : getLogger(StackLocatorUtil.getCallerClass(2));
    }

    public static Logger getRootLogger() {
        return getLogger("");
    }

    public static void setFactory(LoggerContextFactory loggerContextFactory) {
        factory = loggerContextFactory;
    }

    public static void shutdown(boolean z) {
        factory.shutdown(FQCN, null, z, false);
    }

    public static void shutdown() {
        shutdown(false);
    }

    public static void shutdown(boolean z, boolean z2) {
        factory.shutdown(FQCN, null, z, z2);
    }

    public static void shutdown(LoggerContext loggerContext) {
        if (loggerContext instanceof Terminable) {
            ((Terminable) loggerContext).terminate();
        }
    }

    public static Logger getFormatterLogger(Class<?> cls) {
        if (cls == null) {
            cls = StackLocatorUtil.getCallerClass(2);
        }
        return getLogger(cls, (MessageFactory) StringFormatterMessageFactory.INSTANCE);
    }

    public static Logger getFormatterLogger() {
        return getFormatterLogger(StackLocatorUtil.getCallerClass(2));
    }

    public static Logger getFormatterLogger(String str) {
        if (str == null) {
            return getFormatterLogger(StackLocatorUtil.getCallerClass(2));
        }
        return getLogger(str, (MessageFactory) StringFormatterMessageFactory.INSTANCE);
    }

    public static Logger getLogger(Class<?> cls) {
        Class<?> callerClass = callerClass(cls);
        return getContext(callerClass.getClassLoader(), false).getLogger(callerClass);
    }

    public static Logger getLogger(Class<?> cls, MessageFactory messageFactory) {
        Class<?> callerClass = callerClass(cls);
        return getContext(callerClass.getClassLoader(), false).getLogger(callerClass, messageFactory);
    }

    public static Logger getLogger(MessageFactory messageFactory) {
        return getLogger(StackLocatorUtil.getCallerClass(2), messageFactory);
    }

    public static Logger getLogger(Object obj) {
        return getLogger(obj != null ? obj.getClass() : StackLocatorUtil.getCallerClass(2));
    }

    public static Logger getLogger(Object obj, MessageFactory messageFactory) {
        return getLogger(obj != null ? obj.getClass() : StackLocatorUtil.getCallerClass(2), messageFactory);
    }

    public static Logger getLogger() {
        return getLogger(StackLocatorUtil.getCallerClass(2));
    }

    public static Logger getLogger(String str, MessageFactory messageFactory) {
        if (str != null) {
            return getContext(false).getLogger(str, messageFactory);
        }
        return getLogger(StackLocatorUtil.getCallerClass(2), messageFactory);
    }

    public static Logger getLogger(String str, String str2) {
        return factory.getContext(str, null, null, false).getLogger(str2);
    }

    public static LoggerContext getContext() {
        try {
            return factory.getContext(FQCN, null, null, true);
        } catch (IllegalStateException e) {
            LOGGER.warn("{} Using SimpleLogger", e.getMessage());
            return SimpleLoggerContextFactory.INSTANCE.getContext(FQCN, null, null, true);
        }
    }

    public static LoggerContext getContext(ClassLoader classLoader, boolean z) {
        try {
            return factory.getContext(FQCN, classLoader, null, z);
        } catch (IllegalStateException e) {
            LOGGER.warn("{} Using SimpleLogger", e.getMessage());
            return SimpleLoggerContextFactory.INSTANCE.getContext(FQCN, classLoader, null, z);
        }
    }

    public static LoggerContext getContext(ClassLoader classLoader, boolean z, Object obj) {
        try {
            return factory.getContext(FQCN, classLoader, obj, z);
        } catch (IllegalStateException e) {
            LOGGER.warn("{} Using SimpleLogger", e.getMessage());
            return SimpleLoggerContextFactory.INSTANCE.getContext(FQCN, classLoader, obj, z);
        }
    }

    public static LoggerContext getContext(ClassLoader classLoader, boolean z, URI uri) {
        ClassLoader classLoader2;
        boolean z2;
        URI uri2;
        try {
            classLoader2 = classLoader;
            z2 = z;
            uri2 = uri;
            try {
                return factory.getContext(FQCN, classLoader2, null, z2, uri2, null);
            } catch (IllegalStateException e) {
                e = e;
                LOGGER.warn("{} Using SimpleLogger", e.getMessage());
                return SimpleLoggerContextFactory.INSTANCE.getContext(FQCN, classLoader2, null, z2, uri2, null);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            classLoader2 = classLoader;
            z2 = z;
            uri2 = uri;
        }
    }

    public static LoggerContext getContext(ClassLoader classLoader, boolean z, Object obj, URI uri) {
        ClassLoader classLoader2;
        boolean z2;
        Object obj2;
        URI uri2;
        try {
            classLoader2 = classLoader;
            z2 = z;
            obj2 = obj;
            uri2 = uri;
            try {
                return factory.getContext(FQCN, classLoader2, obj2, z2, uri2, null);
            } catch (IllegalStateException e) {
                e = e;
                LOGGER.warn("{} Using SimpleLogger", e.getMessage());
                return SimpleLoggerContextFactory.INSTANCE.getContext(FQCN, classLoader2, obj2, z2, uri2, null);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            classLoader2 = classLoader;
            z2 = z;
            obj2 = obj;
            uri2 = uri;
        }
    }

    public static LoggerContext getContext(ClassLoader classLoader, boolean z, Object obj, URI uri, String str) {
        ClassLoader classLoader2;
        boolean z2;
        Object obj2;
        URI uri2;
        String str2;
        try {
            classLoader2 = classLoader;
            z2 = z;
            obj2 = obj;
            uri2 = uri;
            str2 = str;
            try {
                return factory.getContext(FQCN, classLoader2, obj2, z2, uri2, str2);
            } catch (IllegalStateException e) {
                e = e;
                LOGGER.warn("{} Using SimpleLogger", e.getMessage());
                return SimpleLoggerContextFactory.INSTANCE.getContext(FQCN, classLoader2, obj2, z2, uri2, str2);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            classLoader2 = classLoader;
            z2 = z;
            obj2 = obj;
            uri2 = uri;
            str2 = str;
        }
    }

    public static LoggerContext getContext(String str, boolean z) {
        try {
            return factory.getContext(str, null, null, z);
        } catch (IllegalStateException e) {
            LOGGER.warn("{} Using SimpleLogger", e.getMessage());
            return SimpleLoggerContextFactory.INSTANCE.getContext(str, null, null, z);
        }
    }

    public static LoggerContext getContext(String str, ClassLoader classLoader, boolean z) {
        try {
            return factory.getContext(str, classLoader, null, z);
        } catch (IllegalStateException e) {
            LOGGER.warn("{} Using SimpleLogger", e.getMessage());
            return SimpleLoggerContextFactory.INSTANCE.getContext(str, classLoader, null, z);
        }
    }

    public static LoggerContext getContext(String str, ClassLoader classLoader, boolean z, URI uri, String str2) {
        String str3;
        ClassLoader classLoader2;
        boolean z2;
        try {
            str3 = str;
            classLoader2 = classLoader;
            z2 = z;
        } catch (IllegalStateException e) {
            e = e;
            str3 = str;
            classLoader2 = classLoader;
            z2 = z;
        }
        try {
            return factory.getContext(str3, classLoader2, null, z2, uri, str2);
        } catch (IllegalStateException e2) {
            e = e2;
            LOGGER.warn("{} Using SimpleLogger", e.getMessage());
            return SimpleLoggerContextFactory.INSTANCE.getContext(str3, classLoader2, null, z2);
        }
    }
}
