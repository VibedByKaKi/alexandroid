package org.threeten.bp.zone;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class ZoneRulesInitializer {
    public static final ZoneRulesInitializer DO_NOTHING = new DoNothingZoneRulesInitializer();
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean(false);
    private static final AtomicReference<ZoneRulesInitializer> INITIALIZER = new AtomicReference<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ServiceLoaderZoneRulesInitializer extends ZoneRulesInitializer {
        @Override // org.threeten.bp.zone.ZoneRulesInitializer
        public void initializeProviders() {
            Iterator it2 = ServiceLoader.load(ZoneRulesProvider.class, ZoneRulesProvider.class.getClassLoader()).iterator();
            while (it2.hasNext()) {
                try {
                    ZoneRulesProvider.registerProvider((ZoneRulesProvider) it2.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    public static void initialize() {
        if (INITIALIZED.getAndSet(true)) {
            Single$$ExternalSyntheticBUOutline0.m$2("Already initialized");
            return;
        }
        AtomicReference<ZoneRulesInitializer> atomicReference = INITIALIZER;
        ServiceLoaderZoneRulesInitializer serviceLoaderZoneRulesInitializer = new ServiceLoaderZoneRulesInitializer();
        while (!atomicReference.compareAndSet(null, serviceLoaderZoneRulesInitializer) && atomicReference.get() == null) {
        }
        INITIALIZER.get().initializeProviders();
    }

    public static void setInitializer(ZoneRulesInitializer zoneRulesInitializer) {
        if (INITIALIZED.get()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Already initialized");
            return;
        }
        AtomicReference<ZoneRulesInitializer> atomicReference = INITIALIZER;
        while (!atomicReference.compareAndSet(null, zoneRulesInitializer)) {
            if (atomicReference.get() != null) {
                Single$$ExternalSyntheticBUOutline0.m$2("Initializer was already set, possibly with a default during initialization");
                return;
            }
        }
    }

    public abstract void initializeProviders();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DoNothingZoneRulesInitializer extends ZoneRulesInitializer {
        @Override // org.threeten.bp.zone.ZoneRulesInitializer
        public void initializeProviders() {
        }
    }
}
