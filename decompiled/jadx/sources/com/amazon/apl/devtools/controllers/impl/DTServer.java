package com.amazon.apl.devtools.controllers.impl;

import android.util.Log;
import com.amazon.apl.devtools.controllers.IDTServer;
import com.amazon.apl.devtools.util.CommandRequestFactory;
import com.amazon.apl.devtools.util.DependencyContainer;
import java.net.InetSocketAddress;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DTServer implements IDTServer {
    private static final String TAG = "DTServer";
    private static final int TIMEOUT_IN_SECONDS = 5;
    private static DTServer sInstance;
    private final CommandRequestFactory mCommandRequestFactory;
    private final DTServerData mDTServerData;
    private final DependencyContainer mDependencyContainer;
    private DTWebSocketServer mWebSocketServer;

    private DTServer() {
        DependencyContainer dependencyContainer = DependencyContainer.getInstance();
        this.mDependencyContainer = dependencyContainer;
        this.mCommandRequestFactory = dependencyContainer.getCommandRequestFactory();
        this.mDTServerData = DTServerData.getInstance();
        this.mWebSocketServer = null;
    }

    public static DTServer getInstance() {
        if (sInstance == null) {
            sInstance = new DTServer();
        }
        return sInstance;
    }

    @Override // com.amazon.apl.devtools.controllers.IDTServer
    public void start(int i) {
        Log.i(TAG, "startServer: starting the server");
        this.mDTServerData.setPortNumber(i);
        DTWebSocketServer dTWebSocketServer = new DTWebSocketServer(this.mCommandRequestFactory, new InetSocketAddress(i));
        this.mWebSocketServer = dTWebSocketServer;
        dTWebSocketServer.start();
    }

    @Override // com.amazon.apl.devtools.controllers.IDTServer
    public void stop() {
        try {
            this.mDTServerData.reset();
            this.mDependencyContainer.getTargetCatalog().cleanup();
            this.mWebSocketServer.stop(5);
            Log.i(TAG, "onDestroy: DTWebSocketServer successfully closed");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e(TAG, "DTWebSocketServer fail to close", e);
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }
}
