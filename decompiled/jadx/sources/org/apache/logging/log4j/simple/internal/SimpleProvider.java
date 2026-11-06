package org.apache.logging.log4j.simple.internal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.simple.SimpleLoggerContextFactory;
import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.apache.logging.log4j.spi.NoOpThreadContextMap;
import org.apache.logging.log4j.spi.Provider;
import org.apache.logging.log4j.spi.ThreadContextMap;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.jspecify.annotations.NullMarked;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@NullMarked
/* loaded from: classes11.dex */
public final class SimpleProvider extends Provider {
    private final ThreadContextMap threadContextMap;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Config {
        private static final String DEFAULT_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss:SSS zzz";
        public static final Config INSTANCE = new Config();
        private static final String SYSTEM_ERR = "system.err";
        private static final String SYSTEM_OUT = "system.out";
        private static final String SYSTEM_PREFIX = "org.apache.logging.log4j.simplelog.";
        public final String dateTimeFormat;
        public final Level defaultLevel;
        public final PropertiesUtil props;
        public final boolean showContextMap;
        public final boolean showDateTime;
        public final boolean showLogName;
        public final boolean showShortName;
        public final PrintStream stream;

        private Config() {
            PrintStream printStream;
            PropertiesUtil propertiesUtil = new PropertiesUtil("log4j2.simplelog.properties");
            this.props = propertiesUtil;
            this.showContextMap = propertiesUtil.getBooleanProperty("org.apache.logging.log4j.simplelog.showContextMap", false);
            this.showLogName = propertiesUtil.getBooleanProperty("org.apache.logging.log4j.simplelog.showlogname", false);
            this.showShortName = propertiesUtil.getBooleanProperty("org.apache.logging.log4j.simplelog.showShortLogname", true);
            boolean booleanProperty = propertiesUtil.getBooleanProperty("org.apache.logging.log4j.simplelog.showdatetime", false);
            this.showDateTime = booleanProperty;
            this.defaultLevel = Level.toLevel(propertiesUtil.getStringProperty("org.apache.logging.log4j.simplelog.level"), Level.ERROR);
            this.dateTimeFormat = booleanProperty ? propertiesUtil.getStringProperty("org.apache.logging.log4j.simplelog.dateTimeFormat", DEFAULT_DATE_TIME_FORMAT) : null;
            String stringProperty = propertiesUtil.getStringProperty("org.apache.logging.log4j.simplelog.logFile", SYSTEM_ERR);
            if (SYSTEM_ERR.equalsIgnoreCase(stringProperty)) {
                printStream = System.err;
            } else if (SYSTEM_OUT.equalsIgnoreCase(stringProperty)) {
                printStream = System.out;
            } else {
                try {
                    printStream = new PrintStream(new FileOutputStream(stringProperty));
                } catch (FileNotFoundException unused) {
                    printStream = System.err;
                }
            }
            this.stream = printStream;
        }
    }

    public SimpleProvider() {
        super(null, "2.6.0");
        this.threadContextMap = Config.INSTANCE.showContextMap ? super.getThreadContextMapInstance() : NoOpThreadContextMap.INSTANCE;
    }

    @Override // org.apache.logging.log4j.spi.Provider
    public LoggerContextFactory getLoggerContextFactory() {
        return SimpleLoggerContextFactory.INSTANCE;
    }

    @Override // org.apache.logging.log4j.spi.Provider
    public ThreadContextMap getThreadContextMapInstance() {
        return this.threadContextMap;
    }
}
