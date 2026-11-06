package org.apache.http.impl.client;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpTrace;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes11.dex */
public class StandardHttpRequestRetryHandler extends DefaultHttpRequestRetryHandler {
    private final Map<String, Boolean> idempotentMethods;

    public StandardHttpRequestRetryHandler(int i, boolean z) {
        super(i, z);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.idempotentMethods = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("GET", bool);
        concurrentHashMap.put(HttpHead.METHOD_NAME, bool);
        concurrentHashMap.put("PUT", bool);
        concurrentHashMap.put("DELETE", bool);
        concurrentHashMap.put(HttpOptions.METHOD_NAME, bool);
        concurrentHashMap.put(HttpTrace.METHOD_NAME, bool);
    }

    @Override // org.apache.http.impl.client.DefaultHttpRequestRetryHandler
    public boolean handleAsIdempotent(HttpRequest httpRequest) {
        Boolean bool = this.idempotentMethods.get(httpRequest.getRequestLine().getMethod().toUpperCase(Locale.ROOT));
        return bool != null && bool.booleanValue();
    }

    public StandardHttpRequestRetryHandler() {
        this(3, false);
    }
}
