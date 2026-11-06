package org.apache.logging.log4j.status;

import com.amazon.alexa.accessorykit.ModelTransformer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dagger.model.BindingGraph$$ExternalSyntheticLambda7;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiConsumer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.internal.annotation.SuppressFBWarnings;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.spi.AbstractLogger;
import org.apache.logging.log4j.status.StatusLogger;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StatusLogger extends AbstractLogger {
    private static final String DEBUG_PROPERTY_NAME = "log4j2.debug";
    static final int DEFAULT_FALLBACK_LISTENER_BUFFER_CAPACITY = 0;
    static final Level DEFAULT_FALLBACK_LISTENER_LEVEL = Level.ERROR;
    public static final String DEFAULT_STATUS_LISTENER_LEVEL = "log4j2.StatusLogger.level";
    public static final String MAX_STATUS_ENTRIES = "log4j2.status.entries";
    public static final String PROPERTIES_FILE_NAME = "log4j2.StatusLogger.properties";
    public static final String STATUS_DATE_FORMAT = "log4j2.StatusLogger.dateFormat";
    static final String STATUS_DATE_FORMAT_ZONE = "log4j2.StatusLogger.dateFormatZone";
    private static final long serialVersionUID = 2;
    private final Queue<StatusData> buffer;
    private final Config config;
    private final StatusConsoleListener fallbackListener;
    private final transient ReadWriteLock listenerLock;
    private final transient Lock listenerReadLock;
    private final transient Lock listenerWriteLock;
    private final List<StatusListener> listeners;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static volatile StatusLogger INSTANCE = new StatusLogger();

        private InstanceHolder() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PropertiesUtilsDouble {
        private static boolean isRelevantPropertyName(Object obj) {
            return (obj instanceof String) && ((String) obj).matches("^(?i)log4j.*");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$normalizeProperties$0(Map map, Object obj, Object obj2) {
            if (isRelevantPropertyName(obj)) {
                map.put(normalizePropertyName((String) obj), obj2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Map<String, Object> normalizeProperties(Properties... propertiesArr) {
            final HashMap hashMap = new HashMap();
            for (Properties properties : propertiesArr) {
                properties.forEach(new BiConsumer() { // from class: org.apache.logging.log4j.status.StatusLogger$PropertiesUtilsDouble$$ExternalSyntheticLambda0
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        StatusLogger.PropertiesUtilsDouble.lambda$normalizeProperties$0(hashMap, obj, obj2);
                    }
                });
            }
            return hashMap;
        }

        private static String normalizePropertyName(String str) {
            return str.replaceAll("[._-]", "").replaceAll("\\P{InBasic_Latin}", ".").toLowerCase(Locale.US).replaceAll("^log4j2", "log4j");
        }

        public static Map<String, Object> readAllAvailableProperties() {
            return normalizeProperties(System.getProperties(), readEnvironmentProperties(), readPropertiesFile(StatusLogger.PROPERTIES_FILE_NAME));
        }

        private static Properties readEnvironmentProperties() {
            Properties properties = new Properties();
            properties.putAll(System.getenv());
            return properties;
        }

        public static Properties readPropertiesFile(String str) {
            Properties properties = new Properties();
            URL resource = StatusLogger.class.getResource("/" + str);
            if (resource != null) {
                try {
                    InputStream openStream = resource.openStream();
                    try {
                        properties.load(openStream);
                        if (openStream != null) {
                            openStream.close();
                            return properties;
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    new RuntimeException(a$$ExternalSyntheticOutline0.m("failed reading properties from `", str, "`"), e).printStackTrace(System.err);
                    return properties;
                }
            }
            return properties;
        }

        public static String readProperty(Map<String, Object> map, String str) {
            Object obj = map.get(normalizePropertyName(str));
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusLogger(String str, MessageFactory messageFactory, Config config, StatusConsoleListener statusConsoleListener) {
        super(str, messageFactory);
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(messageFactory, "messageFactory");
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.listenerLock = reentrantReadWriteLock;
        this.listenerReadLock = reentrantReadWriteLock.readLock();
        this.listenerWriteLock = reentrantReadWriteLock.writeLock();
        this.buffer = new ConcurrentLinkedQueue();
        Objects.requireNonNull(config, "config");
        this.config = config;
        Objects.requireNonNull(statusConsoleListener, "fallbackListener");
        this.fallbackListener = statusConsoleListener;
        this.listeners = new ArrayList();
    }

    private void buffer(StatusData statusData) {
        if (this.config.bufferCapacity == 0) {
            return;
        }
        this.buffer.add(statusData);
        while (this.buffer.size() >= this.config.bufferCapacity) {
            this.buffer.remove();
        }
    }

    private static void closeListenerSafely(StatusListener statusListener) {
        try {
            statusListener.close();
        } catch (IOException e) {
            new RuntimeException(String.format("failed closing listener: %s", statusListener), e).printStackTrace(System.err);
        }
    }

    private StatusData createStatusData(String str, Level level, Message message, Throwable th) {
        return new StatusData(getStackTraceElement(str), level, message, th, null, this.config.instantFormatter, Instant.now());
    }

    public static StatusLogger getLogger() {
        return InstanceHolder.INSTANCE;
    }

    private static StackTraceElement getStackTraceElement(String str) {
        if (str == null) {
            return null;
        }
        boolean z = false;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            if (z && !str.equals(className)) {
                return stackTraceElement;
            }
            if (!str.equals(className)) {
                if ("?".equals(className)) {
                    break;
                }
            } else {
                z = true;
            }
        }
        return null;
    }

    private boolean isLevelEnabled(Level level, Level level2) {
        return this.config.debugEnabled || level.isLessSpecificThan(level2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyListener, reason: merged with bridge method [inline-methods] */
    public void lambda$notifyListeners$0(StatusListener statusListener, StatusData statusData) {
        if (isLevelEnabled(statusListener.getStatusLevel(), statusData.getLevel())) {
            statusListener.log(statusData);
        }
    }

    private void notifyListeners(StatusData statusData) {
        this.listenerReadLock.lock();
        try {
            boolean isEmpty = this.listeners.isEmpty();
            this.listeners.forEach(new BindingGraph$$ExternalSyntheticLambda7(this, statusData, 13));
            if (isEmpty) {
                lambda$notifyListeners$0(this.fallbackListener, statusData);
            }
        } finally {
            this.listenerReadLock.unlock();
        }
    }

    public static void setLogger(StatusLogger statusLogger) {
        Objects.requireNonNull(statusLogger, "logger");
        StatusLogger unused = InstanceHolder.INSTANCE = statusLogger;
    }

    @Deprecated
    public void clear() {
        this.buffer.clear();
    }

    public StatusConsoleListener getFallbackListener() {
        return this.fallbackListener;
    }

    @Override // org.apache.logging.log4j.Logger
    public Level getLevel() {
        Level statusLevel = this.fallbackListener.getStatusLevel();
        for (int i = 0; i < this.listeners.size(); i++) {
            Level statusLevel2 = this.listeners.get(i).getStatusLevel();
            if (statusLevel2.isLessSpecificThan(statusLevel)) {
                statusLevel = statusLevel2;
            }
        }
        return statusLevel;
    }

    public Iterable<StatusListener> getListeners() {
        this.listenerReadLock.lock();
        try {
            return Collections.unmodifiableCollection(this.listeners);
        } finally {
            this.listenerReadLock.unlock();
        }
    }

    @Deprecated
    public List<StatusData> getStatusData() {
        return Collections.unmodifiableList(new ArrayList(this.buffer));
    }

    @Override // org.apache.logging.log4j.spi.AbstractLogger, org.apache.logging.log4j.Logger
    public boolean isEnabled(Level level, Marker marker) {
        Objects.requireNonNull(level, "messageLevel");
        return isLevelEnabled(getLevel(), level);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    @SuppressFBWarnings({"INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE"})
    public void logMessage(String str, Level level, Marker marker, Message message, Throwable th) {
        try {
            StatusData createStatusData = createStatusData(str, level, message, th);
            buffer(createStatusData);
            notifyListeners(createStatusData);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    public void registerListener(StatusListener statusListener) {
        Objects.requireNonNull(statusListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listenerWriteLock.lock();
        try {
            this.listeners.add(statusListener);
        } finally {
            this.listenerWriteLock.unlock();
        }
    }

    public void removeListener(StatusListener statusListener) {
        Objects.requireNonNull(statusListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listenerWriteLock.lock();
        try {
            this.listeners.remove(statusListener);
            closeListenerSafely(statusListener);
        } finally {
            this.listenerWriteLock.unlock();
        }
    }

    public void reset() {
        this.listenerWriteLock.lock();
        try {
            Iterator<StatusListener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                closeListenerSafely(it2.next());
                it2.remove();
            }
            this.listenerWriteLock.unlock();
            this.fallbackListener.close();
            this.buffer.clear();
        } catch (Throwable th) {
            this.listenerWriteLock.unlock();
            throw th;
        }
    }

    @Deprecated
    public void setLevel(Level level) {
        Objects.requireNonNull(level, ModelTransformer.KEY_BATTERY_LEVEL);
        this.fallbackListener.setLevel(level);
    }

    @Deprecated
    public void updateListenerLevel(Level level) {
        Objects.requireNonNull(level, ModelTransformer.KEY_BATTERY_LEVEL);
        this.fallbackListener.setLevel(level);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object... objArr) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj, Object obj2) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj, Object obj2, Object obj3) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, CharSequence charSequence, Throwable th) {
        return isEnabled(level, marker);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Config {
        private static final Config INSTANCE = new Config();
        final int bufferCapacity;
        final boolean debugEnabled;
        final Level fallbackListenerLevel;
        final DateTimeFormatter instantFormatter;

        private Config(Map<String, Object> map) {
            this.debugEnabled = readDebugEnabled(map);
            this.bufferCapacity = readBufferCapacity(map);
            this.fallbackListenerLevel = readFallbackListenerLevel(map);
            this.instantFormatter = readInstantFormatter(map);
        }

        public static Config getInstance() {
            return INSTANCE;
        }

        private static int readBufferCapacity(Map<String, Object> map) {
            String readProperty = PropertiesUtilsDouble.readProperty(map, StatusLogger.MAX_STATUS_ENTRIES);
            if (readProperty != null) {
                try {
                    int parseInt = Integer.parseInt(readProperty);
                    if (parseInt >= 0) {
                        return parseInt;
                    }
                    throw new IllegalArgumentException(String.format("was expecting a positive buffer capacity, found: %d", Integer.valueOf(parseInt)));
                } catch (Exception e) {
                    new IllegalArgumentException(String.format("Failed reading the buffer capacity from the `%s` property: `%s`. Falling back to the default: %d.", StatusLogger.MAX_STATUS_ENTRIES, readProperty, 0), e).printStackTrace(System.err);
                }
            }
            return 0;
        }

        private static boolean readDebugEnabled(Map<String, Object> map) {
            String readProperty = PropertiesUtilsDouble.readProperty(map, "log4j2.debug");
            return (readProperty == null || "false".equalsIgnoreCase(readProperty)) ? false : true;
        }

        private static Level readFallbackListenerLevel(Map<String, Object> map) {
            String readProperty = PropertiesUtilsDouble.readProperty(map, StatusLogger.DEFAULT_STATUS_LISTENER_LEVEL);
            Level level = StatusLogger.DEFAULT_FALLBACK_LISTENER_LEVEL;
            if (readProperty != null) {
                try {
                    return Level.valueOf(readProperty);
                } catch (Exception e) {
                    new IllegalArgumentException("Failed reading the level from the `log4j2.StatusLogger.level` property: `" + readProperty + "`. Falling back to the default: `" + level + "`.", e).printStackTrace(System.err);
                }
            }
            return level;
        }

        private static DateTimeFormatter readInstantFormatter(Map<String, Object> map) {
            String readProperty = PropertiesUtilsDouble.readProperty(map, StatusLogger.STATUS_DATE_FORMAT);
            if (readProperty == null) {
                return null;
            }
            try {
                DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern(readProperty);
                String readProperty2 = PropertiesUtilsDouble.readProperty(map, StatusLogger.STATUS_DATE_FORMAT_ZONE);
                ZoneId systemDefault = ZoneId.systemDefault();
                if (readProperty2 != null) {
                    try {
                        systemDefault = ZoneId.of(readProperty2);
                    } catch (Exception e) {
                        new IllegalArgumentException(String.format("Failed reading the instant formatting zone ID from the `%s` property: `%s`. Falling back to the default: `%s`.", StatusLogger.STATUS_DATE_FORMAT_ZONE, readProperty2, systemDefault), e).printStackTrace(System.err);
                    }
                }
                return ofPattern.withZone(systemDefault);
            } catch (Exception e2) {
                new IllegalArgumentException(a$$ExternalSyntheticOutline0.m("failed reading the instant format from the `log4j2.StatusLogger.dateFormat` property: `", readProperty, "`"), e2).printStackTrace(System.err);
                return null;
            }
        }

        private Config() {
            this(PropertiesUtilsDouble.readAllAvailableProperties());
        }

        public Config(Properties... propertiesArr) {
            this((Map<String, Object>) PropertiesUtilsDouble.normalizeProperties(propertiesArr));
        }

        public Config(boolean z, int i, DateTimeFormatter dateTimeFormatter) {
            this.debugEnabled = z;
            if (i >= 0) {
                this.bufferCapacity = i;
                this.fallbackListenerLevel = null;
                this.instantFormatter = dateTimeFormatter;
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "was expecting a positive `bufferCapacity`, found: "));
            throw null;
        }
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, Object obj, Throwable th) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, Message message, Throwable th) {
        return isEnabled(level, marker);
    }

    @Override // org.apache.logging.log4j.spi.ExtendedLogger
    public boolean isEnabled(Level level, Marker marker, String str, Throwable th) {
        return isEnabled(level, marker);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StatusLogger() {
        /*
            r5 = this;
            org.apache.logging.log4j.message.ParameterizedNoReferenceMessageFactory r0 = org.apache.logging.log4j.message.ParameterizedNoReferenceMessageFactory.INSTANCE
            org.apache.logging.log4j.status.StatusLogger$Config r1 = org.apache.logging.log4j.status.StatusLogger.Config.getInstance()
            org.apache.logging.log4j.status.StatusConsoleListener r2 = new org.apache.logging.log4j.status.StatusConsoleListener
            org.apache.logging.log4j.status.StatusLogger$Config r3 = org.apache.logging.log4j.status.StatusLogger.Config.getInstance()
            org.apache.logging.log4j.Level r3 = r3.fallbackListenerLevel
            java.util.Objects.requireNonNull(r3)
            java.io.PrintStream r4 = java.lang.System.err
            r2.<init>(r3, r4)
            java.lang.String r3 = "StatusLogger"
            r5.<init>(r3, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.logging.log4j.status.StatusLogger.<init>():void");
    }
}
