package org.apache.http.protocol;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes11.dex */
public class BasicHttpContext implements HttpContext {
    private final Map<String, Object> map;
    private final HttpContext parentContext;

    public BasicHttpContext(HttpContext httpContext) {
        this.map = new ConcurrentHashMap();
        this.parentContext = httpContext;
    }

    public void clear() {
        this.map.clear();
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        HttpContext httpContext;
        Args.notNull(str, JsonDocumentFields.POLICY_ID);
        Object obj = this.map.get(str);
        return (obj != null || (httpContext = this.parentContext) == null) ? obj : httpContext.getAttribute(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        Args.notNull(str, JsonDocumentFields.POLICY_ID);
        return this.map.remove(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        Args.notNull(str, JsonDocumentFields.POLICY_ID);
        Map<String, Object> map = this.map;
        if (obj != null) {
            map.put(str, obj);
        } else {
            map.remove(str);
        }
    }

    public String toString() {
        return this.map.toString();
    }

    public BasicHttpContext() {
        this(null);
    }
}
