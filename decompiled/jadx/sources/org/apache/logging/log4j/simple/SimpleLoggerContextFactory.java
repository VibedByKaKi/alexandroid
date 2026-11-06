package org.apache.logging.log4j.simple;

import java.net.URI;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.spi.LoggerContextFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SimpleLoggerContextFactory implements LoggerContextFactory {
    public static final SimpleLoggerContextFactory INSTANCE = new SimpleLoggerContextFactory();

    @Override // org.apache.logging.log4j.spi.LoggerContextFactory
    public LoggerContext getContext(String str, ClassLoader classLoader, Object obj, boolean z) {
        return SimpleLoggerContext.INSTANCE;
    }

    @Override // org.apache.logging.log4j.spi.LoggerContextFactory
    public boolean isClassLoaderDependent() {
        return false;
    }

    @Override // org.apache.logging.log4j.spi.LoggerContextFactory
    public LoggerContext getContext(String str, ClassLoader classLoader, Object obj, boolean z, URI uri, String str2) {
        return SimpleLoggerContext.INSTANCE;
    }

    @Override // org.apache.logging.log4j.spi.LoggerContextFactory
    public void removeContext(LoggerContext loggerContext) {
    }
}
