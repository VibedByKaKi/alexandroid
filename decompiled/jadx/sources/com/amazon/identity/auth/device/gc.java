package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.identity.auth.device.api.CookieKeys;
import com.amazon.identity.auth.device.token.MAPCookie;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class gc extends o8 {

    /* renamed from: a, reason: collision with root package name */
    public final v9 f677a;

    public gc(tn tnVar) {
        int i = tn.b;
        this.f677a = (tnVar == null ? new tn(tnVar) : tnVar).a();
    }

    @Override // com.amazon.identity.auth.device.o8
    public final void a(String str, String str2, String str3, ArrayList arrayList) {
        String[] strArr;
        String[] strArr2;
        if (TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            String m$1 = TextUtils.isEmpty(str3) ? str2 : a$$ExternalSyntheticOutline0.m$1(str2, "#", str3);
            Bundle bundle = new Bundle();
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((MAPCookie) it2.next()).d());
                }
                strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            } else {
                strArr2 = new String[0];
            }
            bundle.putStringArray(CookieKeys.KEY_COOKIES, strArr2);
            hashMap.put(m$1, zj.a(bundle));
            hashMap.put(TextUtils.isEmpty(str3) ? b0.a("json.", str2) : q1.a("json.", str2, "#", str3), r8.a(arrayList));
            this.f677a.a("com.amazon.identity.auth.device.cookiekeys.namespace.nonAuth", hashMap);
            return;
        }
        v9 v9Var = this.f677a;
        HashMap hashMap2 = new HashMap();
        String a2 = TextUtils.isEmpty(str3) ? b0.a("com.amazon.dcp.sso.token.amazon.cookies.", str2) : q1.a("com.amazon.dcp.sso.token.amazon.cookies.", str2, "#", str3);
        Bundle bundle2 = new Bundle();
        if (arrayList != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((MAPCookie) it3.next()).d());
            }
            strArr = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
        } else {
            strArr = new String[0];
        }
        bundle2.putStringArray(CookieKeys.KEY_COOKIES, strArr);
        hashMap2.put(a2, zj.a(bundle2));
        hashMap2.put(TextUtils.isEmpty(str3) ? b0.a("com.amazon.dcp.sso.token.amazon.cookies.json.", str2) : q1.a("com.amazon.dcp.sso.token.amazon.cookies.json.", str2, "#", str3), r8.a(arrayList));
        v9Var.b(str, hashMap2);
    }

    @Override // com.amazon.identity.auth.device.o8
    public final Map a(String str, String str2, ArrayList arrayList) {
        String a2;
        String a3;
        if (arrayList.isEmpty()) {
            yf.a("GenericCookieDataStore");
            "user".equalsIgnoreCase(Build.TYPE);
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(null)) {
            a2 = b0.a("com.amazon.dcp.sso.token.amazon.cookies.", str2);
        } else {
            a2 = a0.a("com.amazon.dcp.sso.token.amazon.cookies.", str2, "#null");
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((MAPCookie) it2.next()).d());
        }
        bundle.putStringArray(CookieKeys.KEY_COOKIES, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
        hashMap.put(a2, zj.a(bundle));
        if (TextUtils.isEmpty(null)) {
            a3 = b0.a("com.amazon.dcp.sso.token.amazon.cookies.json.", str2);
        } else {
            a3 = a0.a("com.amazon.dcp.sso.token.amazon.cookies.json.", str2, "#null");
        }
        hashMap.put(a3, r8.a(arrayList));
        return hashMap;
    }

    @Override // com.amazon.identity.auth.device.o8
    public final ArrayList a(String str, String str2, String str3) {
        String a2;
        String a3;
        String a4;
        boolean isEmpty = TextUtils.isEmpty(str);
        v9 v9Var = this.f677a;
        if (isEmpty) {
            ArrayList b = r8.b(v9Var.c("com.amazon.identity.auth.device.cookiekeys.namespace.nonAuth", TextUtils.isEmpty(str3) ? str2 : a$$ExternalSyntheticOutline0.m$1(str2, "#", str3)), null);
            if (g8.a(b)) {
                v9 v9Var2 = this.f677a;
                if (!TextUtils.isEmpty(str3)) {
                    a4 = q1.a("json.", str2, "#", str3);
                } else {
                    a4 = b0.a("json.", str2);
                }
                b = r8.a(v9Var2.c("com.amazon.identity.auth.device.cookiekeys.namespace.nonAuth", a4), (String) null);
                if (!g8.a(b)) {
                    fp.b(new fc(this, str, str2, str3, new ArrayList(b)));
                }
            }
            return b;
        }
        if (!TextUtils.isEmpty(str3)) {
            a2 = q1.a("com.amazon.dcp.sso.token.amazon.cookies.", str2, "#", str3);
        } else {
            a2 = b0.a("com.amazon.dcp.sso.token.amazon.cookies.", str2);
        }
        ArrayList b2 = r8.b(v9Var.d(str, a2), str);
        if (g8.a(b2)) {
            v9 v9Var3 = this.f677a;
            if (!TextUtils.isEmpty(str3)) {
                a3 = q1.a("com.amazon.dcp.sso.token.amazon.cookies.json.", str2, "#", str3);
            } else {
                a3 = b0.a("com.amazon.dcp.sso.token.amazon.cookies.json.", str2);
            }
            b2 = r8.a(v9Var3.d(str, a3), str);
            if (!g8.a(b2)) {
                fp.b(new fc(this, str, str2, str3, new ArrayList(b2)));
            }
        }
        return b2;
    }

    @Override // com.amazon.identity.auth.device.o8
    public final List a(String str, String str2, String str3, String str4) {
        String sb;
        v9 v9Var = this.f677a;
        if (TextUtils.isEmpty(str4)) {
            sb = q1.a("com.amazon.dcp.sso.token.amazon.actor.cookies.json.", str3, ".", str2);
        } else {
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("com.amazon.dcp.sso.token.amazon.actor.cookies.json.", str3, ".", str2, "#");
            m.append(str4);
            sb = m.toString();
        }
        return r8.a(v9Var.d(str, sb), str);
    }

    @Override // com.amazon.identity.auth.device.o8
    public final boolean a(Context context, String str) {
        throw new IllegalStateException("Clear cookies is not supported");
    }

    @Override // com.amazon.identity.auth.device.o8
    public final void a(String str, String str2, String str3, String str4, ArrayList arrayList) {
        String sb;
        v9 v9Var = this.f677a;
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str4)) {
            sb = q1.a("com.amazon.dcp.sso.token.amazon.actor.cookies.json.", str3, ".", str2);
        } else {
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("com.amazon.dcp.sso.token.amazon.actor.cookies.json.", str3, ".", str2, "#");
            m.append(str4);
            sb = m.toString();
        }
        hashMap.put(sb, r8.a(arrayList));
        v9Var.b(str, hashMap);
    }
}
