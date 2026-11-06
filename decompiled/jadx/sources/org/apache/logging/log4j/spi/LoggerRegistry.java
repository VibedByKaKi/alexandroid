package org.apache.logging.log4j.spi;

import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import io.reactivex.rxjava3.core.Maybe$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11;
import org.apache.commons.lang3.stream.Streams$$ExternalSyntheticLambda0;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.jspecify.annotations.NullMarked;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@NullMarked
/* loaded from: classes11.dex */
public class LoggerRegistry<T extends ExtendedLogger> {
    private final ReadWriteLock lock;
    private final Map<String, Map<MessageFactory, T>> loggerByMessageFactoryByName;
    private final Lock readLock;
    private final Lock writeLock;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static class ConcurrentMapFactory<T extends ExtendedLogger> implements MapFactory<T> {
        @Override // org.apache.logging.log4j.spi.LoggerRegistry.MapFactory
        public Map<String, T> createInnerMap() {
            return new ConcurrentHashMap();
        }

        @Override // org.apache.logging.log4j.spi.LoggerRegistry.MapFactory
        public Map<String, Map<String, T>> createOuterMap() {
            return new ConcurrentHashMap();
        }

        @Override // org.apache.logging.log4j.spi.LoggerRegistry.MapFactory
        public void putIfAbsent(Map<String, T> map, String str, T t) {
            map.putIfAbsent(str, t);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public interface MapFactory<T extends ExtendedLogger> {
        Map<String, T> createInnerMap();

        Map<String, Map<String, T>> createOuterMap();

        void putIfAbsent(Map<String, T> map, String str, T t);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public static class WeakMapFactory<T extends ExtendedLogger> implements MapFactory<T> {
        @Override // org.apache.logging.log4j.spi.LoggerRegistry.MapFactory
        public Map<String, T> createInnerMap() {
            return new WeakHashMap();
        }

        @Override // org.apache.logging.log4j.spi.LoggerRegistry.MapFactory
        public Map<String, Map<String, T>> createOuterMap() {
            return new WeakHashMap();
        }

        @Override // org.apache.logging.log4j.spi.LoggerRegistry.MapFactory
        public void putIfAbsent(Map<String, T> map, String str, T t) {
            map.put(str, t);
        }
    }

    public LoggerRegistry() {
        this.loggerByMessageFactoryByName = new HashMap();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<MessageFactory, T> createLoggerRefByMessageFactoryMap(String str) {
        return new WeakHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Stream lambda$getLoggers$0(Map map) {
        return map.values().stream();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$hasLogger$1(Class cls, MessageFactory messageFactory) {
        return cls.equals(messageFactory.getClass());
    }

    public T getLogger(String str, MessageFactory messageFactory) {
        Objects.requireNonNull(str, "name");
        this.readLock.lock();
        try {
            Map<MessageFactory, T> map = this.loggerByMessageFactoryByName.get(str);
            if (messageFactory == null) {
                messageFactory = ParameterizedMessageFactory.INSTANCE;
            }
            return map == null ? null : map.get(messageFactory);
        } finally {
            this.readLock.unlock();
        }
    }

    public Collection<T> getLoggers() {
        this.readLock.lock();
        try {
            return (Collection) this.loggerByMessageFactoryByName.values().stream().flatMap(new Maybe$$ExternalSyntheticLambda0(23)).collect(Collectors.toList());
        } finally {
            this.readLock.unlock();
        }
    }

    public boolean hasLogger(String str, Class<? extends MessageFactory> cls) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(cls, "messageFactoryClass");
        this.readLock.lock();
        try {
            return this.loggerByMessageFactoryByName.getOrDefault(str, Collections.EMPTY_MAP).keySet().stream().anyMatch(new Streams$$ExternalSyntheticLambda0(cls, 3));
        } finally {
            this.readLock.unlock();
        }
    }

    public void putIfAbsent(String str, MessageFactory messageFactory, T t) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(t, "logger");
        this.writeLock.lock();
        if (messageFactory == null) {
            try {
                messageFactory = ParameterizedMessageFactory.INSTANCE;
            } catch (Throwable th) {
                this.writeLock.unlock();
                throw th;
            }
        }
        this.loggerByMessageFactoryByName.computeIfAbsent(str, new Functions$$ExternalSyntheticLambda11(this, 27)).putIfAbsent(messageFactory, t);
        if (str.equals(t.getName())) {
            if (!messageFactory.equals(t.getMessageFactory())) {
            }
            this.writeLock.unlock();
        }
        this.loggerByMessageFactoryByName.computeIfAbsent(t.getName(), new Functions$$ExternalSyntheticLambda11(this, 27)).putIfAbsent(t.getMessageFactory(), t);
        this.writeLock.unlock();
    }

    @Deprecated
    public LoggerRegistry(MapFactory<T> mapFactory) {
        this();
    }

    @Deprecated
    public T getLogger(String str) {
        Objects.requireNonNull(str, "name");
        return getLogger(str, null);
    }

    public Collection<T> getLoggers(Collection<T> collection) {
        Objects.requireNonNull(collection, DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY);
        collection.addAll(getLoggers());
        return collection;
    }

    public boolean hasLogger(String str, MessageFactory messageFactory) {
        Objects.requireNonNull(str, "name");
        return getLogger(str, messageFactory) != null;
    }

    @Deprecated
    public boolean hasLogger(String str) {
        Objects.requireNonNull(str, "name");
        return getLogger(str) != null;
    }
}
