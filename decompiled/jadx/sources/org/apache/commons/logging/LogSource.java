package org.apache.commons.logging;

import java.lang.reflect.Constructor;
import java.util.Hashtable;
import org.apache.commons.logging.impl.Jdk14Logger;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.apache.commons.logging.impl.NoOpLog;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class LogSource {
    protected static boolean jdk14IsAvailable;
    protected static boolean log4jIsAvailable;
    protected static Hashtable logs = new Hashtable();
    protected static Constructor logImplctor = null;

    static {
        log4jIsAvailable = false;
        jdk14IsAvailable = false;
        String str = null;
        try {
            Class.forName("org.apache.log4j.Logger");
            log4jIsAvailable = true;
        } catch (Throwable unused) {
            log4jIsAvailable = false;
        }
        try {
            Class.forName("java.util.logging.Logger");
            int i = Jdk14Logger.$r8$clinit;
            jdk14IsAvailable = true;
        } catch (Throwable unused2) {
            jdk14IsAvailable = false;
        }
        try {
            str = System.getProperty("org.apache.commons.logging.log");
            if (str == null) {
                str = System.getProperty(LogFactoryImpl.LOG_PROPERTY);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (str != null) {
                try {
                    setLogImplementation(str);
                } catch (Throwable unused4) {
                    setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
                }
            }
            try {
                if (log4jIsAvailable) {
                    setLogImplementation("org.apache.commons.logging.impl.Log4JLogger");
                } else if (jdk14IsAvailable) {
                    setLogImplementation("org.apache.commons.logging.impl.Jdk14Logger");
                } else {
                    setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
                }
            } catch (Throwable unused5) {
                setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
            }
        } catch (Throwable unused6) {
        }
    }

    private LogSource() {
    }

    public static Log getInstance(String str) {
        Log log = (Log) logs.get(str);
        if (log != null) {
            return log;
        }
        Log makeNewLogInstance = makeNewLogInstance(str);
        logs.put(str, makeNewLogInstance);
        return makeNewLogInstance;
    }

    public static String[] getLogNames() {
        return (String[]) logs.keySet().toArray(new String[logs.size()]);
    }

    public static Log makeNewLogInstance(String str) {
        Log log;
        try {
            log = (Log) logImplctor.newInstance(str);
        } catch (Throwable unused) {
            log = null;
        }
        return log == null ? new NoOpLog(str) : log;
    }

    public static void setLogImplementation(String str) throws LinkageError, NoSuchMethodException, SecurityException, ClassNotFoundException {
        try {
            logImplctor = Class.forName(str).getConstructor("".getClass());
        } catch (Throwable unused) {
            logImplctor = null;
        }
    }

    public static Log getInstance(Class cls) {
        return getInstance(cls.getName());
    }

    public static void setLogImplementation(Class cls) throws LinkageError, ExceptionInInitializerError, NoSuchMethodException, SecurityException {
        logImplctor = cls.getConstructor("".getClass());
    }
}
