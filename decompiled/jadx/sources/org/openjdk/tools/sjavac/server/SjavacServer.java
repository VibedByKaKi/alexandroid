package org.openjdk.tools.sjavac.server;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import org.openjdk.tools.javac.main.Main;
import org.openjdk.tools.sjavac.Log;
import org.openjdk.tools.sjavac.Util;
import org.openjdk.tools.sjavac.comp.PooledSjavac;
import org.openjdk.tools.sjavac.comp.SjavacImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class SjavacServer implements Terminable {
    public static final String LINE_TYPE_RC = "RC";
    private static Map<String, PortFile> allPortFiles;
    final AtomicBoolean keepAcceptingRequests;
    private final int keepalive;
    private final long myCookie;
    private final int poolsize;
    private PortFile portFile;
    private PortFileMonitor portFileMonitor;
    private final String portfilename;
    private ServerSocket serverSocket;
    Sjavac sjavac;
    private long totalBuildTime;

    public SjavacServer(String str) throws FileNotFoundException {
        this(Util.extractStringOption("portfile", str), Util.extractIntOption("poolsize", str, Runtime.getRuntime().availableProcessors()), Util.extractIntOption("keepalive", str, 120));
    }

    public static synchronized PortFile getPortFile(String str) {
        PortFile portFile;
        synchronized (SjavacServer.class) {
            try {
                if (allPortFiles == null) {
                    allPortFiles = new HashMap();
                }
                portFile = allPortFiles.get(str);
                if (portFile != null) {
                    try {
                        if (!portFile.exists()) {
                            portFile = null;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (portFile == null) {
                    portFile = new PortFile(str);
                    allPortFiles.put(str, portFile);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return portFile;
    }

    public void addBuildTime(long j) {
        this.totalBuildTime += j;
    }

    public long getCookie() {
        return this.myCookie;
    }

    public int getPort() {
        return this.serverSocket.getLocalPort();
    }

    @Override // org.openjdk.tools.sjavac.server.Terminable
    public void shutdown(String str) {
        if (this.keepAcceptingRequests.compareAndSet(true, false)) {
            Log.debug("Quitting: " + str);
            this.portFileMonitor.shutdown();
            try {
                this.portFile.delete();
            } catch (IOException | InterruptedException e) {
                Log.error(e);
            }
            try {
                this.serverSocket.close();
            } catch (IOException e2) {
                Log.error(e2);
            }
        }
    }

    public int startServer() throws IOException, InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        PortFile portFile = getPortFile(this.portfilename);
        this.portFile = portFile;
        synchronized (portFile) {
            try {
                this.portFile.lock();
                this.portFile.getValues();
                if (this.portFile.containsPortInfo()) {
                    Log.debug("Javac server not started because portfile exists!");
                    this.portFile.unlock();
                    return Main.Result.ERROR.exitCode;
                }
                SjavacImpl sjavacImpl = new SjavacImpl();
                this.sjavac = sjavacImpl;
                PooledSjavac pooledSjavac = new PooledSjavac(sjavacImpl, this.poolsize);
                this.sjavac = pooledSjavac;
                this.sjavac = new IdleResetSjavac(pooledSjavac, this, this.keepalive * 1000);
                this.serverSocket = new ServerSocket();
                this.serverSocket.bind(new InetSocketAddress(InetAddress.getByName(null), 0));
                this.portFile.setValues(getPort(), getCookie());
                this.portFile.unlock();
                PortFileMonitor portFileMonitor = new PortFileMonitor(this.portFile, this);
                this.portFileMonitor = portFileMonitor;
                portFileMonitor.start();
                Log.debug("Sjavac server started. Accepting connections...");
                Log.debug("    port: " + getPort());
                Log.debug("    time: " + new Date());
                Log.debug("    poolsize: " + this.poolsize);
                this.keepAcceptingRequests.set(true);
                do {
                    try {
                        new RequestHandler(this.serverSocket.accept(), this.sjavac).start();
                    } catch (SocketException unused) {
                    }
                } while (this.keepAcceptingRequests.get());
                Log.debug("Shutting down.");
                StringBuilder m = a$$ExternalSyntheticOutline0.m("Total wall clock time ", System.currentTimeMillis() - currentTimeMillis, "ms build time ");
                m.append(this.totalBuildTime);
                m.append("ms");
                Log.debug(m.toString());
                this.sjavac.shutdown();
                return Main.Result.OK.exitCode;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SjavacServer(String str, int i, int i2) throws FileNotFoundException {
        this.keepAcceptingRequests = new AtomicBoolean();
        this.portfilename = str;
        this.poolsize = i;
        this.keepalive = i2;
        this.myCookie = new Random().nextLong();
    }
}
