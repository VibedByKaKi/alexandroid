package org.apache.logging.log4j.spi;

import java.net.URI;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface LoggerContextFactory {
    LoggerContext getContext(String str, ClassLoader classLoader, Object obj, boolean z);

    LoggerContext getContext(String str, ClassLoader classLoader, Object obj, boolean z, URI uri, String str2);

    default boolean hasContext(String str, ClassLoader classLoader, boolean z) {
        return false;
    }

    default boolean isClassLoaderDependent() {
        return true;
    }

    void removeContext(LoggerContext loggerContext);

    default void shutdown(String str, ClassLoader classLoader, boolean z, boolean z2) {
        if (hasContext(str, classLoader, z)) {
            LoggerContext context = getContext(str, classLoader, null, z);
            if (context instanceof Terminable) {
                ((Terminable) context).terminate();
            }
        }
    }
}
