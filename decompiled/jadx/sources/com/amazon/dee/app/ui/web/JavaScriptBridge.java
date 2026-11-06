package com.amazon.dee.app.ui.web;

import com.amazon.dee.app.services.logging.Log;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class JavaScriptBridge {
    static final String TAG = "JavaScriptBridge";
    JavaScriptInjector javaScriptInjector;
    JavaScriptResponseQueue javaScriptResponseQueue;

    public JavaScriptBridge(JavaScriptInjector javaScriptInjector, JavaScriptResponseQueue javaScriptResponseQueue) {
        this.javaScriptInjector = javaScriptInjector;
        this.javaScriptResponseQueue = javaScriptResponseQueue;
    }

    public void completeRequest(JavaScriptResponse javaScriptResponse) {
        if (javaScriptResponse == null || this.javaScriptResponseQueue.enqueue(javaScriptResponse)) {
            return;
        }
        Log.e(TAG, "JS response queue overflowing! Responses are not being polled. Request ID " + javaScriptResponse.getRequestId());
    }

    public final void errorResponse(JavaScriptResponse javaScriptResponse, String str, Throwable th) {
        if (th != null) {
            getJavaScriptInterfaceName();
        } else {
            getJavaScriptInterfaceName();
        }
        javaScriptResponse.setError(true);
        javaScriptResponse.setErrorReason(str);
    }

    public JavaScriptBridgeMethod findMethod(String str) {
        return getExposedMethods().get(str);
    }

    public abstract Map<String, JavaScriptBridgeMethod> getExposedMethods();

    public JavaScriptInjector getJavaScriptInjector() {
        return this.javaScriptInjector;
    }

    public abstract String getJavaScriptInterfaceName();

    public final void invokeJavaScriptFunction(String str, JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        sb.append(getJavaScriptInterfaceName());
        sb.append(".");
        sb.append(str);
        sb.append(".apply(");
        sb.append(getJavaScriptInterfaceName());
        if (jSONArray != null) {
            sb.append(", ");
            sb.append(jSONArray.toString());
        }
        sb.append(");");
        this.javaScriptInjector.inject(sb.toString());
    }

    public final void invokeJavaScriptFunction(String str) {
        invokeJavaScriptFunction(str, null);
    }
}
