package org.openjdk.tools.sjavac.server;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import org.openjdk.tools.sjavac.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class PortFileMonitor {
    private static final int CHECK_PORTFILE_INTERVAL = 5000;
    private final PortFile portFile;
    private final SjavacServer server;
    private final Timer timer = new Timer();

    public PortFileMonitor(PortFile portFile, SjavacServer sjavacServer) {
        this.portFile = portFile;
        this.server = sjavacServer;
    }

    public void shutdown() {
        this.timer.cancel();
    }

    public void start() {
        final Log log = Log.get();
        this.timer.schedule(new TimerTask() { // from class: org.openjdk.tools.sjavac.server.PortFileMonitor.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Log.setLogForCurrentThread(log);
                Log.debug("Checking port file status...");
                try {
                    boolean exists = PortFileMonitor.this.portFile.exists();
                    PortFileMonitor portFileMonitor = PortFileMonitor.this;
                    if (!exists) {
                        portFileMonitor.server.shutdown("Quitting because portfile was deleted!");
                        return;
                    }
                    boolean markedForStop = portFileMonitor.portFile.markedForStop();
                    PortFileMonitor portFileMonitor2 = PortFileMonitor.this;
                    if (markedForStop) {
                        portFileMonitor2.server.shutdown("Quitting because a portfile.stop file was found!");
                    } else {
                        if (portFileMonitor2.portFile.stillMyValues()) {
                            return;
                        }
                        PortFileMonitor.this.server.shutdown("Quitting because portfile is now owned by another javac server!");
                    }
                } catch (IOException e) {
                    Log.error("IOException caught in PortFileMonitor.");
                    Log.debug(e);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.error(e2);
                }
            }
        }, 0L, 5000L);
    }
}
