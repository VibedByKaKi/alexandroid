package com.amazon.identity.auth.device;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ri {

    /* renamed from: a, reason: collision with root package name */
    public final String f921a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;

    public ri(String str, String str2, String str3, String str4) {
        this.f921a = str;
        this.b = str2;
        long parseLong = Long.parseLong(str3) * 1000;
        this.c = parseLong;
        this.d = System.currentTimeMillis() + parseLong;
        this.e = Long.parseLong(str4);
    }
}
