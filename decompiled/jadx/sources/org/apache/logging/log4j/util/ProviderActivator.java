package org.apache.logging.log4j.util;

import java.util.Hashtable;
import org.apache.logging.log4j.spi.Provider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class ProviderActivator implements BundleActivator {
    public static final String API_VERSION = "APIVersion";
    private final Provider provider;
    private ServiceRegistration<Provider> providerRegistration = null;

    public ProviderActivator(Provider provider) {
        this.provider = provider;
    }

    public void start(BundleContext bundleContext) throws Exception {
        Hashtable hashtable = new Hashtable();
        hashtable.put(API_VERSION, this.provider.getVersions());
        this.providerRegistration = bundleContext.registerService(Provider.class, this.provider, hashtable);
    }

    public void stop(BundleContext bundleContext) throws Exception {
        ServiceRegistration<Provider> serviceRegistration = this.providerRegistration;
        if (serviceRegistration != null) {
            serviceRegistration.unregister();
        }
    }
}
