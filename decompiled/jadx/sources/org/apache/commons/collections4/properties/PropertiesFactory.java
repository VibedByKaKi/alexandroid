package org.apache.commons.collections4.properties;

import java.util.Properties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PropertiesFactory extends AbstractPropertiesFactory<Properties> {
    public static final PropertiesFactory INSTANCE = new PropertiesFactory();

    private PropertiesFactory() {
    }

    @Override // org.apache.commons.collections4.properties.AbstractPropertiesFactory
    public Properties createProperties() {
        return new Properties();
    }
}
