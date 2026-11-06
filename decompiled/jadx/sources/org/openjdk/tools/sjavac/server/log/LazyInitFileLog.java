package org.openjdk.tools.sjavac.server.log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.openjdk.tools.sjavac.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class LazyInitFileLog extends Log {
    String baseFilename;
    Path destination;

    public LazyInitFileLog(String str) {
        super(null, null);
        this.destination = null;
        this.baseFilename = str;
    }

    private Path getAvailableDestination() {
        Path path = Paths.get(this.baseFilename, new String[0]);
        int i = 1;
        while (Files.exists(path, new LinkOption[0])) {
            path = Paths.get(this.baseFilename + "." + i, new String[0]);
            i++;
        }
        return path;
    }

    public Path getLogDestination() {
        return this.destination;
    }

    @Override // org.openjdk.tools.sjavac.Log
    public void printLogMsg(Log.Level level, String str) {
        try {
            if (this.out == null && isLevelLogged(level)) {
                this.destination = getAvailableDestination();
                PrintWriter printWriter = new PrintWriter((Writer) new FileWriter(this.destination.toFile()), true);
                this.err = printWriter;
                this.out = printWriter;
            }
            super.printLogMsg(level, str);
        } catch (IOException e) {
            System.out.println("IO error occurred: " + e.getMessage());
            System.out.println("Original message: [" + level + "] " + str);
        }
    }
}
