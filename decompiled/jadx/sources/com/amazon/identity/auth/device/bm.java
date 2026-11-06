package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.api.MAPAgeClassificationManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class bm {
    public String A;
    public String B;
    public ArrayList C;
    public ArrayList D;

    /* renamed from: a, reason: collision with root package name */
    public String f537a;
    public String b;
    public String c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public final am l;
    public final d6 m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public HashMap s;
    public final ArrayList t;
    public JSONArray u;
    public long v;
    public final HashMap w;
    public final String x;
    public boolean y;
    public MAPAgeClassificationManager.AgeClassification z;

    public bm(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, d6 d6Var, am amVar) {
        this.u = new JSONArray();
        this.f537a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.t = new ArrayList();
        this.w = new HashMap();
        this.i = str8;
        this.k = str9;
        this.s = null;
        this.m = d6Var;
        this.l = amVar;
    }

    public bm(String str) {
        this.u = new JSONArray();
        this.x = str;
    }

    public bm(String str, String str2, String str3, int i, String str4, String str5, am amVar) {
        this(str, str2, str3, i, null, str4, null, null, null, str5, null, amVar);
    }

    public bm(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, null, null, 0, str2, str3, str4, str5, str6, null, null, null);
    }
}
