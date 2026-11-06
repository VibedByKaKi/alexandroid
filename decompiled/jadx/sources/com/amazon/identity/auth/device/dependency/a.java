package com.amazon.identity.auth.device.dependency;

import android.util.Log;
import com.amazon.identity.auth.device.yf;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f578a;
    public final JSONObject b;
    public final Map c;

    public a(int i, JSONObject jSONObject, Map map) {
        this.f578a = i;
        this.b = jSONObject;
        this.c = map;
    }

    public final Date a() {
        long currentTimeMillis = System.currentTimeMillis();
        Map map = this.c;
        if (map != null && map.containsKey("Cache-Control")) {
            List list = (List) this.c.get("Cache-Control");
            if (!list.isEmpty()) {
                String str = (String) list.get(0);
                if (str.contains("max-age=")) {
                    try {
                        currentTimeMillis = Integer.parseInt(str.substring(str.indexOf("max-age=") + 8)) * 1000;
                    } catch (NumberFormatException unused) {
                        Log.w(yf.a("PandaServiceAccessor"), "Cache-Control header has malformed value: ".concat(str));
                    }
                }
            }
        }
        return new Date(currentTimeMillis);
    }
}
