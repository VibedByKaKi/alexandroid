package org.apache.logging.log4j.util;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import org.apache.logging.log4j.util.PropertySource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class PropertiesPropertySource implements PropertySource {
    private static final int DEFAULT_PRIORITY = 200;
    private static final String PREFIX = "log4j2.";
    private final int priority;
    private final Properties properties;

    public PropertiesPropertySource(Properties properties, int i) {
        this.properties = properties;
        this.priority = i;
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public boolean containsProperty(String str) {
        return getProperty(str) != null;
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public void forEach(BiConsumer<String, String> biConsumer) {
        for (Map.Entry entry : this.properties.entrySet()) {
            biConsumer.accept((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public CharSequence getNormalForm(Iterable<? extends CharSequence> iterable) {
        CharSequence joinAsCamelCase = PropertySource.Util.joinAsCamelCase(iterable);
        if (joinAsCamelCase.length() <= 0) {
            return null;
        }
        return PREFIX + ((Object) joinAsCamelCase);
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public int getPriority() {
        return this.priority;
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public String getProperty(String str) {
        return this.properties.getProperty(str);
    }

    @Override // org.apache.logging.log4j.util.PropertySource
    public Collection<String> getPropertyNames() {
        return this.properties.stringPropertyNames();
    }

    public PropertiesPropertySource(Properties properties) {
        this(properties, 200);
    }
}
