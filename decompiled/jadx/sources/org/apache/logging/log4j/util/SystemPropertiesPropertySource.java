package org.apache.logging.log4j.util;

import aQute.bnd.annotation.spi.ServiceProvider;
import java.util.Collection;
import java.util.Objects;
import java.util.Properties;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;
import org.apache.logging.log4j.util.PropertySource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ServiceProvider(resolution = "optional", value = PropertySource.class)
/* loaded from: classes11.dex */
public class SystemPropertiesPropertySource implements PropertySource {
    private static final int DEFAULT_PRIORITY = 0;
    private static final String PREFIX = "log4j2.";
    private static final Logger LOGGER = StatusLogger.getLogger();
    private static final PropertySource INSTANCE = new SystemPropertiesPropertySource();

    public static String getSystemProperty(String str, String str2) {
        String property = INSTANCE.getProperty(str);
        return property != null ? property : str2;
    }

    private static void logException(SecurityException securityException) {
        LOGGER.error("The Java system properties are not available to Log4j due to security restrictions.", (Throwable) securityException);
    }

    public static PropertySource provider() {
        return INSTANCE;
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public boolean containsProperty(String str) {
        return getProperty(str) != null;
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public void forEach(BiConsumer<String, String> biConsumer) {
        Object[] array;
        try {
            Properties properties = System.getProperties();
            synchronized (properties) {
                array = properties.keySet().toArray();
            }
            for (Object obj : array) {
                String objects = Objects.toString(obj, null);
                biConsumer.accept(objects, properties.getProperty(objects));
            }
        } catch (SecurityException e) {
            logException(e);
        }
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public CharSequence getNormalForm(Iterable<? extends CharSequence> iterable) {
        return PREFIX + ((Object) PropertySource.Util.joinAsCamelCase(iterable));
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public int getPriority() {
        return 0;
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public String getProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException e) {
            logException(e, str);
            return super.getProperty(str);
        }
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public Collection<String> getPropertyNames() {
        try {
            return System.getProperties().stringPropertyNames();
        } catch (SecurityException e) {
            logException(e);
            return super.getPropertyNames();
        }
    }

    private static void logException(SecurityException securityException, String str) {
        LOGGER.error("The Java system property {} is not available to Log4j due to security restrictions.", str, securityException);
    }
}
