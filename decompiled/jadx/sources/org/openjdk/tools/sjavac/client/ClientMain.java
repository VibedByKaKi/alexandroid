package org.openjdk.tools.sjavac.client;

import dagger.internal.codegen.base.Formatter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.openjdk.tools.javac.main.Main;
import org.openjdk.tools.sjavac.AutoFlushWriter;
import org.openjdk.tools.sjavac.Log;
import org.openjdk.tools.sjavac.comp.SjavacImpl;
import org.openjdk.tools.sjavac.options.Options;
import org.openjdk.tools.sjavac.server.Sjavac;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class ClientMain {
    public static int run(String[] strArr, Writer writer, Writer writer2) {
        Log.setLogForCurrentThread(new Log(writer, writer2));
        try {
            Options parseArgs = Options.parseArgs(strArr);
            Log.setLogLevel(parseArgs.getLogLevel());
            Log.debug("==========================================================");
            Log.debug("Launching sjavac client with the following parameters:");
            Log.debug(Formatter.INDENT + parseArgs.getStateArgsString());
            Log.debug("==========================================================");
            boolean z = parseArgs.getServerConf() != null;
            Sjavac sjavacClient = z ? new SjavacClient(parseArgs) : new SjavacImpl();
            Main.Result compile = sjavacClient.compile(strArr);
            if (!z) {
                sjavacClient.shutdown();
            }
            return compile.exitCode;
        } catch (IllegalArgumentException e) {
            Log.error(e.getMessage());
            return Main.Result.CMDERR.exitCode;
        }
    }

    public static int run(String[] strArr) {
        return run(strArr, new AutoFlushWriter(new OutputStreamWriter(System.out)), new AutoFlushWriter(new OutputStreamWriter(System.err)));
    }
}
