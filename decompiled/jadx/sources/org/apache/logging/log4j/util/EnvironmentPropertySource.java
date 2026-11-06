package org.apache.logging.log4j.util;

import aQute.bnd.annotation.spi.ServiceProvider;
import java.util.Collection;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ServiceProvider(resolution = "optional", value = PropertySource.class)
/* loaded from: classes11.dex */
public class EnvironmentPropertySource implements PropertySource {
    private static final int DEFAULT_PRIORITY = 100;
    private static final String PREFIX = "LOG4J_";
    private static final Logger LOGGER = StatusLogger.getLogger();
    private static final PropertySource INSTANCE = new EnvironmentPropertySource();

    private static void logException(SecurityException securityException) {
        LOGGER.error("The environment variables are not available to Log4j due to security restrictions.", (Throwable) securityException);
    }

    public static PropertySource provider() {
        return INSTANCE;
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public boolean containsProperty(String str) {
        try {
            return System.getenv().containsKey(str);
        } catch (SecurityException e) {
            logException(e, str);
            return super.containsProperty(str);
        }
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public void forEach(BiConsumer<String, String> biConsumer) {
        try {
            for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
                String key = entry.getKey();
                if (key.startsWith(PREFIX)) {
                    biConsumer.accept(key.substring(6), entry.getValue());
                }
            }
        } catch (SecurityException e) {
            logException(e);
        }
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public CharSequence getNormalForm(Iterable<? extends CharSequence> iterable) {
        StringBuilder sb = new StringBuilder("LOG4J");
        boolean z = true;
        for (CharSequence charSequence : iterable) {
            sb.append('_');
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(Character.toUpperCase(charSequence.charAt(i)));
            }
            z = false;
        }
        if (z) {
            return null;
        }
        return sb.toString();
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public int getPriority() {
        return 100;
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public String getProperty(String str) {
        try {
            return System.getenv(str);
        } catch (SecurityException e) {
            logException(e, str);
            return super.getProperty(str);
        }
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public Collection<String> getPropertyNames() {
        try {
            return System.getenv().keySet();
        } catch (SecurityException e) {
            logException(e);
            return super.getPropertyNames();
        }
    }

    private static void logException(SecurityException securityException, String str) {
        LOGGER.error("The environment variable {} is not available to Log4j due to security restrictions.", str, securityException);
    }
}
