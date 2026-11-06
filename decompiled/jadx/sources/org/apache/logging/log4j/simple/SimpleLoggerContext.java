package org.apache.logging.log4j.simple;

import java.io.PrintStream;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.internal.annotation.SuppressFBWarnings;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.message.ParameterizedMessageFactory;
import org.apache.logging.log4j.simple.internal.SimpleProvider;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.spi.LoggerRegistry;
import org.apache.logging.log4j.util.PropertiesUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SimpleLoggerContext implements LoggerContext {
    protected static final String DEFAULT_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    protected static final String SYSTEM_PREFIX = "org.apache.logging.log4j.simplelog.";
    private final String dateTimeFormat;
    private final Level defaultLevel;
    private final LoggerRegistry<ExtendedLogger> loggerRegistry = new LoggerRegistry<>();
    private final PropertiesUtil props;
    private final boolean showContextMap;
    private final boolean showDateTime;
    private final boolean showLogName;
    private final boolean showShortName;
    private final PrintStream stream;
    static final SimpleLoggerContext INSTANCE = new SimpleLoggerContext();
    private static final MessageFactory DEFAULT_MESSAGE_FACTORY = ParameterizedMessageFactory.INSTANCE;

    @SuppressFBWarnings(justification = "Opens a file retrieved from configuration (Log4j properties)", value = {"PATH_TRAVERSAL_OUT"})
    public SimpleLoggerContext() {
        SimpleProvider.Config config = SimpleProvider.Config.INSTANCE;
        this.props = config.props;
        this.showContextMap = config.showContextMap;
        this.showLogName = config.showLogName;
        this.showShortName = config.showShortName;
        this.showDateTime = config.showDateTime;
        this.defaultLevel = config.defaultLevel;
        this.dateTimeFormat = config.dateTimeFormat;
        this.stream = config.stream;
    }

    private ExtendedLogger createLogger(String str, MessageFactory messageFactory) {
        return new SimpleLogger(str, this.defaultLevel, this.showLogName, this.showShortName, this.showDateTime, this.showContextMap, this.dateTimeFormat, messageFactory, this.props, this.stream);
    }

    @Override // org.apache.logging.log4j.spi.LoggerContext
    public Object getExternalContext() {
        return null;
    }

    @Override // org.apache.logging.log4j.spi.LoggerContext
    public ExtendedLogger getLogger(String str, MessageFactory messageFactory) {
        if (messageFactory == null) {
            messageFactory = DEFAULT_MESSAGE_FACTORY;
        }
        ExtendedLogger logger = this.loggerRegistry.getLogger(str, messageFactory);
        if (logger != null) {
            return logger;
        }
        this.loggerRegistry.putIfAbsent(str, messageFactory, createLogger(str, messageFactory));
        return this.loggerRegistry.getLogger(str, messageFactory);
    }

    @Override // org.apache.logging.log4j.spi.LoggerContext
    public LoggerRegistry<ExtendedLogger> getLoggerRegistry() {
        return this.loggerRegistry;
    }

    @Override // org.apache.logging.log4j.spi.LoggerContext
    public boolean hasLogger(String str, MessageFactory messageFactory) {
        if (messageFactory == null) {
            messageFactory = DEFAULT_MESSAGE_FACTORY;
        }
        return this.loggerRegistry.hasLogger(str, messageFactory);
    }

    @Override // org.apache.logging.log4j.spi.LoggerContext
    public boolean hasLogger(String str, Class<? extends MessageFactory> cls) {
        return this.loggerRegistry.hasLogger(str, cls);
    }

    @Override // org.apache.logging.log4j.spi.LoggerContext
    public boolean hasLogger(String str) {
        return this.loggerRegistry.hasLogger(str, DEFAULT_MESSAGE_FACTORY);
    }

    @Override // org.apache.logging.log4j.spi.LoggerContext
    public ExtendedLogger getLogger(String str) {
        return getLogger(str, DEFAULT_MESSAGE_FACTORY);
    }
}
