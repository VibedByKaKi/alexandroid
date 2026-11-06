package org.openjdk.tools.sjavac;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Log {
    protected PrintWriter err;
    protected Level level = Level.INFO;
    protected PrintWriter out;
    private static Log stdOutErr = new Log(new PrintWriter(System.out), new PrintWriter(System.err));
    private static ThreadLocal<Log> loggers = new ThreadLocal<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Level {
        ERROR,
        WARN,
        INFO,
        DEBUG,
        TRACE
    }

    public Log(Writer writer, Writer writer2) {
        this.out = writer == null ? null : new PrintWriter(writer, true);
        this.err = writer2 != null ? new PrintWriter(writer2, true) : null;
    }

    public static void debug(String str) {
        log(Level.DEBUG, str);
    }

    public static void error(String str) {
        log(Level.ERROR, str);
    }

    public static Log get() {
        Log log = loggers.get();
        return log != null ? log : stdOutErr;
    }

    public static void info(String str) {
        log(Level.INFO, str);
    }

    public static boolean isDebugging() {
        return get().isLevelLogged(Level.DEBUG);
    }

    public static void log(Level level, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        log(level, stringWriter.toString());
    }

    public static void setLogForCurrentThread(Log log) {
        loggers.set(log);
    }

    public static void setLogLevel(String str) {
        setLogLevel(Level.valueOf(str.toUpperCase(Locale.US)));
    }

    public static void trace(String str) {
        log(Level.TRACE, str);
    }

    public static void warn(String str) {
        log(Level.WARN, str);
    }

    public boolean isLevelLogged(Level level) {
        return level.ordinal() <= this.level.ordinal();
    }

    public void printLogMsg(Level level, String str) {
        if (isLevelLogged(level)) {
            (level.ordinal() <= Level.WARN.ordinal() ? this.err : this.out).println(str);
        }
    }

    public static void debug(Throwable th) {
        log(Level.DEBUG, th);
    }

    public static void error(Throwable th) {
        log(Level.ERROR, th);
    }

    public static void setLogLevel(Level level) {
        get().level = level;
    }

    public static void log(Level level, String str) {
        get().printLogMsg(level, str);
    }
}
