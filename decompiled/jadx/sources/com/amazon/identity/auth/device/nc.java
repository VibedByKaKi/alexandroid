package com.amazon.identity.auth.device;

import android.net.http.SslError;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class nc {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f831a = new WeakHashMap();

    public static Object a(Object obj) {
        Object invoke;
        if (obj == null) {
            return null;
        }
        if (obj instanceof xl) {
            return ((xl) obj).a();
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Integer) {
            return obj;
        }
        if (!(obj instanceof Cloneable)) {
            throw new CloneNotSupportedException(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "Clone not supported on type "));
        }
        Cloneable cloneable = (Cloneable) obj;
        synchronized (nc.class) {
            try {
                try {
                    Class<?> cls = cloneable.getClass();
                    WeakHashMap weakHashMap = f831a;
                    Method method = (Method) weakHashMap.get(cls);
                    if (method == null) {
                        method = cls.getMethod("clone", null);
                        method.setAccessible(true);
                        weakHashMap.put(cls, method);
                    }
                    invoke = method.invoke(cloneable, null);
                } catch (Exception e) {
                    String concat = "Clone method failed on the object of type ".concat(cloneable.getClass().getName());
                    Log.e(yf.a("GenericUtils"), concat, e);
                    throw new CloneNotSupportedException(concat);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return invoke;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null || obj2.getClass() != obj2.getClass()) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static HashMap a(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            xl xlVar = (xl) entry.getValue();
            hashMap.put((String) entry.getKey(), xlVar == null ? null : xlVar.a());
        }
        return hashMap;
    }

    public static boolean a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (webView == null || TextUtils.equals(webView.getUrl(), sslError.getUrl())) {
            return true;
        }
        if (sslErrorHandler == null) {
            return false;
        }
        sslErrorHandler.cancel();
        return false;
    }
}
