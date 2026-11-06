package org.slf4j.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.helpers.MarkerIgnoringBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class AlexaSlf4jAndroidLogger extends MarkerIgnoringBase {
    private ConcurrentMap<ILoggerFactory, Logger> loggerMap = new ConcurrentHashMap();
    private final List<Logger> loggers = new ArrayList();
    private final String name;

    public AlexaSlf4jAndroidLogger(String str) {
        this.name = str;
    }

    @Override // org.slf4j.Logger
    public void debug(String str) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().debug(str);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void error(String str) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().error(str);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.helpers.MarkerIgnoringBase, org.slf4j.helpers.NamedLoggerBase, org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.Logger
    public void info(String str) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().info(str);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            if (it2.next().isInfoEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            if (it2.next().isErrorEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            if (it2.next().isInfoEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            if (it2.next().isTraceEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            if (it2.next().isWarnEnabled()) {
                return true;
            }
        }
        return false;
    }

    public synchronized void subscribe(ILoggerFactory iLoggerFactory) {
        if (this.loggerMap.get(iLoggerFactory) != null) {
            return;
        }
        Logger logger = iLoggerFactory.getLogger(this.name);
        if (this.loggerMap.putIfAbsent(iLoggerFactory, logger) == null) {
            this.loggers.add(logger);
        }
    }

    @Override // org.slf4j.Logger
    public void trace(String str) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().trace(str);
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void unsubscribe(ILoggerFactory iLoggerFactory) {
        Logger remove = this.loggerMap.remove(iLoggerFactory);
        if (remove != null) {
            this.loggers.remove(remove);
        }
    }

    @Override // org.slf4j.Logger
    public void warn(String str) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().warn(str);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().debug(str, obj);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().error(str, obj);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().info(str, obj);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().trace(str, obj);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().warn(str, obj);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj, Object obj2) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().debug(str, obj, obj2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj, Object obj2) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().trace(str, obj, obj2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj, Object obj2) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().info(str, obj, obj2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj, Object obj2) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().trace(str, obj, obj2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj, Object obj2) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().warn(str, obj, obj2);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object... objArr) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().debug(str, objArr);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object... objArr) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().error(str, objArr);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object... objArr) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().info(str, objArr);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object... objArr) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().trace(str, objArr);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object... objArr) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().warn(str, objArr);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Throwable th) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().debug(str, th);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void error(String str, Throwable th) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().error(str, th);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void info(String str, Throwable th) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().info(str, th);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Throwable th) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().trace(str, th);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Throwable th) {
        Iterator<Logger> it2 = this.loggers.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().warn(str, th);
            } catch (Throwable unused) {
            }
        }
    }
}
