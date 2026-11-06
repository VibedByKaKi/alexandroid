package com.amazon.alexa.mosaic.apl.dependencies;

import androidx.annotation.VisibleForTesting;
import com.amazon.apl.devtools.controllers.IDTServer;
import com.amazon.apl.devtools.controllers.impl.DTServer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class APLDevToolsWrapper {
    private static final Integer PORT = 6050;
    private static final String TAG = "APLDevToolsWrapper";
    private static APLDevToolsWrapper wrapperSingletonInstance;
    private IDTServer dtServer;
    private boolean isRunning;

    @VisibleForTesting
    public APLDevToolsWrapper() {
        if (this.dtServer == null) {
            this.dtServer = DTServer.getInstance();
        }
        this.isRunning = false;
    }

    public static APLDevToolsWrapper getInstance() {
        if (wrapperSingletonInstance == null) {
            wrapperSingletonInstance = new APLDevToolsWrapper();
        }
        return wrapperSingletonInstance;
    }

    @VisibleForTesting
    public static void setAPLDevToolsWrapper(APLDevToolsWrapper aPLDevToolsWrapper) {
        wrapperSingletonInstance = aPLDevToolsWrapper;
    }

    @VisibleForTesting
    public void setAplDevTools(IDTServer iDTServer) {
        this.dtServer = iDTServer;
    }

    public void start() {
        if (this.isRunning) {
            return;
        }
        this.dtServer.start(PORT.intValue());
        this.isRunning = true;
    }

    public void stop() {
        if (this.isRunning) {
            this.dtServer.stop();
            this.isRunning = false;
        }
    }
}
