package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class lg {

    /* renamed from: a, reason: collision with root package name */
    public String f790a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Long g;
    public Double h;
    public Boolean i;
    public String j;
    public StringBuilder k;
    public og l;

    public abstract mg a();

    public final void a(String str, Double d) {
        StringBuilder sb = this.k;
        if (sb == null) {
            StringBuilder sb2 = new StringBuilder(str);
            this.k = sb2;
            sb2.append("=");
            sb2.append(d);
            return;
        }
        sb.append(",");
        sb.append(str);
        sb.append("=");
        sb.append(d);
    }
}
