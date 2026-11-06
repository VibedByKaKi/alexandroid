package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.identity.auth.device.framework.RemoteMAPException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class qm {

    /* renamed from: a, reason: collision with root package name */
    public final tn f903a;
    public final String b;
    public final String c;
    public Integer d;
    public Integer e;
    public Integer f;
    public String g;
    public String h;
    public Long i;
    public Integer j;
    public String k;
    public boolean l;
    public RemoteMAPException m;

    public qm(Context context) {
        tn a2 = tn.a(context);
        this.f903a = a2;
        this.b = a2.getPackageName();
        this.c = null;
        this.l = false;
    }

    public final synchronized void a() {
        this.l = true;
        Uri a2 = ff.a(this.c, "/map_info");
        try {
            new qn(this.f903a).a(a2, new pm(this, a2));
            this.m = null;
        } catch (Exception e) {
            yf.a("RemoteMapInfo", "Failed to query " + this.b, e, "RemoteMapInfoFailure:" + this.b);
            RemoteMAPException remoteMAPException = new RemoteMAPException(e);
            this.m = remoteMAPException;
            throw remoteMAPException;
        }
    }

    public final int b() {
        String str = this.c;
        if (str == null) {
            yf.a("RemoteMapInfo");
            "user".equalsIgnoreCase(Build.TYPE);
            h8.b(this.f903a).a();
            return 1;
        }
        Uri a2 = ff.a(str, "/generate_common_info");
        a2.toString();
        this.f903a.getPackageName();
        yf.a("RemoteMapInfo");
        "user".equalsIgnoreCase(Build.TYPE);
        Integer a3 = no.a((String) new qn(this.f903a).a(a2, new k9(a2)));
        if (a3 != null) {
            return a3.intValue();
        }
        throw new RemoteMAPException("Common info version String not a valid integer.");
    }

    public final synchronized String c() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        if (b8.a(this.f903a, this.b)) {
            f();
            return this.g;
        }
        yf.a("RemoteMapInfo");
        "user".equalsIgnoreCase(Build.TYPE);
        String a2 = ta.a(this.f903a, this.b);
        this.g = a2;
        return a2;
    }

    public final String d() {
        String str;
        if (!b8.a(this.f903a, this.b)) {
            yf.a("RemoteMapInfo");
            "user".equalsIgnoreCase(Build.TYPE);
            return null;
        }
        synchronized (this) {
            f();
            yf.a("RemoteMapInfo");
            "user".equalsIgnoreCase(Build.TYPE);
            str = this.h;
        }
        return str;
    }

    public final synchronized Long e() {
        try {
            if (this.i == null) {
                this.i = bi.a(this.f903a, this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.i;
    }

    public final synchronized void f() {
        RemoteMAPException remoteMAPException = this.m;
        if (remoteMAPException != null) {
            throw remoteMAPException;
        }
        if (this.l) {
            return;
        }
        a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        a(sb, "PackageName", this.b);
        try {
            a(sb, "DeviceType", c());
            f();
            a(sb, "MajorVersion", this.d);
            f();
            a(sb, "MinorVersion", this.e);
            f();
            a(sb, "SWVersion", this.f);
            f();
            a(sb, "BrazilVersion", this.k);
            a(sb, "DeviceSerialNumber", d());
        } catch (RemoteMAPException e) {
            Log.w(yf.a("RemoteMapInfo"), "Failed to query " + this.b, e);
        }
        a(sb, "MAPInitVersion", this.j);
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    public qm(Context context, ProviderInfo providerInfo) {
        this.f903a = tn.a(context);
        this.b = providerInfo.packageName;
        this.c = providerInfo.authority;
        this.l = false;
    }

    public static void a(StringBuilder sb, String str, Object obj) {
        if (obj == null) {
            return;
        }
        sb.append(str);
        sb.append(" = ");
        sb.append(obj);
        sb.append(", ");
    }
}
