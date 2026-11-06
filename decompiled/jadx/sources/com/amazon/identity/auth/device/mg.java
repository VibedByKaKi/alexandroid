package com.amazon.identity.auth.device;

import android.text.TextUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class mg {

    /* renamed from: a, reason: collision with root package name */
    public final String f810a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;
    public final Double h;
    public final Boolean i;
    public final String j;
    public final String k;

    public mg(String str, String str2, String str3, String str4, String str5, String str6, Long l, Double d, Boolean bool, String str7, String str8) {
        this.f810a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = l;
        this.h = d;
        this.i = bool;
        this.k = str8;
        this.j = TextUtils.isEmpty(str7) ? yf.f1091a : str7;
    }

    public abstract void a();

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinervaMetricEvent{eventName='");
        sb.append(this.f810a);
        sb.append("', subEventName='");
        sb.append(this.b);
        sb.append("', reasonCode='");
        sb.append(this.c);
        sb.append("', url='");
        sb.append(this.d);
        sb.append("', configKey='");
        sb.append(this.e);
        sb.append("', configValue='");
        sb.append(this.f);
        sb.append("', count=");
        sb.append(this.g);
        sb.append(", durationMs=");
        sb.append(this.h);
        sb.append(", success=");
        sb.append(this.i);
        sb.append(", mapVersion='20260904N', clientIdentifier='");
        sb.append(this.j);
        sb.append("', counters='");
        return cg.a(sb, this.k, "'}");
    }
}
