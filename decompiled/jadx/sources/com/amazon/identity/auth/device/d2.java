package com.amazon.identity.auth.device;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f569a;
    public final Map b;
    public final Map c;
    public final v9 d;

    public d2(String str, Map map, Map map2, v9 v9Var) {
        if (TextUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("AccountData directedId cannot be null");
            throw null;
        }
        this.f569a = str;
        if (map == null) {
            this.b = new HashMap();
        } else {
            this.b = map;
        }
        if (map2 == null) {
            this.c = new HashMap();
        } else {
            this.c = map2;
        }
        this.d = v9Var;
    }

    public final String a(String str) {
        v9 v9Var;
        String str2 = (String) this.b.get(str);
        return (str2 != null || (v9Var = this.d) == null) ? str2 : v9Var.e(this.f569a, str);
    }
}
