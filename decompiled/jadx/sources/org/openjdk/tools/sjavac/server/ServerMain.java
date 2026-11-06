package org.openjdk.tools.sjavac.server;

import com.mapbox.common.JavaHeapDumper$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.PrintStream;
import org.openjdk.tools.javac.main.Main;
import org.openjdk.tools.sjavac.Log;
import org.openjdk.tools.sjavac.server.log.LazyInitFileLog;
import org.openjdk.tools.sjavac.server.log.LoggingOutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class ServerMain {
    private static LazyInitFileLog errorLog;

    public static LazyInitFileLog getErrorLog() {
        return errorLog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$run$0(Thread thread, Throwable th) {
        Log.setLogForCurrentThread(errorLog);
        Log.error(th);
    }

    public static int run(String[] strArr) {
        LazyInitFileLog lazyInitFileLog = new LazyInitFileLog("server.log");
        errorLog = lazyInitFileLog;
        Log.setLogForCurrentThread(lazyInitFileLog);
        Log.Level level = Log.Level.ERROR;
        Log.setLogLevel(level);
        Thread.setDefaultUncaughtExceptionHandler(new JavaHeapDumper$$ExternalSyntheticLambda0(2));
        System.setOut(new PrintStream(new LoggingOutputStream(System.out, Log.Level.INFO, "[stdout] ")));
        System.setErr(new PrintStream(new LoggingOutputStream(System.err, level, "[stderr] ")));
        if (strArr.length > 1) {
            Log.error("When spawning a background server, only a single --startserver argument is allowed.");
            return Main.Result.CMDERR.exitCode;
        }
        try {
            return new SjavacServer(strArr[0]).startServer();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return Main.Result.ERROR.exitCode;
        }
    }
}
