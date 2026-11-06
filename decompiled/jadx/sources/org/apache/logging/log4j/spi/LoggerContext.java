package org.apache.logging.log4j.spi;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MessageFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface LoggerContext {
    public static final LoggerContext[] EMPTY_ARRAY = new LoggerContext[0];

    Object getExternalContext();

    default ExtendedLogger getLogger(Class<?> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = cls.getName();
        }
        return getLogger(canonicalName);
    }

    ExtendedLogger getLogger(String str);

    ExtendedLogger getLogger(String str, MessageFactory messageFactory);

    default LoggerRegistry<? extends Logger> getLoggerRegistry() {
        return null;
    }

    default Object getObject(String str) {
        return null;
    }

    boolean hasLogger(String str);

    boolean hasLogger(String str, Class<? extends MessageFactory> cls);

    boolean hasLogger(String str, MessageFactory messageFactory);

    default Object putObject(String str, Object obj) {
        return null;
    }

    default Object putObjectIfAbsent(String str, Object obj) {
        return null;
    }

    default Object removeObject(String str) {
        return null;
    }

    default boolean removeObject(String str, Object obj) {
        return false;
    }

    default ExtendedLogger getLogger(Class<?> cls, MessageFactory messageFactory) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = cls.getName();
        }
        return getLogger(canonicalName, messageFactory);
    }
}
