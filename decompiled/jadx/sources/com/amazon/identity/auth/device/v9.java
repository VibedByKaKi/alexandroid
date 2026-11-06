package com.amazon.identity.auth.device;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class v9 {
    public abstract Set a();

    public abstract void a(d2 d2Var);

    public abstract void a(String str, String str2, String str3);

    public void a(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a(str, (String) entry.getKey(), (String) entry.getValue());
        }
    }

    public abstract boolean a(String str, d2 d2Var, u0 u0Var);

    public abstract boolean a(String str, d2 d2Var, u0 u0Var, ArrayList arrayList);

    public abstract Set b();

    public abstract void b(String str, String str2);

    public abstract void b(String str, String str2, String str3);

    public final void b(String str, Map map) {
        a(new d2(str, null, map, null));
    }

    public abstract Account c(String str);

    public abstract String c();

    public abstract String c(String str, String str2);

    public abstract void c(String str, String str2, String str3);

    public abstract String d(String str, String str2);

    public abstract Set d(String str);

    public abstract void d();

    public abstract String e(String str, String str2);

    public abstract Set e(String str);

    public abstract void e();

    public abstract void f();

    public abstract void f(String str);

    public boolean b(String str) {
        return b().contains(str);
    }

    public Map a(String str, List list) {
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            hashMap.put(str2, c(str, str2));
        }
        return hashMap;
    }

    public static String a(String str) {
        return s0.a("actor/", str);
    }

    public static String a(String str, String str2) {
        return d0.a("actor_data/", str, str2);
    }
}
