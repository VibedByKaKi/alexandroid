package com.amazon.dee.app.elements;

import com.amazon.dee.app.ui.main.RNLogPrinter;
import com.facebook.react.bridge.JSExceptionHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class AlexaNativeModuleCallExceptionHandler implements JSExceptionHandler {
    private final RNLogPrinter rnLogPrinter;

    public AlexaNativeModuleCallExceptionHandler(RNLogPrinter rNLogPrinter) {
        this.rnLogPrinter = rNLogPrinter;
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        this.rnLogPrinter.handleNativeModuleCallException(exc);
    }
}
