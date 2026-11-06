package org.apache.logging.log4j.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.logging.log4j.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalApi
/* loaded from: classes11.dex */
public final class ServiceLoaderUtil {
    private static final int MAX_BROKEN_SERVICES = 8;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ServiceLoaderSpliterator<S> extends Spliterators.AbstractSpliterator<S> {
        private final Logger logger;
        private final Iterator<? extends S> serviceIterator;
        private final String serviceName;

        private ServiceLoaderSpliterator(Class<S> cls, Iterable<? extends S> iterable, Logger logger) {
            super(Long.MAX_VALUE, 1296);
            this.serviceName = cls.getName();
            this.serviceIterator = iterable.iterator();
            this.logger = logger;
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super S> consumer) {
            int i = 8;
            while (true) {
                int i2 = i - 1;
                if (i <= 0) {
                    return false;
                }
                try {
                } catch (Exception e) {
                    this.logger.warn("Unexpected exception  while loading implementation for service {}", this.serviceName, e);
                    throw e;
                } catch (LinkageError | ServiceConfigurationError e2) {
                    this.logger.warn("Unable to load implementation for service {}", this.serviceName, e2);
                }
                if (this.serviceIterator.hasNext()) {
                    consumer.accept(this.serviceIterator.next());
                    return true;
                }
                continue;
                i = i2;
            }
        }
    }

    private ServiceLoaderUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$safeStream$0(Collection collection, Object obj) {
        return collection.add(obj.getClass());
    }

    public static <S> Stream<S> safeStream(Class<S> cls, ServiceLoader<? extends S> serviceLoader, Logger logger) {
        Objects.requireNonNull(serviceLoader, "serviceLoader");
        final HashSet hashSet = new HashSet();
        Stream stream = StreamSupport.stream(new ServiceLoaderSpliterator(cls, serviceLoader, logger), false);
        Class<?> callerClass = StackLocatorUtil.getCallerClass(2);
        if (OsgiServiceLocator.isAvailable() && callerClass != null) {
            stream = Stream.concat(stream, OsgiServiceLocator.loadServices(cls, callerClass, logger));
        }
        return stream.filter(new Predicate() { // from class: org.apache.logging.log4j.util.ServiceLoaderUtil$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$safeStream$0;
                lambda$safeStream$0 = ServiceLoaderUtil.lambda$safeStream$0(hashSet, obj);
                return lambda$safeStream$0;
            }
        });
    }
}
