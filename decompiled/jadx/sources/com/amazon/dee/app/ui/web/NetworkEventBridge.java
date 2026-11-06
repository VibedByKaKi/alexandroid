package com.amazon.dee.app.ui.web;

import android.content.Context;
import com.amazon.alexa.protocols.network.NetworkService;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NetworkEventBridge extends JavaScriptBridge {
    Context context;
    NetworkService networkService;

    public NetworkEventBridge(Context context, NetworkService networkService, JavaScriptInjector javaScriptInjector, JavaScriptResponseQueue javaScriptResponseQueue) {
        super(javaScriptInjector, javaScriptResponseQueue);
        this.networkService = networkService;
        this.context = context;
    }

    public void fireNetworkEvent(boolean z, boolean z2) {
        invokeJavaScriptFunction("fireNetworkEvent", new JSONArray((Collection<?>) Arrays.asList(Boolean.valueOf(z), Boolean.valueOf(z2))));
    }

    @Override // com.amazon.dee.app.ui.web.JavaScriptBridge
    public Map<String, JavaScriptBridgeMethod> getExposedMethods() {
        return new HashMap();
    }

    @Override // com.amazon.dee.app.ui.web.JavaScriptBridge
    public String getJavaScriptInterfaceName() {
        return "NetworkEventBridge";
    }

    public void notifyConnected() {
        fireNetworkEvent(this.networkService.isConnected(), false);
    }

    public void notifyDisconnected() {
        fireNetworkEvent(false, false);
    }
}
