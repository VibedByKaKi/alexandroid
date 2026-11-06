package org.apache.logging.log4j.util;

import com.amazon.alexa.handsfree.foxtrot.FoxtrotAPIConstants;
import com.amazon.alexa.presence.service.PresenceBleService;
import java.lang.invoke.MethodHandles;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.status.StatusLogger;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.wiring.BundleRevision;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class OsgiServiceLocator {
    private static final Logger LOGGER = StatusLogger.getLogger();
    private static final boolean OSGI_AVAILABLE = checkOsgiAvailable();

    private static boolean checkOsgiAvailable() {
        try {
            return Class.forName("org.osgi.framework.FrameworkUtil").getMethod("getBundle", Class.class).invoke(null, OsgiServiceLocator.class) != null;
        } catch (ClassNotFoundException | LinkageError | NoSuchMethodException unused) {
            return false;
        } catch (Throwable th) {
            LOGGER.error("Unknown error checking OSGI environment.", th);
            return false;
        }
    }

    public static boolean isAvailable() {
        return OSGI_AVAILABLE;
    }

    private static boolean isFragment(Bundle bundle) {
        return (((BundleRevision) bundle.adapt(BundleRevision.class)).getTypes() & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$loadServices$0(Bundle bundle) {
        int state = bundle.getState();
        return state != 1 ? state != 2 ? state != 4 ? state != 8 ? state != 16 ? state != 32 ? "UNKNOWN" : "ACTIVE" : PresenceBleService.ServiceState.STOPPING : PresenceBleService.ServiceState.STARTING : "RESOLVED" : FoxtrotAPIConstants.FOXTROT_BROADCAST_EXTRA_INSTALLED : "UNINSTALLED";
    }

    public static <T> Stream<T> loadServices(final Class<T> cls, Class<?> cls2, Logger logger) {
        final Bundle bundle = FrameworkUtil.getBundle(cls2);
        if (bundle != null && !isFragment(bundle)) {
            final BundleContext bundleContext = bundle.getBundleContext();
            if (bundleContext == null) {
                Objects.requireNonNull(cls);
                final int i = 1;
                final int i2 = 0;
                logger.warn("Unable to load OSGi services for service {}: bundle {} (state {}) does not have a valid BundleContext", new Supplier() { // from class: org.apache.logging.log4j.util.OsgiServiceLocator$$ExternalSyntheticLambda2
                    private final Object get$org$apache$logging$log4j$util$OsgiServiceLocator$$ExternalSyntheticLambda2() {
                        Object lambda$loadServices$0;
                        lambda$loadServices$0 = OsgiServiceLocator.lambda$loadServices$0((Bundle) cls);
                        return lambda$loadServices$0;
                    }

                    @Override // org.apache.logging.log4j.util.Supplier, java.util.function.Supplier
                    public final Object get() {
                        switch (i) {
                            case 0:
                                return get$org$apache$logging$log4j$util$OsgiServiceLocator$$ExternalSyntheticLambda2();
                            default:
                                return ((Class) cls).getName();
                        }
                    }
                }, new Supplier() { // from class: org.apache.logging.log4j.util.OsgiServiceLocator$$ExternalSyntheticLambda1
                    @Override // org.apache.logging.log4j.util.Supplier, java.util.function.Supplier
                    public final Object get() {
                        return bundle.getSymbolicName();
                    }
                }, new Supplier() { // from class: org.apache.logging.log4j.util.OsgiServiceLocator$$ExternalSyntheticLambda2
                    private final Object get$org$apache$logging$log4j$util$OsgiServiceLocator$$ExternalSyntheticLambda2() {
                        Object lambda$loadServices$0;
                        lambda$loadServices$0 = OsgiServiceLocator.lambda$loadServices$0((Bundle) bundle);
                        return lambda$loadServices$0;
                    }

                    @Override // org.apache.logging.log4j.util.Supplier, java.util.function.Supplier
                    public final Object get() {
                        switch (i2) {
                            case 0:
                                return get$org$apache$logging$log4j$util$OsgiServiceLocator$$ExternalSyntheticLambda2();
                            default:
                                return ((Class) bundle).getName();
                        }
                    }
                });
            } else {
                try {
                    return bundleContext.getServiceReferences(cls, (String) null).stream().map(new Function() { // from class: org.apache.logging.log4j.util.OsgiServiceLocator$$ExternalSyntheticLambda3
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return bundleContext.getService((ServiceReference) obj);
                        }
                    });
                } catch (Exception e) {
                    logger.error("Unable to load OSGI services for service {}", cls, e);
                }
            }
        }
        return Stream.empty();
    }

    public static <T> Stream<T> loadServices(Class<T> cls, MethodHandles.Lookup lookup, boolean z) {
        Objects.requireNonNull(lookup, com.facebook.hermes.intl.Constants.LOCALEMATCHER_LOOKUP);
        return loadServices(cls, lookup.lookupClass(), StatusLogger.getLogger());
    }

    public static <T> Stream<T> loadServices(Class<T> cls, MethodHandles.Lookup lookup) {
        return loadServices((Class) cls, lookup, true);
    }
}
