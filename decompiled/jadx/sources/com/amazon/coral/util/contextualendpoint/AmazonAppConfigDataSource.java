package com.amazon.coral.util.contextualendpoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class AmazonAppConfigDataSource implements DataSource {
    private static final Logger LOGGER = LogManager.getLogger((Class<?>) AmazonAppConfigDataSource.class);
    private final Class<?> appConfigClass;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LazyInit {
        private static final AmazonAppConfigDataSource INSTANCE = newInstance();

        private LazyInit() {
        }

        private static AmazonAppConfigDataSource newInstance() {
            try {
                return new AmazonAppConfigDataSource(Class.forName("amazon.platform.config.AppConfig"));
            } catch (Throwable th) {
                AmazonAppConfigDataSource.LOGGER.debug("Could not reflectively retrieve AmazonAppConfigJava", th);
                return null;
            }
        }
    }

    public AmazonAppConfigDataSource(Class<?> cls) {
        this.appConfigClass = cls;
    }

    public static AmazonAppConfigDataSource getInstance() {
        return LazyInit.INSTANCE;
    }

    private boolean isInitialized() throws ReflectiveOperationException {
        return ((Boolean) this.appConfigClass.getMethod("isInitialized", null).invoke(null, null)).booleanValue();
    }

    @Override // com.amazon.coral.util.contextualendpoint.DataSource
    public String findString(String str) {
        try {
            if (isInitialized()) {
                return (String) this.appConfigClass.getMethod("findString", String.class).invoke(null, str);
            }
            throw new IllegalStateException("AmazonAppConfigJava not initialized");
        } catch (ClassCastException e) {
            Single$$ExternalSyntheticBUOutline0.m("Retrieved AmazonAppConfigJava value is not a string.", e);
            return null;
        } catch (Throwable th) {
            throw new UnsupportedOperationException("Could not run findString from AmazonAppConfigJava", th);
        }
    }

    @Override // com.amazon.coral.util.contextualendpoint.DataSource
    public String getServiceName() {
        try {
            if (isInitialized()) {
                return (String) this.appConfigClass.getMethod("getApplicationName", null).invoke(null, null);
            }
            throw new IllegalStateException("AmazonAppConfigJava not initialized");
        } catch (Throwable th) {
            throw new UnsupportedOperationException("getServiceName not supported in AmazonAppConfigJava", th);
        }
    }

    @Override // com.amazon.coral.util.contextualendpoint.DataSource
    public Boolean isProduction() {
        try {
            if (!isInitialized()) {
                throw new IllegalStateException("AmazonAppConfigJava not initialized");
            }
            String str = (String) this.appConfigClass.getMethod("getDomain", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return Boolean.valueOf(str.equalsIgnoreCase("prod"));
        } catch (Throwable th) {
            throw new UnsupportedOperationException("Could not determine isProduction from AmazonAppConfigJava", th);
        }
    }
}
