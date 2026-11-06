package org.apache.logging.log4j.util;

import aQute.bnd.annotation.spi.ServiceConsumer;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.ServiceLoader;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.internal.annotation.SuppressFBWarnings;
import org.apache.logging.log4j.spi.Provider;
import org.apache.logging.log4j.status.StatusLogger;
import org.apache.logging.log4j.util.LoaderUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ServiceConsumer(cardinality = "multiple", resolution = "optional", value = Provider.class)
@InternalApi
/* loaded from: classes11.dex */
public final class ProviderUtil {
    private static volatile Provider PROVIDER = null;
    static final String PROVIDER_RESOURCE = "META-INF/log4j-provider.properties";
    static final Collection<Provider> PROVIDERS = new HashSet();
    static final Lock STARTUP_LOCK = new ReentrantLock();
    private static final String[] COMPATIBLE_API_VERSIONS = {"2.6.0"};
    private static final Logger LOGGER = StatusLogger.getLogger();

    private ProviderUtil() {
    }

    public static void addProvider(Provider provider) {
        if (!validVersion(provider.getVersions())) {
            LOGGER.warn("Ignoring provider for incompatible version {}:\n{}", provider.getVersions(), provider);
        } else {
            PROVIDERS.add(provider);
            LOGGER.debug("Loaded provider:\n{}", provider);
        }
    }

    public static ClassLoader findClassLoader() {
        return LoaderUtil.getThreadContextClassLoader();
    }

    public static Provider getProvider() {
        lazyInit();
        return PROVIDER;
    }

    public static Iterable<Provider> getProviders() {
        lazyInit();
        return PROVIDERS;
    }

    public static boolean hasProviders() {
        lazyInit();
        return !PROVIDERS.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$lazyInit$0(Provider provider) {
        return validVersion(provider.getVersions());
    }

    public static void lazyInit() {
        if (PROVIDER == null) {
            try {
                STARTUP_LOCK.lockInterruptibly();
                try {
                    if (PROVIDER == null) {
                        ServiceLoaderUtil.safeStream(Provider.class, ServiceLoader.load(Provider.class, ProviderUtil.class.getClassLoader()), LOGGER).filter(new ProviderUtil$$ExternalSyntheticLambda0(0)).forEach(new ProviderUtil$$ExternalSyntheticLambda1());
                        for (LoaderUtil.UrlResource urlResource : LoaderUtil.findUrlResources(PROVIDER_RESOURCE, false)) {
                            loadProvider(urlResource.getUrl(), urlResource.getClassLoader());
                        }
                        PROVIDER = selectProvider(PropertiesUtil.getProperties(), PROVIDERS, LOGGER);
                    }
                } finally {
                    STARTUP_LOCK.unlock();
                }
            } catch (InterruptedException e) {
                LOGGER.fatal("Interrupted before Log4j Providers could be loaded.", (Throwable) e);
                Thread.currentThread().interrupt();
            }
        }
    }

    @SuppressFBWarnings(justification = "Uses a fixed URL that ends in 'META-INF/log4j-provider.properties'.", value = {"URLCONNECTION_SSRF_FD"})
    public static void loadProvider(URL url, ClassLoader classLoader) {
        try {
            addProvider(new Provider(PropertiesUtil.loadClose(url.openStream(), url), url, classLoader));
        } catch (IOException e) {
            LOGGER.error("Unable to open {}", url, e);
        }
    }

    @Deprecated
    public static void loadProviders(Enumeration<URL> enumeration, ClassLoader classLoader) {
        if (enumeration != null) {
            while (enumeration.hasMoreElements()) {
                loadProvider(enumeration.nextElement(), classLoader);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.apache.logging.log4j.spi.Provider selectProvider(org.apache.logging.log4j.util.PropertiesUtil r8, java.util.Collection<org.apache.logging.log4j.spi.Provider> r9, org.apache.logging.log4j.Logger r10) {
        /*
            java.lang.Class<org.apache.logging.log4j.spi.LoggerContextFactory> r0 = org.apache.logging.log4j.spi.LoggerContextFactory.class
            java.lang.String r1 = "log4j.provider"
            java.lang.String r2 = r8.getStringProperty(r1)
            r3 = 0
            if (r2 == 0) goto L2c
            java.lang.Class<org.apache.logging.log4j.simple.internal.SimpleProvider> r4 = org.apache.logging.log4j.simple.internal.SimpleProvider.class
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L1d
            org.apache.logging.log4j.simple.internal.SimpleProvider r2 = new org.apache.logging.log4j.simple.internal.SimpleProvider
            r2.<init>()
            goto L2d
        L1d:
            java.lang.Object r2 = org.apache.logging.log4j.util.LoaderUtil.newInstanceOf(r2)     // Catch: java.lang.Exception -> L24
            org.apache.logging.log4j.spi.Provider r2 = (org.apache.logging.log4j.spi.Provider) r2     // Catch: java.lang.Exception -> L24
            goto L2d
        L24:
            r2 = move-exception
            java.lang.String r4 = "Unable to create provider {}.\nFalling back to default selection process."
            org.apache.logging.log4j.spi.Provider r5 = org.apache.logging.log4j.util.ProviderUtil.PROVIDER
            r10.error(r4, r5, r2)
        L2c:
            r2 = r3
        L2d:
            java.lang.String r4 = "log4j2.loggerContextFactory"
            java.lang.String r8 = r8.getStringProperty(r4)
            java.lang.String r5 = ""
            if (r8 == 0) goto L8c
            if (r2 == 0) goto L3f
            java.lang.String r6 = "Ignoring {} system property, since {} was set."
            r10.warn(r6, r4, r1)
            goto L5f
        L3f:
            java.lang.String r6 = "Usage of the {} property is deprecated. Use the {} property instead."
            r10.warn(r6, r4, r1)
            java.util.Iterator r1 = r9.iterator()
        L48:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L5f
            java.lang.Object r6 = r1.next()
            org.apache.logging.log4j.spi.Provider r6 = (org.apache.logging.log4j.spi.Provider) r6
            java.lang.String r7 = r6.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L48
            r2 = r6
        L5f:
            if (r2 != 0) goto L8c
            java.lang.String r1 = "No provider found using {} as logger context factory. The factory will be instantiated directly."
            r10.warn(r1, r8)
            java.lang.Class r1 = org.apache.logging.log4j.util.LoaderUtil.loadClass(r8)     // Catch: java.lang.Exception -> L7b
            boolean r6 = r0.isAssignableFrom(r1)     // Catch: java.lang.Exception -> L7b
            if (r6 == 0) goto L7d
            org.apache.logging.log4j.spi.Provider r6 = new org.apache.logging.log4j.spi.Provider     // Catch: java.lang.Exception -> L7b
            java.lang.Class r0 = r1.asSubclass(r0)     // Catch: java.lang.Exception -> L7b
            r6.<init>(r3, r5, r0)     // Catch: java.lang.Exception -> L7b
            r2 = r6
            goto L8c
        L7b:
            r0 = move-exception
            goto L87
        L7d:
            java.lang.String r1 = "Class {} specified in the {} system property does not extend {}"
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L7b
            r10.error(r1, r8, r4, r0)     // Catch: java.lang.Exception -> L7b
            goto L8c
        L87:
            java.lang.String r1 = "Unable to create class {} specified in the {} system property"
            r10.error(r1, r8, r4, r0)
        L8c:
            if (r2 != 0) goto Ldf
            org.apache.logging.log4j.util.ProviderUtil$$ExternalSyntheticLambda2 r8 = new org.apache.logging.log4j.util.ProviderUtil$$ExternalSyntheticLambda2
            r0 = 0
            r8.<init>(r0)
            java.util.Comparator r8 = java.util.Comparator.comparing(r8)
            int r0 = r9.size()
            if (r0 == 0) goto Lc5
            r1 = 1
            if (r0 == r1) goto Lca
            java.util.stream.Stream r0 = r9.stream()
            java.util.stream.Stream r0 = r0.sorted(r8)
            org.apache.logging.log4j.util.ProviderUtil$$ExternalSyntheticLambda2 r1 = new org.apache.logging.log4j.util.ProviderUtil$$ExternalSyntheticLambda2
            r2 = 2
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.map(r1)
            java.lang.String r1 = "\n"
            java.lang.String r2 = "Log4j API found multiple logging providers:\n"
            java.util.stream.Collector r1 = java.util.stream.Collectors.joining(r1, r2, r5)
            java.lang.Object r0 = r0.collect(r1)
            java.lang.String r0 = (java.lang.String) r0
            r10.warn(r0)
            goto Lca
        Lc5:
            java.lang.String r0 = "Log4j API could not find a logging provider."
            r10.error(r0)
        Lca:
            java.util.stream.Stream r9 = r9.stream()
            java.util.Optional r8 = r9.max(r8)
            org.apache.logging.log4j.util.LoaderUtil$$ExternalSyntheticLambda1 r9 = new org.apache.logging.log4j.util.LoaderUtil$$ExternalSyntheticLambda1
            r0 = 2
            r9.<init>(r0)
            java.lang.Object r8 = r8.orElseGet(r9)
            r2 = r8
            org.apache.logging.log4j.spi.Provider r2 = (org.apache.logging.log4j.spi.Provider) r2
        Ldf:
            java.lang.String r8 = "Using provider:\n{}"
            r10.info(r8, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.logging.log4j.util.ProviderUtil.selectProvider(org.apache.logging.log4j.util.PropertiesUtil, java.util.Collection, org.apache.logging.log4j.Logger):org.apache.logging.log4j.spi.Provider");
    }

    private static boolean validVersion(String str) {
        for (String str2 : COMPATIBLE_API_VERSIONS) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }
}
